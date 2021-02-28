# sigma-bytecode
Sigma's main (still obfuscated and a brainfuck to read) in Bytecode form

*What did I do?*

1. Downloaded the installer from the site
2. Decompiled the installer to find a link leading to the version to download
![](https://i.ibb.co/NFr2nsT/Screen-Shot-2021-02-27-at-5-34-56-PM.jpg)
3. Get the hash from said link: `b3a4dd3df6cfc98dfdb2e172de00ac40e7a76bdf` - `https://jelloprg.sigmaclient.info/download/prelauncher/b3a4dd3df6cfc98dfdb2e172de00ac40e7a76bdf`
4. Link above downloads a file named 'file', append .jar to the end and unzip it
5. You get the version JSON here. If you know the JSON file location, then skip the steps above unless they decided to change it.
![](https://i.ibb.co/n8kVkxF/Screen-Shot-2021-02-27-at-5-39-05-PM.jpg)
`https://jelloprg.sigmaclient.info/version_manifest.json`
6. This is what comes from the link above:
```json
{
  "latest": {
    "release": "1.16.4"
  },
  "versions": [
    {
      "id": "1.16.4",
      "type": "release",
      "url": "https://jelloprg.sigmaclient.info/1.16.4.php",
      "time": "2020-06-18T12:52:53+00:00",
      "releaseTime": "2020-06-18T12:49:28+00:00"
    }
  ]
}
```
7. Take `https://jelloprg.sigmaclient.info/1.16.4.php` and see the JSON it takes you to.
8. Eventually, you'll find a link in the "php" (actually JSON formatted) which takes you to the source.
```json
  "downloads": {
    "client": {
      "sha1": "881a6b206a4562f3e02bf8f03f4be90f65b4c8bb",
      "size": 78292448,
      "url": "https://jelloprg.sigmaclient.info/download/master/881a6b206a4562f3e02bf8f03f4be90f65b4c8bb"
    },
  }
```
FOR IDIOTS THAT ARENT PREPARED TO LEARN JSON: 
`https://jelloprg.sigmaclient.info/download/master/881a6b206a4562f3e02bf8f03f4be90f65b4c8bb`
9. It downloads a 80~ MB file. Append .jar to the end.

## I ran it through Procyon's -bytecode flag
*How did I install Procyon?*
1. http://snapshot.debian.org/package/procyon/0.5.32-1/
2. Navigate and download the lib, unarchive it
3. Download decompiler shit
4. Edit bin file for decompiler because I'm a mac loser
5. If ur windows figure it out on ur own
