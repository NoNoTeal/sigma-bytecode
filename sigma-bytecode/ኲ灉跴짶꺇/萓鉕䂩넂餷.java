public class \u12b2\u7049\u8df4\uc9f6\uae87.\u8413\u9255\u40a9\ub102\u9937 {
    public void \u8413\u9255\u40a9\ub102\u9937() {
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
            invokespecial:Object(Object::<init>, this:\u8413\u9255\u40a9\ub102\u9937)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8413\u9255\u40a9\ub102\u9937(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_4_6F : List<\u7d52\u718f\u3776\u6fb0\ub83f>
        var_5_85 : int
        
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
            invokespecial:Object(Object::<init>, this:\u8413\u9255\u40a9\ub102\u9937)
            putfield:int(\u8413\u9255\u40a9\ub102\u9937::\u8aa5\u3c25\u416d\u8258\uceb8\ub6ab, this:\u8413\u9255\u40a9\ub102\u9937, invokevirtual:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uc84e\u2dcc\u873d\u8389\ufcaf, p0:\u7d52\u718f\u3776\u6fb0\ub83f))
            var_4_6F = invokevirtual:List<\u7d52\u718f\u3776\u6fb0\ub83f>(\u7d52\u718f\u3776\u6fb0\ub83f::\u983f\u4f4a\ub6ab\u3e75\u5140\u7bad, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            putfield:int[](\u8413\u9255\u40a9\ub102\u9937::\u8d90\u4cd9\u3bc9\u8413\u385b\u0a06, this:\u8413\u9255\u40a9\ub102\u9937, newarray:int[](int.class, invokeinterface:int(List<E>::size, var_4_6F:List<\u7d52\u718f\u3776\u6fb0\ub83f>)))
            var_5_85 = and:int(ldc:int(6384), ldc:int(-7665))
            
            while (cmplt:boolean(var_5_85:int, invokeinterface:int(List<E>::size, var_4_6F:List<\u7d52\u718f\u3776\u6fb0\ub83f>))) {
                storeelement:int(getfield:int[](\u8413\u9255\u40a9\ub102\u9937::\u8d90\u4cd9\u3bc9\u8413\u385b\u0a06, this:\u8413\u9255\u40a9\ub102\u9937), var_5_85:int, invokevirtual:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uc84e\u2dcc\u873d\u8389\ufcaf, checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(List<\u7d52\u718f\u3776\u6fb0\ub83f>::get, var_4_6F:List<\u7d52\u718f\u3776\u6fb0\ub83f>, var_5_85:int))))
                inc:int(var_5_85, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u718f\ub19c\ubff1\u8aa5\ubb2b\ud7e8(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
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
            putfield:int(\u8413\u9255\u40a9\ub102\u9937::\u8aa5\u3c25\u416d\u8258\uceb8\ub6ab, this:\u8413\u9255\u40a9\ub102\u9937, invokevirtual:int(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u6bb9\ub19c\u760c\ucef1\u3776\uf9c5, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
            putfield:int[](\u8413\u9255\u40a9\ub102\u9937::\u8d90\u4cd9\u3bc9\u8413\u385b\u0a06, this:\u8413\u9255\u40a9\ub102\u9937, invokevirtual:int[](\u98a4\uafe7\uc3e3\ua6bd\u8640::\u760c\u98a4\ub113\u64f2\u6cfe\u927d, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8308\u3bd6\u8389\u7bad\u62da\u873d(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
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
            invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u927d\u718f\u494c\u6c56\u52d3\u36d3, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, getfield:int(\u8413\u9255\u40a9\ub102\u9937::\u8aa5\u3c25\u416d\u8258\uceb8\ub6ab, this:\u8413\u9255\u40a9\ub102\u9937))
            invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u1187\u8d90\u4c2b\u34df\u64f2\uf995, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, getfield:int[](\u8413\u9255\u40a9\ub102\u9937::\u8d90\u4cd9\u3bc9\u8413\u385b\u0a06, this:\u8413\u9255\u40a9\ub102\u9937))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3dd3\u759a\u8cae\u59ec\u446c\u71f1(\ud36e\u6bb9\u960f\u4c04\u64ab.\u5d20\u4f52\ud523\uc84e\u0800\u6ec6 p0) {
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
            invokeinterface:void(\u5d20\u4f52\ud523\uc84e\u0800\u6ec6::\ub1b9\u4bc8\ud7e8\u0c95\u4cd9\u93a2, p0:\u5d20\u4f52\ud523\uc84e\u0800\u6ec6, this:\u8413\u9255\u40a9\ub102\u9937)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int[] \u183a\u6435\u8d98\u7ce1\u3d4b\u7873() {
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
            return:int[](getfield:int[](\u8413\u9255\u40a9\ub102\u9937::\u8d90\u4cd9\u3bc9\u8413\u385b\u0a06, this:\u8413\u9255\u40a9\ub102\u9937))
        }
        
        goto(Label_0006)
    }
    
    public int \u836c\u5245\u69d9\ub113\u494c\u4f52() {
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
            return:int(getfield:int(\u8413\u9255\u40a9\ub102\u9937::\u8aa5\u3c25\u416d\u8258\uceb8\ub6ab, this:\u8413\u9255\u40a9\ub102\u9937))
        }
        
        goto(Label_0006)
    }
    
    public void \u3dd3\u759a\u8cae\u59ec\u446c\u71f1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u446c\u7c6b\u8bb0\u4975\u76bc p0) {
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
            invokevirtual:void(\u8413\u9255\u40a9\ub102\u9937::\u3dd3\u759a\u8cae\u59ec\u446c\u71f1, this:\u8413\u9255\u40a9\ub102\u9937, checkcast:\u5d20\u4f52\ud523\uc84e\u0800\u6ec6(\ud36e\u6bb9\u960f\u4c04\u64ab.\u5d20\u4f52\ud523\uc84e\u0800\u6ec6.class, p0:\u446c\u7c6b\u8bb0\u4975\u76bc[expected:\u5d20\u4f52\ud523\uc84e\u0800\u6ec6]))
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
    
    public void \u873d\ubded\u071d\u67e9\u8d90\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5D2 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5DD : int
        
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
        var_3_5D2 = and:int(ldc:int(246628150), ldc:int(-556128906))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8413\u9255\u40a9\ub102\u9937[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(16)), ldc:int(0))) {
            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1550269628))
        }
        else {
            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-569038978))
            var_5_85 = and:int(ldc:int(-11143), ldc:int(8966))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9766), ldc:int(-10023)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5D2:int, ldc:int(235973970))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(4631), ldc:int(3297)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(8715), ldc:int(3153)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5D2 = and:int(var_3_D2:int, ldc:int(-1361463974))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(2593), ldc:int(2592)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1812918159))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(913740969))
                        goto(Label_1228)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(788475589))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-682565616))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-2134142723))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1288796091))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(122279979))
                        goto(Label_1228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1825780312))
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1292584999))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(693877358))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1266178330))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-2110515412))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(416335101))
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-38639717))
                        var_11_E3 = and:int(ldc:int(476), ldc:int(-477))
                        goto(Label_1375)
                    }
                    
                    Label_0573:
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1228)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(590352941))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1062319999))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-308193496))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(543035247))
                        goto(Label_1228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-530447999))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1610876190))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(782300476))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(802678070))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1228)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-988118119))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-59316941))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(561), ldc:int(560))
                                goto(Label_0995)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1228)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1016926140))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1327115575))
                        var_11_E3 = and:int(ldc:int(29154), ldc:int(-29672))
                    }
                    
                    Label_0995:
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1280228865))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-960392986))
                        goto(Label_1228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1025206199))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-218335928))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-219915961))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1263116566))
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-312563845))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1228)
                            }
                        }
                    }
                    
                    Label_1122:
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(548867873))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1969613302))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1887455457))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1375)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1228:
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(410185047))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(628345828))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(219516486))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-600312486))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(511833624))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(2094265257))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-792617595))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5D2 = and:int(var_3_5D2:int, ldc:int(259419994))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1375:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5DD = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1386:
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1228)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1355910937))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1677441105))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1355790036))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-548034630))
                        var_17_5DD = add:int(var_16_111:int, and:int(ldc:int(14337), ldc:int(16707)))
                        looporswitchbreak()
                    }
                    
                    var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1699642339))
                }
                
                var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1382138049))
                
                if (cmple:boolean(var_5_85 = var_17_5DD:int, sub:int(var_6_8C:int, xor:int(ldc:int(17426), ldc:int(17427))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(256)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
