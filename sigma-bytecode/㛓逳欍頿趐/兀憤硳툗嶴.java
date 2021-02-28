public class \u36d3\u9033\u6b0d\u983f\u8d90.\u5140\u61a4\u7873\ud217\u5db4 {
    public void \u5140\u61a4\u7873\ud217\u5db4() {
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
            invokespecial:Object(Object::<init>, this:\u5140\u61a4\u7873\ud217\u5db4)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u927d\u647c\u64f2\u7043\ufe34 parse(com.mojang.brigadier.StringReader p0) {
        var_4_64 : String
        var_5_6B : Optional<\u927d\u647c\u64f2\u7043\ufe34>
        var_6_9E : StringTextComponent
        
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
        var_4_64 = invokevirtual:String(StringReader::readUnquotedString, p0:StringReader)
        var_5_6B = invokestatic:Optional<\u927d\u647c\u64f2\u7043\ufe34>(\u4179\uae5d\uc9f6\u4492\u446c::\u6c56\ua068\ud158\u88c5\u8d90\u67d0, var_4_64:String)
        
        if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, var_5_6B:Optional<\u927d\u647c\u64f2\u7043\ufe34>))) {
            var_6_9E = initobject:StringTextComponent(StringTextComponent::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u5140\u61a4\u7873\ud217\u5db4::\u0a06\u5fe1\u183a\u67e9\u7af6\uf995), and:int(ldc:int(-9707), ldc:int(9450)))), var_4_64:String)))
            athrow(initobject:CommandSyntaxException(CommandSyntaxException::<init>, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, var_6_9E:StringTextComponent[expected:Message]), var_6_9E:Message))
        }
        
        return:\u927d\u647c\u64f2\u7043\ufe34(checkcast:\u927d\u647c\u64f2\u7043\ufe34(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u927d\u647c\u64f2\u7043\ufe34.class, invokevirtual:\u927d\u647c\u64f2\u7043\ufe34(Optional<\u927d\u647c\u64f2\u7043\ufe34>::get, var_5_6B:Optional<\u927d\u647c\u64f2\u7043\ufe34>)))
    }
    
    public static \u36d3\u9033\u6b0d\u983f\u8d90.\u5140\u61a4\u7873\ud217\u5db4 \ubded\u718f\u527a\ua562\u36d3\ua61f() {
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
            return:\u5140\u61a4\u7873\ud217\u5db4(initobject:\u5140\u61a4\u7873\ud217\u5db4(\u5140\u61a4\u7873\ud217\u5db4::<init>))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u927d\u647c\u64f2\u7043\ufe34 \u8aa5\ub18d\uc2bd\ubff1\u6435\ub171(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, java.lang.String p1) {
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
            return:\u927d\u647c\u64f2\u7043\ufe34(checkcast:\u927d\u647c\u64f2\u7043\ufe34(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u927d\u647c\u64f2\u7043\ufe34.class, invokevirtual:Object[expected:\u927d\u647c\u64f2\u7043\ufe34](CommandContext::getArgument, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, p1:String, ldc:Class<\u927d\u647c\u64f2\u7043\ufe34>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u927d\u647c\u64f2\u7043\ufe34.class))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> listSuggestions(com.mojang.brigadier.context.CommandContext<S> p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
            return:CompletableFuture<Suggestions>(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u5245\u16f6\u3711\u64ab\u6d69\u647c, invokeinterface:Stream<String>(Stream<\u927d\u647c\u64f2\u7043\ufe34>::map, invokeinterface:Stream<\u927d\u647c\u64f2\u7043\ufe34>(Collection<\u927d\u647c\u64f2\u7043\ufe34>::stream, invokestatic:Collection<\u927d\u647c\u64f2\u7043\ufe34>(\u4179\uae5d\uc9f6\u4492\u446c::\uc910\u4cd9\ubf56\u8c8a\u99f7\u12b2)), invokedynamic:Function<? super \u927d\u647c\u64f2\u7043\ufe34, String>(apply:()Ljava/util/function/Function;)), p1:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<java.lang.String> getExamples() {
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
            return:Collection<String>(getstatic:Collection<String>(\u5140\u61a4\u7873\ud217\u5db4::\u67d0\u93a2\ua6bd\u7049\ub19c\ub8be))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object parse(com.mojang.brigadier.StringReader p0) {
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
            return:Object(invokevirtual:\u927d\u647c\u64f2\u7043\ufe34[expected:Object](\u5140\u61a4\u7873\ud217\u5db4::parse, this:\u5140\u61a4\u7873\ud217\u5db4, p0:StringReader))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1F5 : int
        expr_6B : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_20E_0 : byte[] [generated]
        stack_248_0 : byte[] [generated]
        stack_2AB_0 : byte[] [generated]
        stack_30F_0 : byte[] [generated]
        var_4_1E2 : int
        var_3_1E7 : byte[]
        var_5_1E8 : int
        expr_2AE : byte [generated]
        var_0_305 : int
        expr_30F : byte [generated]
        stack_33D_2 : byte [generated]
        var_2_A4 : byte[]
        expr_A8 : int [generated]
        var_3_237 : byte[]
        var_5_238 : int
        expr_D3 : int [generated]
        expr_106 : int [generated]
        var_3_13A : String
        expr_142 : String[] [generated]
        expr_14C : String[] [generated]
        var_3_1A7 : String[]
        expr_1AF : String[] [generated]
        
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
        var_0_1F5 = and:int(ldc:int(-2141070793), ldc:int(-769550241))
        expr_6B = arraylength:int(stack_A4_0 = stack_A6_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_20E_0 = stack_248_0 = stack_2AB_0 = stack_30F_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("DeuG4dN0rOaasXwDPQbLS0Sk00z7UyNLS0Sk00Ljo0uW05wASCCYJA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1E2 = expr_6B:int
        var_3_1E7 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1E8 = expr_6B:int
        Label_0490:
        
        while (cmpne:boolean(and:int(var_0_1F5:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1F5:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0655)
            }
            
            var_0_1F5 = and:int(var_0_1F5:int, ldc:int(-1368007369))
            var_5_1E8 = add:int(var_5_1E8:int, ldc:int(-1))
            storeelement:byte(var_3_1E7:byte[], var_5_1E8:int, add:byte(loadelement:byte(stack_20E_0:byte[], var_5_1E8:int), ldc:byte(92)))
            
            if (cmpne:boolean(var_5_1E8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_20E_0 = stack_248_0 = stack_2AB_0 = stack_30F_0 = var_3_1E7:byte[]
            goto(Label_0112)
        }
        
        var_0_1F5 = and:int(var_0_1F5:int, ldc:int(253437943))
        goto(Label_0755)
        Label_0655:
        
        while (cmpeq:boolean(and:int(var_0_1F5:int, ldc:int(1048576)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1F5:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0490)
            }
            
            var_0_1F5 = and:int(var_0_1F5:int, ldc:int(1210382455))
            var_5_1E8 = add:int(var_5_1E8:int, ldc:int(-1))
            expr_2AE = xor:byte(loadelement:byte(stack_2AB_0:byte[], var_5_1E8:int), ldc:byte(79))
            storeelement:byte(var_3_1E7:byte[], var_5_1E8:int, or:int(and:int(shl:int(expr_2AE:byte, xor:int(ldc:int(8363), ldc:int(8367))), ldc:int(-16)), and:int(shr:int(expr_2AE:byte[expected:int], and:int(ldc:int(17444), ldc:int(660))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1E8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_20E_0 = stack_248_0 = stack_2AB_0 = stack_30F_0 = var_3_1E7:byte[]
            goto(Label_0216)
        }
        
        Label_0755:
        
        while (cmpeq:boolean(and:int(var_0_1F5:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1F5:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0490)
            }
            
            var_0_305 = and:int(var_0_1F5:int, ldc:int(360300351))
            var_5_1E8 = add:int(var_5_1E8:int, ldc:int(-1))
            expr_30F = loadelement:byte(stack_30F_0:byte[], var_5_1E8:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1E8:int, ldc:int(4)), neg:int(var_4_1E2:int)), ldc:int(0))) {
                var_0_305 = and:int(var_0_305:int, ldc:int(276470335))
                stack_33D_2 = add:byte(expr_30F:byte, ldc:byte(4))
            }
            else {
                stack_33D_2 = add:byte(expr_30F:byte, loadelement:byte(var_3_1E7:byte[], add:int(var_5_1E8:int, ldc:int(4))))
            }
            
            var_0_1F5 = and:int(var_0_305:int, ldc:int(-274482025))
            storeelement:byte(var_3_1E7:byte[], var_5_1E8:int, stack_33D_2:byte)
            
            if (cmpne:boolean(var_5_1E8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_20E_0 = stack_248_0 = stack_2AB_0 = stack_30F_0 = var_3_1E7:byte[]
            goto(Label_0267)
        }
        
        goto(Label_0655)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1F5:int, ldc:int(16)), ldc:int(0))) {
            var_0_1F5 = and:int(var_0_1F5:int, ldc:int(-773560222))
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_1F5:int, ldc:int(32768)), ldc:int(0))) {
            var_0_1F5 = and:int(var_0_1F5:int, ldc:int(104814526))
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_1F5:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_1F5 = and:int(var_0_1F5:int, ldc:int(-400005833))
        }
        else {
            var_0_1F5 = and:int(var_0_1F5:int, ldc:int(2091908119))
            var_2_A4 = stack_A4_0:byte[]
            expr_A8 = add:int(arraylength:int(stack_A6_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A8:int, ldc:int(0))) {
                var_3_237 = newarray:byte[](byte.class, expr_A8:int)
                var_5_238 = expr_A8:int
                
                loop {
                    var_0_1F5 = and:int(var_0_1F5:int, ldc:int(-626156809))
                    var_5_238 = add:int(var_5_238:int, ldc:int(-1))
                    storeelement:byte(var_3_237:byte[], var_5_238:int, add:int(shl:int(loadelement:byte(stack_248_0:byte[], var_5_238:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_A4:byte[], add:int(var_5_238:int, xor:int(ldc:int(3232), ldc:int(3233)))), ldc:int(7)), and:int(ldc:int(9), ldc:int(4193)))))
                    
                    if (cmpne:boolean(var_5_238:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_20E_0 = stack_248_0 = stack_2AB_0 = stack_30F_0 = var_3_237:byte[]
            }
        }
        
        Label_0173:
        
        if (cmpne:boolean(and:int(var_0_1F5:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpne:boolean(and:int(var_0_1F5:int, ldc:int(1024)), ldc:int(0))) {
            var_0_1F5 = and:int(var_0_1F5:int, ldc:int(-318214743))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1F5:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1F5 = and:int(var_0_1F5:int, ldc:int(1434385687))
            expr_D3 = arraylength:int(stack_D3_0:byte[])
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_4_1E2 = expr_D3:int
                var_3_1E7 = newarray:byte[](byte.class, expr_D3:int)
                var_5_1E8 = expr_D3:int
                goto(Label_0655)
            }
        }
        
        Label_0216:
        
        if (cmpne:boolean(and:int(var_0_1F5:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1F5:int, ldc:int(128)), ldc:int(0))) {
                var_0_1F5 = and:int(var_0_1F5:int, ldc:int(-2092243545))
                goto(Label_0173)
            }
            
            if (cmpeq:boolean(and:int(var_0_1F5:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_1F5 = and:int(var_0_1F5:int, ldc:int(-1122641909))
                goto(Label_0112)
            }
            
            var_0_1F5 = and:int(var_0_1F5:int, ldc:int(-1686709257))
            expr_106 = arraylength:int(stack_106_0:byte[])
            
            if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                var_4_1E2 = expr_106:int
                var_3_1E7 = newarray:byte[](byte.class, expr_106:int)
                var_5_1E8 = expr_106:int
                goto(Label_0755)
            }
        }
        
        Label_0267:
        
        if (cmpeq:boolean(and:int(var_0_1F5:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpne:boolean(and:int(var_0_1F5:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0173)
        }
        
        if (cmpne:boolean(and:int(var_0_1F5:int, ldc:int(8)), ldc:int(0))) {
            var_0_1F5 = and:int(var_0_1F5:int, ldc:int(-487368548))
            goto(Label_0112)
        }
        
        var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_142 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16931), ldc:int(1347)))
        expr_14C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4377), ldc:int(4378)))
        storeelement:String(expr_14C:String[], and:int(ldc:int(-1364), ldc:int(1363)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(27048), ldc:int(-27049)), xor:int(ldc:int(5), ldc:int(11))))
        storeelement:String(expr_142:String[], xor:int(ldc:int(403), ldc:int(401)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(17518), ldc:int(14)), and:int(ldc:int(3287), ldc:int(55))))
        storeelement:String(expr_142:String[], xor:int(ldc:int(-16192), ldc:int(-16191)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(-24308), ldc:int(-24293)), and:int(ldc:int(17719), ldc:int(103))))
        putstatic:String[](\u5140\u61a4\u7873\ud217\u5db4::\u0a06\u5fe1\u183a\u67e9\u7af6\uf995, expr_14C:String[])
        var_3_1A7 = expr_142:String[]
        expr_1AF = newarray:String[](java.lang.String.class, and:int(ldc:int(23), ldc:int(10)))
        storeelement:String(expr_1AF:String[], and:int(ldc:int(-1989), ldc:int(1988)), loadelement:String[expected:String](var_3_1A7:String[], xor:int(ldc:int(2056), ldc:int(2057))))
        storeelement:String(expr_1AF:String[], and:int(ldc:int(481), ldc:int(513)), loadelement:String[expected:String](var_3_1A7:String[], xor:int(ldc:int(-31712), ldc:int(-31710))))
        putstatic:Collection<String>(\u5140\u61a4\u7873\ud217\u5db4::\u67d0\u93a2\ua6bd\u7049\ub19c\ub8be, invokestatic:List<String>(Arrays::asList, expr_1AF:String[]))
    }
    
    public void \u960f\ud158\u72f1\ud523\u7043\u446c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_624 : int
        var_5_88 : int
        var_6_8F : int
        var_7_9E : double
        var_9_CF : double
        var_3_E1 : int
        var_11_F2 : int
        var_14_11C : double
        var_16_120 : int
        var_12_118 : double
        var_17_62F : int
        
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
        var_3_624 = and:int(ldc:int(-82130614), ldc:int(2037702346))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5140\u61a4\u7873\ud217\u5db4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0178)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(32)), ldc:int(0))) {
            var_3_624 = and:int(var_3_624:int, ldc:int(-1797189742))
        }
        else {
            var_3_624 = and:int(var_3_624:int, ldc:int(-11080721))
            var_5_88 = and:int(ldc:int(-1271), ldc:int(1270))
            var_6_8F = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9E = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1087), ldc:int(-1600)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E1 = and:int(var_3_624:int, ldc:int(2098882891))
                    var_9_CF = sub:double(var_7_9E:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F2 = var_5_88:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F2:int, sub:int(var_6_8F:int, and:int(ldc:int(25089), ldc:int(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F2:int, and:int(ldc:int(1089), ldc:int(16557)))), var_7_9E:double))) {
                        inc:int(var_11_F2, ldc:int(1))
                    }
                    
                    var_3_624 = and:int(var_3_E1:int, ldc:int(2074863583))
                    var_14_11C = var_7_9E:double
                    var_16_120 = var_11_F2:int
                }
                else {
                    var_11_F2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_88:int), xor:int(ldc:int(7680), ldc:int(7681)))
                    var_12_118 = var_14_11C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88)
                    
                    if (cmplt:boolean(var_16_120 = var_11_F2:int, var_6_8F:int)) {
                        var_9_CF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F2:int)
                        var_16_120 = var_11_F2:int
                        var_14_11C = var_12_118:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-728917893))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(8)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(1752715378))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(1059068282))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-718854734))
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0587)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(2015980747))
                        
                        if (cmplt:boolean(var_16_120:int, var_6_8F:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0587)
                            }
                            
                            goto(Label_0823)
                        }
                    }
                    
                    Label_0414:
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-253442053))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(1361513693))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(32)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(1141819506))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(64)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-161261220))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(64)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(2129809166))
                            loopcontinue()
                        }
                        
                        var_3_624 = and:int(var_3_624:int, ldc:int(-59089205))
                        var_11_F2 = and:int(ldc:int(-2459), ldc:int(2456))
                        goto(Label_1455)
                    }
                    
                    Label_0587:
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(1710351301))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(16)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(1629770533))
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(16)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(1078696586))
                            loopcontinue()
                        }
                        
                        var_3_624 = and:int(var_3_624:int, ldc:int(2059594846))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11C = var_9_CF:double
                            goto(Label_0823)
                        }
                    }
                    
                    Label_0697:
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(16)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(435853823))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(333777526))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(8)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(1370770086))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(-1964388431))
                            goto(Label_0587)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_624 = and:int(var_3_624:int, ldc:int(-15113909))
                        var_14_11C = mul:double(ldc:double(0.5), add:double(var_9_CF:double, var_14_11C:double))
                    }
                    
                    Label_0823:
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-1743093885))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-1699361340))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(128)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(1240413274))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0587)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(505972699))
                            loopcontinue()
                        }
                        
                        var_3_624 = and:int(var_3_624:int, ldc:int(-38962213))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88:int), var_7_9E:double)) {
                                var_11_F2 = and:int(ldc:int(645), ldc:int(4113))
                                goto(Label_1107)
                            }
                        }
                    }
                    
                    Label_0943:
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-1836026665))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0823)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(404033381))
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(8)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(619448924))
                            goto(Label_0587)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(32)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(-2046022240))
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(769598834))
                            loopcontinue()
                        }
                        
                        var_3_624 = and:int(var_3_624:int, ldc:int(2141746430))
                        var_11_F2 = and:int(ldc:int(-5028), ldc:int(5027))
                    }
                    
                    Label_1107:
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(64)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(1256789116))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0943)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0823)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0587)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(-1194494455))
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(545422085))
                            loopcontinue()
                        }
                        
                        var_3_624 = and:int(var_3_624:int, ldc:int(-94576178))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F2:int, ldc:int(0))) {
                                goto(Label_1340)
                            }
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1107)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(-1823419682))
                            goto(Label_0943)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(134006348))
                            goto(Label_0823)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0587)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(-1583225996))
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(2146691947))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11C:double, var_5_88:int, var_16_120:int)
                            goto(Label_1455)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1340:
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0587)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(913676605))
                        goto(Label_0414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-1878361237))
                        loopcontinue()
                    }
                    
                    var_3_624 = and:int(var_3_624:int, ldc:int(2074665595))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11C:double, ldc:double(0.0))
                    Label_1455:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62F = var_5_88:int
                        
                        if (cmpeq:boolean(var_11_F2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1466:
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(16)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(294386546))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-902627892))
                        goto(Label_0697)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(128)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(1720989110))
                        goto(Label_0587)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(16)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-117452933))
                        var_17_62F = add:int(var_16_120:int, and:int(ldc:int(4097), ldc:int(705)))
                        looporswitchbreak()
                    }
                    
                    var_3_624 = and:int(var_3_624:int, ldc:int(1607131879))
                }
                
                var_3_624 = and:int(var_3_624:int, ldc:int(-39225857))
                
                if (cmple:boolean(var_5_88 = var_17_62F:int, sub:int(var_6_8F:int, xor:int(ldc:int(5216), ldc:int(5217))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0178:
        
        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(16384)), ldc:int(0))) {
            var_3_624 = and:int(var_3_624:int, ldc:int(54068586))
            goto(Label_0106)
        }
    }
}
