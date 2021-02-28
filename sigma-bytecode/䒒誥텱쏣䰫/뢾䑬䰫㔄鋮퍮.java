public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\ub8be\u446c\u4c2b\u3504\u92ee\ud36e {
    public void \ub8be\u446c\u4c2b\u3504\u92ee\ud36e() {
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
            invokespecial:Object(Object::<init>, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e)
            putfield:Map<UUID, \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\u759a\u5d20\u156b\u5654\u927d\uc2e8, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e, initobject:ConcurrentHashMap<UUID, \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>[expected:Map<UUID, \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>](ConcurrentHashMap<K, V>::<init>))
            putfield:Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\u67e9\u5140\u7873\u7049\u7af6\u8258, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e, invokestatic:Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(Collections::newSetFromMap, initobject:ConcurrentHashMap<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, Boolean>[expected:Map<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, Boolean>](ConcurrentHashMap<K, V>::<init>)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6cfe\u8d98\u9af2\u4179\u64f2\uc238(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p0) {
        var_4_A0 : UUID
        
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
            invokestatic:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(Objects::requireNonNull, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, loadelement:String(getstatic:String[](\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\u8308\u4cd9\ufe34\uc9f6\ud158\u62da), and:int(ldc:int(2457), ldc:int(-2524))))
            invokeinterface:boolean(Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>::add, getfield:Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\u67e9\u5140\u7873\u7049\u7af6\u8258, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e), p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709)
            
            if (invokevirtual:boolean(\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\ub32d\u7330\u527a\u7330\u7af6\u3e75, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709)) {
                var_4_A0 = invokevirtual:UUID(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\u98a4\u718f\u7bad\uc238\u51fa\ua61f, invokevirtual:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u6c52\u12b2\u6ec6\u12b2\u51fa\u69d9, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709))
                
                if (cmpne:boolean(invokeinterface:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(Map<UUID, \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>::put, getfield:Map<UUID, \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\u759a\u5d20\u156b\u5654\u927d\uc2e8, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e), var_4_A0:UUID, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709), aconstnull:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709())) {
                    invokevirtual:void(Logger::warning, invokeinterface:Logger(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u8709\u839e\uafe7\ua61f\u71ae\ud158, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\u8308\u4cd9\ufe34\uc9f6\ud158\u62da), and:int(ldc:int(7953), ldc:int(41)))), var_4_A0:UUID[expected:Object]), loadelement:String(getstatic:String[](\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\u8308\u4cd9\ufe34\uc9f6\ud158\u62da), xor:int(ldc:int(1536), ldc:int(1538))))))
                }
            }
            
            if (cmpne:boolean(invokevirtual:Channel(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\uc2bd\uc2e8\u7049\ud4fe\ubff1\ub32d, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709), aconstnull:Channel())) {
                invokeinterface:ChannelFuture(ChannelFuture::addListener, invokeinterface:ChannelFuture(Channel::closeFuture, invokevirtual:Channel(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\uc2bd\uc2e8\u7049\ud4fe\ubff1\ub32d, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709)), invokedynamic:ChannelFutureListener[expected:GenericFutureListener](operationComplete:(L\u4492\u8aa5\ud171\uc3e3\u4c2b/\ub8be\u446c\u4c2b\u3504\u92ee\ud36e;L\u3bc9\u67e9\uc87f\u47c2\u5f50/\u16f6\u40a9\u5f50\ub113\ud51e/\u836c\u67e9\u5d20\u5fe1\u7e3f/\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709;)Lio/netty/channel/ChannelFutureListener;, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud36e\ub83f\uff55\ub19c\u3e2a\u0a06(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p0) {
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
            invokestatic:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(Objects::requireNonNull, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, loadelement:String(getstatic:String[](\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\u8308\u4cd9\ufe34\uc9f6\ud158\u62da), and:int(ldc:int(4431), ldc:int(-13296))))
            invokeinterface:boolean(Set<E>::remove, getfield:Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\u67e9\u5140\u7873\u7049\u7af6\u8258, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e), p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709[expected:Object])
            
            if (invokevirtual:boolean(\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\ub32d\u7330\u527a\u7330\u7af6\u3e75, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709)) {
                invokeinterface:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(Map<UUID, \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>::remove, getfield:Map<UUID, \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\u759a\u5d20\u156b\u5654\u927d\uc2e8, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e), invokevirtual:UUID[expected:Object](\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\u98a4\u718f\u7bad\uc238\u51fa\ua61f, invokevirtual:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u6c52\u12b2\u6ec6\u12b2\u51fa\u69d9, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub32d\u7330\u527a\u7330\u7af6\u3e75(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p0) {
        var_2_5F : int
        stack_86_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(1035248910), ldc:int(-677956189))
            
            if (invokevirtual:boolean(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u3711\u7bad\u4f4a\u946b\u97e6\u760c, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709)) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(498167799))
                stack_86_0 = and:int(ldc:int(-5834), ldc:int(5321))
            }
            else {
                stack_86_0 = xor:int(ldc:int(40), ldc:int(41))
            }
            
            return:boolean(stack_86_0:int)
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<java.util.UUID, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709> \ua6bd\ub7dc\ub18d\u6b0d\uc4d2\uae87() {
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
            return:Map<UUID, \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(invokestatic:Map<UUID, \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(Collections::unmodifiableMap, getfield:Map<UUID, \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\u759a\u5d20\u156b\u5654\u927d\uc2e8, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e)))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 \u12b2\u0a06\u0800\ua3b4\u6435\u93a2(java.util.UUID p0) {
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
            return:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(checkcast:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709.class, invokeinterface:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(Map<UUID, \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>::get, getfield:Map<UUID, \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\u759a\u5d20\u156b\u5654\u927d\uc2e8, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e), p0:UUID[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public java.util.UUID \u4492\u927d\u4179\u946b\u3c25\u156b(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p0) {
        var_4_73 : UUID
        var_5_83 : \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709
        
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
        
        if (cmpeq:boolean(invokevirtual:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u6c52\u12b2\u6ec6\u12b2\u51fa\u69d9, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709), aconstnull:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d())) {
            return:UUID(aconstnull:UUID())
        }
        
        var_4_73 = invokevirtual:UUID(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\u98a4\u718f\u7bad\uc238\u51fa\ua61f, invokevirtual:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u6c52\u12b2\u6ec6\u12b2\u51fa\u69d9, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709))
        var_5_83 = checkcast:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709.class, invokeinterface:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(Map<UUID, \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>::get, getfield:Map<UUID, \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\u759a\u5d20\u156b\u5654\u927d\uc2e8, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e), var_4_73:UUID[expected:Object]))
        
        if (logicaland:boolean(cmpne:boolean(var_5_83:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, aconstnull:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709()), invokevirtual:boolean(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::equals, var_5_83:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709[expected:Object]))) {
            return:UUID(var_4_73:UUID)
        }
        
        return:UUID(aconstnull:UUID())
    }
    
    public java.util.Set<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709> \u4975\u6c56\u5bc4\u8cae\ua6bd\u392e() {
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
            return:Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(invokestatic:Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(Collections::unmodifiableSet, getfield:Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\u67e9\u5140\u7873\u7049\u7af6\u8258, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u760c\ud171\uff55\u071d\uc7fe\u836c(java.util.UUID p0) {
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
            return:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<UUID, \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\u759a\u5d20\u156b\u5654\u927d\uc2e8, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e), p0:UUID[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u927d\u8d90\u516c\u7330\ud523\u3504$0(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p0, io.netty.channel.ChannelFuture p1) {
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
            invokevirtual:void(\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\ud36e\ub83f\uff55\ub19c\u3e2a\u0a06, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_DD_0 : byte[] [generated]
        stack_DF_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_118_0 : byte[] [generated]
        stack_14E_0 : byte[] [generated]
        stack_23C_0 : byte[] [generated]
        stack_298_0 : byte[] [generated]
        stack_30D_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_1CC : byte[]
        var_4_1CD : int
        expr_A6 : int [generated]
        var_5_21D : int
        var_3_222 : byte[]
        var_4_223 : int
        expr_23C : byte [generated]
        var_0_28E : int
        expr_298 : byte [generated]
        stack_2D8_2 : byte [generated]
        stack_2B5_0 : byte [generated]
        expr_DF : int [generated]
        expr_118 : int [generated]
        var_3_2FB : byte[]
        var_4_2FC : int
        var_3_15A : String
        stack_1C3_0 : String[] [generated]
        expr_16C : String[] [generated]
        
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
            var_0_5F = and:int(ldc:int(479627845), ldc:int(-694908377))
            expr_65 = var_2_69 = stack_A4_0 = stack_A6_0 = stack_DD_0 = stack_DF_0 = stack_116_0 = stack_118_0 = stack_14E_0 = stack_23C_0 = stack_298_0 = stack_30D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("CUguMj/x89noobsYPg62TZJx5XIIK8/0P/RuD4Yf7/v/zBY79HRuB59mH+/7/8wWO/JmB25mO13uOn/lgA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_1CC = newarray:byte[](byte.class, expr_6D:int)
                var_4_1CD = expr_6D:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(530034197))
                    var_4_1CD = add:int(var_4_1CD:int, ldc:int(-1))
                    storeelement:byte(var_3_1CC:byte[], var_4_1CD:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_1CD:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_1CD:int, xor:int(ldc:int(28928), ldc:int(28929)))), ldc:int(5)), and:int(ldc:int(71), ldc:int(8471)))))
                    
                    if (cmpne:boolean(var_4_1CD:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_DD_0 = stack_DF_0 = stack_116_0 = stack_118_0 = stack_14E_0 = stack_23C_0 = stack_298_0 = stack_30D_0 = var_3_1CC:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-271951864))
                    goto(Label_0285)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2048)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1088678126))
                    goto(Label_0228)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0171)
                }
                
                var_0_5F = and:int(var_0_5F:int, ldc:int(-1929392571))
                expr_A6 = arraylength:int(stack_A6_0:byte[])
                
                if (cmpeq:boolean(expr_A6:int, ldc:int(0))) {
                    goto(Label_0171)
                }
                
                var_5_21D = expr_A6:int
                var_3_222 = newarray:byte[](byte.class, expr_A6:int)
                var_4_223 = expr_A6:int
                Label_0549:
                
                while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1399337131))
                    var_4_223 = add:int(var_4_223:int, ldc:int(-1))
                    expr_23C = loadelement:byte(stack_23C_0:byte[], var_4_223:int)
                    storeelement:byte(var_3_222:byte[], var_4_223:int, or:int(and:int(shl:int(expr_23C:byte, xor:int(ldc:int(-16119), ldc:int(-16115))), ldc:int(-16)), and:int(shr:int(expr_23C:byte[expected:int], xor:int(ldc:int(-16358), ldc:int(-16354))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_223:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A6_0 = stack_A4_0 = stack_DD_0 = stack_DF_0 = stack_116_0 = stack_118_0 = stack_14E_0 = stack_23C_0 = stack_298_0 = stack_30D_0 = var_3_222:byte[]
                    goto(Label_0171)
                }
                
                Label_0641:
                
                while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    var_0_28E = and:int(var_0_5F:int, ldc:int(-273154481))
                    var_4_223 = add:int(var_4_223:int, ldc:int(-1))
                    expr_298 = stack_2D8_2 = loadelement(stack_298_0, var_4_223)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_223:int, ldc:int(2)), neg:int(var_5_21D:int)), ldc:int(0))) {
                        stack_2D8_2 = stack_2B5_0 = add:byte(expr_298:byte, loadelement:byte(var_3_222:byte[], add:int(var_4_223:int, ldc:int(2))))
                        goto(Label_0709)
                    }
                    
                    Label_0677:
                    
                    if (cmpeq:boolean(and:int(var_0_28E:int, ldc:int(1024)), ldc:int(0))) {
                        var_0_28E = and:int(var_0_28E:int, ldc:int(1186918029))
                        stack_2D8_2 = stack_2B5_0 = add:byte(expr_298:byte, ldc:byte(2))
                    }
                    
                    Label_0709:
                    
                    if (cmpeq:boolean(and:int(var_0_28E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0677)
                    }
                    
                    var_0_5F = and:int(var_0_28E:int, ldc:int(400001817))
                    storeelement:byte(var_3_222:byte[], var_4_223:int, stack_2D8_2:byte)
                    
                    if (cmpne:boolean(var_4_223:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A6_0 = stack_A4_0 = stack_DD_0 = stack_DF_0 = stack_116_0 = stack_118_0 = stack_14E_0 = stack_23C_0 = stack_298_0 = stack_30D_0 = var_3_222:byte[]
                    goto(Label_0228)
                }
                
                goto(Label_0549)
                Label_0171:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1963807326))
                    goto(Label_0285)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(536870912)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-804950859))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(532147719))
                    expr_DF = arraylength:int(stack_DF_0:byte[])
                    
                    if (cmpne:boolean(expr_DF:int, ldc:int(0))) {
                        var_5_21D = expr_DF:int
                        var_3_222 = newarray:byte[](byte.class, expr_DF:int)
                        var_4_223 = expr_DF:int
                        goto(Label_0641)
                    }
                }
                
                Label_0228:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-786818125))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_5F:int, ldc:int(1568924075))
                        goto(Label_0171)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(480029669))
                    expr_118 = arraylength:int(stack_118_0:byte[])
                    
                    if (cmpne:boolean(expr_118:int, ldc:int(0))) {
                        var_3_2FB = newarray:byte[](byte.class, expr_118:int)
                        var_4_2FC = expr_118:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(-1214399803))
                            var_4_2FC = add:int(var_4_2FC:int, ldc:int(-1))
                            storeelement:byte(var_3_2FB:byte[], var_4_2FC:int, xor:byte(add:byte(loadelement:byte(stack_30D_0:byte[], var_4_2FC:int), ldc:byte(70)), ldc:byte(43)))
                            
                            if (cmpne:boolean(var_4_2FC:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A6_0 = stack_A4_0 = stack_DD_0 = stack_DF_0 = stack_116_0 = stack_118_0 = stack_14E_0 = stack_23C_0 = stack_298_0 = stack_30D_0 = var_3_2FB:byte[]
                    }
                }
                
                Label_0285:
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(99237332))
                    goto(Label_0228)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0171)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(32)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_5F:int, ldc:int(-341057656))
            }
            
            var_3_15A = initobject:String(String::<init>, stack_14E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1C3_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(579), ldc:int(576)))
            expr_16C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8587), ldc:int(7703)))
            storeelement:String(expr_16C:String[], xor:int(ldc:int(11268), ldc:int(11270)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, and:int(ldc:int(20067), ldc:int(-20068)), xor:int(ldc:int(-18432), ldc:int(-18431))))
            storeelement:String(expr_16C:String[], xor:int(ldc:int(-30655), ldc:int(-30656)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, xor:int(ldc:int(4292), ldc:int(4293)), and:int(ldc:int(12863), ldc:int(105))))
            storeelement:String(expr_16C:String[], and:int(ldc:int(17542), ldc:int(-21640)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, xor:int(ldc:int(16694), ldc:int(16671)), xor:int(ldc:int(3), ldc:int(63))))
            putstatic:String[](\ub8be\u446c\u4c2b\u3504\u92ee\ud36e::\u8308\u4cd9\ufe34\uc9f6\ud158\u62da, expr_16C:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7e3f\uc3e3\ua562\ud171\u88c5\u839e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6BA : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6C5 : int
        
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
        var_3_6BA = and:int(ldc:int(1571703586), ldc:int(2109427517))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub8be\u446c\u4c2b\u3504\u92ee\ud36e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(2146311091))
            var_5_81 = and:int(ldc:int(-5588), ldc:int(1363))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16337), ldc:int(15312)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6BA:int, ldc:int(2144251432))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(24593), ldc:int(143)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:boolean(0), ldc:boolean(1)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6BA = and:int(var_3_D1:int, ldc:int(503228966))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(17473), ldc:int(4643)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-40263383))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1773049196))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1508671567))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1017469748))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1860350411))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(70411243))
                        goto(Label_0756)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(2068161659))
                        goto(Label_0631)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1416160194))
                    }
                    else {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1569589985))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0631)
                            }
                            
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0438:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-583793325))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(390928246))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1759303128))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1382973293))
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(921051963))
                        goto(Label_0756)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(976369416))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1705253275))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(535773154))
                        var_11_E2 = and:int(ldc:int(23905), ldc:int(-32106))
                        goto(Label_1589)
                    }
                    
                    Label_0631:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-618937888))
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-487171826))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(384067367))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1612191279))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-538011082))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0756:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-940944491))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0631)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-955901963))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1609199604))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0870:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-818581507))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(974903012))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-828633995))
                            goto(Label_0756)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0631)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-481534161))
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1141935347))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1108729859))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(-31734), ldc:int(-31733))
                                goto(Label_1173)
                            }
                        }
                    }
                    
                    Label_1004:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1222977389))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2110881228))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1630411797))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-791414110))
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0756)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0631)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(86830578))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1107652952))
                        var_11_E2 = and:int(ldc:int(5208), ldc:int(-13401))
                    }
                    
                    Label_1173:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1137756394))
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1067941449))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(2064147225))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1004)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1555653797))
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-708504642))
                            goto(Label_0756)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-772253958))
                            goto(Label_0631)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(531554105))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1461)
                            }
                        }
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-354224384))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1173)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1647658030))
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2137818428))
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0756)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-384720722))
                            goto(Label_0631)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-980745067))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1611765201))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1589)
                    }
                    
                    Label_1461:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1630758797))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-28139143))
                        goto(Label_0756)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-789153919))
                        goto(Label_0631)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1079047511))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1589:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C5 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1600:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1499799269))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-574744215))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2123259087))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0756)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0631)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1170794557))
                        goto(Label_0438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1606061879))
                        var_17_6C5 = add:int(var_16_110:int, and:int(ldc:int(4117), ldc:int(9)))
                        looporswitchbreak()
                    }
                    
                    var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1309175929))
                }
                
                var_3_6BA = and:int(var_3_6BA:int, ldc:int(1576958585))
                
                if (cmple:boolean(var_5_81 = var_17_6C5:int, sub:int(var_6_88:int, xor:int(ldc:int(1546), ldc:int(1547))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
