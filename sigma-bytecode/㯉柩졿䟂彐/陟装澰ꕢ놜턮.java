public abstract class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u965f\u88c5\u6fb0\ua562\ub19c\ud12e {
    public void \u965f\u88c5\u6fb0\ua562\ub19c\ud12e(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c p0, java.lang.String p1, float p2) {
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
            invokespecial:\u5fe1\u6d69\u3d64\u6bb9\ucfaf\u8709(\u5fe1\u6d69\u3d64\u6bb9\ucfaf\u8709::<init>, this:\u965f\u88c5\u6fb0\ua562\ub19c\ud12e, p0:\u9255\u0c95\u4cd9\ube23\u760c, p1:String, p2:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e \u12b2\u8413\u647c\u3c25\u7bad\uafe7(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\uc910\uc29a\u527a\u6c56\u34df\u6d69 p0, java.lang.String p1) {
        var_3_5F : int
        var_3_B2 : int
        var_5_70 : \u98a4\ud171\u8aa5\u8df4\u120d\u6cfe
        
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
        var_3_5F = and:int(ldc:int(204962710), ldc:int(-302000492))
        
        if (logicalnot:boolean(instanceof:boolean(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe.class, p0:\uc910\uc29a\u527a\u6c56\u34df\u6d69))) {
            return:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(aconstnull:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e())
        }
        
        var_3_B2 = and:int(var_3_5F:int, ldc:int(1245084373))
        var_5_70 = checkcast:\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe.class, p0:\uc910\uc29a\u527a\u6c56\u34df\u6d69[expected:\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe])
        
        if (invokevirtual:boolean(String::equals, p1:String, ldc:String[expected:Object]("head"))) {
            return:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe::\u56bd\ub70c\ub171\uae87\u6fb0\u3776, var_5_70:\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_3_B2:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0488)
            }
            
            if (cmpne:boolean(and:int(var_3_B2:int, ldc:int(1)), ldc:int(0))) {
                var_3_B2 = and:int(var_3_B2:int, ldc:int(1008878655))
                goto(Label_0407)
            }
            
            if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(128)), ldc:int(0))) {
                var_3_B2 = and:int(var_3_B2:int, ldc:int(-609036071))
                goto(Label_0350)
            }
            
            if (cmpne:boolean(and:int(var_3_B2:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0285)
            }
            
            if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(131072)), ldc:int(0))) {
                var_3_B2 = and:int(var_3_B2:int, ldc:int(-1553982570))
            }
            else {
                var_3_B2 = and:int(var_3_B2:int, ldc:int(414710687))
                
                if (invokevirtual:boolean(String::equals, p1:String, ldc:String[expected:Object]("headwear"))) {
                    return:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe::\u8389\u416d\ud523\ud51e\u446c\u8df4, var_5_70:\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe))
                }
            }
            
            Label_0196:
            
            if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(2147483647)), ldc:int(0))) {
                var_3_B2 = and:int(var_3_B2:int, ldc:int(-1851050690))
                goto(Label_0488)
            }
            
            if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(1048576)), ldc:int(0))) {
                var_3_B2 = and:int(var_3_B2:int, ldc:int(457976055))
                goto(Label_0407)
            }
            
            if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(512)), ldc:int(0))) {
                var_3_B2 = and:int(var_3_B2:int, ldc:int(242003136))
                goto(Label_0350)
            }
            
            if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(1048576)), ldc:int(0))) {
                var_3_B2 = and:int(var_3_B2:int, ldc:int(1609051573))
            }
            else {
                if (cmpne:boolean(and:int(var_3_B2:int, ldc:int(1)), ldc:int(0))) {
                    var_3_B2 = and:int(var_3_B2:int, ldc:int(-496181625))
                    loopcontinue()
                }
                
                var_3_B2 = and:int(var_3_B2:int, ldc:int(2136465047))
                
                if (invokevirtual:boolean(String::equals, p1:String, ldc:String[expected:Object]("body"))) {
                    return:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe::\u9a18\u8413\u7e3f\u3a62\ub19c\ubcb0, var_5_70:\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe))
                }
            }
            
            Label_0285:
            
            if (cmpne:boolean(and:int(var_3_B2:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0488)
            }
            
            if (cmpne:boolean(and:int(var_3_B2:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0407)
            }
            
            if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(134217728)), ldc:int(0))) {
                var_3_B2 = and:int(var_3_B2:int, ldc:int(-2125027055))
            }
            else {
                if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_B2 = and:int(var_3_B2:int, ldc:int(-1061296819))
                    goto(Label_0196)
                }
                
                if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(128)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_B2 = and:int(var_3_B2:int, ldc:int(-1646299500))
                
                if (invokevirtual:boolean(String::equals, p1:String, ldc:String[expected:Object]("left_arm"))) {
                    return:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe::\u51fa\u4e72\uf94d\u7873\u64ab\u9937, var_5_70:\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe))
                }
            }
            
            Label_0350:
            
            if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0488)
            }
            
            if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(4194304)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_3_B2:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_B2 = and:int(var_3_B2:int, ldc:int(1055309836))
                    goto(Label_0285)
                }
                
                if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0196)
                }
                
                if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(1048576)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_B2 = and:int(var_3_B2:int, ldc:int(-86092074))
                
                if (invokevirtual:boolean(String::equals, p1:String, ldc:String[expected:Object]("right_arm"))) {
                    return:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe::\u6b0d\uc84e\ua068\ub83f\u3bd6\u9033, var_5_70:\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe))
                }
            }
            
            Label_0407:
            
            if (cmpne:boolean(and:int(var_3_B2:int, ldc:int(1024)), ldc:int(0))) {
                var_3_B2 = and:int(var_3_B2:int, ldc:int(-412390714))
            }
            else {
                if (cmpne:boolean(and:int(var_3_B2:int, ldc:int(64)), ldc:int(0))) {
                    var_3_B2 = and:int(var_3_B2:int, ldc:int(-205227482))
                    goto(Label_0350)
                }
                
                if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0285)
                }
                
                if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_B2 = and:int(var_3_B2:int, ldc:int(-1157045083))
                    goto(Label_0196)
                }
                
                if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_B2 = and:int(var_3_B2:int, ldc:int(-578341766))
                    loopcontinue()
                }
                
                var_3_B2 = and:int(var_3_B2:int, ldc:int(-115385666))
                
                if (invokevirtual:boolean(String::equals, p1:String, ldc:String[expected:Object]("left_leg"))) {
                    return:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe::\u3e2a\u71f1\u4f4a\ubf56\u3711\u3d4b, var_5_70:\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe))
                }
            }
            
            Label_0488:
            
            if (cmpne:boolean(and:int(var_3_B2:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0407)
            }
            
            if (cmpne:boolean(and:int(var_3_B2:int, ldc:int(64)), ldc:int(0))) {
                var_3_B2 = and:int(var_3_B2:int, ldc:int(-3489543))
                goto(Label_0350)
            }
            
            if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(262144)), ldc:int(0))) {
                var_3_B2 = and:int(var_3_B2:int, ldc:int(1584486856))
                goto(Label_0285)
            }
            
            if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0196)
            }
            
            if (cmpeq:boolean(and:int(var_3_B2:int, ldc:int(32)), ldc:int(0))) {
                return:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(ternaryop:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(invokevirtual:boolean(String::equals, p1:String, ldc:String[expected:Object]("right_leg")), getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe::\ud158\u67e9\ube23\ua6bd\uc4d2\ub171, var_5_70:\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe), aconstnull:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e()))
            }
            
            var_3_B2 = and:int(var_3_B2:int, ldc:int(1452436642))
        }
    }
    
    public java.lang.String[] \u3d4b\u9a18\ub32d\uc84e\u2dcc\u600f() {
        expr_62 : String[] [generated]
        
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
            expr_62 = newarray:String[](java.lang.String.class, ldc:int(7))
            storeelement:String(expr_62:String[], and:int(ldc:int(-13795), ldc:int(13792)), ldc:String("head"))
            storeelement:String(expr_62:String[], and:int(ldc:int(24065), ldc:int(8485)), ldc:String("headwear"))
            storeelement:String(expr_62:String[], and:int(ldc:int(17418), ldc:int(34)), ldc:String("body"))
            storeelement:String(expr_62:String[], and:int(ldc:int(13475), ldc:int(11)), ldc:String("left_arm"))
            storeelement:String(expr_62:String[], xor:int(ldc:int(1091), ldc:int(1095)), ldc:String("right_arm"))
            storeelement:String(expr_62:String[], xor:int(ldc:int(-28651), ldc:int(-28656)), ldc:String("left_leg"))
            storeelement:String(expr_62:String[], ldc:int(6), ldc:String("right_leg"))
            return:String[](expr_62:String[])
        }
        
        goto(Label_0006)
    }
    
    public void \u61a4\u1833\u6ec6\u47c2\u6b5f\ufcaf(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5BB : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5C6 : int
        
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
        var_3_5BB = and:int(ldc:int(1615597982), ldc:int(560953823))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u965f\u88c5\u6fb0\ua562\ub19c\ud12e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(1024)), ldc:int(0))) {
            var_3_5BB = and:int(var_3_5BB:int, ldc:int(1817452024))
            var_5_7D = and:int(ldc:int(-13998), ldc:int(13868))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3407), ldc:int(2382)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5BB:int, ldc:int(-327894566))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(1065), ldc:int(643)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(13313), ldc:int(13312)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5BB = and:int(var_3_D2:int, ldc:int(2046262236))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(257), ldc:int(14857)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(2015908657))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(1107637602))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-638678533))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-1122017715))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(201254626))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(1004314009))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-445041100))
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(328253468))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-359007141))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-391641209))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(962156140))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5BB = and:int(var_3_5BB:int, ldc:int(2068684190))
                            var_11_E3 = and:int(ldc:int(21844), ldc:int(-21845))
                            goto(Label_1361)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(2128557503))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-1578336640))
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-1289308274))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(4262893))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5BB = and:int(var_3_5BB:int, ldc:int(-182534565))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5BB = and:int(var_3_5BB:int, ldc:int(-1924849886))
                            loopcontinue()
                        }
                        
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-245032483))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0762:
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(374081308))
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(532981864))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(431056670))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5BB = and:int(var_3_5BB:int, ldc:int(-571076447))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5BB = and:int(var_3_5BB:int, ldc:int(1248783916))
                            loopcontinue()
                        }
                        
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-1487030885))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(353), ldc:int(352))
                                goto(Label_1019)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-1326612942))
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-1985100614))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-911877653))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(1942271390))
                        var_11_E3 = and:int(ldc:int(1156), ldc:int(-1157))
                    }
                    
                    Label_1019:
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-341159443))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-1376544388))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5BB = and:int(var_3_5BB:int, ldc:int(-253186544))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5BB = and:int(var_3_5BB:int, ldc:int(1183019028))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-1126933573))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1220)
                            }
                        }
                    }
                    
                    Label_1130:
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_1019)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5BB = and:int(var_3_5BB:int, ldc:int(1667610524))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1361)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1220:
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(91848995))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(77364411))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-1798009956))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(2133554601))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(1693097389))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-171670542))
                        loopcontinue()
                    }
                    
                    var_3_5BB = and:int(var_3_5BB:int, ldc:int(830250456))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1361:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5C6 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1372:
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(-811630752))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(1931359042))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BB:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5BB = and:int(var_3_5BB:int, ldc:int(855514554))
                        var_17_5C6 = add:int(var_16_111:int, xor:int(ldc:int(528), ldc:int(529)))
                        looporswitchbreak()
                    }
                    
                    var_3_5BB = and:int(var_3_5BB:int, ldc:int(-2061883364))
                }
                
                var_3_5BB = and:int(var_3_5BB:int, ldc:int(-3910760))
                
                if (cmple:boolean(var_5_7D = var_17_5C6:int, sub:int(var_6_84:int, and:int(ldc:int(61), ldc:int(12417))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5BB:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_5BB = and:int(var_3_5BB:int, ldc:int(-472176020))
            goto(Label_0106)
        }
    }
}
