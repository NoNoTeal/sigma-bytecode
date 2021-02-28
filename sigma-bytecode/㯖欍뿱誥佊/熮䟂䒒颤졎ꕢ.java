public class \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u71ae\u47c2\u4492\u98a4\uc84e\ua562 {
    private void \u71ae\u47c2\u4492\u98a4\uc84e\ua562(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u40a9\u8cae\uc31c\u59ec\u7043\u8350 p0) {
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
            putfield:\u40a9\u8cae\uc31c\u59ec\u7043\u8350(\u71ae\u47c2\u4492\u98a4\uc84e\ua562::\u4daf\u7873\ubb2b\u385b\u3e2a\u839e, this:\u71ae\u47c2\u4492\u98a4\uc84e\ua562, p0:\u40a9\u8cae\uc31c\u59ec\u7043\u8350)
            invokespecial:Object(Object::<init>, this:\u71ae\u47c2\u4492\u98a4\uc84e\ua562)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4492\u51b2\ud523\ud12e\uceb8\u4ab3() {
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
        
        if (logicalnot:boolean(instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ubded\u67d0\ub102\ub7dc\u760c\u56bd.class, invokestatic:\u8cae\uf9c5\u67e9\ua3b4\u8350\u5f50(\u40a9\u8cae\uc31c\u59ec\u7043\u8350::\u494c\u99f7\ud7e8\u61a4\ud7e8\u51fa, getfield:\u40a9\u8cae\uc31c\u59ec\u7043\u8350(\u71ae\u47c2\u4492\u98a4\uc84e\ua562::\u4daf\u7873\ubb2b\u385b\u3e2a\u839e, this:\u71ae\u47c2\u4492\u98a4\uc84e\ua562))))) {
            athrow(initobject:\ua3b4\u836c\u983f\u51b2\u8aa5\u7ce1(\ua3b4\u836c\u983f\u51b2\u8aa5\u7ce1::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71ae\u47c2\u4492\u98a4\uc84e\ua562::\uc84e\u92ee\ud523\u5245\u927d\u3776), xor:int(ldc:int(16440), ldc:int(16441)))), invokestatic:\u8cae\uf9c5\u67e9\ua3b4\u8350\u5f50[expected:Object](\u40a9\u8cae\uc31c\u59ec\u7043\u8350::\u494c\u99f7\ud7e8\u61a4\ud7e8\u51fa, getfield:\u40a9\u8cae\uc31c\u59ec\u7043\u8350(\u71ae\u47c2\u4492\u98a4\uc84e\ua562::\u4daf\u7873\ubb2b\u385b\u3e2a\u839e, this:\u71ae\u47c2\u4492\u98a4\uc84e\ua562))))))
        }
        
        invokevirtual:void(\u40a9\u8cae\uc31c\u59ec\u7043\u8350::\u36d3\u12cb\u6ec6\u7ce1\u8389\u4cd9, getfield:\u40a9\u8cae\uc31c\u59ec\u7043\u8350(\u71ae\u47c2\u4492\u98a4\uc84e\ua562::\u4daf\u7873\ubb2b\u385b\u3e2a\u839e, this:\u71ae\u47c2\u4492\u98a4\uc84e\ua562))
        
        if (invokevirtual:boolean(\ubded\u67d0\ub102\ub7dc\u760c\u56bd::\u3bd6\u4bc8\u92ff\u0b8e\u97b7\u61a4, checkcast:\ubded\u67d0\ub102\ub7dc\u760c\u56bd(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ubded\u67d0\ub102\ub7dc\u760c\u56bd.class, invokestatic:\u8cae\uf9c5\u67e9\ua3b4\u8350\u5f50[expected:\ubded\u67d0\ub102\ub7dc\u760c\u56bd](\u40a9\u8cae\uc31c\u59ec\u7043\u8350::\u494c\u99f7\ud7e8\u61a4\ud7e8\u51fa, getfield:\u40a9\u8cae\uc31c\u59ec\u7043\u8350(\u71ae\u47c2\u4492\u98a4\uc84e\ua562::\u4daf\u7873\ubb2b\u385b\u3e2a\u839e, this:\u71ae\u47c2\u4492\u98a4\uc84e\ua562))))) {
            invokevirtual:void(\u40a9\u8cae\uc31c\u59ec\u7043\u8350::\ud171\u3bd6\ub83f\u6198\u5245\u9af2, getfield:\u40a9\u8cae\uc31c\u59ec\u7043\u8350(\u71ae\u47c2\u4492\u98a4\uc84e\ua562::\u4daf\u7873\ubb2b\u385b\u3e2a\u839e, this:\u71ae\u47c2\u4492\u98a4\uc84e\ua562), loadelement:String(getstatic:String[](\u71ae\u47c2\u4492\u98a4\uc84e\ua562::\uc84e\u92ee\ud523\u5245\u927d\u3776), and:int(ldc:int(7233), ldc:int(-7234))), xor:int[expected:boolean](ldc:int(12384), ldc:int(12385)), and:int[expected:boolean](ldc:int(-27990), ldc:int(19477)), and:int[expected:boolean](ldc:int(-4326), ldc:int(4325)))
            invokevirtual:void(\u40a9\u8cae\uc31c\u59ec\u7043\u8350::\u36d3\u12cb\u6ec6\u7ce1\u8389\u4cd9, getfield:\u40a9\u8cae\uc31c\u59ec\u7043\u8350(\u71ae\u47c2\u4492\u98a4\uc84e\ua562::\u4daf\u7873\ubb2b\u385b\u3e2a\u839e, this:\u71ae\u47c2\u4492\u98a4\uc84e\ua562))
        }
        
        invokevirtual:void(\u40a9\u8cae\uc31c\u59ec\u7043\u8350::\ub19c\uc84e\uf9c5\u52d3\u7c6b\u4c04, getfield:\u40a9\u8cae\uc31c\u59ec\u7043\u8350(\u71ae\u47c2\u4492\u98a4\uc84e\ua562::\u4daf\u7873\ubb2b\u385b\u3e2a\u839e, this:\u71ae\u47c2\u4492\u98a4\uc84e\ua562))
        invokestatic:\ub6ab\u4daf\u3bc9\ud217\uf94d\ud523(\u40a9\u8cae\uc31c\u59ec\u7043\u8350::\u5f50\ub113\u4d85\u1187\uc31c\u7ce1, getfield:\u40a9\u8cae\uc31c\u59ec\u7043\u8350(\u71ae\u47c2\u4492\u98a4\uc84e\ua562::\u4daf\u7873\ubb2b\u385b\u3e2a\u839e, this:\u71ae\u47c2\u4492\u98a4\uc84e\ua562), initobject:\u7043\u4ab3\u5654\ua3b4\u1833\uc84e[expected:\ub6ab\u4daf\u3bc9\ud217\uf94d\ud523](\u7043\u4ab3\u5654\ua3b4\u1833\uc84e::<init>, getfield:\u40a9\u8cae\uc31c\u59ec\u7043\u8350(\u71ae\u47c2\u4492\u98a4\uc84e\ua562::\u4daf\u7873\ubb2b\u385b\u3e2a\u839e, this:\u71ae\u47c2\u4492\u98a4\uc84e\ua562), and:int[expected:boolean](ldc:int(-2612), ldc:int(2579))))
    }
    
    public void \u71ae\u47c2\u4492\u98a4\uc84e\ua562(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u40a9\u8cae\uc31c\u59ec\u7043\u8350 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u416d\u72f1\u8d98\ud4fe\u88c5\u4daf p1) {
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
            invokespecial:\u71ae\u47c2\u4492\u98a4\uc84e\ua562(\u71ae\u47c2\u4492\u98a4\uc84e\ua562::<init>, this:\u71ae\u47c2\u4492\u98a4\uc84e\ua562, p0:\u40a9\u8cae\uc31c\u59ec\u7043\u8350)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_211 : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_19C_0 : byte[] [generated]
        stack_223_0 : byte[] [generated]
        stack_260_0 : byte[] [generated]
        stack_2B5_0 : byte[] [generated]
        var_4_17F : int
        var_3_184 : byte[]
        var_5_185 : int
        var_0_192 : int
        expr_19C : byte [generated]
        stack_1E0_2 : byte [generated]
        stack_1BF_0 : byte [generated]
        expr_8E : int [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_24F : byte[]
        var_5_250 : int
        expr_EE : int [generated]
        var_3_2A4 : byte[]
        var_5_2A5 : int
        expr_2B5 : byte [generated]
        var_3_12A : String
        stack_178_0 : String[] [generated]
        expr_13C : String[] [generated]
        
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
        var_0_211 = and:int(ldc:int(699933834), ldc:int(-251726150))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_19C_0 = stack_223_0 = stack_260_0 = stack_2B5_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ALbOWGiYeJAAWgF297DQAIj4OVB3uRB/QHhy4i4mkFqY9ugK491c")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_17F = expr_6B:int
        var_3_184 = newarray:byte[](byte.class, expr_6B:int)
        var_5_185 = expr_6B:int
        Label_0391:
        
        while (cmpeq:boolean(and:int(var_0_211:int, ldc:int(65536)), ldc:int(0))) {
            var_0_192 = and:int(var_0_211:int, ldc:int(1224424652))
            var_5_185 = add:int(var_5_185:int, ldc:int(-1))
            expr_19C = stack_1E0_2 = loadelement(stack_19C_0, var_5_185)
            
            if (cmplt:boolean(add:int(add:int(var_5_185:int, ldc:int(2)), neg:int(var_4_17F:int)), ldc:int(0))) {
                stack_1E0_2 = stack_1BF_0 = add:byte(expr_19C:byte, loadelement:byte(var_3_184:byte[], add:int(var_5_185:int, ldc:int(2))))
                goto(Label_0463)
            }
            
            Label_0425:
            
            if (cmpne:boolean(and:int(var_0_192:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_192 = and:int(var_0_192:int, ldc:int(-2112073873))
            }
            else {
                var_0_192 = and:int(var_0_192:int, ldc:int(129987595))
                stack_1E0_2 = stack_1BF_0 = add:byte(expr_19C:byte, ldc:byte(2))
            }
            
            Label_0463:
            
            if (cmpne:boolean(and:int(var_0_192:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0425)
            }
            
            var_0_211 = and:int(var_0_192:int, ldc:int(-541381537))
            storeelement:byte(var_3_184:byte[], var_5_185:int, stack_1E0_2:byte)
            
            if (cmpne:boolean(var_5_185:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_19C_0 = stack_223_0 = stack_260_0 = stack_2B5_0 = var_3_184:byte[]
            goto(Label_0112)
        }
        
        Label_0518:
        
        while (cmpeq:boolean(and:int(var_0_211:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_211 = and:int(var_0_211:int, ldc:int(448538315))
            var_5_185 = add:int(var_5_185:int, ldc:int(-1))
            storeelement:byte(var_3_184:byte[], var_5_185:int, xor:byte(add:byte(loadelement:byte(stack_223_0:byte[], var_5_185:int), ldc:byte(26)), ldc:byte(120)))
            
            if (cmpne:boolean(var_5_185:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_19C_0 = stack_223_0 = stack_260_0 = stack_2B5_0 = var_3_184:byte[]
            goto(Label_0147)
        }
        
        var_0_211 = and:int(var_0_211:int, ldc:int(1829228165))
        goto(Label_0391)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_211:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_211:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_211:int, ldc:int(8)), ldc:int(0))) {
            var_0_211 = and:int(var_0_211:int, ldc:int(-340117748))
            expr_8E = arraylength:int(stack_8E_0:byte[])
            
            if (cmpne:boolean(expr_8E:int, ldc:int(0))) {
                var_4_17F = expr_8E:int
                var_3_184 = newarray:byte[](byte.class, expr_8E:int)
                var_5_185 = expr_8E:int
                goto(Label_0518)
            }
        }
        
        Label_0147:
        
        if (cmpne:boolean(and:int(var_0_211:int, ldc:int(4)), ldc:int(0))) {
            var_0_211 = and:int(var_0_211:int, ldc:int(1705059885))
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_211:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_211:int, ldc:int(1024)), ldc:int(0))) {
                var_0_211 = and:int(var_0_211:int, ldc:int(-1912680475))
                goto(Label_0112)
            }
            
            var_0_211 = and:int(var_0_211:int, ldc:int(-1078200675))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_24F = newarray:byte[](byte.class, expr_C3:int)
                var_5_250 = expr_C3:int
                
                loop {
                    var_0_211 = and:int(var_0_211:int, ldc:int(1857709261))
                    var_5_250 = add:int(var_5_250:int, ldc:int(-1))
                    storeelement:byte(var_3_24F:byte[], var_5_250:int, add:int(shl:int(loadelement:byte(stack_260_0:byte[], var_5_250:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_250:int, xor:int(ldc:int(513), ldc:int(512)))), ldc:int(7)), xor:int(ldc:int(10), ldc:int(11)))))
                    
                    if (cmpne:boolean(var_5_250:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_19C_0 = stack_223_0 = stack_260_0 = stack_2B5_0 = var_3_24F:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_211:int, ldc:int(8)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_211:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0147)
            }
            
            if (cmpeq:boolean(and:int(var_0_211:int, ldc:int(8192)), ldc:int(0))) {
                var_0_211 = and:int(var_0_211:int, ldc:int(-943091059))
                goto(Label_0112)
            }
            
            var_0_211 = and:int(var_0_211:int, ldc:int(750402824))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_2A4 = newarray:byte[](byte.class, expr_EE:int)
                var_5_2A5 = expr_EE:int
                
                loop {
                    var_0_211 = and:int(var_0_211:int, ldc:int(-1447493655))
                    var_5_2A5 = add:int(var_5_2A5:int, ldc:int(-1))
                    expr_2B5 = loadelement:byte(stack_2B5_0:byte[], var_5_2A5:int)
                    storeelement:byte(var_3_2A4:byte[], var_5_2A5:int, or:int(and:int(shl:int(expr_2B5:byte, and:int(ldc:int(3732), ldc:int(20484))), ldc:int(-16)), and:int(shr:int(expr_2B5:byte[expected:int], and:int(ldc:int(1046), ldc:int(6213))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2A5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_19C_0 = stack_223_0 = stack_260_0 = stack_2B5_0 = var_3_2A4:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpeq:boolean(and:int(var_0_211:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_211:int, ldc:int(16)), ldc:int(0))) {
            var_0_211 = and:int(var_0_211:int, ldc:int(152062323))
            goto(Label_0147)
        }
        
        if (cmpeq:boolean(and:int(var_0_211:int, ldc:int(524288)), ldc:int(0))) {
            var_0_211 = and:int(var_0_211:int, ldc:int(1785704718))
            goto(Label_0112)
        }
        
        var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_178_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1026), ldc:int(5078)))
        expr_13C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(6656), ldc:int(6658)))
        storeelement:String(expr_13C:String[], and:int(ldc:int(-28076), ldc:int(3369)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(10524), ldc:int(-31101)), xor:int(ldc:int(-28480), ldc:int(-28477))))
        storeelement:String(expr_13C:String[], xor:int(ldc:int(-30590), ldc:int(-30589)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(2947), ldc:int(59)), xor:int(ldc:int(462), ldc:int(488))))
        putstatic:String[](\u71ae\u47c2\u4492\u98a4\uc84e\ua562::\uc84e\u92ee\ud523\u5245\u927d\u3776, expr_13C:String[])
    }
    
    public void \u67e9\uceb8\u12cb\u4d85\u8c8a\u7af6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_639 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_644 : int
        
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
        var_3_639 = and:int(ldc:int(1271648212), ldc:int(-495360044))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u71ae\u47c2\u4492\u98a4\uc84e\ua562[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_639 = and:int(var_3_639:int, ldc:int(1012492485))
        }
        else {
            var_3_639 = and:int(var_3_639:int, ldc:int(-764678664))
            var_5_85 = and:int(ldc:int(3665), ldc:int(-3666))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-26604), ldc:int(10185)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_639:int, ldc:int(1254598486))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(12417), ldc:int(2369)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(145), ldc:int(1285)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_639 = and:int(var_3_D2:int, ldc:int(2001812948))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(17666), ldc:int(17667)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1657580298))
                        goto(Label_1480)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(909162465))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-985825574))
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0955)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1652228553))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-199430081))
                    }
                    else {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1667594110))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-2016710374))
                        goto(Label_1480)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1046363467))
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1501834844))
                        goto(Label_0955)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(2056306257))
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1509846725))
                        goto(Label_0707)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1412705745))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(1736263543))
                        var_11_E3 = and:int(ldc:int(12845), ldc:int(-12846))
                        goto(Label_1469)
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-442761273))
                        goto(Label_1480)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(274478806))
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1422666308))
                        goto(Label_0955)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1006885876))
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1482651188))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1014132234))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-2119687270))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(1198651258))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0707:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1480)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(798511023))
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1185375581))
                        goto(Label_0955)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1926014059))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-770580549))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-797612427))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(1945226712))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0839:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-999603385))
                        goto(Label_1480)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1597967530))
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-515705985))
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(427116980))
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(1668365693))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(21833), ldc:int(37))
                                goto(Label_1097)
                            }
                        }
                    }
                    
                    Label_0955:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1480)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1540820970))
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-739908246))
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1227598952))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(-205031471))
                        var_11_E3 = and:int(ldc:int(-31924), ldc:int(26801))
                    }
                    
                    Label_1097:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1885872151))
                        goto(Label_1480)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1745782314))
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(413259850))
                            goto(Label_0955)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-866627151))
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1427801785))
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-612057768))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-463643368))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(-482103975))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1359)
                            }
                        }
                    }
                    
                    Label_1240:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-30791825))
                        goto(Label_1480)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_1097)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(291488572))
                            goto(Label_0955)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(253220458))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(-816736803))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1469)
                    }
                    
                    Label_1359:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1480)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0955)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1533845991))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-931256178))
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_639 = and:int(var_3_639:int, ldc:int(-211953680))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1469:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_644 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1480:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1634313464))
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-242383808))
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1127472355))
                        goto(Label_0955)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1830121492))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(43398639))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1391447932))
                        var_17_644 = add:int(var_16_111:int, and:int(ldc:int(8293), ldc:int(411)))
                        looporswitchbreak()
                    }
                }
                
                var_3_639 = and:int(var_3_639:int, ldc:int(-697758376))
                
                if (cmple:boolean(var_5_85 = var_17_644:int, sub:int(var_6_8C:int, and:int(ldc:int(10497), ldc:int(16899))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
