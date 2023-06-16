<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ToDo List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <div class="d-flex align-items-center bg-dark" style="height: 50vw">
        
        <form class="m-auto d-flex flex-column gap-2" action="user" method="post" style="min-width: 400px;">
            <h2 class="text-light m-0 mx-auto">Cadastro de usuário</h2>
            <input required placeholder="Nome" class="form-control bg-dark text-light" type="text" id="txtName">
            <input required placeholder="Sobrenome" class="form-control bg-dark text-light" type="text" id="txtSurname">
            <input required placeholder="Idade" class="form-control bg-dark text-light" type="number" id="txtAge">
            <input class="form-control btn btn-secondary" value="Enviar" type="submit">
            <input type="hidden" name="acao" value="cadastrar">
        </form>
    </div>
</body>
</html>
