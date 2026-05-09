import axios from 'axios';

const API_URL = "http://localhost:8080/api/bff/dashboard";

export const fetchDashboardData = async () => {
    try {
        const response = await axios.get(API_URL);
        return response.data;
    } catch (error) {
        console.error("Error al obtener datos del BFF", error);
        return null;
    }
};