public final class \u927d\u92ff\u71ae\uafe7\u6bb9.\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20 {
    private void \u5fe1\uc229\u5d20\u8bb0\u839e\u5d20(java.util.List<java.util.regex.Pattern> p0, java.util.List<java.util.regex.Pattern> p1, java.util.List<java.util.regex.Pattern> p2) {
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
            invokespecial:Object(Object::<init>, this:\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20)
            putfield:List<Pattern>(\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20::\uc29a\u6d99\ub8be\u36d3\u4e72\u36d3, this:\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20, p0:List<Pattern>)
            putfield:List<Pattern>(\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20::\uc229\u624e\u4d85\u6ec6\u4f4a\u76bc, this:\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20, p1:List<Pattern>)
            putfield:List<Pattern>(\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20::\u7ce1\ua6bd\uc2bd\ubefe\u8709\u8413, this:\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20, p2:List<Pattern>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String \u6d69\u8c8a\ufe34\ua068\ub102\u946b(java.util.List<java.util.regex.Pattern> p0, java.lang.String p1) {
        var_2_5F : int
        var_4_63 : ArrayList
        var_5_6B : Iterator<Pattern>
        var_2_CC : int
        var_7_C6 : Matcher
        
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
            var_2_5F = and:int(ldc:int(1286047016), ldc:int(1245469725))
            var_4_63 = invokestatic:ArrayList(Lists::newArrayList)
            var_5_6B = invokeinterface:Iterator<Pattern>(List<Pattern>::iterator, p0:List<Pattern>)
            
            loop {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(128)), ldc:int(0))) {
                    var_2_CC = and:int(var_2_5F:int, ldc:int(-738553848))
                }
                else {
                    var_2_CC = and:int(var_2_5F:int, ldc:int(-446380119))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_6B:Iterator<Pattern>)) {
                        var_7_C6 = invokevirtual:Matcher(Pattern::matcher, checkcast:Pattern(java.util.regex.Pattern.class, invokeinterface:Pattern(Iterator<Pattern>::next, var_5_6B:Iterator<Pattern>)), p1:String[expected:CharSequence])
                        
                        loop {
                            var_2_CC = and:int(var_2_CC:int, ldc:int(1684805919))
                            
                            if (logicalnot:boolean(invokevirtual:boolean(Matcher::find, var_7_C6:Matcher))) {
                                looporswitchbreak()
                            }
                            
                            invokeinterface:boolean(List<String>::add, var_4_63:ArrayList<String>[expected:List<String>], invokevirtual:String(Matcher::group, var_7_C6:Matcher))
                        }
                        
                        var_2_5F = and:int(var_2_CC:int, ldc:int(-378658294))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_CC:int, ldc:int(1048576)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_5F = and:int(var_2_CC:int, ldc:int(-1139035026))
            }
            
