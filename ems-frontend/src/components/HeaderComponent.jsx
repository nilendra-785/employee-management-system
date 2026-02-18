import React from 'react'
import { NavLink } from 'react-router-dom'

const HeaderComponent = () => {
  return (
    <header style={{ width: '100vw' }}>
      <nav className="navbar navbar-expand-lg navbar-dark bg-dark w-100" style={{ margin: 0, padding: 0 }}>
        <div className="container-fluid d-flex flex-column align-items-center justify-content-center py-2">

          {/* Centered Heading */}
          <a
            className="navbar-brand text-"
            href="https://www.javaguides.net"
            style={{
              fontSize: '1.8rem',
              fontWeight: 'bold',
            //  marginBottom: '8px',
              color: 'white',
              textDecoration: 'none'
            }}
          >
            Employee Management System
          </a>

          {/* Navigation Links */}
          <div className="collapse navbar-collapse show">
            <ul className="navbar-nav d-flex flex-row gap-4">
              <li className="nav-item">
                <NavLink className="nav-link" to="/employees">
                  Employees
                </NavLink>
              </li>

              <li className="nav-item">
                <NavLink className="nav-link" to="/departments">
                  Departments
                </NavLink>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </header>
  )
}

export default HeaderComponent






