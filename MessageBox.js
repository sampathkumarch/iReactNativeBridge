import React from 'react';
import {View, Text} from 'react-native';
// import './global.css';
const MessageBox = ({message}) => {
  return (
    <View className="p-4 bg-orange-700 rounded-xl shadow-md">
      <Text className="text-9xl text-red-950">{message}</Text>
    </View>
  );
};

export default MessageBox;
