public interface \u5d20\u7043\u88c5\u5db4\uf94d.\u8cae\u3d64\u965f\u3c25\u7006 {
    void \u9a18\u47c2\u74b1\u8258\u3c25\u946b(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u4daf\u72f1\u16f6\u8aa5\u8389 p0);
    
    java.lang.String \uf94d\u8350\uc29a\u72f1\u3d4b\ua562();
    
    void \u8df4\u6198\ud158\u6b0d\u98a4\u7c6b(com.google.gson.Gson p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u4daf\u72f1\u16f6\u8aa5\u8389 p1, com.google.gson.JsonElement p2, java.nio.file.Path p3) {
        var_4_68 : int
        var_6_6F : String
        var_4_1CA : int
        var_7_85 : String
        var_8_1DA : BufferedWriter
        var_9_1DD : Throwable
        var_10_218 : Throwable
        var_12_23D : Throwable
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_68 = and:int(and:int(ldc:int(643228298), ldc:int(1860021559)), ldc:int(-1085222077))
            var_6_6F = invokevirtual:String(Gson::toJson, p0:Gson, p2:JsonElement)
            var_4_1CA = and:int(var_4_68:int, ldc:int(-1797588757))
            var_7_85 = invokevirtual:String(HashCode::toString, invokeinterface:HashCode(HashFunction::hashUnencodedChars, getstatic:HashFunction(\u8cae\u3d64\u965f\u3c25\u7006::\uc87f\u4975\ub8be\u4e72\u7c6b\u6cfe), var_6_6F:String[expected:CharSequence]))
            
            loop {
                if (cmpeq:boolean(and:int(var_4_1CA:int, ldc:int(1048576)), ldc:int(0))) {
                    var_4_1CA = and:int(var_4_1CA:int, ldc:int(-1915160783))
                    goto(Label_0401)
                }
                
                if (cmpne:boolean(and:int(var_4_1CA:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0332)
                }
                
                if (cmpeq:boolean(and:int(var_4_1CA:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_1CA = and:int(var_4_1CA:int, ldc:int(-1360606428))
                    goto(Label_0283)
                }
                
                if (cmpeq:boolean(and:int(var_4_1CA:int, ldc:int(524288)), ldc:int(0))) {
                    var_4_1CA = and:int(var_4_1CA:int, ldc:int(-288168074))
                    
                    if (logicalnot:boolean(invokestatic:boolean(Objects::equals, invokevirtual:String[expected:Object](\u4daf\u72f1\u16f6\u8aa5\u8389::\u759a\ub171\u62da\u8308\uae87\ub32d, p1:\u4daf\u72f1\u16f6\u8aa5\u8389, p3:Path), var_7_85:String[expected:Object]))) {
                        goto(Label_0332)
                    }
                }
                
                Label_0207:
                
                if (cmpeq:boolean(and:int(var_4_1CA:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0401)
                }
                
                if (cmpeq:boolean(and:int(var_4_1CA:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0332)
                }
                
                if (cmpeq:boolean(and:int(var_4_1CA:int, ldc:int(67108864)), ldc:int(0))) {
                    var_4_1CA = and:int(var_4_1CA:int, ldc:int(1628975171))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_1CA:int, ldc:int(524288)), ldc:int(0))) {
                        var_4_1CA = and:int(var_4_1CA:int, ldc:int(-82571431))
                        loopcontinue()
                    }
                    
                    var_4_1CA = and:int(var_4_1CA:int, ldc:int(-310800522))
                    
                    if (invokestatic:boolean(Files::exists, p3:Path, newarray:LinkOption[](java.nio.file.LinkOption.class, and:int(ldc:int(-29024), ldc:int(24669))))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0283:
                
                if (cmpne:boolean(and:int(var_4_1CA:int, ldc:int(2097152)), ldc:int(0))) {
                    var_4_1CA = and:int(var_4_1CA:int, ldc:int(-1023937597))
                    goto(Label_0401)
                }
                
                if (cmpne:boolean(and:int(var_4_1CA:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_4_1CA:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_1CA:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_1CA = and:int(var_4_1CA:int, ldc:int(-570910930))
                }
                
                Label_0332:
                
                if (cmpne:boolean(and:int(var_4_1CA:int, ldc:int(1048576)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_4_1CA:int, ldc:int(65536)), ldc:int(0))) {
                        var_4_1CA = and:int(var_4_1CA:int, ldc:int(-938473984))
                        goto(Label_0283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_1CA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_1CA:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_1CA = and:int(var_4_1CA:int, ldc:int(-27600977))
                    invokestatic:Path(Files::createDirectories, invokeinterface:Path(Path::getParent, p3:Path), newarray:FileAttribute[](java.nio.file.attribute.FileAttribute.class, and:int(ldc:int(-30940), ldc:int(26841))))
                }
                
                Label_0401:
                
                if (cmpne:boolean(and:int(var_4_1CA:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0332)
                }
                
                if (cmpne:boolean(and:int(var_4_1CA:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_1CA = and:int(var_4_1CA:int, ldc:int(-177038637))
                    goto(Label_0283)
                }
                
                if (cmpeq:boolean(and:int(var_4_1CA:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0207)
                }
                
                if (cmpne:boolean(and:int(var_4_1CA:int, ldc:int(32768)), ldc:int(0))) {
                    var_4_1CA = and:int(var_4_1CA:int, ldc:int(-430729814))
                    var_8_1DA = invokestatic:BufferedWriter(Files::newBufferedWriter, p3:Path, newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(-21546), ldc:int(21545))))
                    var_9_1DD = aconstnull:Throwable()
                    
                    try {
                        invokevirtual:void(Writer::write, var_8_1DA:BufferedWriter[expected:Writer], var_6_6F:String)
                    }
                    catch (java.lang.Throwable var_10_218) {
                        var_9_1DD = var_10_218:Throwable
                        athrow(var_10_218:Throwable)
                    }
                    finally {
                        if (cmpne:boolean(var_8_1DA:BufferedWriter, aconstnull:BufferedWriter())) {
                            if (cmpne:boolean(var_9_1DD:Throwable, aconstnull:Throwable())) {
                                try {
                                    invokevirtual:void(BufferedWriter::close, var_8_1DA:BufferedWriter)
                                }
                                catch (java.lang.Throwable var_12_23D) {
                                    invokevirtual:void(Throwable::addSuppressed, var_9_1DD:Throwable, var_12_23D:Throwable)
                                }
                            }
                            else {
                                invokevirtual:void(BufferedWriter::close, var_8_1DA:BufferedWriter)
                            }
                        }
                    }
                    
                    looporswitchbreak()
                }
                
                var_4_1CA = and:int(var_4_1CA:int, ldc:int(-1325306086))
            }
            
            invokevirtual:void(\u4daf\u72f1\u16f6\u8aa5\u8389::\ud158\uf94d\uae87\u56bd\uf995\u92ff, p1:\u4daf\u72f1\u16f6\u8aa5\u8389, p3:Path, var_7_85:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putstatic:HashFunction(\u8cae\u3d64\u965f\u3c25\u7006::\uc87f\u4975\ub8be\u4e72\u7c6b\u6cfe, invokestatic:HashFunction(Hashing::sha1))
            return:void()
        }
        
        goto(Label_0006)
    }
}
