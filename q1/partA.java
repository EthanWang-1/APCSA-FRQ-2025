public int walkDogs(int hour){
        if(company.numAvailableDogs(hour) >= maxDogs){
            company.updateDogs(hour, maxDogs);
            return maxDogs;
        } else {
            updateDogs(hour, company.numAvailableDogs(hour))
            return company.numAvailableDogs(hour);
        }
    }
