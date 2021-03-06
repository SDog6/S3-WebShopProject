import React from 'react';
import * as FaIcons from 'react-icons/fa';
import * as AiIcons from 'react-icons/ai';
import * as IoIcons from 'react-icons/io';
import * as VsIcons from 'react-icons/vsc';
import * as MdIcons from "react-icons/md";
import * as ReactIcons from "react-icons/bs";




export const UserSidebarData = [
  {
    title: 'Home',
    path: '/',
    icon: <AiIcons.AiFillHome />,
    cName: 'nav-text'
  },
  {
    title: 'Products',
    path: '/products',
    icon: <FaIcons.FaCartPlus />,
    cName: 'nav-text'
  },
  {
    title: 'Account',
    path: '/account',
    icon: <VsIcons.VscAccount />,
    cName: 'nav-text'
  },
  {
    title: 'Chat',
    path: '/Chat',
    icon: <ReactIcons.BsFillChatDotsFill />,
    cName: 'nav-text'
  },
  {
    title: 'About',
    path: '/about',
    icon: <IoIcons.IoMdHelpCircle />,
    cName: 'nav-text'
  }
];
