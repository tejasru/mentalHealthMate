import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
import 'bootstrap/dist/css/bootstrap.min.css';
import { FiLogIn } from 'react-icons/fi';
import {FaHandPointLeft} from 'react-icons/fa';
import {RiMentalHealthLine} from 'react-icons/ri';

function NavBar() {
  return (
    <Navbar expand="lg" className="bg-body-tertiary">
      <Container>
        <Navbar.Brand href="#home">Mental Health Mate <RiMentalHealthLine /></Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <Nav.Link href="#home">Home</Nav.Link>
            <Nav.Link href="#link">Login <FiLogIn /></Nav.Link>
            <Nav.Link href="#register">Register <FaHandPointLeft /></Nav.Link>
            <NavDropdown title="More" id="basic-nav-dropdown">
              <NavDropdown.Item href="#action/3.1">Support Groups</NavDropdown.Item>
              <NavDropdown.Item href="#action/3.2">
                Blogs
              </NavDropdown.Item>
              {/* <NavDropdown.Item href="#action/3.3">Blogs</NavDropdown.Item> */}
              {/* <NavDropdown.Divider />
              <NavDropdown.Item href="#action/3.4">
                
              </NavDropdown.Item> */}
            </NavDropdown>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
}

export default NavBar;