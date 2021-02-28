public final class \ua562\ucb79\uc87f\u3dd3\ubcb0.\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe<E> {
    public static \ua562\ucb79\uc87f\u3dd3\ubcb0.\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe<E> \u3e75\u61a4\u1187\u7049\u3dd3\u6b5f(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<E>> p0) {
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
            return:\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe<E>(initobject:\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe<E>(\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe<E>::<init>, p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<E>>))
        }
        
        goto(Label_0006)
    }
    
    private void \u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<E>> p0) {
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
            invokespecial:MapCodec(MapCodec::<init>, this:\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe<E>)
            putfield:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<E>>(\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe::\ud36e\u6bb9\u8bb0\u92ee\u4cd9\ufe34, this:\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe<E>, p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<E>>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.RecordBuilder<T> encode(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<E> p0, com.mojang.serialization.DynamicOps<T> p1, com.mojang.serialization.RecordBuilder<T> p2) {
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
            return:RecordBuilder<T>(p2:RecordBuilder<T>)
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.DataResult<\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<E>> decode(com.mojang.serialization.DynamicOps<T> p0, com.mojang.serialization.MapLike<T> p1) {
        var_3_5F : int
        stack_91_0 : DataResult [generated]
        
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
            var_3_5F = and:int(ldc:int(-602298582), ldc:int(893255155))
            
            if (logicalnot:boolean(instanceof:boolean(\ub113\uc4d2\u183a\u527a\u6435.\ud171\ub171\u4c2b\uae5d\u4c04\u494c.class, p0:\ud171\ub171\u4c2b\uae5d\u4c04\u494c))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-568662220))
                stack_91_0 = invokestatic:DataResult(DataResult::error, loadelement:String(getstatic:String[](\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe::\u8aa5\u3bc9\uc87f\u71ae\u3dd3\u3c25), and:int(ldc:int(-25193), ldc:int(8808))))
            }
            else {
                stack_91_0 = invokevirtual:DataResult(\ud171\ub171\u4c2b\uae5d\u4c04\u494c::\u946b\u1187\u93a2\u0b8e\u69d9\u873d, checkcast:\ud171\ub171\u4c2b\uae5d\u4c04\u494c(\ub113\uc4d2\u183a\u527a\u6435.\ud171\ub171\u4c2b\uae5d\u4c04\u494c.class, p0:\ud171\ub171\u4c2b\uae5d\u4c04\u494c), getfield:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<E>>(\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe::\ud36e\u6bb9\u8bb0\u92ee\u4cd9\ufe34, this:\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe<E>))
            }
            
            return:DataResult<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<E>>(stack_91_0:DataResult)
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe::\u8aa5\u3bc9\uc87f\u71ae\u3dd3\u3c25), xor:int(ldc:int(6657), ldc:int(6656)))), getfield:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<E>>[expected:Object](\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe::\ud36e\u6bb9\u8bb0\u92ee\u4cd9\ufe34, this:\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe<E>)), loadelement:String(getstatic:String[](\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe::\u8aa5\u3bc9\uc87f\u71ae\u3dd3\u3c25), and:int(ldc:int(23842), ldc:int(194))))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.stream.Stream<T> keys(com.mojang.serialization.DynamicOps<T> p0) {
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
            return:Stream<T>(invokestatic:Stream<T>(Stream<T>::empty))
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.RecordBuilder encode(java.lang.Object p0, com.mojang.serialization.DynamicOps p1, com.mojang.serialization.RecordBuilder p2) {
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
            return:RecordBuilder(invokevirtual:RecordBuilder(\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe<E>::encode, this:\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe<E>, checkcast:\ud12e\ub8be\u69d9\uc246\uc84e\u9255(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255.class, p0:Object[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<E>]), p1:DynamicOps, p2:RecordBuilder))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_1AF_0 : byte[] [generated]
        stack_1F3_0 : byte[] [generated]
        stack_270_0 : byte[] [generated]
        stack_2C5_0 : byte[] [generated]
        var_4_192 : int
        var_3_197 : byte[]
        var_5_198 : int
        var_0_20B : int
        expr_1F3 : byte [generated]
        stack_23F_2 : byte [generated]
        stack_216_0 : byte [generated]
        expr_96 : int [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_25F : byte[]
        var_5_260 : int
        expr_EE : int [generated]
        var_3_2B4 : byte[]
        var_5_2B5 : int
        expr_2C8 : byte [generated]
        var_3_122 : String
        stack_18B_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(-264510447), ldc:int(2038293733))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_1AF_0 = stack_1F3_0 = stack_270_0 = stack_2C5_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("IUk30nPQdFReXNspS9nVD9NHzEReXNVZRk3QUWLi1EpMxuhv6OzX0A==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_192 = expr_6B:int
        var_3_197 = newarray:byte[](byte.class, expr_6B:int)
        var_5_198 = expr_6B:int
        Label_0410:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(128)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1006635783))
            var_5_198 = add:int(var_5_198:int, ldc:int(-1))
            storeelement:byte(var_3_197:byte[], var_5_198:int, add:byte(loadelement:byte(stack_1AF_0:byte[], var_5_198:int), ldc:byte(44)))
            
            if (cmpne:boolean(var_5_198:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_1AF_0 = stack_1F3_0 = stack_270_0 = stack_2C5_0 = var_3_197:byte[]
            goto(Label_0112)
        }
        
        Label_0478:
        
        while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_20B = and:int(var_0_5F:int, ldc:int(1564326003))
            var_5_198 = add:int(var_5_198:int, ldc:int(-1))
            expr_1F3 = stack_23F_2 = loadelement(stack_1F3_0, var_5_198)
            
            if (cmplt:boolean(add:int(add:int(var_5_198:int, ldc:int(4)), neg:int(var_4_192:int)), ldc:int(0))) {
                stack_23F_2 = stack_216_0 = add:byte(expr_1F3:byte, loadelement:byte(var_3_197:byte[], add:int(var_5_198:int, ldc:int(4))))
                goto(Label_0550)
            }
            
            Label_0512:
            
            if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_20B = and:int(var_0_20B:int, ldc:int(717181186))
            }
            else {
                var_0_20B = and:int(var_0_20B:int, ldc:int(1421587093))
                stack_23F_2 = stack_216_0 = add:byte(expr_1F3:byte, ldc:byte(4))
            }
            
            Label_0550:
            
            if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_20B = and:int(var_0_20B:int, ldc:int(1115135590))
                goto(Label_0512)
            }
            
            var_0_5F = and:int(var_0_20B:int, ldc:int(-1019478171))
            storeelement:byte(var_3_197:byte[], var_5_198:int, stack_23F_2:byte)
            
            if (cmpne:boolean(var_5_198:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_1AF_0 = stack_1F3_0 = stack_270_0 = stack_2C5_0 = var_3_197:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0410)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(64)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-264369467))
        }
        else {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1392114605))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_192 = expr_96:int
                var_3_197 = newarray:byte[](byte.class, expr_96:int)
                var_5_198 = expr_96:int
                goto(Label_0478)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(495177082))
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1057358171))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_25F = newarray:byte[](byte.class, expr_C3:int)
                var_5_260 = expr_C3:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-476332073))
                    var_5_260 = add:int(var_5_260:int, ldc:int(-1))
                    storeelement:byte(var_3_25F:byte[], var_5_260:int, add:int(shl:int(loadelement:byte(stack_270_0:byte[], var_5_260:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_260:int, xor:int(ldc:int(16400), ldc:int(16401)))), ldc:int(3)), and:int(ldc:int(19039), ldc:int(4511)))))
                    
                    if (cmpne:boolean(var_5_260:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_1AF_0 = stack_1F3_0 = stack_270_0 = stack_2C5_0 = var_3_25F:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(65536)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(-703222840))
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(1647966843))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_2B4 = newarray:byte[](byte.class, expr_EE:int)
                var_5_2B5 = expr_EE:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-289672743))
                    var_5_2B5 = add:int(var_5_2B5:int, ldc:int(-1))
                    expr_2C8 = xor:byte(loadelement:byte(stack_2C5_0:byte[], var_5_2B5:int), ldc:byte(53))
                    storeelement:byte(var_3_2B4:byte[], var_5_2B5:int, or:int(and:int(shl:int(expr_2C8:byte, and:int(ldc:int(580), ldc:int(2308))), ldc:int(-16)), and:int(shr:int(expr_2C8:byte[expected:int], and:int(ldc:int(9334), ldc:int(18948))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2B5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_1AF_0 = stack_1F3_0 = stack_270_0 = stack_2C5_0 = var_3_2B4:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-80082150))
            goto(Label_0112)
        }
        
        var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_18B_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2051), ldc:int(2048)))
        expr_134 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(408), ldc:int(411)))
        storeelement:String(expr_134:String[], and:int(ldc:int(-28998), ldc:int(28997)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(3001), ldc:int(-3006)), and:int(ldc:int(819), ldc:int(12378))))
        storeelement:String(expr_134:String[], and:int(ldc:int(1445), ldc:int(2049)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(4154), ldc:int(406)), xor:int(ldc:int(4398), ldc:int(4360))))
        storeelement:String(expr_134:String[], and:int(ldc:int(1578), ldc:int(387)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(2572), ldc:int(2602)), xor:int(ldc:int(11418), ldc:int(11453))))
        putstatic:String[](\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe::\u8aa5\u3bc9\uc87f\u71ae\u3dd3\u3c25, expr_134:String[])
    }
    
    public void \u071d\u61a4\u7049\u40a9\u16f6\u839e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60B : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_616 : int
        
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
        var_3_60B = and:int(ldc:int(1101762317), ldc:int(-742929077))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5d20\u3504\u3bc9\ub7dc\u6fb0\ubefe<E>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_60B = and:int(var_3_60B:int, ldc:int(497201037))
            var_5_7D = and:int(ldc:int(23336), ldc:int(-31530))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(20786), ldc:int(-20787)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_60B:int, ldc:int(-135279187))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(5393), ldc:int(2093)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(16897), ldc:int(391)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_60B = and:int(var_3_CA:int, ldc:int(1408408985))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(20769), ldc:int(11351)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-914805793))
                        goto(Label_1188)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(484625319))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0796)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(770267128))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-806621749))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0796)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1994825468))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(610214146))
                        goto(Label_1188)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0796)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-54367331))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(168727159))
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(901705077))
                        var_11_DB = and:int(ldc:int(-1391), ldc:int(364))
                        goto(Label_1447)
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-570869716))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1141620365))
                        goto(Label_1188)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-230968098))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1204715821))
                        goto(Label_0796)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1294492494))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-2059486706))
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(368708965))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0796)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1947638670))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1188)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(649439172))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1861939694))
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(1048578890))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(1101927399))
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-373338743))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0796:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1193504953))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1768027833))
                        goto(Label_1188)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1723640273))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-1766631364))
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(665006043))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(-24542), ldc:int(-24541))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0915:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1488560947))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1188)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0796)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(1234012791))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-475341495))
                        var_11_DB = and:int(ldc:int(13652), ldc:int(-14165))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1917661726))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1899942963))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(1703337346))
                            goto(Label_0915)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(2082398518))
                            goto(Label_0796)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-1289142330))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(588206462))
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-236208667))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1307)
                            }
                        }
                    }
                    
                    Label_1188:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(23188515))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(1978269180))
                            goto(Label_0915)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0796)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-1536642268))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-100716679))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1447)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1307:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1381137190))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1850666834))
                        goto(Label_1188)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1752190025))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0796)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1916801066))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1825543549))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_60B = and:int(var_3_60B:int, ldc:int(1978273185))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1447:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_616 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1458:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1188)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1590239672))
                        goto(Label_0796)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1441783269))
                        var_17_616 = add:int(var_16_109:int, and:int(ldc:int(2625), ldc:int(20617)))
                        looporswitchbreak()
                    }
                    
                    var_3_60B = and:int(var_3_60B:int, ldc:int(-501825181))
                }
                
                var_3_60B = and:int(var_3_60B:int, ldc:int(-676377115))
                
                if (cmple:boolean(var_5_7D = var_17_616:int, sub:int(var_6_84:int, xor:int(ldc:int(20483), ldc:int(20482))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
