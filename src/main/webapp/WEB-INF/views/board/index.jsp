<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap CSS -->
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<!-- JQuery -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>board</title>
<style>
body {
	padding-top: 70px;
	padding-bottom: 30px;
}
</style>
<script>
	$(document).on('click', '#btnWriteForm', function(e) {
		e.preventDefault();
		location.href = "${pageContext.request.contextPath}/board/boardForm";
	});
</script>
</head>
<body>
	<article>
		<div class="container">
			<div class="table-responsive">
				<h2>board List</h2>
				<table class="table table-striped table-sm">
					<colgroup>
						<col style="width: 5%;" />
						<col style="width: auto;" />
						<col style="width: 15%;" />
						<col style="width: 10%;" />
						<col style="width: 10%;" />
					</colgroup>
					<thead>
						<tr>
							<th>NO</th>
							<th>글제목</th>
							<th>작성자</th>
							<th>조회수</th>
							<th>작성일</th>
						</tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${empty boardList}">
								<tr>
									<td colspan="5" align="center">데이터가 없습니다.</td>
								</tr>
							</c:when>
							<c:when test="${!empty boardList}">
								<c:forEach var="list" items="${boardList}">
									<tr>
										<td>
											<c:out value="${list.bid}" />
										</td>
										<td>
											<c:out value="${list.title}" />
										</td>
										<td>
											<c:out value="${list.reg_id}" />
										</td>
										<td>
											<c:out value="${list.view_cnt}" />
										</td>
										<td>
											<c:out value="${list.reg_dt}" />
										</td>
									</tr>
								</c:forEach>
							</c:when>
						</c:choose>
					</tbody>
				</table>
			</div>
			<div>
				<button type="button" class="btn btn-sm btn-primary" id="btnWriteForm">글쓰기</button>
			</div>
		</div>
	</article>
</body>
</html>