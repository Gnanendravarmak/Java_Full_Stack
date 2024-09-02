import React from "react";
import Product from "../../Products/Product";

const Home = () => {
  const role = localStorage.getItem("role");

  return (
    <div>
      {role === "admin" ? (
        <div>
          <Product />
        </div>
      ) : (
        <div>
          <Product />
        </div>
      )}
    </div>
  );
};

export default Home;
