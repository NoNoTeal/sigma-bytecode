public class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\ub7dc\u74b1\ub7dc\uc31c\u98a4 {
    public void \ub7dc\u74b1\ub7dc\uc31c\u98a4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            invokespecial:Object(Object::<init>, this:\ub7dc\u74b1\ub7dc\uc31c\u98a4)
            putfield:\u7d52\u718f\u3776\u6fb0\ub83f(\ub7dc\u74b1\ub7dc\uc31c\u98a4::\u71f1\ud12e\ua562\u72f1\u0800\u6198, this:\ub7dc\u74b1\ub7dc\uc31c\u98a4, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9af2\u7006\u1833\ube23\u3711\ubb2b(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0) {
        var_4_76 : UUID
        
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
        
        if (logicalnot:boolean(instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\ub7dc\u74b1\ub7dc\uc31c\u98a4::\u71f1\ud12e\ua562\u72f1\u0800\u6198, this:\ub7dc\u74b1\ub7dc\uc31c\u98a4)))) {
            var_4_76 = invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\ub7dc\u74b1\ub7dc\uc31c\u98a4::\u71f1\ud12e\ua562\u72f1\u0800\u6198, this:\ub7dc\u74b1\ub7dc\uc31c\u98a4))
            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\ub18d\uc229\u071d\u7873\u4daf\u3e2a, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\ub7dc\u74b1\ub7dc\uc31c\u98a4::\u71f1\ud12e\ua562\u72f1\u0800\u6198, this:\ub7dc\u74b1\ub7dc\uc31c\u98a4), p0:\uc31c\uc87f\uc246\u3776\ub7dc)
            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ubff1\u8aa5\u6b0d\u5bc4\ud158, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\ub7dc\u74b1\ub7dc\uc31c\u98a4::\u71f1\ud12e\ua562\u72f1\u0800\u6198, this:\ub7dc\u74b1\ub7dc\uc31c\u98a4), var_4_76:UUID)
            return:void()
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\ub7dc\u74b1\ub7dc\uc31c\u98a4::\u9033\u8cae\u3c25\ud12e\u6c56\u946b)))
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \ub171\uc3e3\ubff1\ud158\u3711\u0b8e() {
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
            return:\uc31c\uc87f\uc246\u3776\ub7dc(invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\uc84e\u7ce1\u6b5f\u51b2\ubb2b\u3d4b::\u97b7\uc29a\u7049\u5654\u1187\ud51e, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\ub7dc\u74b1\ub7dc\uc31c\u98a4::\u71f1\ud12e\ua562\u72f1\u0800\u6198, this:\ub7dc\u74b1\ub7dc\uc31c\u98a4)))
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \u2dcc\u6fb0\u416d\u8350\u16f6\u67e9() {
        stack_89_1 : String [generated]
        expr_76 : Object[] [generated]
        
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
            stack_89_1 = loadelement:String(getstatic:String[](\ub7dc\u74b1\ub7dc\uc31c\u98a4::\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c), and:int(ldc:int(11138), ldc:int(-31620)))
            expr_76 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(4099), ldc:int(1349)))
            storeelement:Object(expr_76:Object[], and:int(ldc:int(10666), ldc:int(-11691)), invokevirtual:ITextComponent[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\ub7dc\u74b1\ub7dc\uc31c\u98a4::\u71f1\ud12e\ua562\u72f1\u0800\u6198, this:\ub7dc\u74b1\ub7dc\uc31c\u98a4)))
            return:ITextComponent(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_89_1:String, expr_76:Object[]))
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \u51b2\u5bc4\ubcb0\u2dcc\u1833\u4c2b(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab p0) {
        stack_98_1 : String [generated]
        expr_76 : Object[] [generated]
        
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
            stack_98_1 = loadelement:String(getstatic:String[](\ub7dc\u74b1\ub7dc\uc31c\u98a4::\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c), and:int(ldc:int(3077), ldc:int(29531)))
            expr_76 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(9799), ldc:int(26)))
            storeelement:Object(expr_76:Object[], and:int(ldc:int(-21756), ldc:int(21595)), invokevirtual:ITextComponent[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\ub7dc\u74b1\ub7dc\uc31c\u98a4::\u71f1\ud12e\ua562\u72f1\u0800\u6198, this:\ub7dc\u74b1\ub7dc\uc31c\u98a4)))
            storeelement:Object(expr_76:Object[], xor:int(ldc:int(6658), ldc:int(6659)), invokeinterface:ITextComponent[expected:Object](\u93a2\u97b7\u647c\ud36e\u64ab::\u12b2\u946b\ufcaf\u61a4\u8cae\u9af2, p0:\u93a2\u97b7\u647c\ud36e\u64ab))
            return:ITextComponent(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_98_1:String, expr_76:Object[]))
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \ubded\u92ff\u59ec\u392e\u6d99\ube23(\u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p0, double p1, int p2) {
        stack_D5_1 : String [generated]
        expr_79 : Object[] [generated]
        stack_C6_1 : int [generated]
        stack_C3_0 : Locale [generated]
        stack_C3_1 : String [generated]
        expr_B3 : Object[] [generated]
        
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
            stack_D5_1 = loadelement:String(getstatic:String[](\ub7dc\u74b1\ub7dc\uc31c\u98a4::\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c), xor:int(ldc:int(-32768), ldc:int(-32766)))
            expr_79 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(4100), ldc:int(17460)))
            storeelement:Object(expr_79:Object[], and:int(ldc:int(29065), ldc:int(-29086)), p0:\ub171\u47c2\u3bd6\u3776\u59ec[expected:Object])
            storeelement:Object(expr_79:Object[], xor:int(ldc:int(394), ldc:int(395)), invokevirtual:ITextComponent[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\ub7dc\u74b1\ub7dc\uc31c\u98a4::\u71f1\ud12e\ua562\u72f1\u0800\u6198, this:\ub7dc\u74b1\ub7dc\uc31c\u98a4)))
            stack_C6_1 = xor:int(ldc:int(10321), ldc:int(10323))
            stack_C3_0 = getstatic:Locale(Locale::ROOT)
            stack_C3_1 = loadelement:String(getstatic:String[](\ub7dc\u74b1\ub7dc\uc31c\u98a4::\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c), and:int(ldc:int(4611), ldc:int(3139)))
            expr_B3 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(1088), ldc:int(1089)))
            storeelement:Object(expr_B3:Object[], and:int(ldc:int(-16476), ldc:int(16467)), invokestatic:Double[expected:Object](Double::valueOf, p1:double))
            storeelement:Object(expr_79:Object[], stack_C6_1:int, invokestatic:String(String::format, stack_C3_0:Locale, stack_C3_1:String, expr_B3:Object[]))
            storeelement:Object(expr_79:Object[], and:int(ldc:int(8755), ldc:int(16515)), invokestatic:Integer[expected:Object](Integer::valueOf, p2:int))
            return:ITextComponent(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_D5_1:String, expr_79:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a lambda$\u74b1\u12b2\u34df\u759a\u8753\u7330$0(java.lang.String p0) {
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
            return:\u0a06\u1833\u64f2\ud217\u183a(initobject:\u156b\u3d64\u8640\u446c\u4bc8[expected:\u0a06\u1833\u64f2\ud217\u183a](\u156b\u3d64\u8640\u446c\u4bc8::<init>, p0:String))
        }
        
        goto(Label_0006)
    }
    
    static {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void \uf995\u0b8e\u6fb0\u67d0\u6198\uc31c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66A : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C4 : double
        var_3_D6 : int
        var_11_E7 : int
        var_14_111 : double
        var_16_115 : int
        var_12_10D : double
        var_17_675 : int
        
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
        var_3_66A = and:int(ldc:int(-572200634), ldc:int(1606758857))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub7dc\u74b1\ub7dc\uc31c\u98a4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8)), ldc:int(0))) {
            var_3_66A = and:int(var_3_66A:int, ldc:int(-70404851))
            var_5_7D = and:int(ldc:int(-27595), ldc:int(25026))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3649), ldc:int(-3650)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C4 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D6 = and:int(var_3_66A:int, ldc:int(-641094833))
                    var_9_C4 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E7 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E7:int, sub:int(var_6_84:int, and:int(ldc:int(693), ldc:int(17409)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E7:int, xor:int(ldc:int(-32506), ldc:int(-32505)))), var_7_93:double))) {
                        inc:int(var_11_E7, ldc:int(1))
                    }
                    
                    var_3_66A = and:int(var_3_D6:int, ldc:int(-540035813))
                    var_14_111 = var_7_93:double
                    var_16_115 = var_11_E7:int
                }
                else {
                    var_11_E7 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(5265), ldc:int(2337)))
                    var_12_10D = var_14_111 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_115 = var_11_E7:int, var_6_84:int)) {
                        var_9_C4 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E7:int)
                        var_16_115 = var_11_E7:int
                        var_14_111 = var_12_10D:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1552)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1008396146))
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-627981073))
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-1780132252))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1022338531))
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1526168781))
                    }
                    else {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-574184174))
                        
                        if (cmplt:boolean(var_16_115:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0592)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0412:
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-210258248))
                        goto(Label_1552)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-1576517910))
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-2133667050))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-545584829))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(320613895))
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(752258129))
                            loopcontinue()
                        }
                        
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1609579360))
                        var_11_E7 = and:int(ldc:int(-2077), ldc:int(2076))
                        goto(Label_1541)
                    }
                    
                    Label_0592:
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1552)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-281443159))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-27016838))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(449940956))
                            loopcontinue()
                        }
                        
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1506618735))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_111 = var_9_C4:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0707:
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1552)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1311092660))
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-753526369))
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1334429507))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-1525614823))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1595905009))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(1344890632))
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1608524657))
                        var_14_111 = mul:double(ldc:double(0.5), add:double(var_9_C4:double, var_14_111:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1552)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-84253328))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0707)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(66574507))
                            loopcontinue()
                        }
                        
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-640795334))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E7 = and:int(ldc:int(22829), ldc:int(9219))
                                goto(Label_1128)
                            }
                        }
                    }
                    
                    Label_0953:
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1063887451))
                        goto(Label_1552)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1902012174))
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1760997179))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-636249770))
                            goto(Label_0707)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-1413733093))
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(366781903))
                            loopcontinue()
                        }
                        
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1508962766))
                        var_11_E7 = and:int(ldc:int(20559), ldc:int(-21584))
                    }
                    
                    Label_1128:
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1579552413))
                        goto(Label_1552)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1691295000))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-1859184505))
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(1829524139))
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(1368992206))
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-501174382))
                            loopcontinue()
                        }
                        
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-104795204))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                                goto(Label_1409)
                            }
                        }
                    }
                    
                    Label_1267:
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-703816879))
                        goto(Label_1552)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_1128)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-622205781))
                            goto(Label_0953)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-310534317))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-552654770))
                            goto(Label_0707)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(521826291))
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-37260396))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_111:double, var_5_7D:int, var_16_115:int)
                            goto(Label_1541)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1409:
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1552)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(813546377))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(195453163))
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(934201916))
                        goto(Label_0412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(170496740))
                        loopcontinue()
                    }
                    
                    var_3_66A = and:int(var_3_66A:int, ldc:int(-1791702))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_111:double, ldc:double(0.0))
                    Label_1541:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_675 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1552:
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-2100213638))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-1200623809))
                        goto(Label_0412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(2079977318))
                        var_17_675 = add:int(var_16_115:int, xor:int(ldc:int(1097), ldc:int(1096)))
                        looporswitchbreak()
                    }
                }
                
                var_3_66A = and:int(var_3_66A:int, ldc:int(2043258742))
                
                if (cmple:boolean(var_5_7D = var_17_675:int, sub:int(var_6_84:int, and:int(ldc:int(1281), ldc:int(14353))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8192)), ldc:int(0))) {
            var_3_66A = and:int(var_3_66A:int, ldc:int(1718482482))
            goto(Label_0106)
        }
    }
}
