import axios from 'axios';

const API_URL = "http://localhost:8080/api";

export const createRule = (ruleString) => {
    return axios.post(`${API_URL}/create_rule`, { ruleString });
};

export const evaluateRule = (userData) => {
    return axios.post(`${API_URL}/evaluate_rule`, userData);
};
