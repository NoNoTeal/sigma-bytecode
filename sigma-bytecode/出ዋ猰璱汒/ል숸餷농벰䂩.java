public class \u51fa\u12cb\u7330\u74b1\u6c52.\u120d\uc238\u9937\ub18d\ubcb0\u40a9 {
    private void \u120d\uc238\u9937\ub18d\ubcb0\u40a9() {
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
            invokespecial:Object(Object::<init>, this:\u120d\uc238\u9937\ub18d\ubcb0\u40a9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \ub8be\u99f7\u5245\u873d\ub18d\ud217(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1) {
        var_2_6F : int
        var_4_A3 : int
        var_5_A9 : int
        var_6_D2 : int
        
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
        var_2_6F = and:int(ldc:int(1175066155), ldc:int(-696345922))
        
        if (cmpne:boolean(p0:ByteBuffer, aconstnull:ByteBuffer())) {
            if (cmpne:boolean(p1:ByteBuffer, aconstnull:ByteBuffer())) {
                goto(Label_0139)
            }
        }
        
        Label_0100:
        
        if (cmpeq:boolean(and:int(var_2_6F:int, ldc:int(2048)), ldc:int(0))) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>))
        }
        
        var_2_6F = and:int(var_2_6F:int, ldc:int(-382506982))
        Label_0139:
        
        if (cmpeq:boolean(and:int(var_2_6F:int, ldc:int(8)), ldc:int(0))) {
            var_2_6F = and:int(var_2_6F:int, ldc:int(-1190997386))
            goto(Label_0100)
        }
        
        var_4_A3 = invokevirtual:int(Buffer::remaining, p0:ByteBuffer[expected:Buffer])
        var_5_A9 = invokevirtual:int(Buffer::remaining, p1:ByteBuffer[expected:Buffer])
        
        if (cmple:boolean(var_4_A3:int, var_5_A9:int)) {
            invokevirtual:ByteBuffer(ByteBuffer::put, p1:ByteBuffer, p0:ByteBuffer)
            return:int(var_4_A3:int)
        }
        
        var_6_D2 = invokestatic:int(Math::min, var_4_A3:int, var_5_A9:int)
        invokevirtual:Buffer(Buffer::limit, p0:ByteBuffer[expected:Buffer], var_6_D2:int)
        invokevirtual:ByteBuffer(ByteBuffer::put, p1:ByteBuffer, p0:ByteBuffer)
        return:int(var_6_D2:int)
    }
    
    public static java.nio.ByteBuffer \ube23\ud12e\u88c5\u527a\u4bc8\u7ce1() {
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
            return:ByteBuffer(invokestatic:ByteBuffer(ByteBuffer::allocate, and:int(ldc:int(-6082), ldc:int(6081))))
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
    
    public void \u52d3\u92ee\u34df\u7ce1\uf9c5\u6cfe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64D : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_658 : int
        
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
        var_3_64D = and:int(ldc:int(2115421118), ldc:int(-599865756))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u120d\uc238\u9937\ub18d\ubcb0\u40a9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
            var_3_64D = and:int(var_3_64D:int, ldc:int(1894968293))
            var_5_7D = and:int(ldc:int(-26204), ldc:int(8795))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(29189), ldc:int(-29190)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_64D:int, ldc:int(1490842302))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(8545), ldc:int(16385)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(8225), ldc:int(4491)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_64D = and:int(var_3_CA:int, ldc:int(-89850314))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(17443), ldc:int(10629)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-687173408))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1793842045))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1068137373))
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1496935644))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1006981631))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(358740017))
                    }
                    else {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(274558775))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(829474960))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-241668900))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1285878206))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1931564834))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-861266633))
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1840722129))
                        var_11_DB = and:int(ldc:int(29452), ldc:int(-30559))
                        goto(Label_1495)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-967934080))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-217194068))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1743360787))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(1350947305))
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1293465644))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-658561066))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-2074763161))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1730171487))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(897107485))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(2118486779))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(501474238))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-2074019401))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1040967120))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1396747107))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-435529434))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-941840452))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-2103795501))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-36687669))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-606480235))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1774591393))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(18817), ldc:int(4139))
                                goto(Label_1099)
                            }
                        }
                    }
                    
                    Label_0937:
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-960735003))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1902488582))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-379009658))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-740337405))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(1625947602))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-993178386))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-753508371))
                        var_11_DB = and:int(ldc:int(1685), ldc:int(-20158))
                    }
                    
                    Label_1099:
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1704755613))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1779742729))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(689961903))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-1255120692))
                            goto(Label_0937)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-1782999955))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(1302674598))
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-702950764))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1340)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-2092725543))
                        goto(Label_1506)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1679895088))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1099)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-1963465448))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-569682028))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1495)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1340:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(926155190))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1107654612))
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-2005433172))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1360133355))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-2012463488))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1184891764))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1982545958))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-375123041))
                        loopcontinue()
                    }
                    
                    var_3_64D = and:int(var_3_64D:int, ldc:int(362537647))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1495:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_658 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1506:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1274927880))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(254977009))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-2053883267))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1107191815))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1054366911))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1646212474))
                        var_17_658 = add:int(var_16_109:int, and:int(ldc:int(25089), ldc:int(4165)))
                        looporswitchbreak()
                    }
                }
                
                var_3_64D = and:int(var_3_64D:int, ldc:int(-61704595))
                
                if (cmple:boolean(var_5_7D = var_17_658:int, sub:int(var_6_84:int, xor:int(ldc:int(1025), ldc:int(1024))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1024)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