            return:String(invokestatic:String(String::join, loadelement:String[expected:CharSequence](getstatic:String[](\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20::\u5db4\u760c\ub171\u7043\u6b0d\u4f4a), and:int(ldc:int(-17810), ldc:int(17809))), var_4_63:ArrayList<String>[expected:Iterable<? extends CharSequence>]))
        }
        
        goto(Label_0006)
    }
    
    private com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> \u8709\u3d4b\u0b8e\u527a\u4c04\u36d3() {
        var_3_67 : ImmutableMap$Builder
        var_4_72 : String
        var_5_8B : String
        var_6_A4 : String
        
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
            var_3_67 = initobject:ImmutableMap$Builder(ImmutableMap$Builder::<init>)
            var_4_72 = invokestatic:String(\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20::\u6d69\u8c8a\ufe34\ua068\ub102\u946b, getfield:List<Pattern>(\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20::\uc29a\u6d99\ub8be\u36d3\u4e72\u36d3, this:\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20), invokestatic:String(\u8cae\u4492\u0b8e\ucfaf\ud523::\u3e75\u516c\u47c2\u647c\u0800\u98a4))
            
            if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, var_4_72:String))) {
                invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, var_3_67:ImmutableMap$Builder, loadelement:String[expected:Object](getstatic:String[](\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20::\u5db4\u760c\ub171\u7043\u6b0d\u4f4a), and:int(ldc:int(12897), ldc:int(2051))), var_4_72:String[expected:Object])
            }
            
            var_5_8B = invokestatic:String(\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20::\u6d69\u8c8a\ufe34\ua068\ub102\u946b, getfield:List<Pattern>(\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20::\uc229\u624e\u4d85\u6ec6\u4f4a\u76bc, this:\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20), invokestatic:String(\u8cae\u4492\u0b8e\ucfaf\ud523::\uff55\u76bc\u1833\u392e\ub7dc\u88c5))
            
            if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, var_5_8B:String))) {
                invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, var_3_67:ImmutableMap$Builder, loadelement:String[expected:Object](getstatic:String[](\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20::\u5db4\u760c\ub171\u7043\u6b0d\u4f4a), and:int(ldc:int(18467), ldc:int(130))), var_5_8B:String[expected:Object])
            }
            
            var_6_A4 = invokestatic:String(\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20::\u6d69\u8c8a\ufe34\ua068\ub102\u946b, getfield:List<Pattern>(\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20::\u7ce1\ua6bd\uc2bd\ubefe\u8709\u8413, this:\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20), invokestatic:String(\u8cae\u4492\u0b8e\ucfaf\ud523::\uf995\u183a\u92ff\u416d\u1833\u647c))
            
            if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, var_6_A4:String))) {
                invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, var_3_67:ImmutableMap$Builder, loadelement:String[expected:Object](getstatic:String[](\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20::\u5db4\u760c\ub171\u7043\u6b0d\u4f4a), xor:int(ldc:int(16459), ldc:int(16456))), var_6_A4:String[expected:Object])
            }
            
            return:ImmutableMap<String, String>(invokevirtual:ImmutableMap(ImmutableMap$Builder::build, var_3_67:ImmutableMap$Builder))
        }
        
        goto(Label_0006)
    }
    
    public void \u5fe1\uc229\u5d20\u8bb0\u839e\u5d20(java.util.List p0, java.util.List p1, java.util.List p2, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u74b1\u7bad\u52d3\u97b7\ud12e\u0c95 p3) {
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
            invokespecial:\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20(\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20::<init>, this:\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20, p0:List<Pattern>, p1:List<Pattern>, p2:List<Pattern>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static com.google.common.collect.ImmutableMap \u8bb0\u6435\u183a\u8cae\u64ab\u71f1(\u927d\u92ff\u71ae\uafe7\u6bb9.\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20 p0) {
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
            return:ImmutableMap(invokespecial:ImmutableMap<String, String>(\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20::\u8709\u3d4b\u0b8e\u527a\u4c04\u36d3, p0:\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_239 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_10A_0 : byte[] [generated]
        stack_10C_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_1E9_0 : byte[] [generated]
        stack_252_0 : byte[] [generated]
        stack_2E0_0 : byte[] [generated]
        stack_31D_0 : byte[] [generated]
        var_4_1C5 : int
        var_3_1CA : byte[]
        var_5_1CB : int
        expr_1E9 : byte [generated]
        var_0_26A : int
        expr_252 : byte [generated]
        stack_296_2 : byte [generated]
        stack_26D_0 : byte [generated]
        expr_9E : int [generated]
        expr_D9 : int [generated]
        var_2_10A : byte[]
        expr_10E : int [generated]
        var_3_30C : byte[]
        var_5_30D : int
        var_3_13A : String
        stack_1BE_0 : String[] [generated]
        expr_14C : String[] [generated]
        
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
        var_0_239 = and:int(ldc:int(-1334539133), ldc:int(-155660449))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D7_0 = stack_D9_0 = stack_10A_0 = stack_10C_0 = stack_12E_0 = stack_1E9_0 = stack_252_0 = stack_2E0_0 = stack_31D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("RLmRc30IAZgCCgAAcHQPmZznIiWUnpi5")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1C5 = expr_6B:int
        var_3_1CA = newarray:byte[](byte.class, expr_6B:int)
        var_5_1CB = expr_6B:int
        Label_0461:
        
        while (cmpeq:boolean(and:int(var_0_239:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_239:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0558)
            }
            
            var_0_239 = and:int(var_0_239:int, ldc:int(-1317148937))
            var_5_1CB = add:int(var_5_1CB:int, ldc:int(-1))
            expr_1E9 = loadelement:byte(stack_1E9_0:byte[], var_5_1CB:int)
            storeelement:byte(var_3_1CA:byte[], var_5_1CB:int, or:int(and:int(shl:int(expr_1E9:byte, and:int(ldc:int(16524), ldc:int(12358))), ldc:int(-16)), and:int(shr:int(expr_1E9:byte[expected:int], and:int(ldc:int(14348), ldc:int(1364))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1CB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D7_0 = stack_D9_0 = stack_10A_0 = stack_10C_0 = stack_12E_0 = stack_1E9_0 = stack_252_0 = stack_2E0_0 = stack_31D_0 = var_3_1CA:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0700)
        Label_0558:
        
        while (cmpne:boolean(and:int(var_0_239:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_239:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0461)
            }
            
            var_0_26A = and:int(var_0_239:int, ldc:int(-159650538))
            var_5_1CB = add:int(var_5_1CB:int, ldc:int(-1))
            expr_252 = stack_296_2 = loadelement(stack_252_0, var_5_1CB)
            
            if (cmplt:boolean(add:int(add:int(var_5_1CB:int, ldc:int(6)), neg:int(var_4_1C5:int)), ldc:int(0))) {
                stack_296_2 = stack_26D_0 = add:byte(expr_252:byte, loadelement:byte(var_3_1CA:byte[], add:int(var_5_1CB:int, ldc:int(6))))
                goto(Label_0637)
            }
            
            Label_0607:
            
            if (cmpeq:boolean(and:int(var_0_26A:int, ldc:int(8192)), ldc:int(0))) {
                var_0_26A = and:int(var_0_26A:int, ldc:int(-36186557))
                stack_296_2 = stack_26D_0 = add:byte(expr_252:byte, ldc:byte(6))
            }
            
            Label_0637:
            
            if (cmpne:boolean(and:int(var_0_26A:int, ldc:int(524288)), ldc:int(0))) {
                var_0_26A = and:int(var_0_26A:int, ldc:int(-1503409432))
                goto(Label_0607)
            }
            
            var_0_239 = and:int(var_0_26A:int, ldc:int(-516764005))
            storeelement:byte(var_3_1CA:byte[], var_5_1CB:int, stack_296_2:byte)
            
            if (cmpne:boolean(var_5_1CB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D7_0 = stack_D9_0 = stack_10A_0 = stack_10C_0 = stack_12E_0 = stack_1E9_0 = stack_252_0 = stack_2E0_0 = stack_31D_0 = var_3_1CA:byte[]
            goto(Label_0163)
        }
        
        var_0_239 = and:int(var_0_239:int, ldc:int(2062294038))
        Label_0700:
        
        while (cmpeq:boolean(and:int(var_0_239:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_239:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0461)
            }
            
            var_0_239 = and:int(var_0_239:int, ldc:int(-1294864482))
            var_5_1CB = add:int(var_5_1CB:int, ldc:int(-1))
            storeelement:byte(var_3_1CA:byte[], var_5_1CB:int, add:byte(xor:byte(loadelement:byte(stack_2E0_0:byte[], var_5_1CB:int), ldc:byte(124)), ldc:byte(3)))
            
            if (cmpne:boolean(var_5_1CB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D7_0 = stack_D9_0 = stack_10A_0 = stack_10C_0 = stack_12E_0 = stack_1E9_0 = stack_252_0 = stack_2E0_0 = stack_31D_0 = var_3_1CA:byte[]
            goto(Label_0222)
        }
        
        var_0_239 = and:int(var_0_239:int, ldc:int(691484092))
        goto(Label_0558)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_239:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_239 = and:int(var_0_239:int, ldc:int(-901351310))
            goto(Label_0275)
        }
        
        if (cmpeq:boolean(and:int(var_0_239:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_239 = and:int(var_0_239:int, ldc:int(-158478946))
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_239:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_239 = and:int(var_0_239:int, ldc:int(-1176651962))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_1C5 = expr_9E:int
                var_3_1CA = newarray:byte[](byte.class, expr_9E:int)
                var_5_1CB = expr_9E:int
                goto(Label_0558)
            }
        }
        
        Label_0163:
        
        if (cmpeq:boolean(and:int(var_0_239:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_239 = and:int(var_0_239:int, ldc:int(942273462))
            goto(Label_0275)
        }
        
        if (cmpne:boolean(and:int(var_0_239:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_239 = and:int(var_0_239:int, ldc:int(-139758781))
        }
        else {
            if (cmpne:boolean(and:int(var_0_239:int, ldc:int(512)), ldc:int(0))) {
                var_0_239 = and:int(var_0_239:int, ldc:int(-577059397))
                goto(Label_0112)
            }
            
            var_0_239 = and:int(var_0_239:int, ldc:int(-306598657))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_1C5 = expr_D9:int
                var_3_1CA = newarray:byte[](byte.class, expr_D9:int)
                var_5_1CB = expr_D9:int
                goto(Label_0700)
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_0_239:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_239 = and:int(var_0_239:int, ldc:int(-367551575))
        }
        else {
            if (cmpne:boolean(and:int(var_0_239:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_239:int, ldc:int(1024)), ldc:int(0))) {
                var_0_239 = and:int(var_0_239:int, ldc:int(1926436098))
                goto(Label_0112)
            }
            
            var_0_239 = and:int(var_0_239:int, ldc:int(-1296713769))
            var_2_10A = stack_10A_0:byte[]
            expr_10E = add:int(arraylength:int(stack_10C_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_10E:int, ldc:int(0))) {
                var_3_30C = newarray:byte[](byte.class, expr_10E:int)
                var_5_30D = expr_10E:int
                
                loop {
                    var_0_239 = and:int(var_0_239:int, ldc:int(-306451394))
                    var_5_30D = add:int(var_5_30D:int, ldc:int(-1))
                    storeelement:byte(var_3_30C:byte[], var_5_30D:int, add:int(shl:int(loadelement:byte(stack_31D_0:byte[], var_5_30D:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_10A:byte[], add:int(var_5_30D:int, and:int(ldc:int(147), ldc:int(14113)))), ldc:int(4)), xor:int(ldc:int(22666), ldc:int(22661)))))
                    
                    if (cmpne:boolean(var_5_30D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D7_0 = stack_D9_0 = stack_10A_0 = stack_10C_0 = stack_12E_0 = stack_1E9_0 = stack_252_0 = stack_2E0_0 = stack_31D_0 = var_3_30C:byte[]
            }
        }
        
        Label_0275:
        
        if (cmpne:boolean(and:int(var_0_239:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_239:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_0_239:int, ldc:int(4096)), ldc:int(0))) {
            var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1BE_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(10819), ldc:int(10823)))
            expr_14C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(19), ldc:int(23)))
            storeelement:String(expr_14C:String[], and:int(ldc:int(-27669), ldc:int(27668)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(-2005), ldc:int(1732)), xor:int(ldc:int(24640), ldc:int(24642))))
            storeelement:String(expr_14C:String[], xor:int(ldc:boolean(0), ldc:boolean(1)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(1606), ldc:int(16515)), and:int(ldc:int(25451), ldc:int(4122))))
            storeelement:String(expr_14C:String[], and:int(ldc:int(16823), ldc:int(10755)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(58), ldc:int(14)), and:int(ldc:int(212), ldc:int(24850))))
            storeelement:String(expr_14C:String[], xor:int(ldc:int(30720), ldc:int(30722)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(4127), ldc:int(4111)), xor:int(ldc:int(1024), ldc:int(1047))))
            putstatic:String[](\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20::\u5db4\u760c\ub171\u7043\u6b0d\u4f4a, expr_14C:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u8640\u4d85\ud158\u71f1\u9af2\u67e9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_621 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C3 : double
        var_3_D5 : int
        var_11_E6 : int
        var_14_110 : double
        var_16_114 : int
        var_12_10C : double
        var_17_62C : int
        
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
        var_3_621 = and:int(ldc:int(1319084188), ldc:int(1323044253))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5fe1\uc229\u5d20\u8bb0\u839e\u5d20[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_621 = and:int(var_3_621:int, ldc:int(1318910175))
            var_5_7D = and:int(ldc:int(-9291), ldc:int(9290))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(26246), ldc:int(-26263)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C3 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D5 = and:int(var_3_621:int, ldc:int(-941990824))
                    var_9_C3 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E6 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E6:int, sub:int(var_6_84:int, and:int(ldc:int(1), ldc:int(597)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E6:int, and:int(ldc:int(17441), ldc:int(2049)))), var_7_93:double))) {
                        inc:int(var_11_E6, ldc:int(1))
                    }
                    
                    var_3_621 = and:int(var_3_D5:int, ldc:int(-692166980))
                    var_14_110 = var_7_93:double
                    var_16_114 = var_11_E6:int
                }
                else {
                    var_11_E6 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(5251), ldc:int(861)))
                    var_12_10C = var_14_110 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_114 = var_11_E6:int, var_6_84:int)) {
                        var_9_C3 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E6:int)
                        var_16_114 = var_11_E6:int
                        var_14_110 = var_12_10C:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(260677106))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-389407581))
                        goto(Label_0901)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0780)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-425884966))
                        
                        if (cmplt:boolean(var_16_114:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0540)
                            }
                            
                            goto(Label_0780)
                        }
                    }
                    
                    Label_0384:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-254632114))
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(512)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-841220949))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0901)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0780)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1704351575))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(1459282587))
                            var_11_E6 = and:int(ldc:int(-32164), ldc:int(28033))
                            goto(Label_1438)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0540:
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-625318199))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-696476493))
                        goto(Label_0901)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0780)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-794690895))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(1740323951))
                            goto(Label_0384)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(1876584607))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_110 = var_9_C3:double
                            goto(Label_0780)
                        }
                    }
                    
                    Label_0661:
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(512)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(780554989))
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(512)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1987203664))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-974019203))
                        goto(Label_0901)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0540)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(2140871996))
                        var_14_110 = mul:double(ldc:double(0.5), add:double(var_9_C3:double, var_14_110:double))
                    }
                    
                    Label_0780:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(512)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(629475754))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(1432603927))
                            goto(Label_0661)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(1280535695))
                            goto(Label_0540)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-668747783))
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(-155414568))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E6 = and:int(ldc:int(2891), ldc:int(17445))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0901:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(320303684))
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-524290246))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(512)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1075494538))
                            goto(Label_0780)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0661)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1396371942))
                            goto(Label_0540)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(512583590))
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(1878551256))
                        var_11_E6 = and:int(ldc:int(25618), ldc:int(-25619))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0901)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0780)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(512)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-286286136))
                            goto(Label_0661)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0540)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(1595485931))
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(1455017692))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                                goto(Label_1289)
                            }
                        }
                    }
                    
                    Label_1167:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(1773742180))
                            goto(Label_0901)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0780)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0661)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0540)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1681118124))
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1204005556))
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(-826764135))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_110:double, var_5_7D:int, var_16_114:int)
                        goto(Label_1438)
                    }
                    
                    Label_1289:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-517074083))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0901)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(357384917))
                        goto(Label_0780)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-829954863))
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(620414905))
                        goto(Label_0540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-153688122))
                        goto(Label_0384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1444356126))
                        loopcontinue()
                    }
                    
                    var_3_621 = and:int(var_3_621:int, ldc:int(-4505953))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_110:double, ldc:double(0.0))
                    Label_1438:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62C = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1449:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1426299961))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(16)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1596126618))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0901)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0780)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1418519905))
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1412562565))
                        goto(Label_0540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1312252994))
                        goto(Label_0384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-18999525))
                        var_17_62C = add:int(var_16_114:int, and:int(ldc:int(8961), ldc:int(4113)))
                        looporswitchbreak()
                    }
                }
                
                var_3_621 = and:int(var_3_621:int, ldc:int(1589483804))
                
                if (cmple:boolean(var_5_7D = var_17_62C:int, sub:int(var_6_84:int, xor:int(ldc:int(-15358), ldc:int(-15357))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_621 = and:int(var_3_621:int, ldc:int(-603335342))
            goto(Label_0106)
        }
    }
}
