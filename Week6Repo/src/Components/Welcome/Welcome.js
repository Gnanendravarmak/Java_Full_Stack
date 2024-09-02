import React from 'react';
import './Welcome.css'; // Import the CSS file

const Welcome = () => {
  return (
    <div className="welcome-container">
      <div className="welcome-header">
        <h1>Welcome to Our Amazing Store!</h1>
        <p>Discover top-notch products and exclusive deals just for you.</p>
      </div>
      <div className="welcome-images">
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQpN1CM35fzkl6aR5bP05bSYoCp0Q7RyX5rVA&s" alt="Featured Product 1" className="welcome-image" />
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8vPEPUfGJUDk-4GesW6KPYhdg2hhxy37dHA&s" alt="Featured Product 2" className="welcome-image" />
      </div>
      <div className="welcome-promo">
        <h2>Exclusive Offers Just for You!</h2>
        <p>Explore our latest deals and discounts on a wide range of products. Don’t miss out on our limited-time offers!</p>
        <button className="shop-now-button">Shop Now</button>
      </div>
      <div className="welcome-testimonials">
        <h2>What Our Customers Say</h2>
        <div className="testimonial">
          <img src="https://images.unsplash.com/photo-1506794778202-cad84cf45f1d" alt="Customer 1" className="testimonial-image" />
          <p>"Great quality products and fast delivery. Highly recommend!" - Alex P.</p>
        </div>
        <div className="testimonial">
          <img src="https://images.unsplash.com/photo-1506794778202-cad84cf45f1d" alt="Customer 2" className="testimonial-image" />
          <p>"Amazing customer service and fantastic prices. I’ll be back!" - Jamie L.</p>
        </div>
      </div>
    </div>
  );
}

export default Welcome;
