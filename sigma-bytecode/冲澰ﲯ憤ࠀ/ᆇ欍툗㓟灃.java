public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\u1187\u6b0d\ud217\u34df\u7043 {
    public void \u1187\u6b0d\ud217\u34df\u7043(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1) {
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
            invokespecial:Object(Object::<init>, this:\u1187\u6b0d\ud217\u34df\u7043)
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u1187\u6b0d\ud217\u34df\u7043::\ud7e8\u3504\ubf56\u4bc8\ud4fe, this:\u1187\u6b0d\ud217\u34df\u7043, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u1187\u6b0d\ud217\u34df\u7043::\uc87f\u88c5\ud7e8\ub8be\u3dd3, this:\u1187\u6b0d\ud217\u34df\u7043, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
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
        
        if (instanceof:boolean(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u1187\u6b0d\ud217\u34df\u7043.class, p0:Object)) {
            return:boolean(invokevirtual:boolean(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::equals, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u1187\u6b0d\ud217\u34df\u7043::\ud7e8\u3504\ubf56\u4bc8\ud4fe, checkcast:\u1187\u6b0d\ud217\u34df\u7043(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u1187\u6b0d\ud217\u34df\u7043.class, p0:Object[expected:\u1187\u6b0d\ud217\u34df\u7043])), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object](\u1187\u6b0d\ud217\u34df\u7043::\ud7e8\u3504\ubf56\u4bc8\ud4fe, this:\u1187\u6b0d\ud217\u34df\u7043)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-28936), ldc:int(28935)))
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
    
    public void \ua3b4\u4d85\u3e75\u6198\u7330(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_615 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_620 : int
        
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
        var_3_615 = and:int(ldc:int(1780944294), ldc:int(1182415609))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u1187\u6b0d\ud217\u34df\u7043[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
            var_3_615 = and:int(var_3_615:int, ldc:int(1526692550))
            var_5_7D = and:int(ldc:int(-11196), ldc:int(10419))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18262), ldc:int(17989)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_615:int, ldc:int(1265793788))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(11587), ldc:int(49)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(16530), ldc:int(16531)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_615 = and:int(var_3_D2:int, ldc:int(-138167561))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(4097), ldc:int(4096)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1299397915))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-900231040))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-124516807))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1849260598))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-164626953))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(568525425))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1638613691))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-928664516))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-947253774))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1131402679))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1522788563))
                        var_11_E3 = and:int(ldc:int(-19558), ldc:int(17509))
                        goto(Label_1431)
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(749166122))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-447903317))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1517932756))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(978618673))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1471568073))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-749660384))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(569715518))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1681662395))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(539990181))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1329339866))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(2062200809))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(537010080))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1098222918))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(461839038))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(379959793))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-425460847))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(21), ldc:int(5289))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-942247174))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1729899900))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-140819775))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-178457851))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1986710010))
                        var_11_E3 = and:int(ldc:int(10285), ldc:int(-27006))
                    }
                    
                    Label_1043:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(823730756))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1051358845))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-2110318794))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-846683430))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1208488424))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-542132090))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1125635753))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_1043)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1428559676))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1793773699))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(2018744119))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-802404132))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1211347900))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1115573500))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1431)
                    }
                    
                    Label_1300:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(128)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1783125076))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1578090702))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1655286942))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(2127188484))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-979358634))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(-11900514))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1431:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_620 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1442:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(825136238))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-869722154))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1184107801))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-276109923))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-980610743))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1246902972))
                        var_17_620 = add:int(var_16_111:int, xor:int(ldc:int(18946), ldc:int(18947)))
                        looporswitchbreak()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(-1964965256))
                }
                
                var_3_615 = and:int(var_3_615:int, ldc:int(-73758039))
                
                if (cmple:boolean(var_5_7D = var_17_620:int, sub:int(var_6_84:int, xor:int(ldc:int(5129), ldc:int(5128))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
            var_3_615 = and:int(var_3_615:int, ldc:int(-1201899667))
            goto(Label_0106)
        }
    }
}
