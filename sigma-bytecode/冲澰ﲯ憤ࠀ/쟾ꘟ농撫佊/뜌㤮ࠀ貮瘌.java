public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub70c\u392e\u0800\u8cae\u760c {
    public void \ub70c\u392e\u0800\u8cae\u760c() {
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
            invokespecial:Object(Object::<init>, this:\ub70c\u392e\u0800\u8cae\u760c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ubb2b\u0800\u2dcc\u5fe1\u62da\u6b0d(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
            invokevirtual:LiteralCommandNode(CommandDispatcher::register, p0:CommandDispatcher<\u8413\u5140\u64f2\uc9f6\u9937>, checkcast:LiteralArgumentBuilder(com.mojang.brigadier.builder.LiteralArgumentBuilder.class, invokevirtual:ArgumentBuilder[expected:LiteralArgumentBuilder](LiteralArgumentBuilder::then, checkcast:LiteralArgumentBuilder(com.mojang.brigadier.builder.LiteralArgumentBuilder.class, invokevirtual:ArgumentBuilder[expected:LiteralArgumentBuilder](LiteralArgumentBuilder::executes, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\ub70c\u392e\u0800\u8cae\u760c::\u5bc4\u647c\u4d85\u5f50\uc29a\u34df), and:int(ldc:int(-21302), ldc:int(16949)))), invokedynamic:Command(run:(Lcom/mojang/brigadier/CommandDispatcher;)Lcom/mojang/brigadier/Command;, p0:CommandDispatcher<\u8413\u5140\u64f2\uc9f6\u9937>))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::executes, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\ub70c\u392e\u0800\u8cae\u760c::\u5bc4\u647c\u4d85\u5f50\uc29a\u34df), xor:int(ldc:int(3392), ldc:int(3393))), invokestatic:StringArgumentType[expected:ArgumentType](StringArgumentType::greedyString)), invokedynamic:Command(run:(Lcom/mojang/brigadier/CommandDispatcher;)Lcom/mojang/brigadier/Command;, p0:CommandDispatcher<\u8413\u5140\u64f2\uc9f6\u9937>)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u3c25\u3711\u156b\u3e2a\ub83f\u69d9$1(com.mojang.brigadier.CommandDispatcher p0, com.mojang.brigadier.context.CommandContext p1) {
        var_4_77 : ParseResults
        var_5_A7 : Map
        var_6_B5 : Iterator<String>
        
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
        var_4_77 = invokevirtual:ParseResults(CommandDispatcher::parse, p0:CommandDispatcher, invokestatic:String(StringArgumentType::getString, p1:CommandContext, loadelement:String(getstatic:String[](\ub70c\u392e\u0800\u8cae\u760c::\u5bc4\u647c\u4d85\u5f50\uc29a\u34df), xor:int(ldc:int(130), ldc:int(131)))), invokevirtual:Object(CommandContext::getSource, p1:CommandContext))
        
        if (logicalnot:boolean(invokeinterface:boolean(List::isEmpty, invokevirtual:List(CommandContextBuilder::getNodes, invokevirtual:CommandContextBuilder(ParseResults::getContext, var_4_77:ParseResults))))) {
            var_5_A7 = invokevirtual:Map(CommandDispatcher::getSmartUsage, p0:CommandDispatcher, invokevirtual:CommandNode(ParsedCommandNode::getNode, checkcast:ParsedCommandNode(com.mojang.brigadier.context.ParsedCommandNode.class, invokestatic:Object[expected:ParsedCommandNode](Iterables::getLast, invokevirtual:List[expected:Iterable](CommandContextBuilder::getNodes, invokevirtual:CommandContextBuilder(ParseResults::getContext, var_4_77:ParseResults))))), invokevirtual:Object(CommandContext::getSource, p1:CommandContext))
            var_6_B5 = invokeinterface:Iterator<String>(Collection<String>::iterator, invokeinterface:Collection<String>(Map<K, String>::values, var_5_A7:Map<K, String>))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_6_B5:Iterator<String>)) {
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), initobject:StringTextComponent(StringTextComponent::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub70c\u392e\u0800\u8cae\u760c::\u5bc4\u647c\u4d85\u5f50\uc29a\u34df), xor:int(ldc:int(4098), ldc:int(4096)))), invokeinterface:String(ImmutableStringReader::getString, invokevirtual:ImmutableStringReader(ParseResults::getReader, var_4_77:ParseResults))), loadelement:String(getstatic:String[](\ub70c\u392e\u0800\u8cae\u760c::\u5bc4\u647c\u4d85\u5f50\uc29a\u34df), and:int(ldc:int(67), ldc:int(4355)))), checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_6_B5:Iterator<String>))))), and:int[expected:boolean](ldc:int(1626), ldc:int(-7771)))
            }
            
            return:int(invokeinterface:int(Map<K, V>::size, var_5_A7:Map<K, String>))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\ub70c\u392e\u0800\u8cae\u760c::\u8640\uc229\u8cae\u98a4\uc31c\u67d0)))
    }
    
    private static int lambda$\ud523\u51fa\u1187\ucb79\u9033\u6b0d$0(com.mojang.brigadier.CommandDispatcher p0, com.mojang.brigadier.context.CommandContext p1) {
        var_2_5F : int
        var_4_6C : Map
        var_5_7A : Iterator<String>
        
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
            var_2_5F = and:int(ldc:int(-752186671), ldc:int(-610538627))
            var_4_6C = invokevirtual:Map(CommandDispatcher::getSmartUsage, p0:CommandDispatcher, invokevirtual:RootCommandNode[expected:CommandNode](CommandDispatcher::getRoot, p0:CommandDispatcher), invokevirtual:Object(CommandContext::getSource, p1:CommandContext))
            var_5_7A = invokeinterface:Iterator<String>(Collection<String>::iterator, invokeinterface:Collection<String>(Map<K, String>::values, var_4_6C:Map<K, String>))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-701272454))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_7A:Iterator<String>))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), initobject:StringTextComponent(StringTextComponent::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub70c\u392e\u0800\u8cae\u760c::\u5bc4\u647c\u4d85\u5f50\uc29a\u34df), xor:int(ldc:int(18), ldc:int(16)))), checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_5_7A:Iterator<String>))))), and:int[expected:boolean](ldc:int(-2569), ldc:int(2568)))
            }
            
            return:int(invokeinterface:int(Map<K, V>::size, var_4_6C:Map<K, String>))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_24F : int
        expr_6B : int [generated]
        stack_8E_0 : byte[] [generated]
        stack_90_0 : byte[] [generated]
        stack_B4_0 : byte[] [generated]
        stack_B6_0 : byte[] [generated]
        stack_EF_0 : byte[] [generated]
        stack_F1_0 : byte[] [generated]
        stack_127_0 : byte[] [generated]
        stack_214_0 : byte[] [generated]
        stack_262_0 : byte[] [generated]
        stack_2D4_0 : byte[] [generated]
        stack_32A_0 : byte[] [generated]
        var_4_1F5 : int
        var_3_1FA : byte[]
        var_5_1FB : int
        var_0_258 : int
        expr_262 : byte [generated]
        stack_2A2_2 : byte [generated]
        stack_27F_0 : byte [generated]
        expr_90 : int [generated]
        var_2_B4 : byte[]
        expr_B8 : int [generated]
        var_3_2C2 : byte[]
        var_5_2C3 : int
        expr_F1 : int [generated]
        var_3_318 : byte[]
        var_5_319 : int
        expr_32D : byte [generated]
        var_3_133 : String
        expr_13B : String[] [generated]
        expr_145 : String[] [generated]
        
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
        var_0_24F = and:int(ldc:int(-2084805034), ldc:int(-1695654062))
        expr_6B = arraylength:int(stack_8E_0 = stack_90_0 = stack_B4_0 = stack_B6_0 = stack_EF_0 = stack_F1_0 = stack_127_0 = stack_214_0 = stack_262_0 = stack_2D4_0 = stack_32A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("3VjNNjq0rbI1LTY6rA82L7IztrW1Lb5SrzWztS4DAYX/Bg==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1F5 = expr_6B:int
        var_3_1FA = newarray:byte[](byte.class, expr_6B:int)
        var_5_1FB = expr_6B:int
        Label_0509:
        
        while (cmpne:boolean(and:int(var_0_24F:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_24F = and:int(var_0_24F:int, ldc:int(-1410407173))
            var_5_1FB = add:int(var_5_1FB:int, ldc:int(-1))
            storeelement:byte(var_3_1FA:byte[], var_5_1FB:int, add:byte(loadelement:byte(stack_214_0:byte[], var_5_1FB:int), ldc:byte(77)))
            
            if (cmpne:boolean(var_5_1FB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_90_0 = stack_8E_0 = stack_B4_0 = stack_B6_0 = stack_EF_0 = stack_F1_0 = stack_127_0 = stack_214_0 = stack_262_0 = stack_2D4_0 = stack_32A_0 = var_3_1FA:byte[]
            goto(Label_0112)
        }
        
        Label_0579:
        
        while (cmpeq:boolean(and:int(var_0_24F:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_258 = and:int(var_0_24F:int, ldc:int(-1375982482))
            var_5_1FB = add:int(var_5_1FB:int, ldc:int(-1))
            expr_262 = stack_2A2_2 = loadelement(stack_262_0, var_5_1FB)
            
            if (cmplt:boolean(add:int(add:int(var_5_1FB:int, ldc:int(5)), neg:int(var_4_1F5:int)), ldc:int(0))) {
                stack_2A2_2 = stack_27F_0 = add:byte(expr_262:byte, loadelement:byte(var_3_1FA:byte[], add:int(var_5_1FB:int, ldc:int(5))))
                goto(Label_0655)
            }
            
            Label_0623:
            
            if (cmpne:boolean(and:int(var_0_258:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_258 = and:int(var_0_258:int, ldc:int(-744167555))
                stack_2A2_2 = stack_27F_0 = add:byte(expr_262:byte, ldc:byte(5))
            }
            
            Label_0655:
            
            if (cmpne:boolean(and:int(var_0_258:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0623)
            }
            
            var_0_24F = and:int(var_0_258:int, ldc:int(-1745590846))
            storeelement:byte(var_3_1FA:byte[], var_5_1FB:int, stack_2A2_2:byte)
            
            if (cmpne:boolean(var_5_1FB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_90_0 = stack_8E_0 = stack_B4_0 = stack_B6_0 = stack_EF_0 = stack_F1_0 = stack_127_0 = stack_214_0 = stack_262_0 = stack_2D4_0 = stack_32A_0 = var_3_1FA:byte[]
            goto(Label_0149)
        }
        
        var_0_24F = and:int(var_0_24F:int, ldc:int(1951774662))
        goto(Label_0509)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_24F:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0246)
        }
        
        if (cmpne:boolean(and:int(var_0_24F:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0189)
        }
        
        if (cmpne:boolean(and:int(var_0_24F:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_24F = and:int(var_0_24F:int, ldc:int(-1934629810))
            expr_90 = arraylength:int(stack_90_0:byte[])
            
            if (cmpne:boolean(expr_90:int, ldc:int(0))) {
                var_4_1F5 = expr_90:int
                var_3_1FA = newarray:byte[](byte.class, expr_90:int)
                var_5_1FB = expr_90:int
                goto(Label_0579)
            }
        }
        
        Label_0149:
        
        if (cmpne:boolean(and:int(var_0_24F:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0246)
        }
        
        if (cmpeq:boolean(and:int(var_0_24F:int, ldc:int(256)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_24F:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_24F = and:int(var_0_24F:int, ldc:int(-88240524))
            var_2_B4 = stack_B4_0:byte[]
            expr_B8 = add:int(arraylength:int(stack_B6_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B8:int, ldc:int(0))) {
                var_3_2C2 = newarray:byte[](byte.class, expr_B8:int)
                var_5_2C3 = expr_B8:int
                
                loop {
                    var_0_24F = and:int(var_0_24F:int, ldc:int(-1795393714))
                    var_5_2C3 = add:int(var_5_2C3:int, ldc:int(-1))
                    storeelement:byte(var_3_2C2:byte[], var_5_2C3:int, add:int(shl:int(loadelement:byte(stack_2D4_0:byte[], var_5_2C3:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_B4:byte[], add:int(var_5_2C3:int, xor:int(ldc:int(-30591), ldc:int(-30592)))), ldc:int(3)), and:int(ldc:int(543), ldc:int(16543)))))
                    
                    if (cmpne:boolean(var_5_2C3:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_90_0 = stack_8E_0 = stack_B4_0 = stack_B6_0 = stack_EF_0 = stack_F1_0 = stack_127_0 = stack_214_0 = stack_262_0 = stack_2D4_0 = stack_32A_0 = var_3_2C2:byte[]
            }
        }
        
        Label_0189:
        
        if (cmpne:boolean(and:int(var_0_24F:int, ldc:int(65536)), ldc:int(0))) {
            var_0_24F = and:int(var_0_24F:int, ldc:int(894945274))
        }
        else {
            if (cmpne:boolean(and:int(var_0_24F:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0149)
            }
            
            if (cmpeq:boolean(and:int(var_0_24F:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_24F = and:int(var_0_24F:int, ldc:int(2121351883))
                goto(Label_0112)
            }
            
            var_0_24F = and:int(var_0_24F:int, ldc:int(-760774963))
            expr_F1 = arraylength:int(stack_F1_0:byte[])
            
            if (cmpne:boolean(expr_F1:int, ldc:int(0))) {
                var_3_318 = newarray:byte[](byte.class, expr_F1:int)
                var_5_319 = expr_F1:int
                
                loop {
                    var_0_24F = and:int(var_0_24F:int, ldc:int(-206688921))
                    var_5_319 = add:int(var_5_319:int, ldc:int(-1))
                    expr_32D = xor:byte(loadelement:byte(stack_32A_0:byte[], var_5_319:int), ldc:byte(44))
                    storeelement:byte(var_3_318:byte[], var_5_319:int, or:int(and:int(shl:int(expr_32D:byte, xor:int(ldc:int(645), ldc:int(641))), ldc:int(-16)), and:int(shr:int(expr_32D:byte[expected:int], xor:int(ldc:int(13569), ldc:int(13573))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_319:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_90_0 = stack_8E_0 = stack_B4_0 = stack_B6_0 = stack_EF_0 = stack_F1_0 = stack_127_0 = stack_214_0 = stack_262_0 = stack_2D4_0 = stack_32A_0 = var_3_318:byte[]
            }
        }
        
        Label_0246:
        
        if (cmpeq:boolean(and:int(var_0_24F:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_24F = and:int(var_0_24F:int, ldc:int(-1808957633))
            goto(Label_0189)
        }
        
        if (cmpeq:boolean(and:int(var_0_24F:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_24F = and:int(var_0_24F:int, ldc:int(1334014382))
            goto(Label_0149)
        }
        
        if (cmpeq:boolean(and:int(var_0_24F:int, ldc:int(128)), ldc:int(0))) {
            var_3_133 = initobject:String(String::<init>, stack_127_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_13B = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(321), ldc:int(324)))
            expr_145 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(21058), ldc:int(21063)))
            storeelement:String(expr_145:String[], and:int(ldc:int(2179), ldc:int(4683)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(-15603), ldc:int(11474)), and:int(ldc:int(341), ldc:int(1577))))
            storeelement:String(expr_145:String[], and:int(ldc:int(211), ldc:int(20514)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(22661), ldc:int(8785)), xor:int(ldc:int(2049), ldc:int(2051))))
            storeelement:String(expr_145:String[], xor:int(ldc:int(3332), ldc:int(3333)), invokevirtual:String[expected:String](String::substring, var_3_133:String, xor:int(ldc:int(-30975), ldc:int(-30973)), and:int(ldc:int(16669), ldc:int(5353))))
            storeelement:String(expr_13B:String[], xor:int(ldc:int(8449), ldc:int(8453)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(649), ldc:int(8493)), xor:int(ldc:int(8197), ldc:int(8216))))
            storeelement:String(expr_145:String[], and:int(ldc:int(-26718), ldc:int(26713)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(8349), ldc:int(541)), and:int(ldc:int(16425), ldc:int(4775))))
            putstatic:String[](\ub70c\u392e\u0800\u8cae\u760c::\u5bc4\u647c\u4d85\u5f50\uc29a\u34df, expr_145:String[])
            putstatic:SimpleCommandExceptionType(\ub70c\u392e\u0800\u8cae\u760c::\u8640\uc229\u8cae\u98a4\uc31c\u67d0, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(expr_13B:String[], xor:int(ldc:int(16423), ldc:int(16419))))))
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \uc4d2\ud171\u120d\u62da\u4c2b\uf94d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_690 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_69B : int
        
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
        var_3_690 = and:int(ldc:int(-97357042), ldc:int(-228329497))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub70c\u392e\u0800\u8cae\u760c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_690 = and:int(var_3_690:int, ldc:int(-143716546))
            var_5_81 = and:int(ldc:int(7284), ldc:int(-7286))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3658), ldc:int(-7916)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_690:int, ldc:int(-92554394))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(-32760), ldc:int(-32759)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(705), ldc:int(31779)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_690 = and:int(var_3_D1:int, ldc:int(-93934825))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(513), ldc:int(419)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-2112428586))
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-672279806))
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(187913176))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(311875601))
                        goto(Label_0982)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(32)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(1572592698))
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(1)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(557716775))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-211567665))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0849)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1935844615))
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-104777377))
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(128)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-278322397))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0982)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1903495985))
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0717)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(870304964))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(-151306442))
                            var_11_E2 = and:int(ldc:int(-4603), ldc:int(4586))
                            goto(Label_1538)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0595:
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(813258995))
                        goto(Label_1549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(128)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1344800659))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(256)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(56308093))
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(256)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1539017700))
                        goto(Label_0982)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_690 = and:int(var_3_690:int, ldc:int(-98427121))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0849)
                        }
                    }
                    
                    Label_0717:
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(923509712))
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(128)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(261662542))
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0982)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(128)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(1736286553))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(4)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(530670582))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_690 = and:int(var_3_690:int, ldc:int(-68713682))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0849:
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1682173308))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(64)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1747876512))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(256)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(-2065480327))
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(-145158844))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(128)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(1542948213))
                            loopcontinue()
                        }
                        
                        var_3_690 = and:int(var_3_690:int, ldc:int(-214794266))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(13), ldc:int(3121))
                                goto(Label_1133)
                            }
                        }
                    }
                    
                    Label_0982:
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-935450122))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(4)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(-34662194))
                            goto(Label_0849)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(389662676))
                            goto(Label_0717)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_690 = and:int(var_3_690:int, ldc:int(-29970521))
                        var_11_E2 = and:int(ldc:int(15237), ldc:int(-16264))
                    }
                    
                    Label_1133:
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-2006568000))
                        goto(Label_1549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(613348914))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(533023751))
                            goto(Label_0982)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0849)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(2139915774))
                            goto(Label_0717)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(4)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(-1274385896))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(1960323973))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_690 = and:int(var_3_690:int, ldc:int(-152926434))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1401)
                            }
                        }
                    }
                    
                    Label_1276:
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1133)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0982)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(256)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(-1448226272))
                            goto(Label_0849)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(-1164325813))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(128)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(-1494059624))
                            loopcontinue()
                        }
                        
                        var_3_690 = and:int(var_3_690:int, ldc:int(-97282290))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1538)
                    }
                    
                    Label_1401:
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1018191388))
                        goto(Label_1549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1924808769))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0982)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(32)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1721549701))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(297242230))
                        loopcontinue()
                    }
                    
                    var_3_690 = and:int(var_3_690:int, ldc:int(-75842657))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1538:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69B = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1549:
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(128)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(666785395))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1613415793))
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-340539988))
                        goto(Label_0982)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(1823592537))
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(512)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1185168795))
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-80217314))
                        var_17_69B = add:int(var_16_110:int, and:int(ldc:int(17539), ldc:int(113)))
                        looporswitchbreak()
                    }
                    
                    var_3_690 = and:int(var_3_690:int, ldc:int(2080500776))
                }
                
                var_3_690 = and:int(var_3_690:int, ldc:int(-31218713))
                
                if (cmple:boolean(var_5_81 = var_17_69B:int, sub:int(var_6_88:int, xor:int(ldc:int(16385), ldc:int(16384))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
