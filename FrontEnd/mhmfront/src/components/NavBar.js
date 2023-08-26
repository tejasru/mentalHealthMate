import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
import 'bootstrap/dist/css/bootstrap.min.css';
import { FiLogIn } from 'react-icons/fi';
import {FaHandPointLeft} from 'react-icons/fa';
import {RiMentalHealthLine,RiArrowLeftSLine,RiArrowLeftSFill} from 'react-icons/ri';
import {useNavigate} from 'react-router';

function NavBar() {
  const navigate = useNavigate();

  const home=()=>{
    navigate('/');
  }
  const userLogin=()=>{
    navigate('/userLogin');
  }
  const doctorLogin=()=>{
    navigate('/doctorLogin')
  }
  const userRegisteration=()=>{
    navigate('/userRegisteration');
  }
  const doctorRegister=()=>{
    navigate('/doctorRegisteration');
  }
  return (
    <Navbar expand="lg" className="bg-body-tertiary">
      <Container>
        <Navbar.Brand onClick={home}>Mental Health Mate <RiMentalHealthLine /></Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <Nav.Link href="#link">About us</Nav.Link>
            <Nav.Link onClick={userLogin}>User Login <FiLogIn /></Nav.Link>
            <Nav.Link onClick={doctorLogin}>Doctor Login <FaHandPointLeft /></Nav.Link>
            <NavDropdown title="More" id="basic-nav-dropdown">
              <NavDropdown.Item href="#action/3.1">
              <Nav.Link onClick={userRegisteration}>User Registeration<RiArrowLeftSLine /></Nav.Link>
              </NavDropdown.Item>
              <NavDropdown.Item href="#action/3.2">
              <Nav.Link onClick={doctorRegister}>Doctor Registeration<RiArrowLeftSFill /></Nav.Link>
              </NavDropdown.Item>
            </NavDropdown>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
}

export default NavBar;