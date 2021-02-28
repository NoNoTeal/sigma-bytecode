public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\uc238\u6cfe\u97e6\ucb79\ub7dc\uc84e {
    public void \uc238\u6cfe\u97e6\ucb79\ub7dc\uc84e(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18 p0, int p1, float p2, int p3) {
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
            putfield:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18(\uc238\u6cfe\u97e6\ucb79\ub7dc\uc84e::\ua61f\ufcaf\u6c56\u8640\u965f\u0b8e, this:\uc238\u6cfe\u97e6\ucb79\ub7dc\uc84e, p0:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18)
            putfield:int(\uc238\u6cfe\u97e6\ucb79\ub7dc\uc84e::\ubefe\u8753\u7af6\ud171\u0800\uc2e8, this:\uc238\u6cfe\u97e6\ucb79\ub7dc\uc84e, p3:int)
            invokespecial:Long2ByteOpenHashMap(Long2ByteOpenHashMap::<init>, this:\uc238\u6cfe\u97e6\ucb79\ub7dc\uc84e, p1:int, p2:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void rehash(int p0) {
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
            
            if (cmpgt:boolean(p0:int, getfield:int(\uc238\u6cfe\u97e6\ucb79\ub7dc\uc84e::\ubefe\u8753\u7af6\ud171\u0800\uc2e8, this:\uc238\u6cfe\u97e6\ucb79\ub7dc\uc84e))) {
                invokespecial:void(Long2ByteOpenHashMap::rehash, this:\uc238\u6cfe\u97e6\ucb79\ub7dc\uc84e[expected:Long2ByteOpenHashMap], p0:int)
            }
            
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud523\uc910\u6fb0\u3504\ua6bd\u97b7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63D : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_648 : int
        
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
        var_3_63D = and:int(ldc:int(-1537812024), ldc:int(-1083310953))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc238\u6cfe\u97e6\ucb79\ub7dc\uc84e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_63D = and:int(var_3_63D:int, ldc:int(-52129358))
            var_5_7D = and:int(ldc:int(17055), ldc:int(-27296))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(25173), ldc:int(-25174)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_63D:int, ldc:int(-1494770743))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(8753), ldc:int(5321)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(31753), ldc:int(53)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_63D = and:int(var_3_CA:int, ldc:int(-176828225))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(16771), ldc:int(521)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(758158289))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1221978130))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1795131330))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(2068533309))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-911058409))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-2110977602))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1100893110))
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1559685408))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(411575916))
                    }
                    else {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-171590403))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1045216863))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-752250690))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(544850004))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1253373288))
                        goto(Label_0724)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1502459791))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-277414215))
                            var_11_DB = and:int(ldc:int(8975), ldc:int(-13232))
                            goto(Label_1471)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0581:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1416015796))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1534157020))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1750370427))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(799043436))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-493944288))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1991723895))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1001742087))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-276875155))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-270076425))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0724:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(675417060))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1336066554))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(226206525))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1691714846))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1785994367))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1656110642))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1350774359))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0858:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1353653706))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-341667247))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1227520307))
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-303106404))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(-24062), ldc:int(-24061))
                                goto(Label_1099)
                            }
                        }
                    }
                    
                    Label_0961:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(882972783))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1417471064))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-305911819))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1342336554))
                        var_11_DB = and:int(ldc:int(-5350), ldc:int(5345))
                    }
                    
                    Label_1099:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1223864231))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(647901736))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(203318443))
                            goto(Label_0961)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1011442479))
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-2040985846))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1233341730))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1340)
                            }
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1117969428))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1691973928))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1099)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1722887329))
                            goto(Label_0961)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0724)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1274284026))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1216954714))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1471)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1340:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1226637903))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(51095193))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(2088429313))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1982843652))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-5800799))
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63D = and:int(var_3_63D:int, ldc:int(-43197250))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1471:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_648 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1482:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-288322127))
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1450710197))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-195830999))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(925574243))
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1158884090))
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-438329956))
                        var_17_648 = add:int(var_16_109:int, and:int(ldc:int(8833), ldc:int(4353)))
                        looporswitchbreak()
                    }
                    
                    var_3_63D = and:int(var_3_63D:int, ldc:int(-418864405))
                }
                
                var_3_63D = and:int(var_3_63D:int, ldc:int(-1538272851))
                
                if (cmple:boolean(var_5_7D = var_17_648:int, sub:int(var_6_84:int, xor:int(ldc:int(178), ldc:int(179))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
