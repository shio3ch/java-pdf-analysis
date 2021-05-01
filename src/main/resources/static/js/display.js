/**
 * 画像を非同期で読み込む。
 */
window.onload = function loadAllItemImage() {

  const method = "GET";
  const path = "/display-image";
  const param = "id";

  let itemListElems = document.getElementsByClassName("item-image");
  for (let i = 0; i < itemListElems.length; i++) {
    
    let itemImage = itemListElems[i];
    let reqPath = path + "?" + param + "="
        + encodeURIComponent(itemImage.getAttribute("item-id"), true);

    // HTTPリクエストを作成
    let xhr = new XMLHttpRequest();
    xhr.responseType = "blob";
    xhr.open(method, reqPath, true);

    // 画像読み込み完了後のイベント
    xhr.onload = function() {
      let oURL = URL.createObjectURL(this.response);
      
      let image = new Image();
      image.onload = () => {
        // 画像の表示が終わったらオブジェクトURLを解放する
        URL.revokeObjectURL(oURL);
      };
      image.src = oURL;
      image.className = "item-img";

      // ローディングのElementを画像に置き換え
      while (itemImage.firstChild) {
        itemImage.removeChild(itemImage.firstChild);
      }
      itemImage.appendChild(image);

    };

    xhr.send(null);
  }
}