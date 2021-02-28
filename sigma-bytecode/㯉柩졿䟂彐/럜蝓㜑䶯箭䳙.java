public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9 {
    public void \ub7dc\u8753\u3711\u4daf\u7bad\u4cd9(int p0, int p1, int p2, int p3, int p4, int p5) {
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
            invokespecial:Object(Object::<init>, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9)
            putfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u718f\ud158\u5d20\u6435\uc3e3\ud217, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9, p0:int)
            putfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u64f2\u965f\u71f1\u56bd\ubff1\uc7fe, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9, p1:int)
            putfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\uc2bd\ud51e\u5fe1\u3a62\u7d52\ub70c, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9, p2:int)
            putfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ub83f\uf995\uf995\u8c8a\u0b8e\u6ec6, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9, add:int(sub:int(p3:int, p0:int), xor:int(ldc:int(9216), ldc:int(9217))))
            putfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u61a4\u5f50\uceb8\uf94d\uf9c5\u8308, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9, add:int(sub:int(p4:int, p1:int), xor:int(ldc:int(10376), ldc:int(10377))))
            putfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u3e2a\ud523\u0a06\u8cae\u7049\u71f1, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9, add:int(sub:int(p5:int, p2:int), xor:int(ldc:int(2560), ldc:int(2561))))
            putfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\uc84e\u56bd\u759a\u0c95\u6fb0\u516c, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9, mul:int(mul:int(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ub83f\uf995\uf995\u8c8a\u0b8e\u6ec6, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u61a4\u5f50\uceb8\uf94d\uf9c5\u8308, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9)), getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u3e2a\ud523\u0a06\u8cae\u7049\u71f1, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u2dcc\uc7fe\u836c\ua61f\uae5d\ud171() {
        var_3_86 : int
        
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
        
        if (cmpne:boolean(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ubded\ubb2b\u6cfe\ud217\u839e\u0b8e, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\uc84e\u56bd\u759a\u0c95\u6fb0\u516c, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9))) {
            putfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ua61f\u9af2\u5f50\u71f1\uff55\ubcb0, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9, rem:int(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ubded\ubb2b\u6cfe\ud217\u839e\u0b8e, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ub83f\uf995\uf995\u8c8a\u0b8e\u6ec6, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9)))
            var_3_86 = div:int(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ubded\ubb2b\u6cfe\ud217\u839e\u0b8e, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ub83f\uf995\uf995\u8c8a\u0b8e\u6ec6, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9))
            putfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ud523\u392e\uf9c5\u12cb\ud158\u4daf, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9, rem:int(var_3_86:int, getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u61a4\u5f50\uceb8\uf94d\uf9c5\u8308, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9)))
            putfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ud12e\u6fb0\u446c\uafe7\u3bd6\ub1b9, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9, div:int(var_3_86:int, getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u61a4\u5f50\uceb8\uf94d\uf9c5\u8308, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9)))
            putfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ubded\ubb2b\u6cfe\ud217\u839e\u0b8e, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9, add:int(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ubded\ubb2b\u6cfe\ud217\u839e\u0b8e, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), and:int(ldc:int(12449), ldc:int(3595))))
            return:boolean(and:int[expected:boolean](ldc:int(21665), ldc:int(8211)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(21916), ldc:int(-30109)))
    }
    
    public int \u51b2\ufe34\uc229\u40a9\u647c\ufe34() {
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
            return:int(add:int(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u718f\ud158\u5d20\u6435\uc3e3\ud217, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ua61f\u9af2\u5f50\u71f1\uff55\ubcb0, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9)))
        }
        
        goto(Label_0006)
    }
    
    public int \u3e75\uc31c\u76bc\ub70c\u156b\u98a4() {
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
            return:int(add:int(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u64f2\u965f\u71f1\u56bd\ubff1\uc7fe, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ud523\u392e\uf9c5\u12cb\ud158\u4daf, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9)))
        }
        
        goto(Label_0006)
    }
    
    public int \uae5d\u97b7\ucfaf\u61a4\u8d90\ud51e() {
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
            return:int(add:int(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\uc2bd\ud51e\u5fe1\u3a62\u7d52\ub70c, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ud12e\u6fb0\u446c\uafe7\u3bd6\ub1b9, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9)))
        }
        
        goto(Label_0006)
    }
    
    public int \ud36e\u7c6b\u67d0\u4f4a\u72f1\u8cae() {
        var_1_1B2 : int
        var_3_67 : int
        
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
            var_1_1B2 = and:int(ldc:int(-1175955162), ldc:int(686600159))
            var_3_67 = and:int(ldc:int(7568), ldc:int(-7577))
            
            if (cmpne:boolean(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ua61f\u9af2\u5f50\u71f1\uff55\ubcb0, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), ldc:int(0))) {
                if (cmpne:boolean(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ua61f\u9af2\u5f50\u71f1\uff55\ubcb0, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), sub:int(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ub83f\uf995\uf995\u8c8a\u0b8e\u6ec6, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), and:int(ldc:int(4105), ldc:int(529))))) {
                    goto(Label_0205)
                }
            }
            
            Label_0111:
            
            if (cmpne:boolean(and:int(var_1_1B2:int, ldc:int(1073741824)), ldc:int(0))) {
                var_1_1B2 = and:int(var_1_1B2:int, ldc:int(-572123461))
                goto(Label_0394)
            }
            
            if (cmpeq:boolean(and:int(var_1_1B2:int, ldc:int(2048)), ldc:int(0))) {
                var_1_1B2 = and:int(var_1_1B2:int, ldc:int(471462547))
                goto(Label_0338)
            }
            
            if (cmpeq:boolean(and:int(var_1_1B2:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_1B2 = and:int(var_1_1B2:int, ldc:int(-1493742084))
                goto(Label_0261)
            }
            
            if (cmpne:boolean(and:int(var_1_1B2:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_1B2 = and:int(var_1_1B2:int, ldc:int(-1959991607))
            }
            else {
                var_1_1B2 = and:int(var_1_1B2:int, ldc:int(-294826114))
                inc:int(var_3_67, ldc:int(1))
            }
            
            Label_0205:
            
            if (cmpne:boolean(and:int(var_1_1B2:int, ldc:int(1048576)), ldc:int(0))) {
                var_1_1B2 = and:int(var_1_1B2:int, ldc:int(-1501287486))
                goto(Label_0394)
            }
            
            if (cmpeq:boolean(and:int(var_1_1B2:int, ldc:int(524288)), ldc:int(0))) {
                var_1_1B2 = and:int(var_1_1B2:int, ldc:int(189188367))
                goto(Label_0338)
            }
            
            if (cmpne:boolean(and:int(var_1_1B2:int, ldc:int(524288)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_1B2:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0111)
                }
                
                var_1_1B2 = and:int(var_1_1B2:int, ldc:int(-278382186))
                
                if (cmpne:boolean(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ud523\u392e\uf9c5\u12cb\ud158\u4daf, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), ldc:int(0))) {
                    if (cmpne:boolean(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ud523\u392e\uf9c5\u12cb\ud158\u4daf, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), sub:int(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u61a4\u5f50\uceb8\uf94d\uf9c5\u8308, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), xor:int(ldc:int(14352), ldc:int(14353))))) {
                        goto(Label_0338)
                    }
                }
            }
            
            Label_0261:
            
            if (cmpne:boolean(and:int(var_1_1B2:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0394)
            }
            
            if (cmpne:boolean(and:int(var_1_1B2:int, ldc:int(536870912)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_1B2:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0205)
                }
                
                if (cmpeq:boolean(and:int(var_1_1B2:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_1B2 = and:int(var_1_1B2:int, ldc:int(-916960508))
                    goto(Label_0111)
                }
                
                var_1_1B2 = and:int(var_1_1B2:int, ldc:int(-1418835093))
                inc:int(var_3_67, ldc:int(1))
            }
            
            Label_0338:
            
            if (cmpeq:boolean(and:int(var_1_1B2:int, ldc:int(2097152)), ldc:int(0))) {
                var_1_1B2 = and:int(var_1_1B2:int, ldc:int(-1993716439))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_1B2:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0261)
                }
                
                if (cmpne:boolean(and:int(var_1_1B2:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0205)
                }
                
                if (cmpne:boolean(and:int(var_1_1B2:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_1B2 = and:int(var_1_1B2:int, ldc:int(-692466480))
                    goto(Label_0111)
                }
                
                var_1_1B2 = and:int(var_1_1B2:int, ldc:int(2129173622))
                
                if (cmpne:boolean(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ud12e\u6fb0\u446c\uafe7\u3bd6\ub1b9, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), ldc:int(0))) {
                    if (cmpne:boolean(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ud12e\u6fb0\u446c\uafe7\u3bd6\ub1b9, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), sub:int(getfield:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u3e2a\ud523\u0a06\u8cae\u7049\u71f1, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), xor:int(ldc:int(75), ldc:int(74))))) {
                        return:int(var_3_67:int)
                    }
                }
            }
            
            Label_0394:
            
            if (cmpeq:boolean(and:int(var_1_1B2:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0338)
            }
            
            if (cmpne:boolean(and:int(var_1_1B2:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0261)
            }
            
            if (cmpne:boolean(and:int(var_1_1B2:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0205)
            }
            
            if (cmpeq:boolean(and:int(var_1_1B2:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_1B2 = and:int(var_1_1B2:int, ldc:int(-1286911018))
                goto(Label_0111)
            }
            
            var_1_1B2 = and:int(var_1_1B2:int, ldc:int(-1200969322))
            inc:int(var_3_67, ldc:int(1))
            return:int(var_3_67:int)
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
    
    public void \u3e75\ubb2b\u7bad\u4daf\u6cfe\u8640(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61D : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_628 : int
        
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
        var_3_61D = and:int(ldc:int(-113928215), ldc:int(-692199433))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(-570433797))
            var_5_7D = and:int(ldc:int(4381), ldc:int(-20766))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(25963), ldc:int(-25964)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_61D:int, ldc:int(-243943441))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(12432), ldc:int(12433)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(8256), ldc:int(8257)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_61D = and:int(var_3_D2:int, ldc:int(-226625539))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(8289), ldc:int(4103)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1123916729))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1218971747))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2025545681))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1996372494))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(253925817))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1321230538))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-96651549))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1829656414))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(944100699))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1294685994))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-679510031))
                        var_11_E3 = and:int(ldc:int(-4551), ldc:int(4294))
                        goto(Label_1432)
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(648928548))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1957379103))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1506052673))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(130191515))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2039766078))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1507368467))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1041921420))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1132296613))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-725622791))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-860659346))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1494452004))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-562038797))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-848148815))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1893025912))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1406925856))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(336716764))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1790986543))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-213917705))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(8195), ldc:int(19725))
                                goto(Label_1059)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-226033165))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(361422255))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(268938281))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1203367517))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-109594627))
                        var_11_E3 = and:int(ldc:int(-23495), ldc:int(5062))
                    }
                    
                    Label_1059:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-619852550))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-241744834))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1507039372))
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1488278889))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-801808669))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1245260918))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(316481749))
                            goto(Label_1059)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1587293880))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-614576020))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-37923075))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1432)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1292:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-789039537))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1899887601))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-906749452))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(377568450))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1990865273))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1344518015))
                        loopcontinue()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(-604020763))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1432:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_628 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1443:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1761985665))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1790739927))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1964781282))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-777561435))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1210727158))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-570441729))
                        var_17_628 = add:int(var_16_111:int, and:int(ldc:int(513), ldc:int(17483)))
                        looporswitchbreak()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(-292435170))
                }
                
                var_3_61D = and:int(var_3_61D:int, ldc:int(-557852675))
                
                if (cmple:boolean(var_5_7D = var_17_628:int, sub:int(var_6_84:int, and:int(ldc:int(2051), ldc:int(81))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(1702159205))
            goto(Label_0106)
        }
    }
}
