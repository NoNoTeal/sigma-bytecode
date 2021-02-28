public class \u516c\u3d64\u718f\ub171\u6b5f.\u71ae\u3bd6\u6b0d\u93a2\uc7fe\ucef1 {
    public void \u71ae\u3bd6\u6b0d\u93a2\uc7fe\ucef1() {
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
            invokespecial:Object(Object::<init>, this:\u71ae\u3bd6\u6b0d\u93a2\uc7fe\ucef1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static byte[] \u7d52\uae87\u71ae\u4492\u4ab3\u97e6(byte[] p0) {
        var_1_64 : int
        var_3_6D : ByteArrayInputStream
        var_1_72 : int
        var_4_7A : ByteArrayOutputStream
        var_1_8F : int
        var_5_89 : PushbackInputStream
        var_6_97 : int
        
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
        var_1_64 = and:int(and:int(ldc:int(1467831254), ldc:int(-76189905)), ldc:int(-609754202))
        var_3_6D = initobject:ByteArrayInputStream(ByteArrayInputStream::<init>, p0:byte[])
        var_1_72 = and:int(var_1_64:int, ldc:int(-940083105))
        var_4_7A = initobject:ByteArrayOutputStream(ByteArrayOutputStream::<init>)
        var_1_8F = and:int(var_1_72:int, ldc:int(1530088751))
        var_5_89 = initobject:PushbackInputStream(PushbackInputStream::<init>, var_3_6D:ByteArrayInputStream[expected:InputStream])
        
        try {
            loop {
                var_1_8F = and:int(var_1_8F:int, ldc:int(1806295982))
                var_6_97 = and:int(ldc:int(-10815), ldc:int(10302))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_8F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_8F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0313)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_8F:int, ldc:int(8)), ldc:int(0))) {
                        var_1_8F = and:int(var_1_8F:int, ldc:int(2101383662))
                        goto(Label_0250)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_8F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_8F = and:int(var_1_8F:int, ldc:int(2075092935))
                        
                        if (cmpge:boolean(add:int(var_6_97:int, xor:int(ldc:int(-30590), ldc:int(-30586))), ldc:int(72))) {
                            if (cmpeq:boolean(add:int(var_6_97:int, xor:int(ldc:int(261), ldc:int(257))), ldc:int(72))) {
                                goto(Label_0387)
                            }
                            
                            invokestatic:void(\u71ae\u3bd6\u6b0d\u93a2\uc7fe\ucef1::\u416d\u8258\u8aa5\ube23\u74b1\uf9c5, var_5_89:PushbackInputStream[expected:InputStream], var_4_7A:ByteArrayOutputStream[expected:OutputStream], sub:int(ldc:int(72), var_6_97:int))
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0209:
                    
                    if (cmpne:boolean(and:int(var_1_8F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0387)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_8F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_8F:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_8F = and:int(var_1_8F:int, ldc:int(838038024))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_8F:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_8F = and:int(var_1_8F:int, ldc:int(1266405447))
                    }
                    
                    Label_0250:
                    
                    if (cmpeq:boolean(and:int(var_1_8F:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_8F = and:int(var_1_8F:int, ldc:int(-1719932746))
                        goto(Label_0387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_8F:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_8F = and:int(var_1_8F:int, ldc:int(-730335113))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_8F:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0209)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_8F:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_8F = and:int(var_1_8F:int, ldc:int(2134856390))
                        invokestatic:void(\u71ae\u3bd6\u6b0d\u93a2\uc7fe\ucef1::\u416d\u8258\u8aa5\ube23\u74b1\uf9c5, var_5_89:PushbackInputStream[expected:InputStream], var_4_7A:ByteArrayOutputStream[expected:OutputStream], and:int(ldc:int(18566), ldc:int(4)))
                    }
                    
                    Label_0313:
                    
                    if (cmpeq:boolean(and:int(var_1_8F:int, ldc:int(2)), ldc:int(0))) {
                        var_1_8F = and:int(var_1_8F:int, ldc:int(920536662))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_8F:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0250)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_8F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0209)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_8F:int, ldc:int(4)), ldc:int(0))) {
                            var_1_8F = and:int(var_1_8F:int, ldc:int(1121318425))
                            loopcontinue()
                        }
                        
                        var_1_8F = and:int(var_1_8F:int, ldc:int(1333379614))
                        inc:int(var_6_97, ldc:int(4))
                        loopcontinue()
                    }
                    
                    Label_0387:
                    
                    if (cmpne:boolean(and:int(var_1_8F:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_8F = and:int(var_1_8F:int, ldc:int(2002808237))
                        goto(Label_0313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_8F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0250)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_8F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0209)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_8F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_8F = and:int(var_1_8F:int, ldc:int(1945584687))
                        invokestatic:void(\u71ae\u3bd6\u6b0d\u93a2\uc7fe\ucef1::\u416d\u8258\u8aa5\ube23\u74b1\uf9c5, var_5_89:PushbackInputStream[expected:InputStream], var_4_7A:ByteArrayOutputStream[expected:OutputStream], and:int(ldc:int(18436), ldc:int(326)))
                        looporswitchbreak()
                    }
                    
                    var_1_8F = and:int(var_1_8F:int, ldc:int(1421712065))
                }
            }
        }
        catch (java.io.IOException var_7_1DC) {
            return:byte[](invokevirtual:byte[](ByteArrayOutputStream::toByteArray, var_4_7A:ByteArrayOutputStream))
        }
    }
    
    private static void \u416d\u8258\u8aa5\ube23\u74b1\uf9c5(java.io.InputStream p0, java.io.OutputStream p1, int p2) {
        var_3_CF : int
        var_5_9B : int
        var_3_1B1 : int
        var_6_1BB : byte[]
        var_3_995 : int
        var_7_661 : int
        var_8_664 : int
        var_9_667 : int
        var_10_66A : int
        
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
        var_3_CF = and:int(ldc:int(1156883605), ldc:int(1911745207))
        
        loop {
            if (cmpeq:boolean(and:int(var_3_CF:int, ldc:int(65536)), ldc:int(0))) {
                var_3_CF = and:int(var_3_CF:int, ldc:int(-126839749))
                
                if (cmpge:boolean(p2:int, xor:int(ldc:int(25633), ldc:int(25635)))) {
                    looporswitchbreak()
                }
            }
            
            if (cmpne:boolean(and:int(var_3_CF:int, ldc:int(4194304)), ldc:int(0))) {
                athrow(initobject:IOException(IOException::<init>))
            }
            
            var_3_CF = and:int(var_3_CF:int, ldc:int(-1423912969))
        }
        
        loop {
            Label_0151:
            var_5_9B = invokevirtual:int(InputStream::read, p0:InputStream)
            
            loop {
                if (cmpeq:boolean(and:int(var_3_CF:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0385)
                }
                
                if (cmpne:boolean(and:int(var_3_CF:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0328)
                }
                
                if (cmpne:boolean(and:int(var_3_CF:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0264)
                }
                
                if (cmpne:boolean(and:int(var_3_CF:int, ldc:int(16)), ldc:int(0))) {
                    var_3_CF = and:int(var_3_CF:int, ldc:int(1198831829))
                    
                    if (cmpne:boolean(var_5_9B:int, ldc:int(-1))) {
                        if (cmpne:boolean(var_5_9B:int, ldc:int(10))) {
                            goto(Label_0264)
                        }
                        
                        loopcontinue(Label_0151)
                    }
                }
                
                Label_0196:
                
                if (cmpeq:boolean(and:int(var_3_CF:int, ldc:int(1048576)), ldc:int(0))) {
                    var_3_CF = and:int(var_3_CF:int, ldc:int(-1518620574))
                    goto(Label_0385)
                }
                
                if (cmpne:boolean(and:int(var_3_CF:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0328)
                }
                
                if (cmpne:boolean(and:int(var_3_CF:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_CF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_CF = and:int(var_3_CF:int, ldc:int(-2014932716))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Label_0264:
                
                if (cmpeq:boolean(and:int(var_3_CF:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_3_CF = and:int(var_3_CF:int, ldc:int(-959871779))
                    goto(Label_0385)
                }
                
                if (cmpeq:boolean(and:int(var_3_CF:int, ldc:int(1)), ldc:int(0))) {
                    var_3_CF = and:int(var_3_CF:int, ldc:int(-817918312))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_CF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0196)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_CF:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_CF = and:int(var_3_CF:int, ldc:int(-80356942))
                        loopcontinue()
                    }
                    
                    var_3_CF = and:int(var_3_CF:int, ldc:int(-193143655))
                    
                    if (cmpeq:boolean(var_5_9B:int, ldc:int(13))) {
                        loopcontinue(Label_0151)
                    }
                }
                
                Label_0328:
                
                if (cmpne:boolean(and:int(var_3_CF:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_CF:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_CF = and:int(var_3_CF:int, ldc:int(625747440))
                        goto(Label_0264)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_CF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_CF = and:int(var_3_CF:int, ldc:int(1673239602))
                        goto(Label_0196)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_CF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_CF = and:int(var_3_CF:int, ldc:int(1843624424))
                        loopcontinue()
                    }
                    
                    var_3_CF = and:int(var_3_CF:int, ldc:int(1509222303))
                }
                
                Label_0385:
                
                if (cmpne:boolean(and:int(var_3_CF:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0328)
                }
                
                if (cmpne:boolean(and:int(var_3_CF:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_CF = and:int(var_3_CF:int, ldc:int(-1471106372))
                    goto(Label_0264)
                }
                
                if (cmpeq:boolean(and:int(var_3_CF:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0196)
                }
                
                if (cmpeq:boolean(and:int(var_3_CF:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0429)
                }
                
                var_3_CF = and:int(var_3_CF:int, ldc:int(-385794047))
            }
            
            athrow(initobject:IOException(IOException::<init>))
            Label_0429:
            var_3_1B1 = and:int(var_3_CF:int, ldc:int(-739002275))
            var_6_1BB = newarray:byte[](byte.class, and:int(ldc:int(12565), ldc:int(78)))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1532)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(256)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-174189001))
                    goto(Label_1416)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1293)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(134217728)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-81762056))
                    goto(Label_1158)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1034)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-1204360755))
                    goto(Label_0927)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(122947788))
                    goto(Label_0804)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0698)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(2048)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(1593176763))
                    storeelement:byte(var_6_1BB:byte[], and:int(ldc:int(-16208), ldc:int(8975)), i2b:byte(var_5_9B:int))
                }
                
                Label_0558:
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(16)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(738095521))
                    goto(Label_1532)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_1416)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_1293)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(333575264))
                    goto(Label_1158)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(4194304)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(1138108435))
                    goto(Label_1034)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(1048576)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-1123471194))
                    goto(Label_0927)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(2)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-1690366254))
                    goto(Label_0804)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(256)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(1131777964))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-377556297))
                    var_5_9B = invokestatic:int(\u71ae\u3bd6\u6b0d\u93a2\uc7fe\ucef1::\ub18d\u7c6b\u647c\ud12e\u3d64\u88c5, p0:InputStream, var_6_1BB:byte[], xor:int(ldc:int(2193), ldc:int(2192)), sub:int(p2:int, and:int(ldc:int(427), ldc:int(24593))))
                }
                
                Label_0698:
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(134217728)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-29533480))
                    goto(Label_1532)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1416)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_1293)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_1158)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1034)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(2097152)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(338997340))
                    goto(Label_0927)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(134217728)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-1247640158))
                        goto(Label_0558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-1622609489))
                        loopcontinue()
                    }
                    
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-319323713))
                    
                    if (cmpne:boolean(var_5_9B:int, ldc:int(-1))) {
                        if (cmpgt:boolean(p2:int, xor:int(ldc:int(24577), ldc:int(24578)))) {
                            goto(Label_0927)
                        }
                        
                        goto(Label_1158)
                    }
                }
                
                Label_0804:
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_1532)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_1416)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_1293)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(2048)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-851198153))
                    goto(Label_1158)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_1034)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(1)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(370046746))
                        goto(Label_0698)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(2107155803))
                        goto(Label_0558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-1132919896))
                        loopcontinue()
                    }
                    
                    athrow(initobject:IOException(IOException::<init>))
                }
                
                Label_0927:
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_1532)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-1819767132))
                    goto(Label_1416)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(1048576)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-605433067))
                    goto(Label_1293)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1158)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(1048576)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(180340814))
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0698)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-1016007233))
                    
                    if (cmpne:boolean(loadelement:byte(var_6_1BB:byte[], and:int(ldc:int(3083), ldc:int(12963))), ldc:byte(61))) {
                        goto(Label_1158)
                    }
                }
                
                Label_1034:
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-462090783))
                    goto(Label_1532)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_1416)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(1951364442))
                    goto(Label_1293)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(1880729752))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(454497325))
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0804)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0698)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-2052563295))
                        goto(Label_0558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(1)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(456311886))
                        loopcontinue()
                    }
                    
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-84550885))
                    p2 = xor:int(ldc:int(16776), ldc:int(16779))
                }
                
                Label_1158:
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-623076342))
                    goto(Label_1532)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1416)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(2097152)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(1927768493))
                        goto(Label_1034)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(1538098295))
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(366188369))
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(1263316831))
                        goto(Label_0698)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-71276710))
                        goto(Label_0558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(1)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-41313812))
                        loopcontinue()
                    }
                    
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(1098366079))
                    
                    if (cmple:boolean(p2:int, and:int(ldc:int(9890), ldc:int(263)))) {
                        goto(Label_1532)
                    }
                }
                
                Label_1293:
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_1532)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(1048576)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1158)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-1173394250))
                        goto(Label_1034)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(1238689881))
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(2075479401))
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0698)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-1879281876))
                        goto(Label_0558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(836458969))
                        loopcontinue()
                    }
                    
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(1954318133))
                    
                    if (cmpne:boolean(loadelement:byte(var_6_1BB:byte[], and:int(ldc:int(1558), ldc:int(12298))), ldc:byte(61))) {
                        goto(Label_1532)
                    }
                }
                
                Label_1416:
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(329637633))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1293)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(641594763))
                        goto(Label_1158)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1034)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(1515468029))
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-1792748564))
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0698)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_1B1 = and:int(var_3_1B1:int, ldc:int(901913184))
                        loopcontinue()
                    }
                    
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-629934213))
                    p2 = and:int(ldc:int(7942), ldc:int(24738))
                }
                
                Label_1532:
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1416)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1293)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_1158)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-15776216))
                    goto(Label_1034)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(256)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-1935490112))
                    goto(Label_0927)
                }
                
                if (cmpne:boolean(and:int(var_3_1B1:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-1451661389))
                    goto(Label_0804)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(4194304)), ldc:int(0))) {
                    var_3_1B1 = and:int(var_3_1B1:int, ldc:int(-1033767435))
                    goto(Label_0698)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0558)
                }
                
                if (cmpeq:boolean(and:int(var_3_1B1:int, ldc:int(2048)), ldc:int(0))) {
                    var_3_995 = and:int(var_3_1B1:int, ldc:int(1853134557))
                    var_7_661 = ldc:int(-1)
                    var_8_664 = ldc:int(-1)
                    var_9_667 = ldc:int(-1)
                    var_10_66A = ldc:int(-1)
                    
                    loop {
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_2927)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(256)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(-1069735662))
                            goto(Label_2797)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(-1065551526))
                            goto(Label_2648)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(2)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(1670465865))
                            goto(Label_2503)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(-1409042146))
                            goto(Label_2354)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_2188)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_2064)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1924)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(1458604369))
                            
                            switch (p2:int) {
                                case 4:
                                    var_10_66A = loadelement:byte[expected:int](getstatic:byte[](\u71ae\u3bd6\u6b0d\u93a2\uc7fe\ucef1::\u3711\ub171\uc246\u759a\u16f6\u3d64), and:int(loadelement:byte[expected:int](var_6_1BB:byte[], and:int(ldc:int(3), ldc:int(1095))), xor:int(ldc:int(16973), ldc:int(17074))))
                                
                                case 2:
                                    goto(Label_1924)
                            }
                        }
                        
                        Label_1800:
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_2927)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_2797)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_2648)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_2503)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_2354)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(1457562830))
                            goto(Label_2188)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(-1925386988))
                            goto(Label_2064)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(-1239780491))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(536870912)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(1788109682))
                                loopcontinue()
                            }
                            
                            var_3_995 = and:int(var_3_995:int, ldc:int(-343953317))
                            var_9_667 = loadelement:byte[expected:int](getstatic:byte[](\u71ae\u3bd6\u6b0d\u93a2\uc7fe\ucef1::\u3711\ub171\uc246\u759a\u16f6\u3d64), and:int(loadelement:byte[expected:int](var_6_1BB:byte[], xor:int(ldc:int(2052), ldc:int(2054))), xor:int(ldc:int(307), ldc:int(460))))
                        }
                        
                        Label_1924:
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_2927)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(256)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(1369572808))
                            goto(Label_2797)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(346892387))
                            goto(Label_2648)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(1913901977))
                            goto(Label_2503)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(32)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(-306402980))
                            goto(Label_2354)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(1874237341))
                            goto(Label_2188)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(2048)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(33554432)), ldc:int(0))) {
                                goto(Label_1800)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(2097152)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(-1013149402))
                                loopcontinue()
                            }
                            
                            var_3_995 = and:int(var_3_995:int, ldc:int(-276907009))
                            var_8_664 = loadelement:byte[expected:int](getstatic:byte[](\u71ae\u3bd6\u6b0d\u93a2\uc7fe\ucef1::\u3711\ub171\uc246\u759a\u16f6\u3d64), and:int(loadelement:byte[expected:int](var_6_1BB:byte[], xor:int(ldc:int(-28032), ldc:int(-28031))), and:int(ldc:int(4351), ldc:int(20479))))
                        }
                        
                        Label_2064:
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_2927)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(115367374))
                            goto(Label_2797)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(32)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(2117085092))
                            goto(Label_2648)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(1520143195))
                            goto(Label_2503)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_2354)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(1)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(32768)), ldc:int(0))) {
                                goto(Label_1924)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_1800)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(4194304)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(-826466949))
                                loopcontinue()
                            }
                            
                            var_3_995 = and:int(var_3_995:int, ldc:int(1341755545))
                            var_7_661 = loadelement:byte[expected:int](getstatic:byte[](\u71ae\u3bd6\u6b0d\u93a2\uc7fe\ucef1::\u3711\ub171\uc246\u759a\u16f6\u3d64), and:int(loadelement:byte[expected:int](var_6_1BB:byte[], and:int(ldc:int(1802), ldc:int(-8063))), xor:int(ldc:int(-28651), ldc:int(-28438))))
                        }
                        
                        Label_2188:
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_2927)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(-1022940073))
                            goto(Label_2797)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_2648)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_2503)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(268435456)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(2)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(-203313075))
                                goto(Label_2064)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(-1816685823))
                                goto(Label_1924)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Label_1800)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(536870912)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_3_995 = and:int(var_3_995:int, ldc:int(2020706901))
                            
                            switch (p2:int) {
                                case 2:
                                    invokevirtual:void(OutputStream::write, p1:OutputStream, i2b:byte(or:int(and:int(shl:int(var_7_661:int, and:int(ldc:int(1603), ldc:int(2310))), and:int(ldc:int(16636), ldc:int(4607))), and:int(ushr:int(var_8_664:int, and:int(ldc:int(6), ldc:int(22564))), xor:int(ldc:int(-29693), ldc:int(-29696))))))
                                    looporswitchbreak()
                                
                                case 3:
                                    invokevirtual:void(OutputStream::write, p1:OutputStream, i2b:byte(or:int(and:int(shl:int(var_7_661:int, and:int(ldc:int(8198), ldc:int(16442))), xor:int(ldc:int(20789), ldc:int(20937))), and:int(ushr:int(var_8_664:int, and:int(ldc:int(4772), ldc:int(3084))), xor:int(ldc:int(-32567), ldc:int(-32566))))))
                                    goto(Label_2503)
                                
                                case 4:
                                    invokevirtual:void(OutputStream::write, p1:OutputStream, i2b:byte(or:int(and:int(shl:int(var_7_661:int, and:int(ldc:int(2338), ldc:int(25162))), xor:int(ldc:int(17081), ldc:int(16965))), and:int(ushr:int(var_8_664:int, xor:int(ldc:int(98), ldc:int(102))), and:int(ldc:int(419), ldc:int(16963))))))
                                    goto(Label_2797)
                                
                                default:
                                    looporswitchbreak(Label_3083)
                            }
                        }
                        
                        Label_2354:
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(2108439518))
                            goto(Label_2927)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_2797)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_2648)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(1073741824)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(256)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(-1677545320))
                                goto(Label_2188)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(2)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(-689647515))
                                goto(Label_2064)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(32768)), ldc:int(0))) {
                                goto(Label_1924)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(4194304)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(-237798466))
                                goto(Label_1800)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(32)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(1970659007))
                                looporswitchbreak()
                            }
                            
                            loopcontinue()
                        }
                        
                        Label_2503:
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(-205164068))
                            goto(Label_2927)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(1285440405))
                            goto(Label_2797)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(1204937686))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(2097152)), ldc:int(0))) {
                                goto(Label_2354)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Label_2188)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(134217728)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(-574505578))
                                goto(Label_2064)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(16384)), ldc:int(0))) {
                                goto(Label_1924)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(268435456)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(103984064))
                                goto(Label_1800)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(268435456)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_3_995 = and:int(var_3_995:int, ldc:int(1484554491))
                            invokevirtual:void(OutputStream::write, p1:OutputStream, i2b:byte(or:int(and:int(shl:int(var_8_664:int, and:int(ldc:int(16460), ldc:int(10261))), and:int(ldc:int(4603), ldc:int(1776))), and:int(ushr:int(var_9_667:int, xor:int(ldc:int(720), ldc:int(722))), ldc:int(15)))))
                        }
                        
                        Label_2648:
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_2927)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(1073741824)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(4194304)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(-817790468))
                                goto(Label_2503)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(33554432)), ldc:int(0))) {
                                goto(Label_2354)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(-1221533208))
                                goto(Label_2188)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(2097152)), ldc:int(0))) {
                                goto(Label_2064)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(32768)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(-1769008411))
                                goto(Label_1924)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(-1171831072))
                                goto(Label_1800)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(4194304)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(1182072799))
                                looporswitchbreak()
                            }
                            
                            loopcontinue()
                        }
                        
                        Label_2797:
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(33554432)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_2648)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Label_2503)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_2354)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(2048)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(49839846))
                                goto(Label_2188)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(33554432)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(410889157))
                                goto(Label_2064)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(2048)), ldc:int(0))) {
                                goto(Label_1924)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_995:int, ldc:int(134217728)), ldc:int(0))) {
                                goto(Label_1800)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(4194304)), ldc:int(0))) {
                                var_3_995 = and:int(var_3_995:int, ldc:int(-1375024057))
                                loopcontinue()
                            }
                            
                            var_3_995 = and:int(var_3_995:int, ldc:int(1249111729))
                            invokevirtual:void(OutputStream::write, p1:OutputStream, i2b:byte(or:int(and:int(shl:int(var_8_664:int, and:int(ldc:int(21542), ldc:int(516))), xor:int(ldc:int(791), ldc:int(999))), and:int(ushr:int(var_9_667:int, and:int(ldc:int(70), ldc:int(9370))), ldc:int(15)))))
                        }
                        
                        Label_2927:
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(498686513))
                            goto(Label_2797)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(-273001184))
                            goto(Label_2648)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_2503)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(32)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(651545318))
                            goto(Label_2354)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(-1559500850))
                            goto(Label_2188)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_2064)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(306580154))
                            goto(Label_1924)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_995:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(1774440588))
                            goto(Label_1800)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_995:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_995 = and:int(var_3_995:int, ldc:int(-730794405))
                            invokevirtual:void(OutputStream::write, p1:OutputStream, i2b:byte(or:int(and:int(shl:int(var_9_667:int, ldc:int(6)), and:int(ldc:int(26840), ldc:int(706))), and:int(var_10_66A:int, ldc:int(63)))))
                            looporswitchbreak()
                        }
                        
                        var_3_995 = and:int(var_3_995:int, ldc:int(-189034273))
                    }
                    
                    Label_3083:
                }
            }
        }
    }
    
    private static int \ub18d\u7c6b\u647c\ud12e\u3d64\u88c5(java.io.InputStream p0, byte[] p1, int p2, int p3) {
        var_4_F2 : int
        var_6_6C : int
        var_7_A9 : int
        stack_106_0 : int [generated]
        
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
            var_4_F2 = and:int(ldc:int(1435509742), ldc:int(-1184033))
            var_6_6C = and:int(ldc:int(-13083), ldc:int(13066))
            
            loop {
                if (cmpne:boolean(and:int(var_4_F2:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_4_F2 = and:int(var_4_F2:int, ldc:int(1856333775))
                    
                    if (cmplt:boolean(var_6_6C:int, p3:int)) {
                        var_7_A9 = invokevirtual:int(InputStream::read, p0:InputStream)
                        
                        if (cmpeq:boolean(var_7_A9:int, ldc:int(-1))) {
                            if (cmpne:boolean(var_6_6C:int, ldc:int(0))) {
                                goto(Label_0217)
                            }
                            
                            stack_106_0 = ldc:int(-1)
                            looporswitchbreak()
                        }
                        
                        Label_0177:
                        
                        if (cmpne:boolean(and:int(var_4_F2:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_4_F2 = and:int(var_4_F2:int, ldc:int(-592747554))
                            storeelement:byte(p1:byte[], add:int(var_6_6C:int, p2:int), i2b:byte(var_7_A9:int))
                            inc:int(var_6_6C, ldc:int(1))
                            loopcontinue()
                        }
                        
                        Label_0217:
                        
                        if (cmpne:boolean(and:int(var_4_F2:int, ldc:int(1)), ldc:int(0))) {
                            var_4_F2 = and:int(var_4_F2:int, ldc:int(-1749198196))
                            goto(Label_0177)
                        }
                        
                        var_4_F2 = and:int(var_4_F2:int, ldc:int(1960829692))
                        stack_106_0 = var_6_6C:int
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_F2:int, ldc:int(1073741824)), ldc:int(0))) {
                    return:int(p3:int)
                }
                
                var_4_F2 = and:int(var_4_F2:int, ldc:int(1419068806))
            }
            
            return:int(stack_106_0:int)
        }
        
        goto(Label_0006)
    }
    
    static {
        expr_69 : byte[] [generated]
        
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
            expr_69 = newarray:byte[](byte.class, xor:int(ldc:int(-30129), ldc:int(-29873)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(5718), ldc:int(-22103)), ldc:byte(-1))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(20612), ldc:int(20614)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(24836), ldc:int(24837)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(38), ldc:int(34)), storeelement:byte(expr_69:byte[], and:int(ldc:int(263), ldc:int(3627)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(6), storeelement:byte(expr_69:byte[], xor:int(ldc:int(16451), ldc:int(16454)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(8), storeelement:byte(expr_69:byte[], ldc:int(7), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(10), storeelement:byte(expr_69:byte[], ldc:int(9), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(12), storeelement:byte(expr_69:byte[], ldc:int(11), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(14), storeelement:byte(expr_69:byte[], ldc:int(13), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(16), storeelement:byte(expr_69:byte[], ldc:int(15), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(18), storeelement:byte(expr_69:byte[], ldc:int(17), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(20), storeelement:byte(expr_69:byte[], ldc:int(19), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(22), storeelement:byte(expr_69:byte[], ldc:int(21), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(24), storeelement:byte(expr_69:byte[], ldc:int(23), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(26), storeelement:byte(expr_69:byte[], ldc:int(25), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(28), storeelement:byte(expr_69:byte[], ldc:int(27), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(30), storeelement:byte(expr_69:byte[], ldc:int(29), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(32), storeelement:byte(expr_69:byte[], ldc:int(31), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(34), storeelement:byte(expr_69:byte[], ldc:int(33), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(36), storeelement:byte(expr_69:byte[], ldc:int(35), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(38), storeelement:byte(expr_69:byte[], ldc:int(37), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(40), storeelement:byte(expr_69:byte[], ldc:int(39), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(42), storeelement:byte(expr_69:byte[], ldc:int(41), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(43), ldc:byte(62))
            storeelement:byte(expr_69:byte[], ldc:int(44), ldc:byte(-1))
            storeelement:byte(expr_69:byte[], ldc:int(46), storeelement:byte(expr_69:byte[], ldc:int(45), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(47), ldc:byte(63))
            storeelement:byte(expr_69:byte[], ldc:int(48), ldc:byte(52))
            storeelement:byte(expr_69:byte[], ldc:int(49), ldc:byte(53))
            storeelement:byte(expr_69:byte[], ldc:int(50), ldc:byte(54))
            storeelement:byte(expr_69:byte[], ldc:int(51), ldc:byte(55))
            storeelement:byte(expr_69:byte[], ldc:int(52), ldc:byte(56))
            storeelement:byte(expr_69:byte[], ldc:int(53), ldc:byte(57))
            storeelement:byte(expr_69:byte[], ldc:int(54), ldc:byte(58))
            storeelement:byte(expr_69:byte[], ldc:int(55), ldc:byte(59))
            storeelement:byte(expr_69:byte[], ldc:int(56), ldc:byte(60))
            storeelement:byte(expr_69:byte[], ldc:int(57), ldc:byte(61))
            storeelement:byte(expr_69:byte[], ldc:int(58), ldc:byte(-1))
            storeelement:byte(expr_69:byte[], ldc:int(60), storeelement:byte(expr_69:byte[], ldc:int(59), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(62), storeelement:byte(expr_69:byte[], ldc:int(61), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(64), storeelement:byte(expr_69:byte[], ldc:int(63), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(65), and:int[expected:byte](ldc:int(2435), ldc:int(-19340)))
            storeelement:byte(expr_69:byte[], ldc:int(66), and:int[expected:byte](ldc:int(2313), ldc:int(4099)))
            storeelement:byte(expr_69:byte[], ldc:int(67), xor:int[expected:byte](ldc:int(514), ldc:int(512)))
            storeelement:byte(expr_69:byte[], ldc:int(68), xor:int[expected:byte](ldc:int(0), ldc:int(3)))
            storeelement:byte(expr_69:byte[], ldc:int(69), and:int[expected:byte](ldc:int(16532), ldc:int(8718)))
            storeelement:byte(expr_69:byte[], ldc:int(70), and:int[expected:byte](ldc:int(3101), ldc:int(4133)))
            storeelement:byte(expr_69:byte[], ldc:int(71), ldc:byte(6))
            storeelement:byte(expr_69:byte[], ldc:int(72), ldc:byte(7))
            storeelement:byte(expr_69:byte[], ldc:int(73), ldc:byte(8))
            storeelement:byte(expr_69:byte[], ldc:int(74), ldc:byte(9))
            storeelement:byte(expr_69:byte[], ldc:int(75), ldc:byte(10))
            storeelement:byte(expr_69:byte[], ldc:int(76), ldc:byte(11))
            storeelement:byte(expr_69:byte[], ldc:int(77), ldc:byte(12))
            storeelement:byte(expr_69:byte[], ldc:int(78), ldc:byte(13))
            storeelement:byte(expr_69:byte[], ldc:int(79), ldc:byte(14))
            storeelement:byte(expr_69:byte[], ldc:int(80), ldc:byte(15))
            storeelement:byte(expr_69:byte[], ldc:int(81), ldc:byte(16))
            storeelement:byte(expr_69:byte[], ldc:int(82), ldc:byte(17))
            storeelement:byte(expr_69:byte[], ldc:int(83), ldc:byte(18))
            storeelement:byte(expr_69:byte[], ldc:int(84), ldc:byte(19))
            storeelement:byte(expr_69:byte[], ldc:int(85), ldc:byte(20))
            storeelement:byte(expr_69:byte[], ldc:int(86), ldc:byte(21))
            storeelement:byte(expr_69:byte[], ldc:int(87), ldc:byte(22))
            storeelement:byte(expr_69:byte[], ldc:int(88), ldc:byte(23))
            storeelement:byte(expr_69:byte[], ldc:int(89), ldc:byte(24))
            storeelement:byte(expr_69:byte[], ldc:int(90), ldc:byte(25))
            storeelement:byte(expr_69:byte[], ldc:int(92), storeelement:byte(expr_69:byte[], ldc:int(91), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(94), storeelement:byte(expr_69:byte[], ldc:int(93), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(96), storeelement:byte(expr_69:byte[], ldc:int(95), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(97), ldc:byte(26))
            storeelement:byte(expr_69:byte[], ldc:int(98), ldc:byte(27))
            storeelement:byte(expr_69:byte[], ldc:int(99), ldc:byte(28))
            storeelement:byte(expr_69:byte[], ldc:int(100), ldc:byte(29))
            storeelement:byte(expr_69:byte[], ldc:int(101), ldc:byte(30))
            storeelement:byte(expr_69:byte[], ldc:int(102), ldc:byte(31))
            storeelement:byte(expr_69:byte[], ldc:int(103), ldc:byte(32))
            storeelement:byte(expr_69:byte[], ldc:int(104), ldc:byte(33))
            storeelement:byte(expr_69:byte[], ldc:int(105), ldc:byte(34))
            storeelement:byte(expr_69:byte[], ldc:int(106), ldc:byte(35))
            storeelement:byte(expr_69:byte[], ldc:int(107), ldc:byte(36))
            storeelement:byte(expr_69:byte[], ldc:int(108), ldc:byte(37))
            storeelement:byte(expr_69:byte[], ldc:int(109), ldc:byte(38))
            storeelement:byte(expr_69:byte[], ldc:int(110), ldc:byte(39))
            storeelement:byte(expr_69:byte[], ldc:int(111), ldc:byte(40))
            storeelement:byte(expr_69:byte[], ldc:int(112), ldc:byte(41))
            storeelement:byte(expr_69:byte[], ldc:int(113), ldc:byte(42))
            storeelement:byte(expr_69:byte[], ldc:int(114), ldc:byte(43))
            storeelement:byte(expr_69:byte[], ldc:int(115), ldc:byte(44))
            storeelement:byte(expr_69:byte[], ldc:int(116), ldc:byte(45))
            storeelement:byte(expr_69:byte[], ldc:int(117), ldc:byte(46))
            storeelement:byte(expr_69:byte[], ldc:int(118), ldc:byte(47))
            storeelement:byte(expr_69:byte[], ldc:int(119), ldc:byte(48))
            storeelement:byte(expr_69:byte[], ldc:int(120), ldc:byte(49))
            storeelement:byte(expr_69:byte[], ldc:int(121), ldc:byte(50))
            storeelement:byte(expr_69:byte[], ldc:int(122), ldc:byte(51))
            storeelement:byte(expr_69:byte[], ldc:int(124), storeelement:byte(expr_69:byte[], ldc:int(123), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], ldc:int(126), storeelement:byte(expr_69:byte[], ldc:int(125), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(253), ldc:int(125)), storeelement:byte(expr_69:byte[], ldc:int(127), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(17282), ldc:int(162)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(2078), ldc:int(2207)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(9420), ldc:int(6277)), storeelement:byte(expr_69:byte[], and:int(ldc:int(131), ldc:int(18343)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(1463), ldc:int(10374)), storeelement:byte(expr_69:byte[], and:int(ldc:int(17029), ldc:int(12453)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(1619), ldc:int(1755)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(34), ldc:int(165)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(16644), ldc:int(16782)), storeelement:byte(expr_69:byte[], and:int(ldc:int(16809), ldc:int(4809)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(462), ldc:int(1676)), storeelement:byte(expr_69:byte[], and:int(ldc:int(459), ldc:int(139)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(9118), ldc:int(16526)), storeelement:byte(expr_69:byte[], and:int(ldc:int(5517), ldc:int(24797)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(2681), ldc:int(2793)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(1358), ldc:int(1473)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(-24011), ldc:int(-23897)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(2088), ldc:int(2233)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(6805), ldc:int(1172)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(9055), ldc:int(9164)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(4246), ldc:int(3830)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(6204), ldc:int(6313)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(2300), ldc:int(20889)), storeelement:byte(expr_69:byte[], and:int(ldc:int(8855), ldc:int(19671)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(2266), ldc:int(702)), storeelement:byte(expr_69:byte[], and:int(ldc:int(159), ldc:int(17657)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(10460), ldc:int(4253)), storeelement:byte(expr_69:byte[], and:int(ldc:int(155), ldc:int(28667)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(218), ldc:int(68)), storeelement:byte(expr_69:byte[], and:int(ldc:int(12445), ldc:int(157)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(1549), ldc:int(1709)), storeelement:byte(expr_69:byte[], and:int(ldc:int(8607), ldc:int(191)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(5527), ldc:int(5429)), storeelement:byte(expr_69:byte[], and:int(ldc:int(13473), ldc:int(17397)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(17646), ldc:int(948)), storeelement:byte(expr_69:byte[], and:int(ldc:int(2219), ldc:int(12979)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(65), ldc:int(231)), storeelement:byte(expr_69:byte[], and:int(ldc:int(5293), ldc:int(27045)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(107), ldc:int(195)), storeelement:byte(expr_69:byte[], and:int(ldc:int(16551), ldc:int(12463)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(1785), ldc:int(1619)), storeelement:byte(expr_69:byte[], and:int(ldc:int(16809), ldc:int(8959)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(8365), ldc:int(19374)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(25144), ldc:int(25235)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(789), ldc:int(955)), storeelement:byte(expr_69:byte[], and:int(ldc:int(6317), ldc:int(431)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(504), ldc:int(13493)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(8800), ldc:int(8911)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(6326), ldc:int(10171)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(16421), ldc:int(16532)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(-22186), ldc:int(-22046)), storeelement:byte(expr_69:byte[], and:int(ldc:int(20667), ldc:int(9655)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(10934), ldc:int(502)), storeelement:byte(expr_69:byte[], and:int(ldc:int(2743), ldc:int(4349)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(184), ldc:int(188)), storeelement:byte(expr_69:byte[], and:int(ldc:int(21239), ldc:int(191)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(529), ldc:int(683)), storeelement:byte(expr_69:byte[], and:int(ldc:int(12539), ldc:int(19645)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(956), ldc:int(13500)), storeelement:byte(expr_69:byte[], and:int(ldc:int(4347), ldc:int(19899)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(625), ldc:int(719)), storeelement:byte(expr_69:byte[], and:int(ldc:int(23741), ldc:int(8383)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(10453), ldc:int(192)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(3620), ldc:int(3739)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(556), ldc:int(750)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(2450), ldc:int(2387)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(1789), ldc:int(16836)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(31), ldc:int(220)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(2502), ldc:int(18135)), storeelement:byte(expr_69:byte[], and:int(ldc:int(16615), ldc:int(453)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(-32748), ldc:int(-32548)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(189), ldc:int(122)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(-8031), ldc:int(-8085)), storeelement:byte(expr_69:byte[], and:int(ldc:int(10985), ldc:int(4301)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(8363), ldc:int(8295)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(2137), ldc:int(2194)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(-32765), ldc:int(-32563)), storeelement:byte(expr_69:byte[], and:int(ldc:int(2253), ldc:int(28877)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(16490), ldc:int(16570)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(8395), ldc:int(8196)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(11474), ldc:int(20691)), storeelement:byte(expr_69:byte[], and:int(ldc:int(16593), ldc:int(2513)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(199), ldc:int(19)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(2222), ldc:int(2173)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(-24120), ldc:int(-24290)), storeelement:byte(expr_69:byte[], and:int(ldc:int(213), ldc:int(3317)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(220), ldc:int(4824)), storeelement:byte(expr_69:byte[], and:int(ldc:int(10967), ldc:int(215)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(-32614), ldc:int(-32704)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(20569), ldc:int(20608)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(8956), ldc:int(5341)), storeelement:byte(expr_69:byte[], and:int(ldc:int(1275), ldc:int(14811)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(18142), ldc:int(8702)), storeelement:byte(expr_69:byte[], and:int(ldc:int(5341), ldc:int(11007)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(9446), ldc:int(232)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(638), ldc:int(673)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(227), ldc:int(8438)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(-3968), ldc:int(-3999)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(22756), ldc:int(8445)), storeelement:byte(expr_69:byte[], and:int(ldc:int(4843), ldc:int(1511)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(2151), ldc:int(2177)), storeelement:byte(expr_69:byte[], and:int(ldc:int(1255), ldc:int(245)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(20822), ldc:int(20926)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(360), ldc:int(399)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(16623), ldc:int(6634)), storeelement:byte(expr_69:byte[], and:int(ldc:int(233), ldc:int(1519)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(748), ldc:int(23020)), storeelement:byte(expr_69:byte[], and:int(ldc:int(14315), ldc:int(18671)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(1262), ldc:int(16622)), storeelement:byte(expr_69:byte[], and:int(ldc:int(6125), ldc:int(2285)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(-28030), ldc:int(-28046)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(1746), ldc:int(1597)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(-15858), ldc:int(-15620)), storeelement:byte(expr_69:byte[], xor:int(ldc:int(28754), ldc:int(28835)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(8438), ldc:int(4852)), storeelement:byte(expr_69:byte[], and:int(ldc:int(2551), ldc:int(26363)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(12487), ldc:int(12337)), storeelement:byte(expr_69:byte[], and:int(ldc:int(245), ldc:int(10231)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(10877), ldc:int(10885)), storeelement:byte(expr_69:byte[], and:int(ldc:int(9719), ldc:int(4351)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(4285), ldc:int(4167)), storeelement:byte(expr_69:byte[], and:int(ldc:int(2811), ldc:int(16893)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(509), ldc:int(1276)), storeelement:byte(expr_69:byte[], and:int(ldc:int(9471), ldc:int(507)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], xor:int(ldc:int(253), ldc:int(3)), storeelement:byte(expr_69:byte[], and:int(ldc:int(14077), ldc:int(255)), ldc:byte(-1)))
            storeelement:byte(expr_69:byte[], and:int(ldc:int(1279), ldc:int(2815)), and:int[expected:byte](ldc:int(3180), ldc:int(-3181)))
            putstatic:byte[](\u71ae\u3bd6\u6b0d\u93a2\uc7fe\ucef1::\u3711\ub171\uc246\u759a\u16f6\u3d64, expr_69:byte[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3e75\u97b7\u97e6\ubefe\u183a\u4cd9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_641 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_64C : int
        
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
        var_3_641 = and:int(ldc:int(-1824442345), ldc:int(990361262))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u71ae\u3bd6\u6b0d\u93a2\uc7fe\ucef1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
            var_3_641 = and:int(var_3_641:int, ldc:int(-622519993))
        }
        else {
            var_3_641 = and:int(var_3_641:int, ldc:int(-1086377674))
            var_5_8A = and:int(ldc:int(15057), ldc:int(-15090))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-6332), ldc:int(2235)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_641:int, ldc:int(1944025935))
                    var_9_D0 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_91:int, xor:int(ldc:int(-25600), ldc:int(-25599)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(17415), ldc:int(1)))), var_7_A0:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_641 = and:int(var_3_E2:int, ldc:int(1475214791))
                    var_14_11D = var_7_A0:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(-14328), ldc:int(-14327)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_91:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-184007339))
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-660195962))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1770616769))
                        goto(Label_1095)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0951)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1631291341))
                        goto(Label_0677)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(708478075))
                        goto(Label_0574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-681445950))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0574)
                            }
                            
                            goto(Label_0823)
                        }
                    }
                    
                    Label_0423:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1813627754))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-2074717462))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1095)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(469172956))
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0677)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1821524317))
                            var_11_F3 = and:int(ldc:int(12395), ldc:int(-12652))
                            goto(Label_1483)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0574:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1385453990))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1095)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0951)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1834582073))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-745162446))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0823)
                        }
                    }
                    
                    Label_0677:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1384269636))
                        goto(Label_1095)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1538221604))
                        goto(Label_0951)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(994824038))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(401898948))
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-211160497))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(2097304179))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1287571294))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0823:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1095)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-574788291))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1805043518))
                            goto(Label_0677)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1986874988))
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1836319676))
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1947792038))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(858371595))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F3 = and:int(ldc:int(20521), ldc:int(10965))
                                goto(Label_1095)
                            }
                        }
                    }
                    
                    Label_0951:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1175269723))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1594503268))
                            goto(Label_0823)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0677)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-657362296))
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-739428930))
                        var_11_F3 = and:int(ldc:int(26918), ldc:int(-28520))
                    }
                    
                    Label_1095:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-2001736038))
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1743608192))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0951)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1380905363))
                            goto(Label_0823)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0677)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1758195599))
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(727624070))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-207503822))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1362)
                            }
                        }
                    }
                    
                    Label_1222:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1796848238))
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1095)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1331956507))
                            goto(Label_0951)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0823)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(2006749023))
                            goto(Label_0677)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1298287197))
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1367459735))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(1059549446))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_8A:int, var_16_121:int)
                        goto(Label_1483)
                    }
                    
                    Label_1362:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1078600704))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1095)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(242811211))
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1783185891))
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0677)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0574)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_641 = and:int(var_3_641:int, ldc:int(1466267494))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1483:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64C = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1494:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1590872130))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1839689575))
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1095)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0677)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(284553291))
                        goto(Label_0574)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-672056770))
                        var_17_64C = add:int(var_16_121:int, xor:int(ldc:int(528), ldc:int(529)))
                        looporswitchbreak()
                    }
                    
                    var_3_641 = and:int(var_3_641:int, ldc:int(2040330478))
                }
                
                var_3_641 = and:int(var_3_641:int, ldc:int(1997763843))
                
                if (cmple:boolean(var_5_8A = var_17_64C:int, sub:int(var_6_91:int, and:int(ldc:int(3747), ldc:int(81))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_641 = and:int(var_3_641:int, ldc:int(-2082068924))
            goto(Label_0108)
        }
    }
}
