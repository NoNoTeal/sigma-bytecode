public final class \ub113\uc4d2\u183a\u527a\u6435.\u759a\u51b2\u6d99\u6d99\uc87f\u64f2 {
    public void \u759a\u51b2\u6d99\u6d99\uc87f\u64f2() {
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
            invokespecial:Object(Object::<init>, this:\u759a\u51b2\u6d99\u6d99\uc87f\u64f2)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u8350\u4f52\u62da\ub19c\ubf56\u12cb \u760c\u8308\u3dd3\u6d99\ub18d\ub7dc(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8350\u4f52\u62da\ub19c\ubf56\u12cb> p0, com.mojang.brigadier.StringReader p1) {
        var_5_6B : float
        var_6_78 : float
        var_7_85 : float
        
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
            invokevirtual:void(StringReader::expect, p1:StringReader, ldc:char(32))
            var_5_6B = d2f:float(invokevirtual:double(StringReader::readDouble, p1:StringReader))
            invokevirtual:void(StringReader::expect, p1:StringReader, ldc:char(32))
            var_6_78 = d2f:float(invokevirtual:double(StringReader::readDouble, p1:StringReader))
            invokevirtual:void(StringReader::expect, p1:StringReader, ldc:char(32))
            var_7_85 = d2f:float(invokevirtual:double(StringReader::readDouble, p1:StringReader))
            invokevirtual:void(StringReader::expect, p1:StringReader, ldc:char(32))
            return:\u8350\u4f52\u62da\ub19c\ubf56\u12cb(initobject:\u8350\u4f52\u62da\ub19c\ubf56\u12cb(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::<init>, var_5_6B:float, var_6_78:float, var_7_85:float, d2f:float(invokevirtual:double(StringReader::readDouble, p1:StringReader))))
        }
        
        goto(Label_0006)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u8350\u4f52\u62da\ub19c\ubf56\u12cb \u8d90\u4ab3\u3d4b\u8413\u12b2\u3d64(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8350\u4f52\u62da\ub19c\ubf56\u12cb> p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p1) {
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
            return:\u8350\u4f52\u62da\ub19c\ubf56\u12cb(initobject:\u8350\u4f52\u62da\ub19c\ubf56\u12cb(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::<init>, invokevirtual:float(\u98a4\uafe7\uc3e3\ua6bd\u8640::readFloat, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640), invokevirtual:float(\u98a4\uafe7\uc3e3\ua6bd\u8640::readFloat, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640), invokevirtual:float(\u98a4\uafe7\uc3e3\ua6bd\u8640::readFloat, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640), invokevirtual:float(\u98a4\uafe7\uc3e3\ua6bd\u8640::readFloat, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640)))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a \u8d90\u4ab3\u3d4b\u8413\u12b2\u3d64(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\ubff1\ud171\uceb8\u4492\u67d0\u8aa5 p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p1) {
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
            return:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a(invokevirtual:\u8350\u4f52\u62da\ub19c\ubf56\u12cb[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u759a\u51b2\u6d99\u6d99\uc87f\u64f2::\u8d90\u4ab3\u3d4b\u8413\u12b2\u3d64, this:\u759a\u51b2\u6d99\u6d99\uc87f\u64f2, p0:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u8350\u4f52\u62da\ub19c\ubf56\u12cb>, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a \u760c\u8308\u3dd3\u6d99\ub18d\ub7dc(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\ubff1\ud171\uceb8\u4492\u67d0\u8aa5 p0, com.mojang.brigadier.StringReader p1) {
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
            return:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a(invokevirtual:\u8350\u4f52\u62da\ub19c\ubf56\u12cb[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u759a\u51b2\u6d99\u6d99\uc87f\u64f2::\u760c\u8308\u3dd3\u6d99\ub18d\ub7dc, this:\u759a\u51b2\u6d99\u6d99\uc87f\u64f2, p0:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u8350\u4f52\u62da\ub19c\ubf56\u12cb>, p1:StringReader))
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u120d\u3e2a\u385b\ub6ab\u0c95\u4492(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5D5 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5E0 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
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
        var_3_5D5 = and:int(ldc:int(-176378160), ldc:int(1698481149))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u759a\u51b2\u6d99\u6d99\uc87f\u64f2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2004391383))
            var_5_7D = and:int(ldc:int(22348), ldc:int(-22351))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(17039), ldc:int(-17040)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5D5:int, ldc:int(-6780709))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(149), ldc:int(20803)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(2704), ldc:int(2705)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5D5 = and:int(var_3_CA:int, ldc:int(1834474866))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-19968), ldc:int(-19967)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(747283266))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1322329968))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1891642796))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1694570629))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-11690010))
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(11302538))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1832229591))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1457460890))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(319094440))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-820477062))
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-11298092))
                        var_11_DB = and:int(ldc:int(-24251), ldc:int(2746))
                        goto(Label_1383)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1128272930))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(842333039))
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1002027103))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1432286106))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-794844978))
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-411965324))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(481053586))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-733926973))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1358392210))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-441417643))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1513117007))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1017288756))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-44973445))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(16905), ldc:int(9505))
                                goto(Label_1019)
                            }
                        }
                    }
                    
                    Label_0865:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-880969348))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2118873319))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(352246858))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-165353247))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(141274630))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2102962525))
                        var_11_DB = and:int(ldc:int(11532), ldc:int(-11533))
                    }
                    
                    Label_1019:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1786833209))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-636814244))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-260298862))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-968572565))
                            goto(Label_0865)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(334863906))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-953445101))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1662796403))
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2111431797))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(578362621))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1019)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0865)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1789299631))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(112270646))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1105637328))
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-451312385))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1383)
                    }
                    
                    Label_1276:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1912268183))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-130751683))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1979579088))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1383:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E0 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1394:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1934863041))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1043045618))
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-558192150))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-137310211))
                        var_17_5E0 = add:int(var_16_109:int, and:int(ldc:int(4103), ldc:int(18257)))
                        looporswitchbreak()
                    }
                    
                    var_3_5D5 = and:int(var_3_5D5:int, ldc:int(114699416))
                }
                
                var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-275077546))
                
                if (cmple:boolean(var_5_7D = var_17_5E0:int, sub:int(var_6_84:int, and:int(ldc:int(27137), ldc:int(261))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
