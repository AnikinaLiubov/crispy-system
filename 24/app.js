const get_api_res_btn = document.getElementById('get_api_res_btn');
const api_result1 = document.getElementById('api_result1');
const api_result2 = document.getElementById('api_result2');
get_api_res_btn.addEventListener('click', getAPI);

    function getAPI(){
            fetch('http://api.open-notify.org/iss-now.json', {
    method: 'GET'
  })
    .then(res => res.json())
    .then(data=> {
        console.log(data.iss_position)
        api_result1.innerHTML += data.iss_position.latitude;
        api_result2.innerHTML += data.iss_position.longitude;
        
    });
    }