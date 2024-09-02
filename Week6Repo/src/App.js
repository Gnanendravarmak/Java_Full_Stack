import logo from './logo.svg';
import './App.css';
import Navbar from './Components/Navbar/Navbar';
import { Route, Routes } from 'react-router-dom';
import Login from './Components/Pages/Login/Login';
import SignIn from './Components/Pages/SignIn/SignIn';
import Home from './Components/Pages/Home/Home';
import Welcome from './Components/Welcome/Welcome';
import ShowData from './Components/ShowData/ShowData';
import { useState } from 'react';
import ProductForm from './Components/ProductForm/ProductForm';
import UpdateProductForm from './Components/ProductForm/UpdateProductForm ';

function App() {
  const [products, setProducts] = useState([]);

  return (
    <div>
        <Navbar />
        {/* <Welcome/> */}
        <Routes>
          <Route exact path="/" element={<Welcome />} />
          <Route path="/home" element={<Home />} />
          <Route path="/login" element={<Login />} />
          <Route path="/signin" element={<SignIn />} />
          <Route path="/showdata" element={<ShowData />} />
          <Route path="/addProduct" element={<ProductForm />} />
          <Route path="/updateProduct/:productId" element={<UpdateProductForm />}/>

          {/* <Route path="/" exact>
            <ProductList products={products} setProducts={setProducts} />
          </Route>

          <Route path="/add">
            <ProductForm products={products} setProducts={setProducts} />
          </Route>
          <Route path="/edit/:id">
            <ProductForm products={products} setProducts={setProducts} />
            </Route> */}
        </Routes>
      </div>
  );
}

export default App;
