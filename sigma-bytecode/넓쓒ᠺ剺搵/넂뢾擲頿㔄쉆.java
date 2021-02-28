public final class \ub113\uc4d2\u183a\u527a\u6435.\ub102\ub8be\u64f2\u983f\u3504\uc246 {
    public void \ub102\ub8be\u64f2\u983f\u3504\uc246(java.nio.file.Path p0, java.nio.file.Path p1) {
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
            putfield:Path(\ub102\ub8be\u64f2\u983f\u3504\uc246::\u0b8e\ub32d\u7049\u64f2\u6d69\u56bd, this:\ub102\ub8be\u64f2\u983f\u3504\uc246, p0:Path)
            putfield:Path(\ub102\ub8be\u64f2\u983f\u3504\uc246::\u67e9\u71ae\u6bb9\ubff1\u5fe1\u3776, this:\ub102\ub8be\u64f2\u983f\u3504\uc246, p1:Path)
            invokespecial:Object(Object::<init>, this:\ub102\ub8be\u64f2\u983f\u3504\uc246)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean getAsBoolean() {
        var_1_95 : int
        stack_A2_0 : int [generated]
        var_3_A7 : IOException
        
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
        var_1_95 = and:int(ldc:int(-1498754329), ldc:int(-480389889))
        
        try {
            loop {
                if (cmpeq:boolean(and:int(var_1_95:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_95 = and:int(var_1_95:int, ldc:int(-1289800714))
                    invokestatic:Path(Files::move, getfield:Path(\ub102\ub8be\u64f2\u983f\u3504\uc246::\u0b8e\ub32d\u7049\u64f2\u6d69\u56bd, this:\ub102\ub8be\u64f2\u983f\u3504\uc246), getfield:Path(\ub102\ub8be\u64f2\u983f\u3504\uc246::\u67e9\u71ae\u6bb9\ubff1\u5fe1\u3776, this:\ub102\ub8be\u64f2\u983f\u3504\uc246), newarray:CopyOption[](java.nio.file.CopyOption.class, and:int(ldc:int(28769), ldc:int(-31458))))
                }
                
                if (cmpne:boolean(and:int(var_1_95:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_95 = and:int(var_1_95:int, ldc:int(1893997353))
            }
            
            var_1_95 = and:int(var_1_95:int, ldc:int(-1171704326))
            stack_A2_0 = xor:int(ldc:int(1032), ldc:int(1033))
            var_1_95 = and:int(var_1_95:int, ldc:int(-155631902))
            return:boolean(stack_A2_0:int)
        }
        catch (java.io.IOException var_3_A7) {
            invokeinterface:void(Logger::error, invokestatic:Logger(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u64ab\ub18d\u6d99\ua068\u72f1\ua068), loadelement:String(getstatic:String[](\ub102\ub8be\u64f2\u983f\u3504\uc246::\u0a06\uc238\u64ab\ub7dc\u9a18\ubefe), and:int(ldc:int(9556), ldc:int(-27990))), var_3_A7:IOException[expected:Throwable])
            return:boolean(and:int[expected:boolean](ldc:int(-1472), ldc:int(1439)))
        }
    }
    
    public java.lang.String toString() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub102\ub8be\u64f2\u983f\u3504\uc246::\u0a06\uc238\u64ab\ub7dc\u9a18\ubefe), and:int(ldc:int(4753), ldc:int(26631)))), getfield:Path[expected:Object](\ub102\ub8be\u64f2\u983f\u3504\uc246::\u0b8e\ub32d\u7049\u64f2\u6d69\u56bd, this:\ub102\ub8be\u64f2\u983f\u3504\uc246)), loadelement:String(getstatic:String[](\ub102\ub8be\u64f2\u983f\u3504\uc246::\u0a06\uc238\u64ab\ub7dc\u9a18\ubefe), xor:int(ldc:int(12805), ldc:int(12807)))), getfield:Path[expected:Object](\ub102\ub8be\u64f2\u983f\u3504\uc246::\u67e9\u71ae\u6bb9\ubff1\u5fe1\u3776, this:\ub102\ub8be\u64f2\u983f\u3504\uc246))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1C5 : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_1D7_0 : byte[] [generated]
        stack_22A_0 : byte[] [generated]
        stack_286_0 : byte[] [generated]
        stack_2FE_0 : byte[] [generated]
        var_4_1B2 : int
        var_3_1B7 : byte[]
        var_5_1B8 : int
        expr_1D7 : byte [generated]
        var_0_27C : int
        expr_286 : byte [generated]
        stack_2CA_2 : byte [generated]
        stack_2A9_0 : byte [generated]
        var_0_7B : int
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_219 : byte[]
        var_5_21A : int
        expr_D3 : int [generated]
        expr_FE : int [generated]
        var_3_2ED : byte[]
        var_5_2EE : int
        var_3_142 : String
        stack_1AB_0 : String[] [generated]
        expr_154 : String[] [generated]
        
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
        var_0_1C5 = and:int(ldc:int(714126054), ldc:int(1791504337))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_D1_0 = stack_D3_0 = stack_FC_0 = stack_FE_0 = stack_136_0 = stack_1D7_0 = stack_22A_0 = stack_286_0 = stack_2FE_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("rk3Hn6g97DO6a5BHxR/Nzr68TM9Azm5j/fPPTQ==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1B2 = expr_6B:int
        var_3_1B7 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1B8 = expr_6B:int
        Label_0442:
        
        while (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_1C5 = and:int(var_0_1C5:int, ldc:int(1770399691))
            var_5_1B8 = add:int(var_5_1B8:int, ldc:int(-1))
            expr_1D7 = loadelement:byte(stack_1D7_0:byte[], var_5_1B8:int)
            storeelement:byte(var_3_1B7:byte[], var_5_1B8:int, add:int(or:int(and:int(shl:int(expr_1D7:byte, xor:int(ldc:int(2191), ldc:int(2187))), ldc:int(-16)), and:int(shr:int(expr_1D7:byte[expected:int], xor:int(ldc:int(8209), ldc:int(8213))), ldc:int(15))), ldc:int(28)))
            
            if (cmpne:boolean(var_5_1B8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_D1_0 = stack_D3_0 = stack_FC_0 = stack_FE_0 = stack_136_0 = stack_1D7_0 = stack_22A_0 = stack_286_0 = stack_2FE_0 = var_3_1B7:byte[]
            goto(Label_0112)
        }
        
        var_0_1C5 = and:int(var_0_1C5:int, ldc:int(-232259716))
        Label_0625:
        
        while (cmpeq:boolean(and:int(var_0_1C5:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_27C = and:int(var_0_1C5:int, ldc:int(1858665203))
            var_5_1B8 = add:int(var_5_1B8:int, ldc:int(-1))
            expr_286 = stack_2CA_2 = loadelement(stack_286_0, var_5_1B8)
            
            if (cmplt:boolean(add:int(add:int(var_5_1B8:int, ldc:int(4)), neg:int(var_4_1B2:int)), ldc:int(0))) {
                stack_2CA_2 = stack_2A9_0 = add:byte(expr_286:byte, loadelement:byte(var_3_1B7:byte[], add:int(var_5_1B8:int, ldc:int(4))))
                goto(Label_0697)
            }
            
            Label_0659:
            
            if (cmpeq:boolean(and:int(var_0_27C:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_27C = and:int(var_0_27C:int, ldc:int(1938563387))
            }
            else {
                var_0_27C = and:int(var_0_27C:int, ldc:int(2124760824))
                stack_2CA_2 = stack_2A9_0 = add:byte(expr_286:byte, ldc:byte(4))
            }
            
            Label_0697:
            
            if (cmpeq:boolean(and:int(var_0_27C:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0659)
            }
            
            var_0_1C5 = and:int(var_0_27C:int, ldc:int(-1344097327))
            storeelement:byte(var_3_1B7:byte[], var_5_1B8:int, stack_2CA_2:byte)
            
            if (cmpne:boolean(var_5_1B8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_D1_0 = stack_D3_0 = stack_FC_0 = stack_FE_0 = stack_136_0 = stack_1D7_0 = stack_22A_0 = stack_286_0 = stack_2FE_0 = var_3_1B7:byte[]
            goto(Label_0216)
        }
        
        goto(Label_0442)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(16)), ldc:int(0))) {
            var_0_7B = and:int(var_0_1C5:int, ldc:int(1317366948))
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_1C5:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_1C5 = and:int(var_0_1C5:int, ldc:int(-1113738273))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_219 = newarray:byte[](byte.class, expr_98:int)
                var_5_21A = expr_98:int
                
                loop {
                    var_0_1C5 = and:int(var_0_1C5:int, ldc:int(799298249))
                    var_5_21A = add:int(var_5_21A:int, ldc:int(-1))
                    storeelement:byte(var_3_219:byte[], var_5_21A:int, add:int(shl:int(loadelement:byte(stack_22A_0:byte[], var_5_21A:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_21A:int, and:int(ldc:int(25145), ldc:int(325)))), ldc:int(3)), and:int(ldc:int(30751), ldc:int(63)))))
                    
                    if (cmpne:boolean(var_5_21A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_D1_0 = stack_D3_0 = stack_FC_0 = stack_FE_0 = stack_136_0 = stack_1D7_0 = stack_22A_0 = stack_286_0 = stack_2FE_0 = var_3_219:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpeq:boolean(and:int(var_0_1C5:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_7B = and:int(var_0_1C5:int, ldc:int(1838009040))
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_1C5 = and:int(var_0_1C5:int, ldc:int(-953277953))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(16)), ldc:int(0))) {
                var_0_1C5 = and:int(var_0_1C5:int, ldc:int(-855563464))
                goto(Label_0112)
            }
            
            var_0_1C5 = and:int(var_0_1C5:int, ldc:int(699079391))
            expr_D3 = arraylength:int(stack_D3_0:byte[])
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_4_1B2 = expr_D3:int
                var_3_1B7 = newarray:byte[](byte.class, expr_D3:int)
                var_5_1B8 = expr_D3:int
                goto(Label_0625)
            }
        }
        
        Label_0216:
        
        if (cmpeq:boolean(and:int(var_0_1C5:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_7B = and:int(var_0_1C5:int, ldc:int(782021024))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1C5:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0157)
            }
            
            if (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_7B = and:int(var_0_1C5:int, ldc:int(-389527826))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_2ED = newarray:byte[](byte.class, expr_FE:int)
                var_5_2EE = expr_FE:int
                
                loop {
                    var_0_7B = and:int(var_0_7B:int, ldc:int(714793693))
                    var_5_2EE = add:int(var_5_2EE:int, ldc:int(-1))
                    storeelement:byte(var_3_2ED:byte[], var_5_2EE:int, xor:byte(loadelement:byte(stack_2FE_0:byte[], var_5_2EE:int), ldc:byte(2)))
                    
                    if (cmpne:boolean(var_5_2EE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_D1_0 = stack_D3_0 = stack_FC_0 = stack_FE_0 = stack_136_0 = stack_1D7_0 = stack_22A_0 = stack_286_0 = stack_2FE_0 = var_3_2ED:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(524288)), ldc:int(0))) {
            var_0_1C5 = and:int(var_0_7B:int, ldc:int(2124013614))
            goto(Label_0216)
        }
        
        if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_1C5 = and:int(var_0_7B:int, ldc:int(-1403782128))
            goto(Label_0157)
        }
        
        if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_1C5 = and:int(var_0_7B:int, ldc:int(1707288461))
            goto(Label_0112)
        }
        
        var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1AB_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(68), ldc:int(71)))
        expr_154 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2707), ldc:int(24835)))
        storeelement:String(expr_154:String[], and:int(ldc:int(25602), ldc:int(42)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(11990), ldc:int(-12023)), xor:int(ldc:int(4625), ldc:int(4629))))
        storeelement:String(expr_154:String[], and:int(ldc:int(-27672), ldc:int(27671)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(3460), ldc:int(13)), and:int(ldc:int(13148), ldc:int(54))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(3072), ldc:int(3073)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(1093), ldc:int(1105)), and:int(ldc:int(16447), ldc:int(1563))))
        putstatic:String[](\ub102\ub8be\u64f2\u983f\u3504\uc246::\u0a06\uc238\u64ab\ub7dc\u9a18\ubefe, expr_154:String[])
    }
    
    public void \u7043\u4179\u5245\ufcaf\u34df\u7049(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_635 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_640 : int
        
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
        var_3_635 = and:int(ldc:int(-1080707973), ldc:int(1337457915))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub102\ub8be\u64f2\u983f\u3504\uc246[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_635 = and:int(var_3_635:int, ldc:int(498401018))
            var_5_7D = and:int(ldc:int(30476), ldc:int(-30607))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-30047), ldc:int(21838)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_635:int, ldc:int(-644385029))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(25664), ldc:int(25665)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(13568), ldc:int(13569)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_635 = and:int(var_3_D2:int, ldc:int(266302584))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(9233), ldc:int(2341)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(468836805))
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1049)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-591257435))
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(904418424))
                        goto(Label_0782)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(2053927813))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1792278509))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-2058820624))
                    }
                    else {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-846153989))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0782)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1897283686))
                        goto(Label_1049)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-140998781))
                        goto(Label_0782)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(512)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-271466626))
                            var_11_E3 = and:int(ldc:int(-9058), ldc:int(9057))
                            goto(Label_1456)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1298239818))
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-868494067))
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1127116775))
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(232711454))
                        goto(Label_0907)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0782)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(303072555))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-2122001991))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-270567683))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0782)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1402339943))
                        goto(Label_1467)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(912594045))
                        goto(Label_0907)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-693834182))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-72288648))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0782:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-653704920))
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1151642292))
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(256)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1676065853))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-129663393))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-2070234446))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(2146680572))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(4691), ldc:int(1289))
                                goto(Label_1049)
                            }
                        }
                    }
                    
                    Label_0907:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(417543823))
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(53282262))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(406872659))
                            goto(Label_0782)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(1239170171))
                        var_11_E3 = and:int(ldc:int(-12623), ldc:int(12614))
                    }
                    
                    Label_1049:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1659206876))
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1438983743))
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(335029661))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1707667991))
                            goto(Label_0907)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0782)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1251766668))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-2001596486))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-882480702))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1915158786))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1319)
                            }
                        }
                    }
                    
                    Label_1192:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1182425089))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1049)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1570198567))
                            goto(Label_0907)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-80102183))
                            goto(Label_0782)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1099326441))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1919863683))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1456)
                    }
                    
                    Label_1319:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1174993414))
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1870148703))
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(501644730))
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-677190555))
                        goto(Label_0782)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1307225545))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_635 = and:int(var_3_635:int, ldc:int(2107602424))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1456:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_640 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1467:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(773106413))
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1784330001))
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-550389134))
                        goto(Label_1049)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(2053165420))
                        goto(Label_0782)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-185548446))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(348407678))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1145536769))
                        var_17_640 = add:int(var_16_111:int, xor:int(ldc:int(516), ldc:int(517)))
                        looporswitchbreak()
                    }
                }
                
                var_3_635 = and:int(var_3_635:int, ldc:int(1274920830))
                
                if (cmple:boolean(var_5_7D = var_17_640:int, sub:int(var_6_84:int, xor:int(ldc:int(10305), ldc:int(10304))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
            var_3_635 = and:int(var_3_635:int, ldc:int(-209598622))
            goto(Label_0106)
        }
    }
}
