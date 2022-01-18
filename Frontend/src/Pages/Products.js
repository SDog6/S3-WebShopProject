import React from 'react';
import CPUList from '../API/CPUList';
import CPUCoolingList from '../API/CPUCoolingList';
import GPUList from '../API/GPUList';
import MotherboardList from '../API/MotherboardList';
import PowerSupplyList from '../API/PowerSupplyList';
import RAMList from '../API/RAMList';
import StorageList from '../API/StorageList';

function Products() {
  return (
    <div className='home'>
        <CPUList/>
        <CPUCoolingList/>
        <GPUList/>
        <MotherboardList/>
        <PowerSupplyList/>
        <RAMList/>
        <StorageList/>

    </div>
  );
}

export default Products;
