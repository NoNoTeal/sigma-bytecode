public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5140\u59ec\u7043\u5f50\u718f\u12cb {
    public void \u5140\u59ec\u7043\u5f50\u718f\u12cb(int p0, int p1) {
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
        invokespecial:Object(Object::<init>, this:\u5140\u59ec\u7043\u5f50\u718f\u12cb)
        
        if (cmpge:boolean(p1:int, p0:int)) {
            putfield:int(\u5140\u59ec\u7043\u5f50\u718f\u12cb::\ub113\u0c95\u960f\uc2e8\ud523\u965f, this:\u5140\u59ec\u7043\u5f50\u718f\u12cb, p0:int)
            putfield:int(\u5140\u59ec\u7043\u5f50\u718f\u12cb::\u5d20\u0800\u51fa\u9033\u4c2b\ufcaf, this:\u5140\u59ec\u7043\u5f50\u718f\u12cb, p1:int)
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u5140\u59ec\u7043\u5f50\u718f\u12cb::\u64ab\u6435\ub113\u600f\u4c2b\u8389), and:int(ldc:int(20232), ldc:int(-20233)))), p0:int), loadelement:String(getstatic:String[](\u5140\u59ec\u7043\u5f50\u718f\u12cb::\u64ab\u6435\ub113\u600f\u4c2b\u8389), and:int(ldc:int(1589), ldc:int(22851)))), p1:int))))
    }
    
    public static \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5140\u59ec\u7043\u5f50\u718f\u12cb \uc29a\u8d90\ub8be\u92ff\u760c\u5654(int p0, int p1) {
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
            return:\u5140\u59ec\u7043\u5f50\u718f\u12cb(initobject:\u5140\u59ec\u7043\u5f50\u718f\u12cb(\u5140\u59ec\u7043\u5f50\u718f\u12cb::<init>, p0:int, p1:int))
        }
        
        goto(Label_0006)
    }
    
    public int \u9937\ud4fe\u92ee\u9255\u3e75\u120d(java.util.Random p0) {
        var_2_5F : int
        stack_9A_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(1738181174), ldc:int(-283578442))
            
            if (cmpne:boolean(getfield:int(\u5140\u59ec\u7043\u5f50\u718f\u12cb::\ub113\u0c95\u960f\uc2e8\ud523\u965f, this:\u5140\u59ec\u7043\u5f50\u718f\u12cb), getfield:int(\u5140\u59ec\u7043\u5f50\u718f\u12cb::\u5d20\u0800\u51fa\u9033\u4c2b\ufcaf, this:\u5140\u59ec\u7043\u5f50\u718f\u12cb))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1742404278))
                stack_9A_0 = add:int(invokevirtual:int(Random::nextInt, p0:Random, add:int(sub:int(getfield:int(\u5140\u59ec\u7043\u5f50\u718f\u12cb::\u5d20\u0800\u51fa\u9033\u4c2b\ufcaf, this:\u5140\u59ec\u7043\u5f50\u718f\u12cb), getfield:int(\u5140\u59ec\u7043\u5f50\u718f\u12cb::\ub113\u0c95\u960f\uc2e8\ud523\u965f, this:\u5140\u59ec\u7043\u5f50\u718f\u12cb)), and:int(ldc:int(23297), ldc:int(21)))), getfield:int(\u5140\u59ec\u7043\u5f50\u718f\u12cb::\ub113\u0c95\u960f\uc2e8\ud523\u965f, this:\u5140\u59ec\u7043\u5f50\u718f\u12cb))
            }
            else {
                stack_9A_0 = getfield:int(\u5140\u59ec\u7043\u5f50\u718f\u12cb::\ub113\u0c95\u960f\uc2e8\ud523\u965f, this:\u5140\u59ec\u7043\u5f50\u718f\u12cb)
            }
            
            return:int(stack_9A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public int \ud523\u47c2\u6d99\u760c\u6d99\u6ec6() {
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
            return:int(getfield:int(\u5140\u59ec\u7043\u5f50\u718f\u12cb::\ub113\u0c95\u960f\uc2e8\ud523\u965f, this:\u5140\u59ec\u7043\u5f50\u718f\u12cb))
        }
        
        goto(Label_0006)
    }
    
    public int \u47c2\ud217\ube23\u4f52\u64ab\ub18d() {
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
            return:int(getfield:int(\u5140\u59ec\u7043\u5f50\u718f\u12cb::\u5d20\u0800\u51fa\u9033\u4c2b\ufcaf, this:\u5140\u59ec\u7043\u5f50\u718f\u12cb))
        }
        
        goto(Label_0006)
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u5140\u59ec\u7043\u5f50\u718f\u12cb::\u64ab\u6435\ub113\u600f\u4c2b\u8389), and:int(ldc:int(5186), ldc:int(24843)))), getfield:int(\u5140\u59ec\u7043\u5f50\u718f\u12cb::\ub113\u0c95\u960f\uc2e8\ud523\u965f, this:\u5140\u59ec\u7043\u5f50\u718f\u12cb)), loadelement:String(getstatic:String[](\u5140\u59ec\u7043\u5f50\u718f\u12cb::\u64ab\u6435\ub113\u600f\u4c2b\u8389), and:int(ldc:int(24099), ldc:int(15)))), getfield:int(\u5140\u59ec\u7043\u5f50\u718f\u12cb::\u5d20\u0800\u51fa\u9033\u4c2b\ufcaf, this:\u5140\u59ec\u7043\u5f50\u718f\u12cb)), loadelement:String(getstatic:String[](\u5140\u59ec\u7043\u5f50\u718f\u12cb::\u64ab\u6435\ub113\u600f\u4c2b\u8389), xor:int(ldc:int(-16240), ldc:int(-16236))))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_259 : int
        expr_6B : int [generated]
        stack_AB_0 : byte[] [generated]
        stack_AD_0 : byte[] [generated]
        stack_DF_0 : byte[] [generated]
        stack_E1_0 : byte[] [generated]
        stack_121_0 : byte[] [generated]
        stack_123_0 : byte[] [generated]
        stack_153_0 : byte[] [generated]
        stack_155_0 : byte[] [generated]
        stack_194_0 : byte[] [generated]
        stack_27A_0 : byte[] [generated]
        stack_2B4_0 : byte[] [generated]
        stack_31F_0 : byte[] [generated]
        stack_388_0 : byte[] [generated]
        stack_400_0 : byte[] [generated]
        var_4_246 : int
        var_3_24B : byte[]
        var_5_24C : int
        expr_31F : byte [generated]
        var_0_3A0 : int
        expr_388 : byte [generated]
        stack_3CC_2 : byte [generated]
        stack_3A3_0 : byte [generated]
        var_2_AB : byte[]
        expr_AF : int [generated]
        var_3_2A3 : byte[]
        var_5_2A4 : int
        expr_E1 : int [generated]
        expr_123 : int [generated]
        expr_155 : int [generated]
        var_3_3EF : byte[]
        var_5_3F0 : int
        var_3_1A0 : String
        stack_23F_0 : String[] [generated]
        expr_1B2 : String[] [generated]
        
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
        var_0_259 = and:int(ldc:int(-911305127), ldc:int(-151527713))
        expr_6B = arraylength:int(stack_AB_0 = stack_AD_0 = stack_DF_0 = stack_E1_0 = stack_121_0 = stack_123_0 = stack_153_0 = stack_155_0 = stack_194_0 = stack_27A_0 = stack_2B4_0 = stack_31F_0 = stack_388_0 = stack_400_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("t0e4bbl2IWg0wDS5zwcIcHp7tPV5L6lx8nWx60m3q6Ujt7b0Q5MLirT2M/H1dieuv7e3uAO4a7m6u7eKtPYz8fV0Y61Awn+/lgs=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_246 = expr_6B:int
        var_3_24B = newarray:byte[](byte.class, expr_6B:int)
        var_5_24C = expr_6B:int
        Label_0590:
        
        while (cmpeq:boolean(and:int(var_0_259:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_259:int, ldc:int(2)), ldc:int(0))) {
                var_0_259 = and:int(var_0_259:int, ldc:int(-2118716662))
                goto(Label_0763)
            }
            
            var_0_259 = and:int(var_0_259:int, ldc:int(1587795832))
            var_5_24C = add:int(var_5_24C:int, ldc:int(-1))
            storeelement:byte(var_3_24B:byte[], var_5_24C:int, add:byte(loadelement:byte(stack_27A_0:byte[], var_5_24C:int), ldc:byte(73)))
            
            if (cmpne:boolean(var_5_24C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_DF_0 = stack_E1_0 = stack_121_0 = stack_123_0 = stack_153_0 = stack_155_0 = stack_194_0 = stack_27A_0 = stack_2B4_0 = stack_31F_0 = stack_388_0 = stack_400_0 = var_3_24B:byte[]
            goto(Label_0112)
        }
        
        var_0_259 = and:int(var_0_259:int, ldc:int(-370703413))
        goto(Label_0868)
        Label_0763:
        
        while (cmpeq:boolean(and:int(var_0_259:int, ldc:int(128)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0590)
            }
            
            var_0_259 = and:int(var_0_259:int, ldc:int(1839439578))
            var_5_24C = add:int(var_5_24C:int, ldc:int(-1))
            expr_31F = loadelement:byte(stack_31F_0:byte[], var_5_24C:int)
            storeelement:byte(var_3_24B:byte[], var_5_24C:int, or:int(and:int(shl:int(expr_31F:byte, xor:int(ldc:int(4645), ldc:int(4641))), ldc:int(-16)), and:int(shr:int(expr_31F:byte[expected:int], xor:int(ldc:int(17029), ldc:int(17025))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_24C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_DF_0 = stack_E1_0 = stack_121_0 = stack_123_0 = stack_153_0 = stack_155_0 = stack_194_0 = stack_27A_0 = stack_2B4_0 = stack_31F_0 = stack_388_0 = stack_400_0 = var_3_24B:byte[]
            goto(Label_0230)
        }
        
        var_0_259 = and:int(var_0_259:int, ldc:int(364495885))
        Label_0868:
        
        while (cmpne:boolean(and:int(var_0_259:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_259 = and:int(var_0_259:int, ldc:int(-1483209054))
                goto(Label_0590)
            }
            
            var_0_3A0 = and:int(var_0_259:int, ldc:int(1521131388))
            var_5_24C = add:int(var_5_24C:int, ldc:int(-1))
            expr_388 = stack_3CC_2 = loadelement(stack_388_0, var_5_24C)
            
            if (cmplt:boolean(add:int(add:int(var_5_24C:int, ldc:int(6)), neg:int(var_4_246:int)), ldc:int(0))) {
                stack_3CC_2 = stack_3A3_0 = add:byte(expr_388:byte, loadelement:byte(var_3_24B:byte[], add:int(var_5_24C:int, ldc:int(6))))
                goto(Label_0947)
            }
            
            Label_0917:
            
            if (cmpne:boolean(and:int(var_0_3A0:int, ldc:int(64)), ldc:int(0))) {
                var_0_3A0 = and:int(var_0_3A0:int, ldc:int(-977275175))
                stack_3CC_2 = stack_3A3_0 = add:byte(expr_388:byte, ldc:byte(6))
            }
            
            Label_0947:
            
            if (cmpne:boolean(and:int(var_0_3A0:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_3A0 = and:int(var_0_3A0:int, ldc:int(-1043349445))
                goto(Label_0917)
            }
            
            var_0_259 = and:int(var_0_3A0:int, ldc:int(1220452093))
            storeelement:byte(var_3_24B:byte[], var_5_24C:int, stack_3CC_2:byte)
            
            if (cmpne:boolean(var_5_24C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_DF_0 = stack_E1_0 = stack_121_0 = stack_123_0 = stack_153_0 = stack_155_0 = stack_194_0 = stack_27A_0 = stack_2B4_0 = stack_31F_0 = stack_388_0 = stack_400_0 = var_3_24B:byte[]
            goto(Label_0296)
        }
        
        goto(Label_0763)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_259:int, ldc:int(128)), ldc:int(0))) {
            var_0_259 = and:int(var_0_259:int, ldc:int(1794269898))
            goto(Label_0346)
        }
        
        if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0296)
        }
        
        if (cmpne:boolean(and:int(var_0_259:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_259 = and:int(var_0_259:int, ldc:int(554331512))
            goto(Label_0230)
        }
        
        if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_259 = and:int(var_0_259:int, ldc:int(-1281310795))
        }
        else {
            var_0_259 = and:int(var_0_259:int, ldc:int(1392179163))
            var_2_AB = stack_AB_0:byte[]
            expr_AF = add:int(arraylength:int(stack_AD_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_AF:int, ldc:int(0))) {
                var_3_2A3 = newarray:byte[](byte.class, expr_AF:int)
                var_5_2A4 = expr_AF:int
                
                loop {
                    var_0_259 = and:int(var_0_259:int, ldc:int(1471135487))
                    var_5_2A4 = add:int(var_5_2A4:int, ldc:int(-1))
                    storeelement:byte(var_3_2A3:byte[], var_5_2A4:int, add:int(shl:int(loadelement:byte(stack_2B4_0:byte[], var_5_2A4:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_AB:byte[], add:int(var_5_2A4:int, xor:int(ldc:int(8193), ldc:int(8192)))), ldc:int(2)), and:int(ldc:int(24703), ldc:int(191)))))
                    
                    if (cmpne:boolean(var_5_2A4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AD_0 = stack_AB_0 = stack_DF_0 = stack_E1_0 = stack_121_0 = stack_123_0 = stack_153_0 = stack_155_0 = stack_194_0 = stack_27A_0 = stack_2B4_0 = stack_31F_0 = stack_388_0 = stack_400_0 = var_3_2A3:byte[]
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0346)
        }
        
        if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0296)
        }
        
        if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_259:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_259 = and:int(var_0_259:int, ldc:int(739483251))
                goto(Label_0112)
            }
            
            var_0_259 = and:int(var_0_259:int, ldc:int(-240396545))
            expr_E1 = arraylength:int(stack_E1_0:byte[])
            
            if (cmpne:boolean(expr_E1:int, ldc:int(0))) {
                var_4_246 = expr_E1:int
                var_3_24B = newarray:byte[](byte.class, expr_E1:int)
                var_5_24C = expr_E1:int
                goto(Label_0763)
            }
        }
        
        Label_0230:
        
        if (cmpne:boolean(and:int(var_0_259:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_259 = and:int(var_0_259:int, ldc:int(-224254121))
            goto(Label_0346)
        }
        
        if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(64)), ldc:int(0))) {
            var_0_259 = and:int(var_0_259:int, ldc:int(425428533))
        }
        else {
            if (cmpne:boolean(and:int(var_0_259:int, ldc:int(128)), ldc:int(0))) {
                var_0_259 = and:int(var_0_259:int, ldc:int(363669878))
                goto(Label_0180)
            }
            
            if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_259 = and:int(var_0_259:int, ldc:int(-235669896))
            expr_123 = arraylength:int(stack_123_0:byte[])
            
            if (cmpne:boolean(expr_123:int, ldc:int(0))) {
                var_4_246 = expr_123:int
                var_3_24B = newarray:byte[](byte.class, expr_123:int)
                var_5_24C = expr_123:int
                goto(Label_0868)
            }
        }
        
        Label_0296:
        
        if (cmpne:boolean(and:int(var_0_259:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0230)
            }
            
            if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_259 = and:int(var_0_259:int, ldc:int(-1534834258))
                goto(Label_0180)
            }
            
            if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_259 = and:int(var_0_259:int, ldc:int(1638053722))
            expr_155 = arraylength:int(stack_155_0:byte[])
            
            if (cmpne:boolean(expr_155:int, ldc:int(0))) {
                var_3_3EF = newarray:byte[](byte.class, expr_155:int)
                var_5_3F0 = expr_155:int
                
                loop {
                    var_0_259 = and:int(var_0_259:int, ldc:int(-924403719))
                    var_5_3F0 = add:int(var_5_3F0:int, ldc:int(-1))
                    storeelement:byte(var_3_3EF:byte[], var_5_3F0:int, xor:byte(loadelement:byte(stack_400_0:byte[], var_5_3F0:int), ldc:byte(67)))
                    
                    if (cmpne:boolean(var_5_3F0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AD_0 = stack_AB_0 = stack_DF_0 = stack_E1_0 = stack_121_0 = stack_123_0 = stack_153_0 = stack_155_0 = stack_194_0 = stack_27A_0 = stack_2B4_0 = stack_31F_0 = stack_388_0 = stack_400_0 = var_3_3EF:byte[]
            }
        }
        
        Label_0346:
        
        if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(131072)), ldc:int(0))) {
            var_0_259 = and:int(var_0_259:int, ldc:int(845691382))
            goto(Label_0296)
        }
        
        if (cmpne:boolean(and:int(var_0_259:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_259 = and:int(var_0_259:int, ldc:int(255265302))
            goto(Label_0230)
        }
        
        if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0180)
        }
        
        if (cmpne:boolean(and:int(var_0_259:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_259 = and:int(var_0_259:int, ldc:int(-1787791739))
            goto(Label_0112)
        }
        
        var_3_1A0 = initobject:String(String::<init>, stack_194_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_23F_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2181), ldc:int(5989)))
        expr_1B2 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(30215), ldc:int(2213)))
        storeelement:String(expr_1B2:String[], and:int(ldc:int(37), ldc:int(14531)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, and:int(ldc:int(22096), ldc:int(-22097)), xor:int(ldc:int(-32735), ldc:int(-32724))))
        storeelement:String(expr_1B2:String[], xor:int(ldc:int(-32763), ldc:int(-32762)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, xor:int(ldc:int(142), ldc:int(131)), and:int(ldc:int(559), ldc:int(9358))))
        storeelement:String(expr_1B2:String[], and:int(ldc:int(8842), ldc:int(2082)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, xor:int(ldc:int(10306), ldc:int(10316)), and:int(ldc:int(8343), ldc:int(3455))))
        storeelement:String(expr_1B2:String[], and:int(ldc:int(10452), ldc:int(5157)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, xor:int(ldc:int(16990), ldc:int(16969)), xor:int(ldc:int(-32635), ldc:int(-32611))))
        storeelement:String(expr_1B2:String[], and:int(ldc:int(-2512), ldc:int(207)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, xor:int(ldc:int(12296), ldc:int(12304)), xor:int(ldc:int(5192), ldc:int(5121))))
        putstatic:String[](\u5140\u59ec\u7043\u5f50\u718f\u12cb::\u64ab\u6435\ub113\u600f\u4c2b\u8389, expr_1B2:String[])
    }
    
    public void \u4d85\u99f7\uff55\u1833\uc246\ud7e8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FE : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_609 : int
        
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
        var_3_5FE = and:int(ldc:int(-1368755052), ldc:int(-53627531))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5140\u59ec\u7043\u5f50\u718f\u12cb[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(32)), ldc:int(0))) {
            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1174473724))
        }
        else {
            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1090751276))
            var_5_85 = and:int(ldc:int(-26131), ldc:int(9746))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16333), ldc:int(972)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5FE:int, ldc:int(-867617164))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(533), ldc:int(532)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(8320), ldc:int(8321)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5FE = and:int(var_3_DA:int, ldc:int(-10766410))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:boolean(0), ldc:boolean(1)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(313931344))
                        goto(Label_1281)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-194214365))
                        goto(Label_1026)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-496922812))
                        goto(Label_0893)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0776)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(751332489))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-276576401))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1134739457))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0776)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1026)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1298775955))
                        goto(Label_0893)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0776)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1133742529))
                            var_11_EB = and:int(ldc:int(4678), ldc:int(-4679))
                            goto(Label_1410)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1843572729))
                        goto(Label_1026)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1766222835))
                        goto(Label_0893)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-340038436))
                        goto(Label_0776)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-425783798))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-302435300))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0776)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1096990542))
                        goto(Label_1281)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-901146698))
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1026)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1339178083))
                        goto(Label_0893)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(124942701))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(623714060))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1108509321))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0776:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1952187169))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1411677763))
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1026)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1225032700))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-863402418))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-285264707))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(5), ldc:int(145))
                                goto(Label_1026)
                            }
                        }
                    }
                    
                    Label_0893:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1380974887))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1816779858))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0776)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1368753067))
                        var_11_EB = and:int(ldc:int(-3386), ldc:int(3385))
                    }
                    
                    Label_1026:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-220008210))
                            goto(Label_0893)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0776)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-22867566))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-34452794))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(252168082))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1678191695))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1369604099))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1281)
                            }
                        }
                    }
                    
                    Label_1151:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1519066397))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1237288245))
                            goto(Label_1026)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1186736364))
                            goto(Label_0893)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0776)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1126607609))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-831555724))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1410)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1281:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1383154367))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-687092488))
                        goto(Label_1026)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0893)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0776)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1220796432))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-942031047))
                        loopcontinue()
                    }
                    
                    var_3_5FE = and:int(var_3_5FE:int, ldc:int(-563235140))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1410:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_609 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1421:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-575172382))
                        goto(Label_1281)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1452947212))
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1026)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0893)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0776)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(278786636))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1872235796))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-329566921))
                        var_17_609 = add:int(var_16_119:int, and:int(ldc:int(2673), ldc:int(4489)))
                        looporswitchbreak()
                    }
                    
                    var_3_5FE = and:int(var_3_5FE:int, ldc:int(-633749966))
                }
                
                var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1636942595))
                
                if (cmple:boolean(var_5_85 = var_17_609:int, sub:int(var_6_8C:int, xor:int(ldc:int(21632), ldc:int(21633))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(32)), ldc:int(0))) {
            var_3_5FE = and:int(var_3_5FE:int, ldc:int(830861044))
            goto(Label_0106)
        }
    }
}
