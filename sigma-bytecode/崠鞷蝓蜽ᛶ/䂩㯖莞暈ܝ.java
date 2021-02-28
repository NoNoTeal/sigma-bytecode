public class \u5d20\u97b7\u8753\u873d\u16f6.\u40a9\u3bd6\u839e\uf9c5\u071d {
    public void \u40a9\u3bd6\u839e\uf9c5\u071d(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u0800\u6c56\u47c2\ufe34\u5db4 p0) {
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
            invokespecial:Object(Object::<init>, this:\u40a9\u3bd6\u839e\uf9c5\u071d)
            putfield:\u0800\u6c56\u47c2\ufe34\u5db4(\u40a9\u3bd6\u839e\uf9c5\u071d::\u6bb9\u74b1\ubefe\u2dcc\u93a2\uc4d2, this:\u40a9\u3bd6\u839e\uf9c5\u071d, p0:\u0800\u6c56\u47c2\ufe34\u5db4)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9a18\u47c2\u74b1\u8258\u3c25\u946b(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u4daf\u72f1\u16f6\u8aa5\u8389 p0) {
        var_4_77 : Path
        var_5_86 : CommandDispatcher<\u8413\u5140\u64f2\uc9f6\u9937>
        
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
            var_4_77 = invokeinterface:Path(Path::resolve, invokevirtual:Path(\u0800\u6c56\u47c2\ufe34\u5db4::\ufe34\ube23\ubded\u74b1\u8df4\u5bc4, getfield:\u0800\u6c56\u47c2\ufe34\u5db4(\u40a9\u3bd6\u839e\uf9c5\u071d::\u6bb9\u74b1\ubefe\u2dcc\u93a2\uc4d2, this:\u40a9\u3bd6\u839e\uf9c5\u071d)), loadelement:String(getstatic:String[](\u40a9\u3bd6\u839e\uf9c5\u071d::\u183a\u7af6\u5db4\u12b2\u4c2b\u5140), and:int(ldc:int(-23045), ldc:int(23044))))
            var_5_86 = invokevirtual:CommandDispatcher<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u2dcc\u97b7\u3e2a\u6fb0\u6cfe\u8bb0, initobject:\u40a9\ud51e\ua562\ucef1\u873d(\u40a9\ud51e\ua562\ucef1\u873d::<init>, getstatic:\u3c25\u40a9\ua068\u3c25\u4f52(\u3c25\u40a9\ua068\u3c25\u4f52::\u3711\u3e75\ua61f\ud12e\u59ec\u873d)))
            invokestatic:void(\u8cae\u3d64\u965f\u3c25\u7006::\u8df4\u6198\ud158\u6b0d\u98a4\u7c6b, getstatic:Gson(\u40a9\u3bd6\u839e\uf9c5\u071d::\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab), p0:\u4daf\u72f1\u16f6\u8aa5\u8389, invokestatic:JsonObject(\u6c52\ube23\ucb79\u494c\u8d98::\u3bc9\u3a62\ud217\u5f50\u8350\uf995, var_5_86:CommandDispatcher, invokevirtual:RootCommandNode(CommandDispatcher::getRoot, var_5_86:CommandDispatcher<\u8413\u5140\u64f2\uc9f6\u9937>)), var_4_77:Path)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \uf94d\u8350\uc29a\u72f1\u3d4b\ua562() {
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
            return:String(loadelement:String(getstatic:String[](\u40a9\u3bd6\u839e\uf9c5\u071d::\u183a\u7af6\u5db4\u12b2\u4c2b\u5140), xor:int(ldc:int(-32507), ldc:int(-32508))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_20B : int
        expr_6B : int [generated]
        stack_9B_0 : byte[] [generated]
        stack_9D_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_111_0 : byte[] [generated]
        stack_113_0 : byte[] [generated]
        stack_14B_0 : byte[] [generated]
        stack_14D_0 : byte[] [generated]
        stack_184_0 : byte[] [generated]
        stack_22C_0 : byte[] [generated]
        stack_27C_0 : byte[] [generated]
        stack_2DF_0 : byte[] [generated]
        stack_32A_0 : byte[] [generated]
        stack_3A2_0 : byte[] [generated]
        var_4_1F8 : int
        var_3_1FD : byte[]
        var_5_1FE : int
        expr_22C : byte [generated]
        var_0_320 : int
        expr_32A : byte [generated]
        stack_36E_2 : byte [generated]
        stack_34D_0 : byte [generated]
        var_2_9B : byte[]
        expr_9F : int [generated]
        var_3_26B : byte[]
        var_5_26C : int
        expr_C9 : int [generated]
        expr_113 : int [generated]
        expr_14D : int [generated]
        var_3_391 : byte[]
        var_5_392 : int
        var_3_190 : String
        stack_1DE_0 : String[] [generated]
        expr_1A2 : String[] [generated]
        
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
        var_0_20B = and:int(ldc:int(-817952544), ldc:int(-817909529))
        expr_6B = arraylength:int(stack_9B_0 = stack_9D_0 = stack_C7_0 = stack_C9_0 = stack_111_0 = stack_113_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_22C_0 = stack_27C_0 = stack_2DF_0 = stack_32A_0 = stack_3A2_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("IC6wEGzo4tairKEg4WZhY3YS76GgQW8moHSjpaMlIrW29PWF")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1F8 = expr_6B:int
        var_3_1FD = newarray:byte[](byte.class, expr_6B:int)
        var_5_1FE = expr_6B:int
        Label_0512:
        
        while (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(2)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(16)), ldc:int(0))) {
                var_0_20B = and:int(var_0_20B:int, ldc:int(-1493940776))
                goto(Label_0707)
            }
            
            var_0_20B = and:int(var_0_20B:int, ldc:int(1811914478))
            var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
            expr_22C = loadelement:byte(stack_22C_0:byte[], var_5_1FE:int)
            storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, or:int(and:int(shl:int(expr_22C:byte, and:int(ldc:int(16388), ldc:int(14863))), ldc:int(-16)), and:int(shr:int(expr_22C:byte[expected:int], and:int(ldc:int(16548), ldc:int(4364))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_C7_0 = stack_C9_0 = stack_111_0 = stack_113_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_22C_0 = stack_27C_0 = stack_2DF_0 = stack_32A_0 = stack_3A2_0 = var_3_1FD:byte[]
            goto(Label_0112)
        }
        
        var_0_20B = and:int(var_0_20B:int, ldc:int(213735078))
        goto(Label_0782)
        Label_0707:
        
        while (cmpne:boolean(and:int(var_0_20B:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0512)
            }
            
            var_0_20B = and:int(var_0_20B:int, ldc:int(1874823884))
            var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
            storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, add:byte(loadelement:byte(stack_2DF_0:byte[], var_5_1FE:int), ldc:byte(117)))
            
            if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_C7_0 = stack_C9_0 = stack_111_0 = stack_113_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_22C_0 = stack_27C_0 = stack_2DF_0 = stack_32A_0 = stack_3A2_0 = var_3_1FD:byte[]
            goto(Label_0206)
        }
        
        Label_0782:
        
        while (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0512)
            }
            
            var_0_320 = and:int(var_0_20B:int, ldc:int(2134852474))
            var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
            expr_32A = stack_36E_2 = loadelement(stack_32A_0, var_5_1FE)
            
            if (cmplt:boolean(add:int(add:int(var_5_1FE:int, ldc:int(5)), neg:int(var_4_1F8:int)), ldc:int(0))) {
                stack_36E_2 = stack_34D_0 = add:byte(expr_32A:byte, loadelement:byte(var_3_1FD:byte[], add:int(var_5_1FE:int, ldc:int(5))))
                goto(Label_0861)
            }
            
            Label_0823:
            
            if (cmpne:boolean(and:int(var_0_320:int, ldc:int(1024)), ldc:int(0))) {
                var_0_320 = and:int(var_0_320:int, ldc:int(714340979))
            }
            else {
                var_0_320 = and:int(var_0_320:int, ldc:int(1275006573))
                stack_36E_2 = stack_34D_0 = add:byte(expr_32A:byte, ldc:byte(5))
            }
            
            Label_0861:
            
            if (cmpne:boolean(and:int(var_0_320:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0823)
            }
            
            var_0_20B = and:int(var_0_320:int, ldc:int(-612407973))
            storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, stack_36E_2:byte)
            
            if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_C7_0 = stack_C9_0 = stack_111_0 = stack_113_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_22C_0 = stack_27C_0 = stack_2DF_0 = stack_32A_0 = stack_3A2_0 = var_3_1FD:byte[]
            goto(Label_0280)
        }
        
        goto(Label_0707)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0338)
        }
        
        if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0280)
        }
        
        if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_20B = and:int(var_0_20B:int, ldc:int(-513696424))
            goto(Label_0206)
        }
        
        if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(8192)), ldc:int(0))) {
            var_0_20B = and:int(var_0_20B:int, ldc:int(-616618783))
            var_2_9B = stack_9B_0:byte[]
            expr_9F = add:int(arraylength:int(stack_9D_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_9F:int, ldc:int(0))) {
                var_3_26B = newarray:byte[](byte.class, expr_9F:int)
                var_5_26C = expr_9F:int
                
                loop {
                    var_0_20B = and:int(var_0_20B:int, ldc:int(-809533494))
                    var_5_26C = add:int(var_5_26C:int, ldc:int(-1))
                    storeelement:byte(var_3_26B:byte[], var_5_26C:int, add:int(shl:int(loadelement:byte(stack_27C_0:byte[], var_5_26C:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_9B:byte[], add:int(var_5_26C:int, and:int(ldc:int(2205), ldc:int(33)))), ldc:int(2)), xor:int(ldc:int(4247), ldc:int(4264)))))
                    
                    if (cmpne:boolean(var_5_26C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_C7_0 = stack_C9_0 = stack_111_0 = stack_113_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_22C_0 = stack_27C_0 = stack_2DF_0 = stack_32A_0 = stack_3A2_0 = var_3_26B:byte[]
            }
        }
        
        Label_0164:
        
        if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0338)
        }
        
        if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0280)
        }
        
        if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_20B = and:int(var_0_20B:int, ldc:int(1539287038))
            expr_C9 = arraylength:int(stack_C9_0:byte[])
            
            if (cmpne:boolean(expr_C9:int, ldc:int(0))) {
                var_4_1F8 = expr_C9:int
                var_3_1FD = newarray:byte[](byte.class, expr_C9:int)
                var_5_1FE = expr_C9:int
                goto(Label_0707)
            }
        }
        
        Label_0206:
        
        if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(524288)), ldc:int(0))) {
            var_0_20B = and:int(var_0_20B:int, ldc:int(1890133173))
            goto(Label_0338)
        }
        
        if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_20B = and:int(var_0_20B:int, ldc:int(-1507819083))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_20B = and:int(var_0_20B:int, ldc:int(1022660335))
                goto(Label_0164)
            }
            
            if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_20B = and:int(var_0_20B:int, ldc:int(-519820531))
                goto(Label_0112)
            }
            
            var_0_20B = and:int(var_0_20B:int, ldc:int(1262463199))
            expr_113 = arraylength:int(stack_113_0:byte[])
            
            if (cmpne:boolean(expr_113:int, ldc:int(0))) {
                var_4_1F8 = expr_113:int
                var_3_1FD = newarray:byte[](byte.class, expr_113:int)
                var_5_1FE = expr_113:int
                goto(Label_0782)
            }
        }
        
        Label_0280:
        
        if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_20B = and:int(var_0_20B:int, ldc:int(1334980300))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_20B = and:int(var_0_20B:int, ldc:int(-1593960834))
                goto(Label_0206)
            }
            
            if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0164)
            }
            
            if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_20B = and:int(var_0_20B:int, ldc:int(1799292527))
            expr_14D = arraylength:int(stack_14D_0:byte[])
            
            if (cmpne:boolean(expr_14D:int, ldc:int(0))) {
                var_3_391 = newarray:byte[](byte.class, expr_14D:int)
                var_5_392 = expr_14D:int
                
                loop {
                    var_0_20B = and:int(var_0_20B:int, ldc:int(1266671042))
                    var_5_392 = add:int(var_5_392:int, ldc:int(-1))
                    storeelement:byte(var_3_391:byte[], var_5_392:int, xor:byte(loadelement:byte(stack_3A2_0:byte[], var_5_392:int), ldc:byte(62)))
                    
                    if (cmpne:boolean(var_5_392:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_C7_0 = stack_C9_0 = stack_111_0 = stack_113_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_22C_0 = stack_27C_0 = stack_2DF_0 = stack_32A_0 = stack_3A2_0 = var_3_391:byte[]
            }
        }
        
        Label_0338:
        
        if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0280)
        }
        
        if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(8)), ldc:int(0))) {
            var_0_20B = and:int(var_0_20B:int, ldc:int(1469825809))
            goto(Label_0206)
        }
        
        if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0164)
        }
        
        if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(8)), ldc:int(0))) {
            var_0_20B = and:int(var_0_20B:int, ldc:int(-1820747342))
            goto(Label_0112)
        }
        
        var_3_190 = initobject:String(String::<init>, stack_184_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1DE_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(6915), ldc:int(42)))
        expr_1A2 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16544), ldc:int(16546)))
        storeelement:String(expr_1A2:String[], and:int(ldc:int(9745), ldc:int(4173)), invokevirtual:String[expected:String](String::substring, var_3_190:String, and:int(ldc:int(-4335), ldc:int(238)), and:int(ldc:int(46), ldc:int(27214))))
        storeelement:String(expr_1A2:String[], and:int(ldc:int(-17419), ldc:int(17418)), invokevirtual:String[expected:String](String::substring, var_3_190:String, and:int(ldc:int(782), ldc:int(28766)), and:int(ldc:int(16419), ldc:int(6179))))
        putstatic:String[](\u40a9\u3bd6\u839e\uf9c5\u071d::\u183a\u7af6\u5db4\u12b2\u4c2b\u5140, expr_1A2:String[])
        putstatic:Gson(\u40a9\u3bd6\u839e\uf9c5\u071d::\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab, invokevirtual:Gson(GsonBuilder::create, invokevirtual:GsonBuilder(GsonBuilder::disableHtmlEscaping, invokevirtual:GsonBuilder(GsonBuilder::setPrettyPrinting, initobject:GsonBuilder(GsonBuilder::<init>)))))
    }
    
    public void \u4cd9\ua562\u67e9\u9255\ube23\u5d20(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_688 : int
        
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
        var_3_67D = and:int(ldc:int(-1354325531), ldc:int(-291082399))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u40a9\u3bd6\u839e\uf9c5\u071d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
            var_3_67D = and:int(var_3_67D:int, ldc:int(-931130020))
        }
        else {
            var_3_67D = and:int(var_3_67D:int, ldc:int(-26741910))
            var_5_85 = and:int(ldc:int(16225), ldc:int(-16226))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(17716), ldc:int(-18229)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_67D:int, ldc:int(-329827206))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(28681), ldc:int(3121)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(2148), ldc:int(2149)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_67D = and:int(var_3_D2:int, ldc:int(-49863584))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(6180), ldc:int(6181)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-328476332))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-703728154))
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-289279897))
                        goto(Label_0548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1115160915))
                    }
                    else {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-322980880))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0548)
                            }
                            
                            goto(Label_0821)
                        }
                    }
                    
                    Label_0391:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1209079351))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1781901050))
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(154004622))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(633678867))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1104200337))
                        var_11_E3 = and:int(ldc:int(-32392), ldc:int(31878))
                        goto(Label_1516)
                    }
                    
                    Label_0548:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1103881917))
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-222498075))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1331550200))
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1145884504))
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-691942407))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1126716317))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0821)
                        }
                    }
                    
                    Label_0678:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-702406373))
                        goto(Label_1527)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(511983767))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1519613125))
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1154206264))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(1980306181))
                            goto(Label_0548)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-797625152))
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-58216224))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0821:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-180888750))
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1499545214))
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-911873720))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(2135073535))
                            goto(Label_0548)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(145827830))
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-973376283))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1361593999))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(12832), ldc:int(12833))
                                goto(Label_1119)
                            }
                        }
                    }
                    
                    Label_0958:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(243169221))
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(612067759))
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-1744306799))
                            goto(Label_0821)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(1065421495))
                            goto(Label_0548)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-1847819479))
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1079533472))
                        var_11_E3 = and:int(ldc:int(-19522), ldc:int(19521))
                    }
                    
                    Label_1119:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1555036142))
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(987687427))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0958)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0821)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0548)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(476296968))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1378994823))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1378)
                            }
                        }
                    }
                    
                    Label_1230:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(323618046))
                        goto(Label_1527)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-1029423651))
                            goto(Label_1119)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-881726829))
                            goto(Label_0958)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0821)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-147848468))
                            goto(Label_0678)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(9892241))
                            goto(Label_0548)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-485887617))
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-50450833))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1516)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1378:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(855417298))
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1383551385))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(553786100))
                        goto(Label_0548)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-320873462))
                        goto(Label_0391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(227472885))
                        loopcontinue()
                    }
                    
                    var_3_67D = and:int(var_3_67D:int, ldc:int(-281576471))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1516:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_688 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1527:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(566786340))
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-2082672949))
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(318454034))
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-2079773900))
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1440974067))
                        goto(Label_0548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(808568044))
                        goto(Label_0391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1380488853))
                        var_17_688 = add:int(var_16_111:int, and:int(ldc:int(17121), ldc:int(2335)))
                        looporswitchbreak()
                    }
                    
                    var_3_67D = and:int(var_3_67D:int, ldc:int(1955312488))
                }
                
                var_3_67D = and:int(var_3_67D:int, ldc:int(-278466589))
                
                if (cmple:boolean(var_5_85 = var_17_688:int, sub:int(var_6_8C:int, and:int(ldc:int(17409), ldc:int(4883))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
