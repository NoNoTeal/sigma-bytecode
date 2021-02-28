public class \u3504\ufe34\u600f\u6b0d\u69d9.\u69d9\u446c\ubcb0\u51b2\ua3b4\uc9f6 {
    public void \u69d9\u446c\ubcb0\u51b2\ua3b4\uc9f6(org.apache.logging.log4j.Logger p0) {
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
            invokespecial:Object(Object::<init>, this:\u69d9\u446c\ubcb0\u51b2\ua3b4\uc9f6)
            putfield:Logger(\u69d9\u446c\ubcb0\u51b2\ua3b4\uc9f6::\ub7dc\u4f4a\uc2bd\uff55\u8413\u4c2b, this:\u69d9\u446c\ubcb0\u51b2\ua3b4\uc9f6, p0:Logger)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void uncaughtException(java.lang.Thread p0, java.lang.Throwable p1) {
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
            invokeinterface:void(Logger::error, getfield:Logger(\u69d9\u446c\ubcb0\u51b2\ua3b4\uc9f6::\ub7dc\u4f4a\uc2bd\uff55\u8413\u4c2b, this:\u69d9\u446c\ubcb0\u51b2\ua3b4\uc9f6), loadelement:String(getstatic:String[](\u69d9\u446c\ubcb0\u51b2\ua3b4\uc9f6::\ub8be\u69d9\u8cae\uf995\u4e72\u67e9), and:int(ldc:int(-20899), ldc:int(20896))))
            invokeinterface:void(Logger::error, getfield:Logger(\u69d9\u446c\ubcb0\u51b2\ua3b4\uc9f6::\ub7dc\u4f4a\uc2bd\uff55\u8413\u4c2b, this:\u69d9\u446c\ubcb0\u51b2\ua3b4\uc9f6), invokevirtual:String(Thread::getName, p0:Thread), p1:Throwable)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_97_0 : byte[] [generated]
        stack_99_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_BD_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_194_0 : byte[] [generated]
        stack_20C_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_12E : byte[]
        var_4_12F : int
        var_0_7D : int
        expr_99 : int [generated]
        var_5_17E : int
        var_3_183 : byte[]
        var_4_184 : int
        var_0_1AC : int
        expr_194 : byte [generated]
        stack_1D8_2 : byte [generated]
        stack_1AF_0 : byte [generated]
        expr_BD : int [generated]
        var_3_1FB : byte[]
        var_4_1FC : int
        expr_20C : byte [generated]
        var_3_F2 : String
        stack_125_0 : String[] [generated]
        expr_104 : String[] [generated]
        
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
            var_0_5F = and:int(ldc:int(626013991), ldc:int(1465417702))
            expr_65 = var_2_69 = stack_97_0 = stack_99_0 = stack_BB_0 = stack_BD_0 = stack_E6_0 = stack_194_0 = stack_20C_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ATjNQICON95DQs7CsoJDNjdDEsG1ALG3DbQBDx8Bwc2xc/nHOnsViA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_12E = newarray:byte[](byte.class, expr_6D:int)
                var_4_12F = expr_6D:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1628727457))
                    var_4_12F = add:int(var_4_12F:int, ldc:int(-1))
                    storeelement:byte(var_3_12E:byte[], var_4_12F:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_12F:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_12F:int, and:int(ldc:int(2369), ldc:int(4115)))), ldc:int(2)), xor:int(ldc:int(1564), ldc:int(1571)))))
                    
                    if (cmpne:boolean(var_4_12F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_99_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_E6_0 = stack_194_0 = stack_20C_0 = var_3_12E:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_7D = and:int(var_0_5F:int, ldc:int(1569493709))
                    goto(Label_0194)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1149323692))
                }
                else {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-2058928218))
                    expr_99 = arraylength:int(stack_99_0:byte[])
                    
                    if (cmpne:boolean(expr_99:int, ldc:int(0))) {
                        var_5_17E = expr_99:int
                        var_3_183 = newarray:byte[](byte.class, expr_99:int)
                        var_4_184 = expr_99:int
                        
                        loop {
                            var_0_1AC = and:int(var_0_5F:int, ldc:int(-1093134545))
                            var_4_184 = add:int(var_4_184:int, ldc:int(-1))
                            expr_194 = stack_1D8_2 = loadelement(stack_194_0, var_4_184)
                            
                            if (cmplt:boolean(add:int(add:int(var_4_184:int, ldc:int(6)), neg:int(var_5_17E:int)), ldc:int(0))) {
                                stack_1D8_2 = stack_1AF_0 = add:byte(expr_194:byte, loadelement:byte(var_3_183:byte[], add:int(var_4_184:int, ldc:int(6))))
                                goto(Label_0447)
                            }
                            
                            Label_0417:
                            
                            if (cmpeq:boolean(and:int(var_0_1AC:int, ldc:int(65536)), ldc:int(0))) {
                                var_0_1AC = and:int(var_0_1AC:int, ldc:int(784406287))
                                stack_1D8_2 = stack_1AF_0 = add:byte(expr_194:byte, ldc:byte(6))
                            }
                            
                            Label_0447:
                            
                            if (cmpne:boolean(and:int(var_0_1AC:int, ldc:int(134217728)), ldc:int(0))) {
                                var_0_1AC = and:int(var_0_1AC:int, ldc:int(-1182639982))
                                goto(Label_0417)
                            }
                            
                            var_0_5F = and:int(var_0_1AC:int, ldc:int(-1360732265))
                            storeelement:byte(var_3_183:byte[], var_4_184:int, stack_1D8_2:byte)
                            
                            if (cmpne:boolean(var_4_184:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_99_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_E6_0 = stack_194_0 = stack_20C_0 = var_3_183:byte[]
                    }
                }
                
                Label_0158:
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_0_7D = and:int(var_0_5F:int, ldc:int(-1169725889))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_7D = and:int(var_0_5F:int, ldc:int(-45875401))
                    expr_BD = arraylength:int(stack_BD_0:byte[])
                    
                    if (cmpne:boolean(expr_BD:int, ldc:int(0))) {
                        var_3_1FB = newarray:byte[](byte.class, expr_BD:int)
                        var_4_1FC = expr_BD:int
                        
                        loop {
                            var_0_7D = and:int(var_0_7D:int, ldc:int(209051503))
                            var_4_1FC = add:int(var_4_1FC:int, ldc:int(-1))
                            expr_20C = loadelement:byte(stack_20C_0:byte[], var_4_1FC:int)
                            storeelement:byte(var_3_1FB:byte[], var_4_1FC:int, add:int(xor:int(or:int(and:int(shl:int(expr_20C:byte, xor:int(ldc:int(929), ldc:int(933))), ldc:int(-16)), and:int(shr:int(expr_20C:byte[expected:int], xor:int(ldc:int(-32473), ldc:int(-32477))), ldc:int(15))), ldc:int(105)), ldc:int(75)))
                            
                            if (cmpne:boolean(var_4_1FC:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_99_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_E6_0 = stack_194_0 = stack_20C_0 = var_3_1FB:byte[]
                    }
                }
                
                Label_0194:
                
                if (cmpne:boolean(and:int(var_0_7D:int, ldc:int(134217728)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_7D:int, ldc:int(-1986428342))
                    goto(Label_0158)
                }
                
                if (cmpeq:boolean(and:int(var_0_7D:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_7D:int, ldc:int(1338621412))
            }
            
            var_3_F2 = initobject:String(String::<init>, stack_E6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_125_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(17056), ldc:int(17057)))
            expr_104 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(240), ldc:int(241)))
            storeelement:String(expr_104:String[], and:int(ldc:int(22337), ldc:int(-22346)), invokevirtual:String[expected:String](String::substring, var_3_F2:String, and:int(ldc:int(18608), ldc:int(-18673)), xor:int(ldc:int(4183), ldc:int(4208))))
            putstatic:String[](\u69d9\u446c\ubcb0\u51b2\ua3b4\uc9f6::\ub8be\u69d9\u8cae\uf995\u4e72\u67e9, expr_104:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u34df\u67d0\ubefe\u5654\u1833\u0b8e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5B1 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5BC : int
        
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
        var_3_5B1 = and:int(ldc:int(1318328835), ldc:int(1866172831))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u69d9\u446c\ubcb0\u51b2\ua3b4\uc9f6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(16)), ldc:int(0))) {
            var_3_5B1 = and:int(var_3_5B1:int, ldc:int(2125962167))
            var_5_7D = and:int(ldc:int(-19023), ldc:int(19022))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-4838), ldc:int(4805)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5B1:int, ldc:int(1647876123))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(12297), ldc:int(801)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(6149), ldc:int(6148)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5B1 = and:int(var_3_CA:int, ldc:int(-809031981))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(8256), ldc:int(8257)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-1529452585))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-80973915))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(1038044944))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-1450858250))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-696031902))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-1920852415))
                    }
                    else {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-135064669))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(263524734))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(1711847806))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5B1 = and:int(var_3_5B1:int, ldc:int(2065534855))
                            var_11_DB = and:int(ldc:int(782), ldc:int(-783))
                            goto(Label_1351)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(1544126849))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-387725630))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(1010268621))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-843934246))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(1273759619))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(916218715))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(41609989))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-933598659))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5B1 = and:int(var_3_5B1:int, ldc:int(1347376712))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-426697218))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0762:
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-351342013))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-465936483))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5B1 = and:int(var_3_5B1:int, ldc:int(1329701842))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5B1 = and:int(var_3_5B1:int, ldc:int(863005567))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(1859026482))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(-32766), ldc:int(-32765))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-1087695384))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(300185314))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(2074056486))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-537673091))
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5B1 = and:int(var_3_5B1:int, ldc:int(1410737782))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5B1 = and:int(var_3_5B1:int, ldc:int(1333689907))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-228043157))
                        var_11_DB = and:int(ldc:int(16803), ldc:int(-21924))
                    }
                    
                    Label_1035:
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5B1 = and:int(var_3_5B1:int, ldc:int(854966221))
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5B1 = and:int(var_3_5B1:int, ldc:int(677401773))
                            loopcontinue()
                        }
                        
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-425787762))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1244)
                            }
                        }
                    }
                    
                    Label_1130:
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5B1 = and:int(var_3_5B1:int, ldc:int(1923411284))
                            goto(Label_1035)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5B1 = and:int(var_3_5B1:int, ldc:int(1351353574))
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5B1 = and:int(var_3_5B1:int, ldc:int(1110832242))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-673338513))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1351)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1244:
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-1501565721))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-1848900482))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-632799378))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1351:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5BC = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1362:
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-264257874))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B1:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-594486560))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(2097190859))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-359762750))
                        var_17_5BC = add:int(var_16_109:int, xor:int(ldc:int(4320), ldc:int(4321)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5B1 = and:int(var_3_5B1:int, ldc:int(-678130094))
                
                if (cmple:boolean(var_5_7D = var_17_5BC:int, sub:int(var_6_84:int, and:int(ldc:int(22533), ldc:int(9))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5B1:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
