public final class \u5245\u8aa5\u61a4\u7049\u4cd9.\ubb2b\u4179\u416d\uc2bd\u760c\u960f {
    public void \ubb2b\u4179\u416d\uc2bd\u760c\u960f(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
            putfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ubb2b\u4179\u416d\uc2bd\u760c\u960f::\u760c\u4492\ua562\u494c\uc29a\u6cfe, this:\ubb2b\u4179\u416d\uc2bd\u760c\u960f, p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ubb2b\u4179\u416d\uc2bd\u760c\u960f::\u9033\u600f\u3d64\u839e\u7049\ub102, this:\ubb2b\u4179\u416d\uc2bd\u760c\u960f, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            invokespecial:Object(Object::<init>, this:\ubb2b\u4179\u416d\uc2bd\u760c\u960f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<T> \ubf56\u1833\u8389\ud217\ud217\u983f(java.util.function.BiFunction<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, T> p0) {
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
            return:Optional<T>(invokestatic:Optional<T>(Optional<T>::of, invokeinterface:T(BiFunction<\uf9c5\ud158\u4975\uf94d\ud523\uc31c, \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, T>::apply, p0:BiFunction<\uf9c5\ud158\u4975\uf94d\ud523\uc31c, \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, T>, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ubb2b\u4179\u416d\uc2bd\u760c\u960f::\u760c\u4492\ua562\u494c\uc29a\u6cfe, this:\ubb2b\u4179\u416d\uc2bd\u760c\u960f), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ubb2b\u4179\u416d\uc2bd\u760c\u960f::\u9033\u600f\u3d64\u839e\u7049\ub102, this:\ubb2b\u4179\u416d\uc2bd\u760c\u960f))))
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
    
    public void \u183a\u12b2\u8709\u7043\uc238\uc9f6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60D : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_618 : int
        
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
        var_3_60D = and:int(ldc:int(1667995470), ldc:int(1828694871))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubb2b\u4179\u416d\uc2bd\u760c\u960f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_60D = and:int(var_3_60D:int, ldc:int(557816551))
            var_5_7D = and:int(ldc:int(-16373), ldc:int(16336))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2592), ldc:int(2589)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_60D:int, ldc:int(-440668417))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(12356), ldc:int(12357)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(-20472), ldc:int(-20471)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_60D = and:int(var_3_CA:int, ldc:int(560183126))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(4225), ldc:int(16673)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(886406437))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1398730131))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2029952825))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-728588782))
                    }
                    else {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-423911681))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-908755254))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(168587398))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1708983060))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1400188571))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1320873917))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1086593441))
                        var_11_DB = and:int(ldc:int(23254), ldc:int(-23287))
                        goto(Label_1463)
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1404521230))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1849847375))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1467045325))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(556930161))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(122899548))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1288190249))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1701652834))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(559332163))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2121799163))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-558379410))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1807119605))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1007965169))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1293443234))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1864375152))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-515994124))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-676719811))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-760996291))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1228970849))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(2016232859))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1457265705))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(3), ldc:int(10913))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-401849569))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1857717275))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-295599242))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1742851365))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1221336327))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(652636135))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(674230231))
                        var_11_DB = and:int(ldc:int(-20569), ldc:int(20568))
                    }
                    
                    Label_1083:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1119253189))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(921791991))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1945638102))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1009591470))
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(275436058))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-2144667002))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-85197980))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-270289026))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1340)
                            }
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-857248484))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1066046945))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1083)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-54430115))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(434675962))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1765250015))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1463)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1340:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(199830973))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1867557257))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1826954476))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1439301754))
                        loopcontinue()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(-496249897))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1463:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_618 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1474:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1474603767))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(555982446))
                        var_17_618 = add:int(var_16_109:int, and:int(ldc:int(2861), ldc:int(12435)))
                        looporswitchbreak()
                    }
                }
                
                var_3_60D = and:int(var_3_60D:int, ldc:int(2079836127))
                
                if (cmple:boolean(var_5_7D = var_17_618:int, sub:int(var_6_84:int, and:int(ldc:int(1281), ldc:int(20993))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
