public abstract class \u51fa\u12cb\u7330\u74b1\u6c52.\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T> {
    public void \u4179\ud171\u4f52\u8c8a\u3e2a\u67e9(java.lang.String p0, float p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b p2, \u494c\u4975\ua068\u0c95\uc84e.\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4 p3) {
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
            invokespecial:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6(\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6::<init>, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>)
            invokestatic:Object(Preconditions::checkNotNull, p0:String[expected:Object], ldc:String[expected:Object]("Title cannot be null"))
            invokestatic:void(Preconditions::checkArgument, ternaryop:int[expected:boolean](logicaland:boolean(cmpge:boolean(p1:float, ldc:float(0.0f)), cmple:boolean(p1:float, ldc:float(1.0f))), xor:int(ldc:int(22529), ldc:int(22528)), and:int(ldc:int(-1032), ldc:int(1031))), ldc:String[expected:Object]("Health must be between 0 and 1"))
            putfield:UUID(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\uc3e3\ubb2b\u7ce1\u0c95\u873d\ua6bd, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, invokestatic:UUID(UUID::randomUUID))
            putfield:String(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u3e75\uf94d\u8753\u3c25\u927d\u6d99, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, p0:String)
            putfield:float(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\ud217\u92ee\u64ab\u156b\u8350\u3711, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, p1:float)
            putfield:\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u4c2b\uc2bd\ub70c\u8cae\ua3b4\uc29a, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, ternaryop:\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b(cmpne:boolean(p2:\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b, aconstnull:\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b()), p2:\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b, getstatic:\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b(\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b::\ua3b4\ub83f\ubefe\u385b\u4975\ud171)))
            putfield:\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u600f\u8df4\u8350\u3a62\uc2e8\u873d, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, ternaryop:\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4(cmpne:boolean(p3:\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4, aconstnull:\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4()), p3:\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4, getstatic:\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4(\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4::\u62da\ube23\ua3b4\u12cb\u8aa5\u7c6b)))
            putfield:Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u6c52\u4c2b\u446c\u9a18\u8bb0\u983f, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, invokestatic:Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(Collections::newSetFromMap, initobject:WeakHashMap<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, Boolean>[expected:Map<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, Boolean>](WeakHashMap<K, V>::<init>)))
            putfield:Set<\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe>(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u4c2b\u8df4\uceb8\u9033\u0a06\u3e2a, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, initobject:HashSet<\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe>[expected:Set<\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe>](HashSet<E>::<init>))
            putfield:boolean(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u8350\uc84e\ubefe\u7873\ud158\ubff1, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, xor:int[expected:boolean](ldc:int(130), ldc:int(131)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6 \u156b\uc9f6\u71ae\u76bc\uc238\ud7e8(java.lang.String p0) {
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
            invokestatic:Object(Preconditions::checkNotNull, p0:String[expected:Object])
            putfield:String(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u3e75\uf94d\u8753\u3c25\u927d\u6d99, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, p0:String)
            invokespecial:void(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\u647c\ub18d\u8cae\u600f\u8753\u8350, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, getstatic:\u8709\u12cb\u8df4\u61a4\u9a18\u3776(\u8709\u12cb\u8df4\u61a4\u9a18\u3776::\ub113\ube23\u7049\uafe7\u3c25\u8640))
            return:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6(this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>[expected:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6])
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6 \ubcb0\u47c2\u3d4b\u71ae\u120d\u4ab3(float p0) {
        var_2_5F : int
        stack_94_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(2009027782), ldc:int(2146434758))
            
            if (logicaland:boolean(cmpge:boolean(p0:float, ldc:float(0.0f)), cmple:boolean(p0:float, ldc:float(1.0f)))) {
                stack_94_0 = and:int[expected:boolean](ldc:int(2305), ldc:int(5767))
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1874520063))
                stack_94_0 = and:int[expected:boolean](ldc:int(-18766), ldc:int(18765))
            }
            
            invokestatic:void(Preconditions::checkArgument, stack_94_0:boolean, ldc:String[expected:Object]("Health must be between 0 and 1"))
            putfield:float(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\ud217\u92ee\u64ab\u156b\u8350\u3711, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, p0:float)
            invokespecial:void(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\u647c\ub18d\u8cae\u600f\u8753\u8350, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, getstatic:\u8709\u12cb\u8df4\u61a4\u9a18\u3776(\u8709\u12cb\u8df4\u61a4\u9a18\u3776::\u392e\u3e2a\u0c95\u3e2a\u718f\u5140))
            return:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6(this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>[expected:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6])
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b \u120d\ucfaf\u8df4\u7bad\u385b\ub1b9() {
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
            return:\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b(getfield:\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u4c2b\uc2bd\ub70c\u8cae\ua3b4\uc29a, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6 \u6b5f\u965f\u0a06\u6198\u71ae\u3504(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b p0) {
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
            invokestatic:Object(Preconditions::checkNotNull, p0:\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b[expected:Object])
            putfield:\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u4c2b\uc2bd\ub70c\u8cae\ua3b4\uc29a, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, p0:\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b)
            invokespecial:void(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\u647c\ub18d\u8cae\u600f\u8753\u8350, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, getstatic:\u8709\u12cb\u8df4\u61a4\u9a18\u3776(\u8709\u12cb\u8df4\u61a4\u9a18\u3776::\u6c52\u6bb9\uae87\uc229\u34df\u3a62))
            return:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6(this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>[expected:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6])
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6 \u960f\ucef1\u7af6\uf94d\u64ab\u71f1(\u494c\u4975\ua068\u0c95\uc84e.\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4 p0) {
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
            invokestatic:Object(Preconditions::checkNotNull, p0:\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4[expected:Object])
            putfield:\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u600f\u8df4\u8350\u3a62\uc2e8\u873d, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, p0:\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4)
            invokespecial:void(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\u647c\ub18d\u8cae\u600f\u8753\u8350, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, getstatic:\u8709\u12cb\u8df4\u61a4\u9a18\u3776(\u8709\u12cb\u8df4\u61a4\u9a18\u3776::\u6c52\u6bb9\uae87\uc229\u34df\u3a62))
            return:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6(this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>[expected:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6])
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6 \ub1b9\ua562\u5f50\u9937\ua3b4\ud51e(java.util.UUID p0) {
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
            return:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6(invokevirtual:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\u4c04\u67e9\u8258\u8d90\u93a2\u6435, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52::\u1187\u0800\uc9f6\u392e\u59ec\u8aa5, invokestatic:\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u3776\uf9c5\u3d4b\u72f1\u647c\ubf56), p0:UUID)))
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6 \u4c04\u67e9\u8258\u8d90\u93a2\u6435(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p0) {
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
            
            if (invokeinterface:boolean(Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>::add, getfield:Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u6c52\u4c2b\u446c\u9a18\u8bb0\u983f, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>), p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709)) {
                if (getfield:boolean(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u8350\uc84e\ubefe\u7873\ud158\ubff1, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>)) {
                    invokespecial:void(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\ua562\u983f\uc2e8\u120d\u7e3f\u8bb0, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, invokespecial:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\u3dd3\u392e\u527a\u647c\u4179\u4975, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, getstatic:\u8709\u12cb\u8df4\u61a4\u9a18\u3776(\u8709\u12cb\u8df4\u61a4\u9a18\u3776::\u5f50\u8bb0\u4179\u071d\ua6bd\uafe7), p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709))
                }
            }
            
            return:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6(this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>[expected:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6])
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6 \u600f\ucb79\ud51e\u4975\u3bd6\u965f(java.util.UUID p0) {
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
            return:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6(invokevirtual:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\u3504\u47c2\u67e9\u4179\u76bc\ub102, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52::\u1187\u0800\uc9f6\u392e\u59ec\u8aa5, invokestatic:\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u3776\uf9c5\u3d4b\u72f1\u647c\ubf56), p0:UUID)))
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6 \u3504\u47c2\u67e9\u4179\u76bc\ub102(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p0) {
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
            
            if (invokeinterface:boolean(Set<E>::remove, getfield:Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u6c52\u4c2b\u446c\u9a18\u8bb0\u983f, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>), p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709[expected:Object])) {
                invokespecial:void(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\ua562\u983f\uc2e8\u120d\u7e3f\u8bb0, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, invokespecial:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\u3dd3\u392e\u527a\u647c\u4179\u4975, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, getstatic:\u8709\u12cb\u8df4\u61a4\u9a18\u3776(\u8709\u12cb\u8df4\u61a4\u9a18\u3776::\u1833\ub83f\u5db4\u446c\u7d52\u965f), p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709))
            }
            
            return:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6(this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>[expected:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6])
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6 \u965f\u3d4b\u494c\u6c56\u7873\u64f2(\u12b2\u7049\u8df4\uc9f6\uae87.\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe p0) {
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
            invokestatic:Object(Preconditions::checkNotNull, p0:\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe[expected:Object])
            
            if (logicalnot:boolean(invokevirtual:boolean(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\ucb79\u4d85\u156b\uc29a\uc4d2\u4daf, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, p0:\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe))) {
                invokeinterface:boolean(Set<\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe>::add, getfield:Set<\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe>(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u4c2b\u8df4\uceb8\u9033\u0a06\u3e2a, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>), p0:\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe)
            }
            
            invokespecial:void(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\u647c\ub18d\u8cae\u600f\u8753\u8350, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, getstatic:\u8709\u12cb\u8df4\u61a4\u9a18\u3776(\u8709\u12cb\u8df4\u61a4\u9a18\u3776::\u59ec\u3d64\u446c\ubded\u4975\u759a))
            return:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6(this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>[expected:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6])
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6 \uc229\u527a\u97b7\u4d85\u6198\u8cae(\u12b2\u7049\u8df4\uc9f6\uae87.\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe p0) {
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
            invokestatic:Object(Preconditions::checkNotNull, p0:\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe[expected:Object])
            
            if (invokevirtual:boolean(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\ucb79\u4d85\u156b\uc29a\uc4d2\u4daf, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, p0:\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe)) {
                invokeinterface:boolean(Set<E>::remove, getfield:Set<\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe>(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u4c2b\u8df4\uceb8\u9033\u0a06\u3e2a, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>), p0:\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe[expected:Object])
            }
            
            invokespecial:void(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\u647c\ub18d\u8cae\u600f\u8753\u8350, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, getstatic:\u8709\u12cb\u8df4\u61a4\u9a18\u3776(\u8709\u12cb\u8df4\u61a4\u9a18\u3776::\u59ec\u3d64\u446c\ubded\u4975\u759a))
            return:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6(this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>[expected:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6])
        }
        
        goto(Label_0006)
    }
    
    public boolean \ucb79\u4d85\u156b\uc29a\uc4d2\u4daf(\u12b2\u7049\u8df4\uc9f6\uae87.\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe p0) {
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
            invokestatic:Object(Preconditions::checkNotNull, p0:\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe[expected:Object])
            return:boolean(invokeinterface:boolean(Set<E>::contains, getfield:Set<\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe>(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u4c2b\u8df4\uceb8\u9033\u0a06\u3e2a, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>), p0:\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Set<java.util.UUID> \ua562\u0800\u7330\ub8be\u4f52\u8258() {
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
    
    public java.util.Set<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709> \u071d\u6cfe\ube23\u67d0\u7006\u3c25() {
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
            return:Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(invokestatic:Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(Collections::unmodifiableSet, getfield:Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u6c52\u4c2b\u446c\u9a18\u8bb0\u983f, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>)))
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6 \u34df\u516c\u7043\u74b1\u5f50\u47c2() {
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
            invokespecial:void(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\u9033\u51fa\ud51e\u4e72\u67e9\ua61f, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, xor:int[expected:boolean](ldc:int(20994), ldc:int(20995)))
            return:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6(this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>[expected:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6])
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6 \u3dd3\ubff1\u3a62\u600f\u9255\u7330() {
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
            invokespecial:void(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\u9033\u51fa\ud51e\u4e72\u67e9\ua61f, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, and:int[expected:boolean](ldc:int(-20197), ldc:int(20196)))
            return:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6(this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>[expected:\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6])
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8bb0\ub32d\u8df4\ub83f\u7873\ub6ab() {
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
            return:boolean(getfield:boolean(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u8350\uc84e\ubefe\u7873\ud158\ubff1, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))
        }
        
        goto(Label_0006)
    }
    
    private void \u9033\u51fa\ud51e\u4e72\u67e9\ua61f(boolean p0) {
        var_2_84 : int
        stack_98_1 : \u8709\u12cb\u8df4\u61a4\u9a18\u3776 [generated]
        
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
            var_2_84 = and:int(ldc:int(726505769), ldc:int(659376933))
            
            if (cmpne:boolean(getfield:boolean(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u8350\uc84e\ubefe\u7873\ud158\ubff1, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>), p0:boolean)) {
                if (logicalnot:boolean(putfield:boolean(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u8350\uc84e\ubefe\u7873\ud158\ubff1, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, p0:boolean))) {
                    var_2_84 = and:int(var_2_84:int, ldc:int(-67159559))
                    stack_98_1 = getstatic:\u8709\u12cb\u8df4\u61a4\u9a18\u3776(\u8709\u12cb\u8df4\u61a4\u9a18\u3776::\u1833\ub83f\u5db4\u446c\u7d52\u965f)
                }
                else {
                    stack_98_1 = getstatic:\u8709\u12cb\u8df4\u61a4\u9a18\u3776(\u8709\u12cb\u8df4\u61a4\u9a18\u3776::\u5f50\u8bb0\u4179\u071d\ua6bd\uafe7)
                }
                
                var_2_84 = and:int(var_2_84:int, ldc:int(-277267674))
                invokespecial:void(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\u647c\ub18d\u8cae\u600f\u8753\u8350, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, stack_98_1:\u8709\u12cb\u8df4\u61a4\u9a18\u3776)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.UUID \u8aa5\u4e72\u56bd\u0a06\u7ce1\u7043() {
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
            return:UUID(getfield:UUID(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\uc3e3\ubb2b\u7ce1\u0c95\u873d\ua6bd, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.util.UUID \u624e\ub7dc\u5fe1\u6c56\ub6ab\ud171() {
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
            return:UUID(getfield:UUID(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\uc3e3\ubb2b\u7ce1\u0c95\u873d\ua6bd, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u8413\u4daf\u4ab3\u97b7\u8d90\u5654() {
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
            return:String(getfield:String(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u3e75\uf94d\u8753\u3c25\u927d\u6d99, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))
        }
        
        goto(Label_0006)
    }
    
    public float \u6c52\u5245\ubded\ufe34\uc3e3\u5bc4() {
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
            return:float(getfield:float(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\ud217\u92ee\u64ab\u156b\u8350\u3711, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))
        }
        
        goto(Label_0006)
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4 \u88c5\u93a2\u3e75\u9937\u6d69\ua61f() {
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
            return:\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4(getfield:\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u600f\u8df4\u8350\u3a62\uc2e8\u873d, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Set<\u12b2\u7049\u8df4\uc9f6\uae87.\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe> \u4daf\u61a4\ud12e\u7330\u5db4\ub19c() {
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
            return:Set<\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe>(getfield:Set<\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe>(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u4c2b\u8df4\uceb8\u9033\u0a06\u3e2a, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))
        }
        
        goto(Label_0006)
    }
    
    private void \u647c\ub18d\u8cae\u600f\u8753\u8350(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8709\u12cb\u8df4\u61a4\u9a18\u3776 p0) {
        var_2_61 : int
        var_4_70 : Iterator<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>
        var_5_97 : \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709
        
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
            var_2_61 = and:int(ldc:int(-816941884), ldc:int(-228692257))
            var_4_70 = invokevirtual:Iterator<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(ArrayList<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>::iterator, initobject:ArrayList<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(ArrayList<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>::<init>, getfield:Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>[expected:Collection<? extends \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>](\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u6c52\u4c2b\u446c\u9a18\u8bb0\u983f, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>)))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(-20219922))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_70:Iterator<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>))) {
                    looporswitchbreak()
                }
                
                var_5_97 = checkcast:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709.class, invokeinterface:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(Iterator<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>::next, var_4_70:Iterator<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>))
                invokespecial:void(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\ua562\u983f\uc2e8\u120d\u7e3f\u8bb0, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, var_5_97:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, invokespecial:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\u3dd3\u392e\u527a\u647c\u4179\u4975, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>, p0:\u8709\u12cb\u8df4\u61a4\u9a18\u3776, var_5_97:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ua562\u983f\uc2e8\u120d\u7e3f\u8bb0(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p1) {
        var_3_227 : int
        var_5_220 : Exception
        
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
        var_3_227 = and:int(ldc:int(577419628), ldc:int(-1377051752))
        
        loop {
            if (cmpne:boolean(and:int(var_3_227:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0482)
            }
            
            if (cmpne:boolean(and:int(var_3_227:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0379)
            }
            
            if (cmpne:boolean(and:int(var_3_227:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0304)
            }
            
            if (cmpne:boolean(and:int(var_3_227:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0231)
            }
            
            if (cmpne:boolean(and:int(var_3_227:int, ldc:int(16)), ldc:int(0))) {
                var_3_227 = and:int(var_3_227:int, ldc:int(491447433))
            }
            else {
                var_3_227 = and:int(var_3_227:int, ldc:int(-1141158055))
                
                if (cmpeq:boolean(invokevirtual:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u6c52\u12b2\u6ec6\u12b2\u51fa\u69d9, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709), aconstnull:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d())) {
                    goto(Label_0304)
                }
            }
            
            Label_0160:
            
            if (cmpne:boolean(and:int(var_3_227:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0482)
            }
            
            if (cmpne:boolean(and:int(var_3_227:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0379)
            }
            
            if (cmpeq:boolean(and:int(var_3_227:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0304)
            }
            
            if (cmpeq:boolean(and:int(var_3_227:int, ldc:int(8)), ldc:int(0))) {
                var_3_227 = and:int(var_3_227:int, ldc:int(-302982254))
            }
            else {
                if (cmpne:boolean(and:int(var_3_227:int, ldc:int(1)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_227 = and:int(var_3_227:int, ldc:int(1364880364))
                
                if (invokevirtual:boolean(\u6b5f\uc84e\u7bad\u8258\u8cae\u3bd6::\uc31c\u71f1\u8413\ua562\u8640\uf94d, invokevirtual:\u6b5f\uc84e\u7bad\u8258\u8cae\u3bd6(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\u34df\u8d90\ub19c\ua6bd\u7e3f\u6cfe, invokevirtual:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u6c52\u12b2\u6ec6\u12b2\u51fa\u69d9, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709)), ldc:Class<\u88c5\u8c8a\uf94d\ub6ab\u51fa\uf94d>(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u88c5\u8c8a\uf94d\ub6ab\u51fa\uf94d.class))) {
                    goto(Label_0475)
                }
            }
            
            Label_0231:
            
            if (cmpne:boolean(and:int(var_3_227:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0482)
            }
            
            if (cmpne:boolean(and:int(var_3_227:int, ldc:int(65536)), ldc:int(0))) {
                var_3_227 = and:int(var_3_227:int, ldc:int(1295730450))
                goto(Label_0379)
            }
            
            if (cmpeq:boolean(and:int(var_3_227:int, ldc:int(2147483647)), ldc:int(0))) {
                var_3_227 = and:int(var_3_227:int, ldc:int(1929654479))
            }
            else {
                if (cmpne:boolean(and:int(var_3_227:int, ldc:int(2)), ldc:int(0))) {
                    var_3_227 = and:int(var_3_227:int, ldc:int(-695794114))
                    goto(Label_0160)
                }
                
                if (cmpne:boolean(and:int(var_3_227:int, ldc:int(1073741824)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_227 = and:int(var_3_227:int, ldc:int(569097178))
            }
            
            Label_0304:
            
            if (cmpne:boolean(and:int(var_3_227:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0482)
            }
            
            if (cmpne:boolean(and:int(var_3_227:int, ldc:int(256)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_3_227:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0231)
                }
                
                if (cmpeq:boolean(and:int(var_3_227:int, ldc:int(4194304)), ldc:int(0))) {
                    var_3_227 = and:int(var_3_227:int, ldc:int(644055495))
                    goto(Label_0160)
                }
                
                if (cmpne:boolean(and:int(var_3_227:int, ldc:int(2)), ldc:int(0))) {
                    var_3_227 = and:int(var_3_227:int, ldc:int(680769978))
                    loopcontinue()
                }
                
                var_3_227 = and:int(var_3_227:int, ldc:int(1222576540))
                invokeinterface:boolean(Set<E>::remove, getfield:Set<\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709>(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u6c52\u4c2b\u446c\u9a18\u8bb0\u983f, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>), p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709[expected:Object])
            }
            
            Label_0379:
            
            if (cmpne:boolean(and:int(var_3_227:int, ldc:int(16)), ldc:int(0))) {
                var_3_227 = and:int(var_3_227:int, ldc:int(178762126))
                goto(Label_0482)
            }
            
            if (cmpne:boolean(and:int(var_3_227:int, ldc:int(1)), ldc:int(0))) {
                var_3_227 = and:int(var_3_227:int, ldc:int(-1606671499))
                goto(Label_0304)
            }
            
            if (cmpeq:boolean(and:int(var_3_227:int, ldc:int(524288)), ldc:int(0))) {
                var_3_227 = and:int(var_3_227:int, ldc:int(-2009299807))
                goto(Label_0231)
            }
            
            if (cmpeq:boolean(and:int(var_3_227:int, ldc:int(2048)), ldc:int(0))) {
                var_3_227 = and:int(var_3_227:int, ldc:int(-1002517027))
                goto(Label_0160)
            }
            
            if (cmpeq:boolean(and:int(var_3_227:int, ldc:int(2048)), ldc:int(0))) {
                var_3_227 = and:int(var_3_227:int, ldc:int(-1777857503))
                loopcontinue()
            }
            
            return:void()
            
            try {
                Label_0475:
                invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ub18d\u4f4a\u446c\u3bd6\u0a06\u4daf, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, ldc:Class<\u88c5\u8c8a\uf94d\ub6ab\u51fa\uf94d>(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u88c5\u8c8a\uf94d\ub6ab\u51fa\uf94d.class))
                Label_0482:
                
                if (cmpne:boolean(and:int(var_3_227:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0379)
                }
                
                if (cmpne:boolean(and:int(var_3_227:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0304)
                }
                
                if (cmpeq:boolean(and:int(var_3_227:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0231)
                }
                
                if (cmpne:boolean(and:int(var_3_227:int, ldc:int(2)), ldc:int(0))) {
                    var_3_227 = and:int(var_3_227:int, ldc:int(-724057129))
                    goto(Label_0160)
                }
                
                if (cmpne:boolean(and:int(var_3_227:int, ldc:int(65536)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_227 = and:int(var_3_227:int, ldc:int(2009735161))
            }
            catch (java.lang.Exception var_5_220) {
                var_3_227 = and:int(var_3_227:int, ldc:int(1256086008))
                invokevirtual:void(Throwable::printStackTrace, var_5_220:Exception[expected:Throwable])
            }
        }
    }
    
    private \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 \u3dd3\u392e\u527a\u647c\u4179\u4975(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8709\u12cb\u8df4\u61a4\u9a18\u3776 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p1) {
        var_3_61 : int
        var_5_73 : \u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
        stack_938_0 : \u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 [generated]
        var_5_93D : Exception
        
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
        var_3_61 = and:int(ldc:int(172757657), ldc:int(978087673))
        
        try {
            var_3_61 = and:int(var_3_61:int, ldc:int(-7571747))
            var_5_73 = initobject:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::<init>, ldc:int(12), aconstnull:ByteBuf(), p1:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709)
            
            loop {
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_2187)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_2035)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-570687023))
                    goto(Label_1834)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_1662)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_1496)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_1347)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(134217728)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-1247258032))
                    goto(Label_1184)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1660198249))
                    goto(Label_1010)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0827)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0656)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0438)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(67108864)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-667040711))
                }
                else {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-1149902977))
                    invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_5_73:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<UUID>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u92ee\u718f\u8df4\u156b\ubded\u3e75), getfield:UUID(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\uc3e3\ubb2b\u7ce1\u0c95\u873d\ua6bd, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))
                }
                
                Label_0267:
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_2187)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-489923526))
                    goto(Label_2035)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(778000042))
                    goto(Label_1834)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(8)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(97526513))
                    goto(Label_1662)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1496)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1347)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_1184)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32768)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(702886037))
                    goto(Label_1010)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-29148563))
                    goto(Label_0827)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0656)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(8)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-2123729582))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61 = and:int(var_3_61:int, ldc:int(243264847))
                    invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_5_73:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u8709\u12cb\u8df4\u61a4\u9a18\u3776::\u494c\u6c56\uc9f6\u494c\uae87\u494c, p0:\u8709\u12cb\u8df4\u61a4\u9a18\u3776)))
                }
                
                Label_0438:
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-1481708311))
                    goto(Label_2187)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_2035)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_1834)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(863760742))
                    goto(Label_1662)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1894395061))
                    goto(Label_1496)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1573311362))
                    goto(Label_1347)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1184)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_1010)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-757892427))
                    goto(Label_0827)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(67108864)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-1856214936))
                        loopcontinue()
                    }
                    
                    var_3_61 = and:int(var_3_61:int, ldc:int(-1369466689))
                    
                    switch (loadelement:int(getstatic:int[](\u71ae\u92ff\u5f50\u52d3\u8389\ubefe::\u7043\ub83f\ub1b9\u516c\u9033\ubefe), invokevirtual:int(Enum<E>::ordinal, p0:\u8709\u12cb\u8df4\u61a4\u9a18\u3776[expected:Enum<\u8709\u12cb\u8df4\u61a4\u9a18\u3776>]))) {
                        case 1:
                            invokevirtual:void(\u4ab3\u6d99\u3d64\uc246\uc229\ud7e8<String, JsonElement>::\u385b\uc2bd\u59ec\u3e2a\u8350\u67d0, getstatic:\u4ab3\u6d99\u3d64\uc246\uc229\ud7e8<String, JsonElement>(\u88c5\u8c8a\uf94d\ub6ab\u51fa\uf94d::\uae87\u4ab3\u6fb0\ub1b9\u4c2b\ucb79), var_5_73:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getfield:String(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u3e75\uf94d\u8753\u3c25\u927d\u6d99, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))
                            looporswitchbreak()
                        
                        case 2:
                            goto(Label_2187)
                        
                        case 3:
                            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_5_73:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u4ab3\ub32d\u72f1\u873d\u9a18\uf995[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Float>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ua61f\u5fe1\uc84e\u7049\u62da\u51fa), invokestatic:Float(Float::valueOf, getfield:float(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\ud217\u92ee\u64ab\u156b\u8350\u3711, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>)))
                            goto(Label_1496)
                        
                        case 4:
                            invokevirtual:void(\u4ab3\u6d99\u3d64\uc246\uc229\ud7e8<String, JsonElement>::\u385b\uc2bd\u59ec\u3e2a\u8350\u67d0, getstatic:\u4ab3\u6d99\u3d64\uc246\uc229\ud7e8<String, JsonElement>(\u88c5\u8c8a\uf94d\ub6ab\u51fa\uf94d::\uae87\u4ab3\u6fb0\ub1b9\u4c2b\ucb79), var_5_73:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getfield:String(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u3e75\uf94d\u8753\u3c25\u927d\u6d99, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))
                            goto(Label_1662)
                        
                        case 5:
                            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_5_73:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b::\u93a2\u3c25\u446c\ubf56\u6d99\ubcb0, getfield:\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u4c2b\uc2bd\ub70c\u8cae\ua3b4\uc29a, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))))
                            goto(Label_1834)
                        
                        case 6:
                            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_5_73:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Byte>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u7330\u16f6\ucfaf\u6435\u8753\u4cd9), invokestatic:Byte(Byte::valueOf, i2b:byte(invokespecial:int(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\ua068\u527a\u97b7\u97e6\ua61f\u97e6, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))))
                            goto(Label_2187)
                    }
                }
                
                Label_0656:
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(285498711))
                    goto(Label_2187)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(651560885))
                    goto(Label_2035)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(107182850))
                    goto(Label_1834)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_1662)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_1496)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_1347)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1184)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1869692125))
                    goto(Label_1010)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(411149167))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-852917518))
                        loopcontinue()
                    }
                    
                    var_3_61 = and:int(var_3_61:int, ldc:int(-273698753))
                    invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_5_73:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u4ab3\ub32d\u72f1\u873d\u9a18\uf995[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Float>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ua61f\u5fe1\uc84e\u7049\u62da\u51fa), invokestatic:Float(Float::valueOf, getfield:float(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\ud217\u92ee\u64ab\u156b\u8350\u3711, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>)))
                }
                
                Label_0827:
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-682210015))
                    goto(Label_2187)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1422344607))
                    goto(Label_2035)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_1834)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(353475382))
                    goto(Label_1662)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(1)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-1287582243))
                    goto(Label_1496)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1858562563))
                    goto(Label_1347)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_1184)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(33554432)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0656)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-254528386))
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-867278917))
                        goto(Label_0267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61 = and:int(var_3_61:int, ldc:int(169666507))
                    invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_5_73:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b::\u93a2\u3c25\u446c\ubf56\u6d99\ubcb0, getfield:\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u4c2b\uc2bd\ub70c\u8cae\ua3b4\uc29a, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))))
                }
                
                Label_1010:
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-1592619977))
                    goto(Label_2187)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_2035)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(64)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-1455618399))
                    goto(Label_1834)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-464677322))
                    goto(Label_1662)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(580241197))
                    goto(Label_1496)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1347)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(134217728)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(589699244))
                        goto(Label_0656)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(715008196))
                        loopcontinue()
                    }
                    
                    var_3_61 = and:int(var_3_61:int, ldc:int(462187215))
                    invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_5_73:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4::\u873d\uc3e3\uf9c5\u4975\u392e\ud171, getfield:\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u600f\u8df4\u8350\u3a62\uc2e8\u873d, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))))
                }
                
                Label_1184:
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(347410043))
                    goto(Label_2187)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-902017858))
                    goto(Label_2035)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_1834)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1662)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1496)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1010)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-1869638566))
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(566921530))
                        goto(Label_0656)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(353277410))
                        goto(Label_0267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61 = and:int(var_3_61:int, ldc:int(267348907))
                    invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_5_73:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Byte>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u7330\u16f6\ucfaf\u6435\u8753\u4cd9), invokestatic:Byte(Byte::valueOf, i2b:byte(invokespecial:int(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>::\ua068\u527a\u97b7\u97e6\ua61f\u97e6, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))))
                }
                
                Label_1347:
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_2187)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_2035)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_1834)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1662)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(329606987))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(234344951))
                        goto(Label_1184)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1010)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0656)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(1596452925))
                        goto(Label_2187)
                    }
                    
                    loopcontinue()
                }
                
                Label_1496:
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_2187)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-1788627596))
                    goto(Label_2035)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_1834)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(64)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1606465716))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1184)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1010)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(269253323))
                        goto(Label_0656)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(1626459176))
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-1425848124))
                        goto(Label_0267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-631889939))
                        goto(Label_2187)
                    }
                    
                    loopcontinue()
                }
                
                Label_1662:
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_2187)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_2035)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(277112663))
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(1786431796))
                        goto(Label_1184)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1010)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(2034932827))
                        goto(Label_0656)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-1677981756))
                        goto(Label_0267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(763449686))
                        loopcontinue()
                    }
                    
                    var_3_61 = and:int(var_3_61:int, ldc:int(-1692644535))
                    goto(Label_2187)
                }
                
                Label_1834:
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1224324455))
                    goto(Label_2187)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(32768)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1662)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(1507188763))
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(1672699372))
                        goto(Label_1184)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(2076036109))
                        goto(Label_1010)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-324913315))
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-488986804))
                        goto(Label_0656)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-552279996))
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-250878692))
                        goto(Label_0267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(2143977119))
                        loopcontinue()
                    }
                    
                    var_3_61 = and:int(var_3_61:int, ldc:int(-1365389235))
                    invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_5_73:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4::\u873d\uc3e3\uf9c5\u4975\u392e\ud171, getfield:\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u600f\u8df4\u8350\u3a62\uc2e8\u873d, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))))
                }
                
                Label_2035:
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(536870912)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1662)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1184)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(79440936))
                        goto(Label_1010)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0656)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-1107872214))
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-2079558701))
                        goto(Label_0267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61 = and:int(var_3_61:int, ldc:int(994927657))
                }
                
                Label_2187:
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_2035)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_1834)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(2089345057))
                    goto(Label_1662)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_1496)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1768146768))
                    goto(Label_1347)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(64)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(853762164))
                    goto(Label_1184)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(8)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1396307755))
                    goto(Label_1010)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1209326688))
                    goto(Label_0827)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0656)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0438)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-1672417138))
                    goto(Label_0267)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_61 = and:int(var_3_61:int, ldc:int(138895699))
            }
            
            var_3_61 = and:int(var_3_61:int, ldc:int(-343002757))
            stack_938_0 = var_5_73:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            var_3_61 = and:int(var_3_61:int, ldc:int(-1684053463))
            return:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(stack_938_0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
        }
        catch (java.lang.Exception var_5_93D) {
            invokevirtual:void(Throwable::printStackTrace, var_5_93D:Exception[expected:Throwable])
            return:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(aconstnull:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4())
        }
    }
    
    private int \ua068\u527a\u97b7\u97e6\ua61f\u97e6() {
        var_1_61 : int
        var_3_69 : int
        var_4_73 : Iterator<\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe>
        
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
            var_1_61 = and:int(ldc:int(-1963769675), ldc:int(-289491722))
            var_3_69 = and:int(ldc:int(15653), ldc:int(-15654))
            var_4_73 = invokeinterface:Iterator<\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe>(Set<\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe>::iterator, getfield:Set<\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe>(\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9::\u4c2b\u8df4\uceb8\u9033\u0a06\u3e2a, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-537486428))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_73:Iterator<\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe>))) {
                    looporswitchbreak()
                }
                
                var_3_69 = or:int(var_3_69:int, invokevirtual:int(\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe::\ucef1\ud7e8\u12b2\ua61f\uceb8\u47c2, checkcast:\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe(\u12b2\u7049\u8df4\uc9f6\uae87.\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe.class, invokeinterface:\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe(Iterator<\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe>::next, var_4_73:Iterator<\u5bc4\ud36e\u0800\u516c\ud12e\ud4fe>))))
            }
            
            return:int(var_3_69:int)
        }
        
        goto(Label_0006)
    }
    
    private static java.util.UUID lambda$\u839e\u3504\ua562\u9a18\ub171\uf94d$0(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p0) {
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
            return:UUID(invokevirtual:UUID(\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52::\u4179\u5fe1\ub102\u3d64\u960f\u34df, invokestatic:\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u3776\uf9c5\u3d4b\u72f1\u647c\ubf56), p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709))
        }
        
        goto(Label_0006)
    }
    
    public void \u64f2\u5bc4\u59ec\ub171\u6bb9\u3d4b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_67D : int
        
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
        var_3_672 = and:int(ldc:int(-1540307629), ldc:int(-547433010))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4179\ud171\u4f52\u8c8a\u3e2a\u67e9<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(-1489252369))
            var_5_81 = and:int(ldc:int(-32218), ldc:int(14681))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(6736), ldc:int(-7761)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_672:int, ldc:int(-726272713))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(16640), ldc:int(16641)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(-7680), ldc:int(-7679)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_D1:int, ldc:int(-1489838174))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(16776), ldc:int(16777)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1054541072))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(675925051))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-557566003))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(380555518))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2006544073))
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1115842232))
                    }
                    else {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1099827725))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2003288513))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(2122508578))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-946211526))
                        var_11_E2 = and:int(ldc:int(24801), ldc:int(-25314))
                        goto(Label_1517)
                    }
                    
                    Label_0568:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1633156788))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1767837569))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1269104773))
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(357702305))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1637303213))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1617225125))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1908685329))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(631878785))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2096258056))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1109531137))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1031238231))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1398250368))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-372473393))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1109385673))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-2020556584))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-316873449))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(86), ldc:int(87))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(15370106))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1078839459))
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1939880613))
                        var_11_E2 = and:int(ldc:int(-27405), ldc:int(11020))
                    }
                    
                    Label_1101:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(508970771))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-174518695))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1145568083))
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1909825034))
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(420596668))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1714658484))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1401093674))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-306649325))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1380)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_1101)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-282494219))
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-2106599792))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(794445545))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1208892034))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1517)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1380:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1271984353))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1693127476))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-212912999))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1666243629))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(-1761945713))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1517:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1528:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1120670445))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1847003971))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(397469238))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(690710294))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1865209004))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1376060001))
                        var_17_67D = add:int(var_16_110:int, xor:int(ldc:int(16421), ldc:int(16420)))
                        looporswitchbreak()
                    }
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(-2057965789))
                
                if (cmple:boolean(var_5_81 = var_17_67D:int, sub:int(var_6_88:int, and:int(ldc:int(18977), ldc:int(9289))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
