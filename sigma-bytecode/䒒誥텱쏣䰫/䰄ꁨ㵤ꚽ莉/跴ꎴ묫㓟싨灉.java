public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T> {
    public void \u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049() {
        var_3_73 : int
        var_4_DB : int
        var_5_DE : int
        var_3_B1 : ImmutableList$Builder
        
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
            invokespecial:\u8cae\ub83f\u8c8a\u7c6b\u8389\u7d52(\u8cae\ub83f\u8c8a\u7c6b\u8389\u7d52::<init>, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>)
            putfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049::\u8bb0\u16f6\uc2bd\u8308\u36d3\u873d, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>, newarray:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e.class, ldc:int(8)))
            var_3_73 = and:int(ldc:int(10396), ldc:int(-10461))
            
            while (cmplt:boolean(var_3_73:int, arraylength:int(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049::\u8bb0\u16f6\uc2bd\u8308\u36d3\u873d, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>)))) {
                var_4_DB = and:int(ldc:int(26397), ldc:int(-30560))
                
                if (cmpne:boolean(var_5_DE = var_3_73:int, xor:int(ldc:int(1), ldc:int(3)))) {
                    if (cmpeq:boolean(var_3_73:int, xor:int(ldc:int(5888), ldc:int(5891)))) {
                        var_4_DB = ldc:int(24)
                        var_5_DE = ldc:int(19)
                    }
                }
                else {
                    var_4_DB = ldc:int(24)
                    var_5_DE = ldc:int(10)
                }
                
                invokevirtual:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, storeelement:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049::\u8bb0\u16f6\uc2bd\u8308\u36d3\u873d, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>), var_3_73:int, initobject:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::<init>, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>[expected:\uc910\uc29a\u527a\u6c56\u34df\u6d69], var_4_DB:int, var_5_DE:int)), ldc:float(-4.0f), i2f:float(add:int(ldc:int(16), var_3_73:int)), ldc:float(-4.0f), ldc:float(8.0f), ldc:float(1.0f), ldc:float(8.0f))
                inc:int(var_3_73, ldc:int(1))
            }
            
            invokevirtual:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, putfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049::\u647c\u67d0\u8709\u9937\u12cb\u16f6, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>, initobject:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::<init>, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>[expected:\uc910\uc29a\u527a\u6c56\u34df\u6d69], and:int(ldc:int(20897), ldc:int(-29182)), ldc:int(16))), ldc:float(-2.0f), ldc:float(18.0f), ldc:float(-2.0f), ldc:float(4.0f), ldc:float(4.0f), ldc:float(4.0f))
            var_3_B1 = invokestatic:ImmutableList$Builder(ImmutableList::builder)
            invokevirtual:ImmutableList$Builder(ImmutableList$Builder::add, var_3_B1:ImmutableList$Builder, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[expected:Object](\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049::\u647c\u67d0\u8709\u9937\u12cb\u16f6, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>))
            invokevirtual:ImmutableList$Builder(ImmutableList$Builder::addAll, var_3_B1:ImmutableList$Builder, invokestatic:List<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>[expected:Iterable](Arrays::asList, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049::\u8bb0\u16f6\uc2bd\u8308\u36d3\u873d, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>)))
            putfield:ImmutableList<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>(\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049::\u52d3\uc2bd\ub1b9\u6d69\u2dcc\u8258, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>, invokevirtual:ImmutableList(ImmutableList$Builder::build, var_3_B1:ImmutableList$Builder))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\ud158\u8350\u183a\u516c\ubcb0(T extends \u51b2\u6fb0\ufcaf\u61a4\u0800.\u5db4\u71f1\u600f\u67d0\u0b8e p0, float p1, float p2, float p3, float p4, float p5) {
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
    
    public void \u6d69\u61a4\uceb8\ud217\u8d98\uc246(T extends \u51b2\u6fb0\ufcaf\u61a4\u0800.\u5db4\u71f1\u600f\u67d0\u0b8e p0, float p1, float p2, float p3) {
        var_7_70 : float
        var_8_87 : int
        
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
            var_7_70 = invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u494c\ub6ab\u8bb0\u8bb0\uc31c\uc31c, p3:float, getfield:float(\u5db4\u71f1\u600f\u67d0\u0b8e::\u71f1\uc238\u6c56\uff55\u1187\ua068, p0:T extends \u5db4\u71f1\u600f\u67d0\u0b8e[expected:\u5db4\u71f1\u600f\u67d0\u0b8e]), getfield:float(\u5db4\u71f1\u600f\u67d0\u0b8e::\u74b1\u3dd3\u9033\ucef1\u760c\u5bc4, p0:T extends \u5db4\u71f1\u600f\u67d0\u0b8e[expected:\u5db4\u71f1\u600f\u67d0\u0b8e]))
            
            if (cmplt:boolean(var_7_70:float, ldc:float(0.0f))) {
                var_7_70 = ldc:float(0.0f)
            }
            
            var_8_87 = and:int(ldc:int(17447), ldc:int(-23728))
            
            while (cmplt:boolean(var_8_87:int, arraylength:int(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049::\u8bb0\u16f6\uc2bd\u8308\u36d3\u873d, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>)))) {
                putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u494c\u600f\ubcb0\u5db4\u67e9\u5db4, loadelement:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049::\u8bb0\u16f6\uc2bd\u8308\u36d3\u873d, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>), var_8_87:int), mul:float(mul:float(i2f:float(neg:int(sub:int(and:int(ldc:int(5), ldc:int(15598)), var_8_87:int))), var_7_70:float), ldc:float(1.7f)))
                inc:int(var_8_87, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.google.common.collect.ImmutableList<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e> \uc87f\u3711\u183a\u156b\u5fe1\uf9c5() {
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
            return:ImmutableList<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>(getfield:ImmutableList<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>(\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049::\u52d3\uc2bd\ub1b9\u6d69\u2dcc\u8258, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Iterable \uc87f\u3711\u183a\u156b\u5fe1\uf9c5() {
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
            return:Iterable(invokevirtual:ImmutableList<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>[expected:Iterable](\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>::\uc87f\u3711\u183a\u156b\u5fe1\uf9c5, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>))
        }
        
        goto(Label_0006)
    }
    
    public void \u6d69\u61a4\uceb8\ud217\u8d98\uc246(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, float p1, float p2, float p3) {
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
            invokevirtual:void(\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<\u5db4\u71f1\u600f\u67d0\u0b8e>::\u6d69\u61a4\uceb8\ud217\u8d98\uc246, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>, checkcast:\u5db4\u71f1\u600f\u67d0\u0b8e(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u5db4\u71f1\u600f\u67d0\u0b8e.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\u5db4\u71f1\u600f\u67d0\u0b8e]), p1:float, p2:float, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\ud158\u8350\u183a\u516c\ubcb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, float p1, float p2, float p3, float p4, float p5) {
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
            invokevirtual:void(\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<\u5db4\u71f1\u600f\u67d0\u0b8e>::\u7bad\ud158\u8350\u183a\u516c\ubcb0, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>, checkcast:\u5db4\u71f1\u600f\u67d0\u0b8e(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u5db4\u71f1\u600f\u67d0\u0b8e.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\u5db4\u71f1\u600f\u67d0\u0b8e]), p1:float, p2:float, p3:float, p4:float, p5:float)
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
    
    public void \u4975\u6198\u516c\ubcb0\u7049\u4f4a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5DF : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5EA : int
        
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
        var_3_5DF = and:int(ldc:int(-1336355438), ldc:int(-657368039))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8df4\ua3b4\ubb2b\u34df\uc2e8\u7049<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(16384)), ldc:int(0))) {
            var_3_5DF = and:int(var_3_5DF:int, ldc:int(834533105))
            var_5_7D = and:int(ldc:int(2609), ldc:int(-10868))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20250), ldc:int(1817)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5DF:int, ldc:int(-252027557))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(72), ldc:int(73)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(5140), ldc:int(5141)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5DF = and:int(var_3_D2:int, ldc:int(-1839270803))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(97), ldc:int(129)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-190367975))
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1014)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(1794468644))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1702624508))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(1065080257))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1564563509))
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1651109770))
                        goto(Label_1014)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(1023847655))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(78537859))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(1572289749))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1442741091))
                            loopcontinue()
                        }
                        
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1709476418))
                        var_11_E3 = and:int(ldc:int(20644), ldc:int(-20901))
                        goto(Label_1379)
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(85963424))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1014)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1638274827))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(530286769))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-803318427))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(861783697))
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1014)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(912723481))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-14479959))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-209595670))
                            loopcontinue()
                        }
                        
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1695457419))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-313383394))
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1674621914))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1014)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1880087235))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(1932717516))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(493974835))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(20514), ldc:int(20515))
                                goto(Label_1014)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(236657872))
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-151412551))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(1517518209))
                        var_11_E3 = and:int(ldc:int(-13626), ldc:int(5425))
                    }
                    
                    Label_1014:
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(1909600114))
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1498997562))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(1831528724))
                            loopcontinue()
                        }
                        
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(307320539))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1249)
                            }
                        }
                    }
                    
                    Label_1122:
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-209065280))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1352058291))
                            goto(Label_1014)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-2115880913))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1252609593))
                            loopcontinue()
                        }
                        
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1823026150))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1379)
                    }
                    
                    Label_1249:
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(995936444))
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-2069080575))
                        goto(Label_1014)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(972931610))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-895619850))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5DF = and:int(var_3_5DF:int, ldc:int(-4522647))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1379:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5EA = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1390:
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(347065514))
                        goto(Label_1014)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(795782718))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1086324343))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-389197453))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-930595108))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-145727726))
                        var_17_5EA = add:int(var_16_111:int, xor:int(ldc:int(5192), ldc:int(5193)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1223174796))
                
                if (cmple:boolean(var_5_7D = var_17_5EA:int, sub:int(var_6_84:int, and:int(ldc:int(3113), ldc:int(337))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(2048)), ldc:int(0))) {
            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1010679053))
            goto(Label_0106)
        }
    }
}
