public class \u47c2\u2dcc\u12cb\ud171\u8c8a.\u927d\ub32d\u4e72\u1187\ud158\u983f {
    public void \u927d\ub32d\u4e72\u1187\ud158\u983f() {
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
            invokespecial:Object(Object::<init>, this:\u927d\ub32d\u4e72\u1187\ud158\u983f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public double \u4c04\ub171\ud171\u51fa\u62da\ub6ab(double p0, double p1) {
        var_7_76 : double
        var_9_84 : double
        var_11_8B : double
        
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
            putfield:double(\u927d\ub32d\u4e72\u1187\ud158\u983f::\uc29a\u718f\uc29a\u3504\u4d85\u64ab, this:\u927d\ub32d\u4e72\u1187\ud158\u983f, add:double(getfield:double(\u927d\ub32d\u4e72\u1187\ud158\u983f::\uc29a\u718f\uc29a\u3504\u4d85\u64ab, this:\u927d\ub32d\u4e72\u1187\ud158\u983f), p0:double))
            var_7_76 = sub:double(getfield:double(\u927d\ub32d\u4e72\u1187\ud158\u983f::\uc29a\u718f\uc29a\u3504\u4d85\u64ab, this:\u927d\ub32d\u4e72\u1187\ud158\u983f), getfield:double(\u927d\ub32d\u4e72\u1187\ud158\u983f::\u839e\ua6bd\ufe34\u8308\u12b2\u759a, this:\u927d\ub32d\u4e72\u1187\ud158\u983f))
            var_9_84 = invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u494c\ub6ab\u8bb0\u8bb0\uc31c\uc31c, ldc:double(0.5), getfield:double(\u927d\ub32d\u4e72\u1187\ud158\u983f::\u36d3\u8308\u0800\uceb8\u494c\ubff1, this:\u927d\ub32d\u4e72\u1187\ud158\u983f), var_7_76:double)
            var_11_8B = invokestatic:double(Math::signum, var_7_76:double)
            
            if (cmpgt:boolean(mul:double(var_11_8B:double, var_7_76:double), mul:double(var_11_8B:double, getfield:double(\u927d\ub32d\u4e72\u1187\ud158\u983f::\u36d3\u8308\u0800\uceb8\u494c\ubff1, this:\u927d\ub32d\u4e72\u1187\ud158\u983f)))) {
                var_7_76 = var_9_84:double
            }
            
            putfield:double(\u927d\ub32d\u4e72\u1187\ud158\u983f::\u36d3\u8308\u0800\uceb8\u494c\ubff1, this:\u927d\ub32d\u4e72\u1187\ud158\u983f, var_9_84:double)
            putfield:double(\u927d\ub32d\u4e72\u1187\ud158\u983f::\u839e\ua6bd\ufe34\u8308\u12b2\u759a, this:\u927d\ub32d\u4e72\u1187\ud158\u983f, add:double(getfield:double(\u927d\ub32d\u4e72\u1187\ud158\u983f::\u839e\ua6bd\ufe34\u8308\u12b2\u759a, this:\u927d\ub32d\u4e72\u1187\ud158\u983f), mul:double(var_7_76:double, p1:double)))
            return:double(mul:double(var_7_76:double, p1:double))
        }
        
        goto(Label_0006)
    }
    
    public void \u92ff\u3d4b\u7330\u1187\u4c2b\u67e9() {
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
            putfield:double(\u927d\ub32d\u4e72\u1187\ud158\u983f::\uc29a\u718f\uc29a\u3504\u4d85\u64ab, this:\u927d\ub32d\u4e72\u1187\ud158\u983f, ldc:double(0.0))
            putfield:double(\u927d\ub32d\u4e72\u1187\ud158\u983f::\u839e\ua6bd\ufe34\u8308\u12b2\u759a, this:\u927d\ub32d\u4e72\u1187\ud158\u983f, ldc:double(0.0))
            putfield:double(\u927d\ub32d\u4e72\u1187\ud158\u983f::\u36d3\u8308\u0800\uceb8\u494c\ubff1, this:\u927d\ub32d\u4e72\u1187\ud158\u983f, ldc:double(0.0))
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
    
    public void \uc2e8\uc910\uf995\u67d0\u9a18\u8df4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61D : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_628 : int
        
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
        var_3_61D = and:int(ldc:int(1175399311), ldc:int(-14162417))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u927d\ub32d\u4e72\u1187\ud158\u983f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(-294686793))
            var_5_7D = and:int(ldc:int(9022), ldc:int(-9023))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9042), ldc:int(-9051)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_61D:int, ldc:int(-967442513))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(1027), ldc:int(20737)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(5313), ldc:int(8711)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_61D = and:int(var_3_D2:int, ldc:int(1259846539))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(16896), ldc:int(16897)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(173526297))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1555076340))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1165526843))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1794250853))
                    }
                    else {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-818416021))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1369976039))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1991612659))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1212993023))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1414493372))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1319880052))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1024404993))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-755517863))
                        var_11_E3 = and:int(ldc:int(-15966), ldc:int(7193))
                        goto(Label_1431)
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1499647370))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(102683405))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2095131896))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-349215837))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(253172732))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-418377413))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1616666175))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(495764822))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-2075407330))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-669312615))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1778855803))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-894758667))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1340061620))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-11544894))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-163582099))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(16512), ldc:int(16513))
                                goto(Label_1075)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1706838265))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1934196420))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1127297577))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1678500471))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-660433858))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(948175800))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-186323168))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(189348508))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-881886515))
                        var_11_E3 = and:int(ldc:int(18886), ldc:int(-18895))
                    }
                    
                    Label_1075:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1657612312))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1289571996))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1560798480))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1631145587))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-416826667))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1555321544))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1358176239))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(199475049))
                            goto(Label_1075)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(359827468))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-576368079))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-294313175))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1431)
                    }
                    
                    Label_1316:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-508794792))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-557956359))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(875786126))
                        loopcontinue()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(1518841817))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1431:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_628 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1442:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1295953008))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(301878808))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1933591411))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-386215603))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-684003870))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(976470093))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1329964669))
                        var_17_628 = add:int(var_16_111:int, xor:int(ldc:int(284), ldc:int(285)))
                        looporswitchbreak()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(1335925672))
                }
                
                var_3_61D = and:int(var_3_61D:int, ldc:int(2125821591))
                
                if (cmple:boolean(var_5_7D = var_17_628:int, sub:int(var_6_84:int, xor:int(ldc:int(16451), ldc:int(16450))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(-1827183780))
            goto(Label_0106)
        }
    }
}
