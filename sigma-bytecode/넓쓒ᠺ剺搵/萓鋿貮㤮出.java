public class \ub113\uc4d2\u183a\u527a\u6435.\u8413\u92ff\u8cae\u392e\u51fa {
    public void \u8413\u92ff\u8cae\u392e\u51fa() {
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
            invokespecial:Object(Object::<init>, this:\u8413\u92ff\u8cae\u392e\u51fa)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String parse(com.mojang.brigadier.StringReader p0) {
        var_4_64 : String
        var_5_97 : StringTextComponent
        
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
        
        if (logicalnot:boolean(invokestatic:boolean(\u4179\uae5d\uc9f6\u4492\u446c::\u0b8e\u51b2\u4e72\u3711\u0b8e\uae5d, var_4_64:String))) {
            var_5_97 = initobject:StringTextComponent(StringTextComponent::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8413\u92ff\u8cae\u392e\u51fa::\u446c\u960f\u5bc4\u8709\u983f\u5fe1), and:int(ldc:int(-13407), ldc:int(12318)))), var_4_64:String)))
            athrow(initobject:CommandSyntaxException(CommandSyntaxException::<init>, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, var_5_97:StringTextComponent[expected:Message]), var_5_97:Message))
        }
        
        return:String(var_4_64:String)
    }
    
    public static \ub113\uc4d2\u183a\u527a\u6435.\u8413\u92ff\u8cae\u392e\u51fa \ufe34\u8350\ud12e\ub102\u92ff\u1187() {
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
            return:\u8413\u92ff\u8cae\u392e\u51fa(initobject:\u8413\u92ff\u8cae\u392e\u51fa(\u8413\u92ff\u8cae\u392e\u51fa::<init>))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u965f\u839e\u7c6b\ub113\ucfaf\uc229(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, java.lang.String p1) {
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
            return:String(checkcast:String(java.lang.String.class, invokevirtual:Object[expected:String](CommandContext::getArgument, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, p1:String, ldc:Class<String>(java.lang.String.class))))
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
            return:CompletableFuture<Suggestions>(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u5245\u16f6\u3711\u64ab\u6d69\u647c, invokeinterface:Stream<String>(Collection<String>::stream, invokestatic:Collection<String>(\u4179\uae5d\uc9f6\u4492\u446c::\ucb79\ud4fe\ub171\u8413\u76bc\u8753)), p1:SuggestionsBuilder))
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
            return:Collection<String>(getstatic:Collection<String>(\u8413\u92ff\u8cae\u392e\u51fa::\u98a4\u4f52\u4c04\u8aa5\u47c2\u4ab3))
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
            return:Object(invokevirtual:String[expected:Object](\u8413\u92ff\u8cae\u392e\u51fa::parse, this:\u8413\u92ff\u8cae\u392e\u51fa, p0:StringReader))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_262 : int
        expr_6B : int [generated]
        stack_9B_0 : byte[] [generated]
        stack_9D_0 : byte[] [generated]
        stack_DD_0 : byte[] [generated]
        stack_DF_0 : byte[] [generated]
        stack_117_0 : byte[] [generated]
        stack_119_0 : byte[] [generated]
        stack_14B_0 : byte[] [generated]
        stack_14D_0 : byte[] [generated]
        stack_194_0 : byte[] [generated]
        stack_274_0 : byte[] [generated]
        stack_2C7_0 : byte[] [generated]
        stack_34D_0 : byte[] [generated]
        stack_39D_0 : byte[] [generated]
        stack_3F2_0 : byte[] [generated]
        var_4_248 : int
        var_3_24D : byte[]
        var_5_24E : int
        var_0_2BD : int
        expr_2C7 : byte [generated]
        stack_303_2 : byte [generated]
        stack_2E2_0 : byte [generated]
        expr_34D : byte [generated]
        expr_9D : int [generated]
        expr_DF : int [generated]
        var_2_117 : byte[]
        expr_11B : int [generated]
        var_3_38C : byte[]
        var_5_38D : int
        expr_14D : int [generated]
        var_3_3E1 : byte[]
        var_5_3E2 : int
        var_3_1A0 : String
        expr_1A8 : String[] [generated]
        expr_1B2 : String[] [generated]
        var_3_20D : String[]
        expr_215 : String[] [generated]
        
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
        var_0_262 = and:int(ldc:int(471302347), ldc:int(-1164277023))
        expr_6B = arraylength:int(stack_9B_0 = stack_9D_0 = stack_DD_0 = stack_DF_0 = stack_117_0 = stack_119_0 = stack_14B_0 = stack_14D_0 = stack_194_0 = stack_274_0 = stack_2C7_0 = stack_34D_0 = stack_39D_0 = stack_3F2_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("YVaZbfn7UxrwfutZHHV1eO3WciN09Xjxfut5c3l+83P0fut5gwA=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_248 = expr_6B:int
        var_3_24D = newarray:byte[](byte.class, expr_6B:int)
        var_5_24E = expr_6B:int
        Label_0592:
        
        while (cmpeq:boolean(and:int(var_0_262:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_262:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_262 = and:int(var_0_262:int, ldc:int(2082570))
                goto(Label_0675)
            }
            
            var_0_262 = and:int(var_0_262:int, ldc:int(-642852401))
            var_5_24E = add:int(var_5_24E:int, ldc:int(-1))
            storeelement:byte(var_3_24D:byte[], var_5_24E:int, add:byte(loadelement:byte(stack_274_0:byte[], var_5_24E:int), ldc:byte(10)))
            
            if (cmpne:boolean(var_5_24E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_DD_0 = stack_DF_0 = stack_117_0 = stack_119_0 = stack_14B_0 = stack_14D_0 = stack_194_0 = stack_274_0 = stack_2C7_0 = stack_34D_0 = stack_39D_0 = stack_3F2_0 = var_3_24D:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0809)
        Label_0675:
        
        while (cmpeq:boolean(and:int(var_0_262:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_262:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0592)
            }
            
            var_0_2BD = and:int(var_0_262:int, ldc:int(-1187870343))
            var_5_24E = add:int(var_5_24E:int, ldc:int(-1))
            expr_2C7 = stack_303_2 = loadelement(stack_2C7_0, var_5_24E)
            
            if (cmplt:boolean(add:int(add:int(var_5_24E:int, ldc:int(1)), neg:int(var_4_248:int)), ldc:int(0))) {
                stack_303_2 = stack_2E2_0 = add:byte(expr_2C7:byte, loadelement:byte(var_3_24D:byte[], add:int(var_5_24E:int, ldc:int(1))))
                goto(Label_0754)
            }
            
            Label_0724:
            
            if (cmpne:boolean(and:int(var_0_2BD:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_2BD = and:int(var_0_2BD:int, ldc:int(-1674402319))
                stack_303_2 = stack_2E2_0 = add:byte(expr_2C7:byte, ldc:byte(1))
            }
            
            Label_0754:
            
            if (cmpne:boolean(and:int(var_0_2BD:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0724)
            }
            
            var_0_262 = and:int(var_0_2BD:int, ldc:int(-586380201))
            storeelement:byte(var_3_24D:byte[], var_5_24E:int, stack_303_2:byte)
            
            if (cmpne:boolean(var_5_24E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_DD_0 = stack_DF_0 = stack_117_0 = stack_119_0 = stack_14B_0 = stack_14D_0 = stack_194_0 = stack_274_0 = stack_2C7_0 = stack_34D_0 = stack_39D_0 = stack_3F2_0 = var_3_24D:byte[]
            goto(Label_0162)
        }
        
        var_0_262 = and:int(var_0_262:int, ldc:int(316928879))
        Label_0809:
        
        while (cmpeq:boolean(and:int(var_0_262:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_262:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_262 = and:int(var_0_262:int, ldc:int(1498659471))
                goto(Label_0592)
            }
            
            var_0_262 = and:int(var_0_262:int, ldc:int(-28862007))
            var_5_24E = add:int(var_5_24E:int, ldc:int(-1))
            expr_34D = loadelement:byte(stack_34D_0:byte[], var_5_24E:int)
            storeelement:byte(var_3_24D:byte[], var_5_24E:int, or:int(and:int(shl:int(expr_34D:byte, xor:int(ldc:int(4098), ldc:int(4102))), ldc:int(-16)), and:int(shr:int(expr_34D:byte[expected:int], and:int(ldc:int(54), ldc:int(76))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_24E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_DD_0 = stack_DF_0 = stack_117_0 = stack_119_0 = stack_14B_0 = stack_14D_0 = stack_194_0 = stack_274_0 = stack_2C7_0 = stack_34D_0 = stack_39D_0 = stack_3F2_0 = var_3_24D:byte[]
            goto(Label_0228)
        }
        
        goto(Label_0675)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0338)
        }
        
        if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0288)
        }
        
        if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0228)
        }
        
        if (cmpne:boolean(and:int(var_0_262:int, ldc:int(512)), ldc:int(0))) {
            var_0_262 = and:int(var_0_262:int, ldc:int(1251012472))
        }
        else {
            var_0_262 = and:int(var_0_262:int, ldc:int(1507642203))
            expr_9D = arraylength:int(stack_9D_0:byte[])
            
            if (cmpne:boolean(expr_9D:int, ldc:int(0))) {
                var_4_248 = expr_9D:int
                var_3_24D = newarray:byte[](byte.class, expr_9D:int)
                var_5_24E = expr_9D:int
                goto(Label_0675)
            }
        }
        
        Label_0162:
        
        if (cmpne:boolean(and:int(var_0_262:int, ldc:int(524288)), ldc:int(0))) {
            var_0_262 = and:int(var_0_262:int, ldc:int(-1219853426))
            goto(Label_0338)
        }
        
        if (cmpne:boolean(and:int(var_0_262:int, ldc:int(512)), ldc:int(0))) {
            var_0_262 = and:int(var_0_262:int, ldc:int(600447407))
            goto(Label_0288)
        }
        
        if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(64)), ldc:int(0))) {
                var_0_262 = and:int(var_0_262:int, ldc:int(-1617570026))
                goto(Label_0112)
            }
            
            var_0_262 = and:int(var_0_262:int, ldc:int(-552237589))
            expr_DF = arraylength:int(stack_DF_0:byte[])
            
            if (cmpne:boolean(expr_DF:int, ldc:int(0))) {
                var_4_248 = expr_DF:int
                var_3_24D = newarray:byte[](byte.class, expr_DF:int)
                var_5_24E = expr_DF:int
                goto(Label_0809)
            }
        }
        
        Label_0228:
        
        if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0338)
        }
        
        if (cmpne:boolean(and:int(var_0_262:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_262 = and:int(var_0_262:int, ldc:int(333512729))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0162)
            }
            
            if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(32768)), ldc:int(0))) {
                var_0_262 = and:int(var_0_262:int, ldc:int(378197120))
                goto(Label_0112)
            }
            
            var_0_262 = and:int(var_0_262:int, ldc:int(946525391))
            var_2_117 = stack_117_0:byte[]
            expr_11B = add:int(arraylength:int(stack_119_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_11B:int, ldc:int(0))) {
                var_3_38C = newarray:byte[](byte.class, expr_11B:int)
                var_5_38D = expr_11B:int
                
                loop {
                    var_0_262 = and:int(var_0_262:int, ldc:int(-1686072889))
                    var_5_38D = add:int(var_5_38D:int, ldc:int(-1))
                    storeelement:byte(var_3_38C:byte[], var_5_38D:int, add:int(shl:int(loadelement:byte(stack_39D_0:byte[], var_5_38D:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_117:byte[], add:int(var_5_38D:int, and:int(ldc:int(9473), ldc:int(17043)))), ldc:int(3)), xor:int(ldc:int(4248), ldc:int(4231)))))
                    
                    if (cmpne:boolean(var_5_38D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_DD_0 = stack_DF_0 = stack_117_0 = stack_119_0 = stack_14B_0 = stack_14D_0 = stack_194_0 = stack_274_0 = stack_2C7_0 = stack_34D_0 = stack_39D_0 = stack_3F2_0 = var_3_38C:byte[]
            }
        }
        
        Label_0288:
        
        if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(32768)), ldc:int(0))) {
            var_0_262 = and:int(var_0_262:int, ldc:int(34208395))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0228)
            }
            
            if (cmpne:boolean(and:int(var_0_262:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0162)
            }
            
            if (cmpne:boolean(and:int(var_0_262:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_262 = and:int(var_0_262:int, ldc:int(-550052369))
            expr_14D = arraylength:int(stack_14D_0:byte[])
            
            if (cmpne:boolean(expr_14D:int, ldc:int(0))) {
                var_3_3E1 = newarray:byte[](byte.class, expr_14D:int)
                var_5_3E2 = expr_14D:int
                
                loop {
                    var_0_262 = and:int(var_0_262:int, ldc:int(948433263))
                    var_5_3E2 = add:int(var_5_3E2:int, ldc:int(-1))
                    storeelement:byte(var_3_3E1:byte[], var_5_3E2:int, xor:byte(loadelement:byte(stack_3F2_0:byte[], var_5_3E2:int), ldc:byte(69)))
                    
                    if (cmpne:boolean(var_5_3E2:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_DD_0 = stack_DF_0 = stack_117_0 = stack_119_0 = stack_14B_0 = stack_14D_0 = stack_194_0 = stack_274_0 = stack_2C7_0 = stack_34D_0 = stack_39D_0 = stack_3F2_0 = var_3_3E1:byte[]
            }
        }
        
        Label_0338:
        
        if (cmpne:boolean(and:int(var_0_262:int, ldc:int(32)), ldc:int(0))) {
            var_0_262 = and:int(var_0_262:int, ldc:int(-294449834))
            goto(Label_0288)
        }
        
        if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_262 = and:int(var_0_262:int, ldc:int(-1513583621))
            goto(Label_0228)
        }
        
        if (cmpne:boolean(and:int(var_0_262:int, ldc:int(512)), ldc:int(0))) {
            var_0_262 = and:int(var_0_262:int, ldc:int(-811746117))
            goto(Label_0162)
        }
        
        if (cmpeq:boolean(and:int(var_0_262:int, ldc:int(1)), ldc:int(0))) {
            var_0_262 = and:int(var_0_262:int, ldc:int(-836062916))
            goto(Label_0112)
        }
        
        var_3_1A0 = initobject:String(String::<init>, stack_194_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_1A8 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(26689), ldc:int(26690)))
        expr_1B2 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(11296), ldc:int(11299)))
        storeelement:String(expr_1B2:String[], and:int(ldc:int(-22905), ldc:int(22880)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, and:int(ldc:int(-24881), ldc:int(24880)), and:int(ldc:int(756), ldc:int(278))))
        storeelement:String(expr_1A8:String[], xor:int(ldc:int(-32244), ldc:int(-32242)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, xor:int(ldc:int(374), ldc:int(354)), xor:int(ldc:int(12673), ldc:int(12701))))
        storeelement:String(expr_1A8:String[], and:int(ldc:int(18633), ldc:int(13313)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, xor:int(ldc:int(1417), ldc:int(1429)), and:int(ldc:int(8933), ldc:int(47))))
        putstatic:String[](\u8413\u92ff\u8cae\u392e\u51fa::\u446c\u960f\u5bc4\u8709\u983f\u5fe1, expr_1B2:String[])
        var_3_20D = expr_1A8:String[]
        expr_215 = newarray:String[](java.lang.String.class, and:int(ldc:int(19), ldc:int(16642)))
        storeelement:String(expr_215:String[], and:int(ldc:int(-5389), ldc:int(5388)), loadelement:String[expected:String](var_3_20D:String[], xor:int(ldc:int(2304), ldc:int(2305))))
        storeelement:String(expr_215:String[], and:int(ldc:int(145), ldc:int(2091)), loadelement:String[expected:String](var_3_20D:String[], xor:int(ldc:int(8), ldc:int(10))))
        putstatic:Collection<String>(\u8413\u92ff\u8cae\u392e\u51fa::\u98a4\u4f52\u4c04\u8aa5\u47c2\u4ab3, invokestatic:List<String>(Arrays::asList, expr_215:String[]))
    }
    
    public void \ua6bd\u3a62\ua61f\u12b2\u3e2a\ub19c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_656 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C3 : double
        var_3_D5 : int
        var_11_E6 : int
        var_14_110 : double
        var_16_114 : int
        var_12_10C : double
        var_17_661 : int
        
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
        var_3_656 = and:int(ldc:int(-1411522293), ldc:int(-387203262))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8413\u92ff\u8cae\u392e\u51fa[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
            var_3_656 = and:int(var_3_656:int, ldc:int(1006449287))
        }
        else {
            var_3_656 = and:int(var_3_656:int, ldc:int(-1410485486))
            var_5_85 = and:int(ldc:int(22072), ldc:int(-22201))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21003), ldc:int(-29264)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C3 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D5 = and:int(var_3_656:int, ldc:int(-523654662))
                    var_9_C3 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E6 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E6:int, sub:int(var_6_8C:int, xor:int(ldc:int(2440), ldc:int(2441)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E6:int, and:int(ldc:int(25891), ldc:int(6145)))), var_7_9B:double))) {
                        inc:int(var_11_E6, ldc:int(1))
                    }
                    
                    var_3_656 = and:int(var_3_D5:int, ldc:int(819593075))
                    var_14_110 = var_7_9B:double
                    var_16_114 = var_11_E6:int
                }
                else {
                    var_11_E6 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(1032), ldc:int(1033)))
                    var_12_10C = var_14_110 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_114 = var_11_E6:int, var_6_8C:int)) {
                        var_9_C3 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E6:int)
                        var_16_114 = var_11_E6:int
                        var_14_110 = var_12_10C:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1984562838))
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(2076574029))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0836)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1518048335))
                        goto(Label_0706)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-745418815))
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1215573979))
                    }
                    else {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-354436717))
                        
                        if (cmplt:boolean(var_16_114:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0836)
                        }
                    }
                    
                    Label_0414:
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(860464656))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1188176734))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0836)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(358537853))
                        goto(Label_0706)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(830420347))
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(2096886235))
                        var_11_E6 = and:int(ldc:int(-18960), ldc:int(2573))
                        goto(Label_1520)
                    }
                    
                    Label_0577:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-895526183))
                        goto(Label_1531)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1958734412))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-338703096))
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1554600330))
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0836)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-1742289922))
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1176504490))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_110 = var_9_C3:double
                            goto(Label_0836)
                        }
                    }
                    
                    Label_0706:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1046117950))
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1791148535))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(1398822361))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-7872193))
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1560679529))
                        var_14_110 = mul:double(ldc:double(0.5), add:double(var_9_C3:double, var_14_110:double))
                    }
                    
                    Label_0836:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(2061332877))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(128)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1696610680))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0706)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(875784159))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(1173827391))
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1360414217))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E6 = and:int(ldc:int(4105), ldc:int(18705))
                                goto(Label_1115)
                            }
                        }
                    }
                    
                    Label_0958:
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(128)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(2013724349))
                        goto(Label_1531)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(157840333))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0836)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0706)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(565138708))
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(128)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(668661815))
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(-135404646))
                        var_11_E6 = and:int(ldc:int(-16695), ldc:int(16678))
                    }
                    
                    Label_1115:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1531)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(1682690207))
                            goto(Label_0958)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-854971676))
                            goto(Label_0836)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0706)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-1361883566))
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(-3413150))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                                goto(Label_1358)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1531)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1115)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-196420843))
                            goto(Label_0958)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(1611947432))
                            goto(Label_0836)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-1972617790))
                            goto(Label_0706)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-503380113))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-238165014))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_110:double, var_5_85:int, var_16_114:int)
                            goto(Label_1520)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1358:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-480142964))
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(181421303))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1117109701))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(128)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-554626132))
                        goto(Label_0836)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-2090241325))
                        goto(Label_0706)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1917063609))
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-57891832))
                        loopcontinue()
                    }
                    
                    var_3_656 = and:int(var_3_656:int, ldc:int(2027792798))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_110:double, ldc:double(0.0))
                    Label_1520:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_661 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1531:
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1464195558))
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0836)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0706)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1259640171))
                        goto(Label_0414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1176781454))
                        var_17_661 = add:int(var_16_114:int, and:int(ldc:int(425), ldc:int(3073)))
                        looporswitchbreak()
                    }
                }
                
                var_3_656 = and:int(var_3_656:int, ldc:int(871104455))
                
                if (cmple:boolean(var_5_85 = var_17_661:int, sub:int(var_6_8C:int, and:int(ldc:int(27169), ldc:int(5509))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
