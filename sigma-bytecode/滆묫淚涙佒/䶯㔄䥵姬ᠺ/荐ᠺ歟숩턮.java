public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u8350\u183a\u6b5f\uc229\ud12e {
    public void \u8350\u183a\u6b5f\uc229\ud12e() {
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
            invokespecial:Object(Object::<init>, this:\u8350\u183a\u6b5f\uc229\ud12e)
            putfield:ConcurrentMap<String, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>(\u8350\u183a\u6b5f\uc229\ud12e::\u120d\u7330\u51b2\u8d98\u47c2\u7d52, this:\u8350\u183a\u6b5f\uc229\ud12e, initobject:ConcurrentHashMap<String, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>[expected:ConcurrentMap<String, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>](ConcurrentHashMap<K, V>::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u8350\u183a\u6b5f\uc229\ud12e \uc3e3\u8cae\u4e72\u4e72\u16f6\u760c(java.lang.String p0, \u5d20\u97b7\u8753\u873d\u16f6.\u72f1\u624e\u64ab\ua6bd\uc229 p1) {
        var_5_6D : ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>
        var_6_9E : ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>
        
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
            var_5_6D = checkcast:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>(java.util.concurrent.ConcurrentLinkedQueue<\u5d20\u97b7\u8753\u873d\u16f6.\u72f1\u624e\u64ab\ua6bd\uc229>.class, invokeinterface:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>(Map<K, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>::get, getfield:ConcurrentMap<String, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>[expected:Map<K, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>](\u8350\u183a\u6b5f\uc229\ud12e::\u120d\u7330\u51b2\u8d98\u47c2\u7d52, this:\u8350\u183a\u6b5f\uc229\ud12e), p0:String[expected:Object]))
            
            if (cmpeq:boolean(var_5_6D:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>, aconstnull:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>())) {
                var_5_6D = initobject:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>(ConcurrentLinkedQueue::<init>)
                var_6_9E = checkcast:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>(java.util.concurrent.ConcurrentLinkedQueue<\u5d20\u97b7\u8753\u873d\u16f6.\u72f1\u624e\u64ab\ua6bd\uc229>.class, invokeinterface:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>(ConcurrentMap<String, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>::putIfAbsent, getfield:ConcurrentMap<String, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>(\u8350\u183a\u6b5f\uc229\ud12e::\u120d\u7330\u51b2\u8d98\u47c2\u7d52, this:\u8350\u183a\u6b5f\uc229\ud12e), p0:String, var_5_6D:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>))
                
                if (cmpne:boolean(var_6_9E:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>, aconstnull:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>())) {
                    var_5_6D = var_6_9E:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>
                }
            }
            
            invokevirtual:boolean(ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>::add, var_5_6D:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>, p1:\u72f1\u624e\u64ab\ua6bd\uc229)
            return:\u8350\u183a\u6b5f\uc229\ud12e(this:\u8350\u183a\u6b5f\uc229\ud12e)
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u8350\u183a\u6b5f\uc229\ud12e \u9033\u8cae\u3c25\ud12e\u6c56\u946b(java.lang.String p0, \u5d20\u97b7\u8753\u873d\u16f6.\u72f1\u624e\u64ab\ua6bd\uc229 p1) {
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
            invokevirtual:\u8350\u183a\u6b5f\uc229\ud12e(\u8350\u183a\u6b5f\uc229\ud12e::\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c, this:\u8350\u183a\u6b5f\uc229\ud12e, p0:String, initobject:\ud36e\u3711\uc87f\ucef1\ud12e[expected:\u72f1\u624e\u64ab\ua6bd\uc229](\ud36e\u3711\uc87f\ucef1\ud12e::<init>, this:\u8350\u183a\u6b5f\uc229\ud12e, p0:String, p1:\u72f1\u624e\u64ab\ua6bd\uc229))
            return:\u8350\u183a\u6b5f\uc229\ud12e(this:\u8350\u183a\u6b5f\uc229\ud12e)
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u8350\u183a\u6b5f\uc229\ud12e \uf94d\u3dd3\u760c\u9033\u7330\u6ec6() {
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
            invokeinterface:void(Map<K, V>::clear, getfield:ConcurrentMap<String, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>[expected:Map<String, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>](\u8350\u183a\u6b5f\uc229\ud12e::\u120d\u7330\u51b2\u8d98\u47c2\u7d52, this:\u8350\u183a\u6b5f\uc229\ud12e))
            return:\u8350\u183a\u6b5f\uc229\ud12e(this:\u8350\u183a\u6b5f\uc229\ud12e)
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u8350\u183a\u6b5f\uc229\ud12e \uf94d\u3dd3\u760c\u9033\u7330\u6ec6(java.lang.String p0) {
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
            invokeinterface:Object(Map<Object, Object>::remove, getfield:ConcurrentMap<String, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>[expected:Map<Object, Object>](\u8350\u183a\u6b5f\uc229\ud12e::\u120d\u7330\u51b2\u8d98\u47c2\u7d52, this:\u8350\u183a\u6b5f\uc229\ud12e), p0:String[expected:Object])
            return:\u8350\u183a\u6b5f\uc229\ud12e(this:\u8350\u183a\u6b5f\uc229\ud12e)
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u8350\u183a\u6b5f\uc229\ud12e \uf94d\u3dd3\u760c\u9033\u7330\u6ec6(java.lang.String p0, \u5d20\u97b7\u8753\u873d\u16f6.\u72f1\u624e\u64ab\ua6bd\uc229 p1) {
        var_3_B5 : int
        var_5_6D : ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>
        var_6_84 : Iterator<\u72f1\u624e\u64ab\ua6bd\uc229>
        
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
            var_3_B5 = and:int(ldc:int(-334245726), ldc:int(530043826))
            var_5_6D = checkcast:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>(java.util.concurrent.ConcurrentLinkedQueue<\u5d20\u97b7\u8753\u873d\u16f6.\u72f1\u624e\u64ab\ua6bd\uc229>.class, invokeinterface:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>(Map<K, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>::get, getfield:ConcurrentMap<String, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>[expected:Map<K, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>](\u8350\u183a\u6b5f\uc229\ud12e::\u120d\u7330\u51b2\u8d98\u47c2\u7d52, this:\u8350\u183a\u6b5f\uc229\ud12e), p0:String[expected:Object]))
            
            if (cmpne:boolean(var_5_6D:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>, aconstnull:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>())) {
                var_6_84 = invokevirtual:Iterator<\u72f1\u624e\u64ab\ua6bd\uc229>(ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>::iterator, var_5_6D:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>)
                
                loop {
                    var_3_B5 = and:int(var_3_B5:int, ldc:int(-1376394094))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_84:Iterator<\u72f1\u624e\u64ab\ua6bd\uc229>))) {
                        looporswitchbreak()
                    }
                    
                    if (invokestatic:boolean(\u8350\u183a\u6b5f\uc229\ud12e::\u71f1\ud12e\ua562\u72f1\u0800\u6198, p1:\u72f1\u624e\u64ab\ua6bd\uc229, checkcast:\u72f1\u624e\u64ab\ua6bd\uc229(\u5d20\u97b7\u8753\u873d\u16f6.\u72f1\u624e\u64ab\ua6bd\uc229.class, invokeinterface:\u72f1\u624e\u64ab\ua6bd\uc229(Iterator<\u72f1\u624e\u64ab\ua6bd\uc229>::next, var_6_84:Iterator<\u72f1\u624e\u64ab\ua6bd\uc229>)))) {
                        invokeinterface:void(Iterator<E>::remove, var_6_84:Iterator<\u72f1\u624e\u64ab\ua6bd\uc229>)
                        looporswitchbreak()
                    }
                    
                    var_3_B5 = and:int(var_3_B5:int, ldc:int(-1789824782))
                }
            }
            
            return:\u8350\u183a\u6b5f\uc229\ud12e(this:\u8350\u183a\u6b5f\uc229\ud12e)
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u71f1\ud12e\ua562\u72f1\u0800\u6198(\u5d20\u97b7\u8753\u873d\u16f6.\u72f1\u624e\u64ab\ua6bd\uc229 p0, \u5d20\u97b7\u8753\u873d\u16f6.\u72f1\u624e\u64ab\ua6bd\uc229 p1) {
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
        
        if (invokevirtual:boolean(Object::equals, p0:\u72f1\u624e\u64ab\ua6bd\uc229[expected:Object], p1:\u72f1\u624e\u64ab\ua6bd\uc229[expected:Object])) {
            return:boolean(and:int[expected:boolean](ldc:int(4771), ldc:int(18753)))
        }
        
        if (logicalnot:boolean(instanceof:boolean(\u12b2\u7049\u8df4\uc9f6\uae87.\ud36e\u3711\uc87f\ucef1\ud12e.class, p1:\u72f1\u624e\u64ab\ua6bd\uc229))) {
            return:boolean(and:int[expected:boolean](ldc:int(-4448), ldc:int(4382)))
        }
        
        return:boolean(invokevirtual:boolean(Object::equals, p0:\u72f1\u624e\u64ab\ua6bd\uc229[expected:Object], getfield:\u72f1\u624e\u64ab\ua6bd\uc229[expected:Object](\ud36e\u3711\uc87f\ucef1\ud12e::\u6fb0\u99f7\u7330\u624e\u97e6\u760c, checkcast:\ud36e\u3711\uc87f\ucef1\ud12e(\u12b2\u7049\u8df4\uc9f6\uae87.\ud36e\u3711\uc87f\ucef1\ud12e.class, p1:\u72f1\u624e\u64ab\ua6bd\uc229[expected:\ud36e\u3711\uc87f\ucef1\ud12e]))))
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u8350\u183a\u6b5f\uc229\ud12e \u8350\u76bc\u67e9\uff55\u8bb0\u385b(java.lang.String p0, java.lang.Object[] p1) {
        var_3_5F : int
        var_5_6D : ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>
        var_6_84 : Iterator<\u72f1\u624e\u64ab\ua6bd\uc229>
        
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
            var_3_5F = and:int(ldc:int(-343173823), ldc:int(-490407152))
            var_5_6D = checkcast:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>(java.util.concurrent.ConcurrentLinkedQueue<\u5d20\u97b7\u8753\u873d\u16f6.\u72f1\u624e\u64ab\ua6bd\uc229>.class, invokeinterface:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>(Map<K, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>::get, getfield:ConcurrentMap<String, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>[expected:Map<K, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>](\u8350\u183a\u6b5f\uc229\ud12e::\u120d\u7330\u51b2\u8d98\u47c2\u7d52, this:\u8350\u183a\u6b5f\uc229\ud12e), p0:String[expected:Object]))
            
            if (cmpne:boolean(var_5_6D:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>, aconstnull:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>())) {
                var_6_84 = invokevirtual:Iterator<\u72f1\u624e\u64ab\ua6bd\uc229>(ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>::iterator, var_5_6D:ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>)
                
                loop {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-373950138))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_84:Iterator<\u72f1\u624e\u64ab\ua6bd\uc229>))) {
                        looporswitchbreak()
                    }
                    
                    invokeinterface:void(\u72f1\u624e\u64ab\ua6bd\uc229::\uae87\u5245\ucb79\u5654\u9af2\u9033, checkcast:\u72f1\u624e\u64ab\ua6bd\uc229(\u5d20\u97b7\u8753\u873d\u16f6.\u72f1\u624e\u64ab\ua6bd\uc229.class, invokeinterface:\u72f1\u624e\u64ab\ua6bd\uc229(Iterator<\u72f1\u624e\u64ab\ua6bd\uc229>::next, var_6_84:Iterator<\u72f1\u624e\u64ab\ua6bd\uc229>)), p1:Object[])
                }
            }
            
            return:\u8350\u183a\u6b5f\uc229\ud12e(this:\u8350\u183a\u6b5f\uc229\ud12e)
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u5d20\u97b7\u8753\u873d\u16f6.\u72f1\u624e\u64ab\ua6bd\uc229> \u7d52\u4e72\u92ee\u7bad\u72f1\u5f50(java.lang.String p0) {
        var_2_5F : int
        var_4_6D : ConcurrentLinkedQueue<?>
        stack_9C_0 : ArrayList<\u72f1\u624e\u64ab\ua6bd\uc229> [generated]
        
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
            var_2_5F = and:int(ldc:int(-1229200803), ldc:int(-1363418631))
            var_4_6D = checkcast:ConcurrentLinkedQueue<?>(java.util.concurrent.ConcurrentLinkedQueue<?>.class, invokeinterface:ConcurrentLinkedQueue<?>(Map<K, ConcurrentLinkedQueue<?>>::get, getfield:ConcurrentMap<String, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>[expected:Map<K, ConcurrentLinkedQueue<?>>](\u8350\u183a\u6b5f\uc229\ud12e::\u120d\u7330\u51b2\u8d98\u47c2\u7d52, this:\u8350\u183a\u6b5f\uc229\ud12e), p0:String[expected:Object]))
            
            if (cmpeq:boolean(var_4_6D:ConcurrentLinkedQueue<?>, aconstnull:ConcurrentLinkedQueue<?>())) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-356570113))
                stack_9C_0 = initobject:ArrayList<\u72f1\u624e\u64ab\ua6bd\uc229>(ArrayList<E>::<init>, and:int(ldc:int(-10833), ldc:int(10832)))
            }
            else {
                stack_9C_0 = initobject:ArrayList<\u72f1\u624e\u64ab\ua6bd\uc229>(ArrayList<\u72f1\u624e\u64ab\ua6bd\uc229>::<init>, var_4_6D:Collection<? extends \u72f1\u624e\u64ab\ua6bd\uc229>)
            }
            
            return:List<\u72f1\u624e\u64ab\ua6bd\uc229>(stack_9C_0:ArrayList<\u72f1\u624e\u64ab\ua6bd\uc229>)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7af6\u392e\u8cae\u494c\ub8be\uf9c5(java.lang.String p0) {
        var_2_5F : int
        var_4_6D : ConcurrentLinkedQueue
        stack_A2_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(1099435335), ldc:int(1397599683))
            var_4_6D = checkcast:ConcurrentLinkedQueue(java.util.concurrent.ConcurrentLinkedQueue.class, invokeinterface:ConcurrentLinkedQueue(Map<K, ConcurrentLinkedQueue>::get, getfield:ConcurrentMap<String, ConcurrentLinkedQueue<\u72f1\u624e\u64ab\ua6bd\uc229>>[expected:Map<K, ConcurrentLinkedQueue>](\u8350\u183a\u6b5f\uc229\ud12e::\u120d\u7330\u51b2\u8d98\u47c2\u7d52, this:\u8350\u183a\u6b5f\uc229\ud12e), p0:String[expected:Object]))
            
            if (logicaland:boolean(cmpne:boolean(var_4_6D:ConcurrentLinkedQueue, aconstnull:ConcurrentLinkedQueue()), logicalnot:boolean(invokevirtual:boolean(ConcurrentLinkedQueue::isEmpty, var_4_6D:ConcurrentLinkedQueue)))) {
                stack_A2_0 = xor:int(ldc:int(2052), ldc:int(2053))
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(869731815))
                stack_A2_0 = and:int(ldc:int(-4765), ldc:int(4764))
            }
            
            return:boolean(stack_A2_0:int)
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud158\u0c95\u9937\u2dcc\u4f4a\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65C : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_667 : int
        
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
        var_3_65C = and:int(ldc:int(-1895062110), ldc:int(-271073493))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8350\u183a\u6b5f\uc229\ud12e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_65C = and:int(var_3_65C:int, ldc:int(561107726))
        }
        else {
            var_3_65C = and:int(var_3_65C:int, ldc:int(-1409567748))
            var_5_85 = and:int(ldc:int(21368), ldc:int(-31613))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(28848), ldc:int(-28849)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_65C:int, ldc:int(-1190928008))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(11265), ldc:int(4875)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(8201), ldc:int(97)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_65C = and:int(var_3_DA:int, ldc:int(-336874641))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(9408), ldc:int(9409)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(2052621144))
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-804164753))
                        goto(Label_1381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1967429655))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0940)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-455826624))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(175669578))
                    }
                    else {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-548738784))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0821)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-102802552))
                        goto(Label_1381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-973476178))
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1657245383))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1378865890))
                        goto(Label_0940)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(91574819))
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1342506120))
                            var_11_EB = and:int(ldc:int(26172), ldc:int(-26237))
                            goto(Label_1511)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(921292753))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1562939784))
                        goto(Label_0940)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1411021316))
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1887863006))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-652496005))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0821)
                        }
                    }
                    
                    Label_0686:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-931822256))
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-650535356))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1757892710))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1184103249))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-564213956))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-318047877))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0821:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1562581188))
                        goto(Label_1381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1343681484))
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1270889765))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0686)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1177128141))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1445266519))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(5156), ldc:int(5157))
                                goto(Label_1103)
                            }
                        }
                    }
                    
                    Label_0940:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1380984247))
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1879731476))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1305215593))
                            goto(Label_0821)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1835812887))
                            goto(Label_0686)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1260898773))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-348199569))
                        var_11_EB = and:int(ldc:int(12004), ldc:int(-12005))
                    }
                    
                    Label_1103:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-977848439))
                        goto(Label_1381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-851981382))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(64)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-961196369))
                            goto(Label_0940)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1384390357))
                            goto(Label_0821)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-2124628908))
                            goto(Label_0686)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-53268499))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-104878674))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1381)
                            }
                        }
                    }
                    
                    Label_1241:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1574036313))
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1763248436))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1103)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0940)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-2139153098))
                            goto(Label_0821)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0686)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(225527606))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-974529474))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-318313177))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1511)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1381:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-749313558))
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1460377501))
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1531259484))
                        goto(Label_0940)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1887648257))
                        goto(Label_0686)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_65C = and:int(var_3_65C:int, ldc:int(-67913870))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1511:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_667 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1522:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(143620290))
                        goto(Label_1381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-206790514))
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-664586470))
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1018682425))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1620400716))
                        var_17_667 = add:int(var_16_119:int, xor:int(ldc:int(396), ldc:int(397)))
                        looporswitchbreak()
                    }
                }
                
                var_3_65C = and:int(var_3_65C:int, ldc:int(-885857350))
                
                if (cmple:boolean(var_5_85 = var_17_667:int, sub:int(var_6_8C:int, and:int(ldc:int(13), ldc:int(20657))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_65C = and:int(var_3_65C:int, ldc:int(-2087916202))
            goto(Label_0106)
        }
    }
}
