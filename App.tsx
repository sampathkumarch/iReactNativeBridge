import React, { useEffect, useState } from 'react'; // React hooks
import { View, Text } from 'react-native'; // UI components
import { NativeModules } from 'react-native'; // Access native modules
import MessageBox from './MessageBox';
import './global.css';
// Destructure HelloWorld module from NativeModules
const { HelloWorld } = NativeModules;

const App = () => {
  const [message, setMessage] = useState(''); // State to hold message from native module

  useEffect(() => {
    // Call the native module method and update the message
    HelloWorld.getMessage().then(setMessage);
  }, []);

  // Render the message in the center of the screen
  return (
    <View style={{ flex: 1, justifyContent: "center", alignItems: 'center' }}>
      {/* <Text className="text-9xl text-red-950">{message}</Text> */}
      <MessageBox message={message} />
    </View>
  );
};

export default App;
