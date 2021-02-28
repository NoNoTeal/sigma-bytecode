public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd {
    public void \ub19c\ubf56\uc87f\u3bd6\u960f\u56bd(\u516c\u3d64\u718f\ub171\u6b5f.\ubded\u8308\u4c04\ucb79\u836c\u4492 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p1) {
        var_5_78 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_6_B0 : String
        
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
            putfield:\ubded\u8308\u4c04\ucb79\u836c\u4492(\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd::\u8308\u67e9\u965f\uc7fe\u9255\u51fa, this:\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd, p0:\ubded\u8308\u4c04\ucb79\u836c\u4492)
            invokespecial:\ub1b9\u7049\u8aa5\u0a06\u9af2\u9255(\ub1b9\u7049\u8aa5\u0a06\u9af2\u9255::<init>, this:\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd)
            putfield:\uc2e8\u9255\u647c\ud171\ubf56(\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd::\u72f1\u183a\u4975\u0b8e\ub32d\uc2bd, this:\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd, p1:\uc2e8\u9255\u647c\ud171\ubf56)
            var_5_78 = invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u8df4\ua068\u9af2\u8350\uc29a\u392e, invokestatic:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>](\u71f1\ud4fe\u47c2\ubcb0\uff55\u156b::\u8c8a\u1187\u7d52\uff55\u9255\ud158, getfield:\u71f1\ud4fe\u47c2\ubcb0\uff55\u156b(\ubded\u8308\u4c04\ucb79\u836c\u4492::\u3d64\ubefe\u9033\u527a\u3c25\u760c, p0:\ubded\u8308\u4c04\ucb79\u836c\u4492)), p1:\uc2e8\u9255\u647c\ud171\ubf56[expected:Object])
            var_6_B0 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd::\uf9c5\u983f\u6d69\u4bc8\u527a\ub19c), and:int(ldc:int(-11409), ldc:int(11408)))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, var_5_78:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)), loadelement:String(getstatic:String[](\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd::\uf9c5\u983f\u6d69\u4bc8\u527a\ub19c), xor:int(ldc:int(4109), ldc:int(4108)))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, var_5_78:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
            
            if (logicalnot:boolean(invokevirtual:boolean(LanguageMap::func_230506_b_, invokestatic:LanguageMap(LanguageMap::getInstance), var_6_B0:String))) {
                putfield:ITextComponent(\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd::\u8cae\ub7dc\uf94d\u4f52\u5d20\u3a62, this:\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd, initobject:StringTextComponent(StringTextComponent::<init>, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, var_5_78:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
            }
            else {
                putfield:ITextComponent(\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd::\u8cae\ub7dc\uf94d\u4f52\u5d20\u3a62, this:\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd, initobject:TranslationTextComponent(TranslationTextComponent::<init>, var_6_B0:String))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8413\u4492\uc2e8\u946b\u1187\u516c(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, boolean p8, float p9) {
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
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub32d\u3e75\uc7fe\u92ff\u9937\u5f50, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u71f1\ud4fe\u47c2\ubcb0\uff55\u156b::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, getfield:\u71f1\ud4fe\u47c2\ubcb0\uff55\u156b(\ubded\u8308\u4c04\ucb79\u836c\u4492::\u3d64\ubefe\u9033\u527a\u3c25\u760c, getfield:\ubded\u8308\u4c04\ucb79\u836c\u4492(\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd::\u8308\u67e9\u965f\uc7fe\u9255\u51fa, this:\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd))), getfield:ITextComponent(\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd::\u8cae\ub7dc\uf94d\u4f52\u5d20\u3a62, this:\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd), add:int(p3:int, and:int(ldc:int(8261), ldc:int(4133))), add:int(p2:int, and:int(ldc:int(18), ldc:int(66))), ldc:int(16777215))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u183a\ud36e\u1187\u88c5\u7bad\u5bc4(double p0, double p1, int p2) {
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
        
        if (cmpne:boolean(p2:int, ldc:int(0))) {
            return:boolean(and:int[expected:boolean](ldc:int(4317), ldc:int(-6366)))
        }
        
        invokevirtual:void(\ubded\u8308\u4c04\ucb79\u836c\u4492::\u8c8a\ubcb0\ud36e\u67d0\uceb8\u7873, getfield:\ubded\u8308\u4c04\ucb79\u836c\u4492(\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd::\u8308\u67e9\u965f\uc7fe\u9255\u51fa, this:\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd), this:\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd)
        return:boolean(xor:int[expected:boolean](ldc:int(72), ldc:int(73)))
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u385b\u4cd9\u36d3\u3bd6\uc9f6\u183a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd p0) {
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
            return:\uc2e8\u9255\u647c\ud171\ubf56(getfield:\uc2e8\u9255\u647c\ud171\ubf56(\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd::\u72f1\u183a\u4975\u0b8e\ub32d\uc2bd, p0:\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_13A : int
        expr_6B : int [generated]
        stack_85_0 : byte[] [generated]
        stack_87_0 : byte[] [generated]
        stack_A9_0 : byte[] [generated]
        stack_AB_0 : byte[] [generated]
        stack_C6_0 : byte[] [generated]
        stack_14C_0 : byte[] [generated]
        stack_1D3_0 : byte[] [generated]
        stack_229_0 : byte[] [generated]
        var_4_127 : int
        var_3_12C : byte[]
        var_5_12D : int
        var_0_164 : int
        expr_14C : byte [generated]
        stack_198_2 : byte [generated]
        stack_16F_0 : byte [generated]
        expr_1D3 : byte [generated]
        expr_87 : int [generated]
        var_2_A9 : byte[]
        expr_AD : int [generated]
        var_3_218 : byte[]
        var_5_219 : int
        var_3_D2 : String
        stack_120_0 : String[] [generated]
        expr_E4 : String[] [generated]
        
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
        var_0_13A = and:int(ldc:int(-485116923), ldc:int(-1483227730))
        expr_6B = arraylength:int(stack_85_0 = stack_87_0 = stack_A9_0 = stack_AB_0 = stack_C6_0 = stack_14C_0 = stack_1D3_0 = stack_229_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("BRQUSvYP76Q=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_127 = expr_6B:int
        var_3_12C = newarray:byte[](byte.class, expr_6B:int)
        var_5_12D = expr_6B:int
        Label_0303:
        
        while (cmpne:boolean(and:int(var_0_13A:int, ldc:int(1024)), ldc:int(0))) {
            var_0_164 = and:int(var_0_13A:int, ldc:int(-1277707047))
            var_5_12D = add:int(var_5_12D:int, ldc:int(-1))
            expr_14C = stack_198_2 = loadelement(stack_14C_0, var_5_12D)
            
            if (cmplt:boolean(add:int(add:int(var_5_12D:int, ldc:int(4)), neg:int(var_4_127:int)), ldc:int(0))) {
                stack_198_2 = stack_16F_0 = add:byte(expr_14C:byte, loadelement:byte(var_3_12C:byte[], add:int(var_5_12D:int, ldc:int(4))))
                goto(Label_0383)
            }
            
            Label_0345:
            
            if (cmpeq:boolean(and:int(var_0_164:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_164 = and:int(var_0_164:int, ldc:int(-1510413579))
            }
            else {
                var_0_164 = and:int(var_0_164:int, ldc:int(-213944682))
                stack_198_2 = stack_16F_0 = add:byte(expr_14C:byte, ldc:byte(4))
            }
            
            Label_0383:
            
            if (cmpne:boolean(and:int(var_0_164:int, ldc:int(32)), ldc:int(0))) {
                var_0_164 = and:int(var_0_164:int, ldc:int(1674280554))
                goto(Label_0345)
            }
            
            var_0_13A = and:int(var_0_164:int, ldc:int(-1556119906))
            storeelement:byte(var_3_12C:byte[], var_5_12D:int, stack_198_2:byte)
            
            if (cmpne:boolean(var_5_12D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_87_0 = stack_85_0 = stack_A9_0 = stack_AB_0 = stack_C6_0 = stack_14C_0 = stack_1D3_0 = stack_229_0 = var_3_12C:byte[]
            goto(Label_0112)
        }
        
        var_0_13A = and:int(var_0_13A:int, ldc:int(240852389))
        Label_0446:
        
        while (cmpne:boolean(and:int(var_0_13A:int, ldc:int(65536)), ldc:int(0))) {
            var_0_13A = and:int(var_0_13A:int, ldc:int(-1279443906))
            var_5_12D = add:int(var_5_12D:int, ldc:int(-1))
            expr_1D3 = loadelement:byte(stack_1D3_0:byte[], var_5_12D:int)
            storeelement:byte(var_3_12C:byte[], var_5_12D:int, xor:int(add:int(or:int(and:int(shl:int(expr_1D3:byte, and:int(ldc:int(261), ldc:int(24796))), ldc:int(-16)), and:int(shr:int(expr_1D3:byte[expected:int], and:int(ldc:int(4836), ldc:int(1028))), ldc:int(15))), ldc:int(49)), ldc:int(59)))
            
            if (cmpne:boolean(var_5_12D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_87_0 = stack_85_0 = stack_A9_0 = stack_AB_0 = stack_C6_0 = stack_14C_0 = stack_1D3_0 = stack_229_0 = var_3_12C:byte[]
            goto(Label_0140)
        }
        
        goto(Label_0303)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_13A:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0178)
        }
        
        if (cmpne:boolean(and:int(var_0_13A:int, ldc:int(1024)), ldc:int(0))) {
            var_0_13A = and:int(var_0_13A:int, ldc:int(-1544194062))
            expr_87 = arraylength:int(stack_87_0:byte[])
            
            if (cmpne:boolean(expr_87:int, ldc:int(0))) {
                var_4_127 = expr_87:int
                var_3_12C = newarray:byte[](byte.class, expr_87:int)
                var_5_12D = expr_87:int
                goto(Label_0446)
            }
        }
        
        Label_0140:
        
        if (cmpeq:boolean(and:int(var_0_13A:int, ldc:int(65536)), ldc:int(0))) {
            var_0_13A = and:int(var_0_13A:int, ldc:int(558667364))
        }
        else {
            if (cmpne:boolean(and:int(var_0_13A:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_13A = and:int(var_0_13A:int, ldc:int(-1347076271))
            var_2_A9 = stack_A9_0:byte[]
            expr_AD = add:int(arraylength:int(stack_AB_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                var_3_218 = newarray:byte[](byte.class, expr_AD:int)
                var_5_219 = expr_AD:int
                
                loop {
                    var_0_13A = and:int(var_0_13A:int, ldc:int(-483035223))
                    var_5_219 = add:int(var_5_219:int, ldc:int(-1))
                    storeelement:byte(var_3_218:byte[], var_5_219:int, add:int(shl:int(loadelement:byte(stack_229_0:byte[], var_5_219:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_A9:byte[], add:int(var_5_219:int, and:int(ldc:int(193), ldc:int(13849)))), ldc:int(6)), and:int(ldc:int(16723), ldc:int(15375)))))
                    
                    if (cmpne:boolean(var_5_219:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_87_0 = stack_85_0 = stack_A9_0 = stack_AB_0 = stack_C6_0 = stack_14C_0 = stack_1D3_0 = stack_229_0 = var_3_218:byte[]
            }
        }
        
        Label_0178:
        
        if (cmpeq:boolean(and:int(var_0_13A:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0140)
        }
        
        if (cmpne:boolean(and:int(var_0_13A:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_D2 = initobject:String(String::<init>, stack_C6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_120_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-19967), ldc:int(-19965)))
            expr_E4 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1572), ldc:int(1574)))
            storeelement:String(expr_E4:String[], and:int(ldc:int(20649), ldc:int(323)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, and:int(ldc:int(6313), ldc:int(-6570)), xor:int(ldc:int(-24566), ldc:int(-24565))))
            storeelement:String(expr_E4:String[], and:int(ldc:int(-26183), ldc:int(9794)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, and:int(ldc:int(23051), ldc:int(8197)), and:int(ldc:int(2407), ldc:int(9367))))
            putstatic:String[](\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd::\uf9c5\u983f\u6d69\u4bc8\u527a\ub19c, expr_E4:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u0a06\u516c\u76bc\u5fe1\u61a4\u946b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63F : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_64A : int
        
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
        var_3_63F = and:int(ldc:int(-1492473296), ldc:int(128974716))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_63F = and:int(var_3_63F:int, ldc:int(591133688))
            var_5_7D = and:int(ldc:int(4562), ldc:int(-5588))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-8645), ldc:int(8644)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_63F:int, ldc:int(-811877379))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(18), ldc:int(19)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(16385), ldc:int(9227)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_63F = and:int(var_3_D2:int, ldc:int(1740304059))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(27681), ldc:int(5)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(944621198))
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(2123250901))
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-446433686))
                        goto(Label_0808)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1644924085))
                        goto(Label_0688)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1623572126))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1745163331))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0808)
                        }
                    }
                    
                    Label_0403:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(970501163))
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1893059403))
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0808)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0688)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1798350588))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1348538378))
                            var_11_E3 = and:int(ldc:int(23072), ldc:int(-23329))
                            goto(Label_1478)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1032552287))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1816494988))
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-2125229430))
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1923609736))
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1587384084))
                        goto(Label_0808)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1756430412))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0808)
                        }
                    }
                    
                    Label_0688:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1688166558))
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1832211771))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-934434952))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1738452603))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0808:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1632279264))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-535857957))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-136642690))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(18704), ldc:int(18705))
                                goto(Label_1096)
                            }
                        }
                    }
                    
                    Label_0912:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(2109157344))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-101773529))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-112028391))
                            goto(Label_0808)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(520958530))
                            goto(Label_0688)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1096485536))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1578774076))
                            goto(Label_0403)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-76538464))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(670023548))
                        var_11_E3 = and:int(ldc:int(-21705), ldc:int(21704))
                    }
                    
                    Label_1096:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(214310708))
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1995679314))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(265254858))
                            goto(Label_0912)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0808)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1990146185))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1816204495))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1374)
                            }
                        }
                    }
                    
                    Label_1216:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1665645397))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-810387109))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-979881921))
                            goto(Label_1096)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(619379424))
                            goto(Label_0912)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(951555511))
                            goto(Label_0808)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1257733192))
                            goto(Label_0688)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(839070796))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-337990032))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1478)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1374:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0808)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1036646695))
                        goto(Label_0403)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63F = and:int(var_3_63F:int, ldc:int(267038391))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1478:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64A = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1489:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-2093375615))
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-843678606))
                        goto(Label_0808)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-2017628204))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0403)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1127918328))
                        var_17_64A = add:int(var_16_111:int, and:int(ldc:int(5993), ldc:int(2177)))
                        looporswitchbreak()
                    }
                    
                    var_3_63F = and:int(var_3_63F:int, ldc:int(-1907397266))
                }
                
                var_3_63F = and:int(var_3_63F:int, ldc:int(-1277236232))
                
                if (cmple:boolean(var_5_7D = var_17_64A:int, sub:int(var_6_84:int, xor:int(ldc:int(-30590), ldc:int(-30589))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_63F = and:int(var_3_63F:int, ldc:int(-234139425))
            goto(Label_0106)
        }
    }
}
