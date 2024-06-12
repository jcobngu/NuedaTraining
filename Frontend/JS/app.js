async function fetchData(){
    const records = await fetch("http://localhost:8080/customer");
    const data = await records.json();
    console.log("dataaaa", data);
    let tab = '';


    // for (const item of data){
    //     console.log("id of item", item.id)
    //     tab += `<tr>
    //     <td>${item.firstName}</td>
    //     <td>${item.lastName}</td>
    //     <td>${item.id}</td>
    //     </tr>`;
    // }
    await data.forEach(item => function(user){
        console.log(item.id)
        tab += `<tr>
        <td>${item.firstName}</td>
        <td>${item.lastName}</td>
        <td>${item.id}</td>
        </tr>`;
    })

    console.log(document.getElementById('myTbody'))
    document.getElementById('myTbody').innerHTML = tab;

    $(document).ready(function () {
        $('#example').DataTable();
    });
}

fetchData();

