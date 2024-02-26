import { initializeApp } from 'https://www.gstatic.com/firebasejs/10.8.0/firebase-app.js'
import { getAuth } from 'https://www.gstatic.com/firebasejs/10.8.0/firebase-auth.js'
import { getDatabase } from 'https://www.gstatic.com/firebasejs/10.8.0/firebase-database.js'
import { getStorage } from 'https://www.gstatic.com/firebasejs/10.8.0/firebase-storage.js'

const firebaseConfig = {
    apiKey: "AIzaSyD31o-HQhrhCDcuDwG4Esc3hBHSax_WwXo",
    authDomain: "happytails-24.firebaseapp.com",
    projectId: "happytails-24",
    storageBucket: "happytails-24.appspot.com",
    messagingSenderId: "516897098796",
    appId: "1:516897098796:web:bc86e560874e9f5a469589",
    measurementId: "G-H9NQ0THDNN",
    databaseURL: "https://happytails-24-default-rtdb.asia-southeast1.firebasedatabase.app"
};

const app = initializeApp(firebaseConfig);
const auth = getAuth(app);
const db = getDatabase(app);
const storage = getStorage(app);

export { auth, app, db, storage }