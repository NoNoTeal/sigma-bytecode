public class \u12b2\u7049\u8df4\uc9f6\uae87.\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E> {
    public static \u12b2\u7049\u8df4\uc9f6\uae87.\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E> \u8413\u760c\u8308\u76bc\u8350\u3c25() {
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
            return:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>(initobject:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>(\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>::<init>))
        }
        
        goto(Label_0006)
    }
    
    public static \u12b2\u7049\u8df4\uc9f6\uae87.\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E> \ua61f\ub19c\u4492\u8df4\u6198\u5db4(int p0, E p1) {
        var_4_69 : Object[]
        
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
            invokestatic:Object(Validate::notNull, p1:E[expected:Object])
            var_4_69 = newarray:Object[](java.lang.Object.class, p0:int)
            invokestatic:void(Arrays::fill, var_4_69:Object[], p1:E[expected:Object])
            return:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>(initobject:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>(\u99f7\u8aa5\u8709\u52d3\u960f\u392e<Object>::<init>, invokestatic:List<E>(Arrays::asList, checkcast:E[](E[].class, var_4_69:E[][expected:Object[]])), p1:E[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    public static \u12b2\u7049\u8df4\uc9f6\uae87.\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E> \u4c2b\u7e3f\u64f2\u72f1\ud51e\u624e(E p0, E[] p1) {
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
            return:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>(initobject:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>(\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>::<init>, invokestatic:List<E>(Arrays::asList, p1:E[]), p0:E))
        }
        
        goto(Label_0006)
    }
    
    public void \u99f7\u8aa5\u8709\u52d3\u960f\u392e() {
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
            invokespecial:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<Object>(\u99f7\u8aa5\u8709\u52d3\u960f\u392e<Object>::<init>, this:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>, invokestatic:ArrayList[expected:List<Object>](Lists::newArrayList), aconstnull:Object())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u99f7\u8aa5\u8709\u52d3\u960f\u392e(java.util.List<E> p0, E p1) {
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
            invokespecial:AbstractList(AbstractList::<init>, this:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>)
            putfield:List<E>(\u99f7\u8aa5\u8709\u52d3\u960f\u392e::\u5bc4\ufcaf\u5140\u8cae\u8bb0\u5140, this:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>, p0:List<E>)
            putfield:E(\u99f7\u8aa5\u8709\u52d3\u960f\u392e::\u67d0\u4c04\u5654\uafe7\uc2bd\u983f, this:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>, p1:E)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public E get(int p0) {
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
            return:E(invokeinterface:E(List<E>::get, getfield:List<E>(\u99f7\u8aa5\u8709\u52d3\u960f\u392e::\u5bc4\ufcaf\u5140\u8cae\u8bb0\u5140, this:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>), p0:int))
        }
        
        goto(Label_0006)
    }
    
    public E set(int p0, E p1) {
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
            invokestatic:Object(Validate::notNull, p1:E[expected:Object])
            return:E(invokeinterface:E(List<E>::set, getfield:List<E>(\u99f7\u8aa5\u8709\u52d3\u960f\u392e::\u5bc4\ufcaf\u5140\u8cae\u8bb0\u5140, this:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>), p0:int, p1:E))
        }
        
        goto(Label_0006)
    }
    
    public void add(int p0, E p1) {
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
            invokestatic:Object(Validate::notNull, p1:E[expected:Object])
            invokeinterface:void(List<E>::add, getfield:List<E>(\u99f7\u8aa5\u8709\u52d3\u960f\u392e::\u5bc4\ufcaf\u5140\u8cae\u8bb0\u5140, this:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>), p0:int, p1:E)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public E remove(int p0) {
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
            return:E(invokeinterface:E(List<E>::remove, getfield:List<E>(\u99f7\u8aa5\u8709\u52d3\u960f\u392e::\u5bc4\ufcaf\u5140\u8cae\u8bb0\u5140, this:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>), p0:int))
        }
        
        goto(Label_0006)
    }
    
    public int size() {
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
            return:int(invokeinterface:int(List<E>::size, getfield:List<E>(\u99f7\u8aa5\u8709\u52d3\u960f\u392e::\u5bc4\ufcaf\u5140\u8cae\u8bb0\u5140, this:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>)))
        }
        
        goto(Label_0006)
    }
    
    public void clear() {
        var_1_5F : int
        var_3_73 : int
        
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
            var_1_5F = and:int(ldc:int(833386124), ldc:int(219608082))
            
            if (cmpne:boolean(getfield:E(\u99f7\u8aa5\u8709\u52d3\u960f\u392e::\u67d0\u4c04\u5654\uafe7\uc2bd\u983f, this:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>), aconstnull:E())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1601600548))
                var_3_73 = and:int(ldc:int(-23501), ldc:int(2828))
                
                while (cmplt:boolean(var_3_73:int, invokevirtual:int(\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>::size, this:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>))) {
                    invokevirtual:E(\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>::set, this:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>, var_3_73:int, getfield:E(\u99f7\u8aa5\u8709\u52d3\u960f\u392e::\u67d0\u4c04\u5654\uafe7\uc2bd\u983f, this:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>))
                    inc:int(var_3_73, ldc:int(1))
                }
            }
            else {
                invokespecial:void(AbstractList<E>::clear, this:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>[expected:AbstractList<E>])
            }
            
            return:void()
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
    
    public void \u74b1\ub171\u76bc\u4d85\u7c6b\u6c52(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63A : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_645 : int
        
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
        var_3_63A = and:int(ldc:int(-947412416), ldc:int(260487031))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<E>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(16384)), ldc:int(0))) {
            var_3_63A = and:int(var_3_63A:int, ldc:int(1342662256))
        }
        else {
            var_3_63A = and:int(var_3_63A:int, ldc:int(2079826642))
            var_5_85 = and:int(ldc:int(27141), ldc:int(-27142))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9624), ldc:int(-9625)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_63A:int, ldc:int(-1349009580))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(3155), ldc:int(769)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(1553), ldc:int(1)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_63A = and:int(var_3_D2:int, ldc:int(329164313))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(8704), ldc:int(8705)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1331)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1435234257))
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1050)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1195118065))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-1696105155))
                    }
                    else {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-1819303095))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(795515866))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-282012701))
                        goto(Label_1331)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1660045934))
                        goto(Label_1050)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(1672427405))
                            loopcontinue()
                        }
                        
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-337662995))
                        var_11_E3 = and:int(ldc:int(-31115), ldc:int(14594))
                        goto(Label_1451)
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-1023301042))
                        goto(Label_1331)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1146870654))
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-19487973))
                        goto(Label_1050)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-228852736))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-354983052))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(618336738))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63A = and:int(var_3_63A:int, ldc:int(998747868))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(865949657))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1331)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(492981781))
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-1674442499))
                        goto(Label_1050)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(-2146545893))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-1744918700))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-638806036))
                        goto(Label_1331)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1050)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(962173147))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(794768247))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(-1314728580))
                            loopcontinue()
                        }
                        
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1401878137))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(329), ldc:int(19))
                                goto(Label_1050)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(165879380))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-47083849))
                        goto(Label_1331)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(-322517775))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(-1533414497))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(738730590))
                            loopcontinue()
                        }
                        
                        var_3_63A = and:int(var_3_63A:int, ldc:int(265205347))
                        var_11_E3 = and:int(ldc:int(-25178), ldc:int(25169))
                    }
                    
                    Label_1050:
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-2108773945))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-848198077))
                        goto(Label_1331)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1332749644))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(1172334573))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(-770555136))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(-580059196))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(1297735256))
                            loopcontinue()
                        }
                        
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1205317280))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1331)
                            }
                        }
                    }
                    
                    Label_1195:
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(86800146))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(-1288011315))
                            goto(Label_1050)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(2000650928))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(504790586))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(-1295072967))
                            loopcontinue()
                        }
                        
                        var_3_63A = and:int(var_3_63A:int, ldc:int(395230070))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1451)
                    }
                    
                    Label_1331:
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-1232045303))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1050)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(450687695))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(475010656))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63A = and:int(var_3_63A:int, ldc:int(466004931))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1451:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_645 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1462:
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1331)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-504397256))
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1050)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-404007761))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-125209060))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-683689333))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1573879049))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1785147939))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(603893594))
                        var_17_645 = add:int(var_16_111:int, and:int(ldc:int(15105), ldc:int(16561)))
                        looporswitchbreak()
                    }
                    
                    var_3_63A = and:int(var_3_63A:int, ldc:int(1313599826))
                }
                
                var_3_63A = and:int(var_3_63A:int, ldc:int(2141104002))
                
                if (cmple:boolean(var_5_85 = var_17_645:int, sub:int(var_6_8C:int, xor:int(ldc:int(8256), ldc:int(8257))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
