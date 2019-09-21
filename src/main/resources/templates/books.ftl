<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>图书编号</td>
            <td>图书名称</td>
            <td>图书作者</td>
        </tr>
        <#if bookList?? && (bookList?size>0)>
            <#list bookList as book>
                <tr>
                    <td>${book.id}</td>
                    <td>${book.name}</td>
                    <td>${book.author}</td>
                </tr>
            </#list>
        </#if>
    </table>
</body>
</html>