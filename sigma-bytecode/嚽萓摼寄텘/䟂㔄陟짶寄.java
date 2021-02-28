public interface \u56bd\u8413\u647c\u5bc4\ud158.\u47c2\u3504\u965f\uc9f6\u5bc4 {
    \u5d20\u7043\u88c5\u5db4\uf94d.\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6 \uf995\u983f\u4c04\u3504\u40a9\ud158();
    
    void \uc3e3\ubcb0\u946b\u8aa5\u4975\ud523();
    
    void \u6435\u3d4b\u927d\u67e9\u4f52\ub7dc(int p0, byte p1);
    
    void \u8d90\u4c2b\ub1b9\u40a9\u12cb\ucfaf(int p0, short p1);
    
    void \ud171\u0c95\ub7dc\ud217\ua562\u647c(int p0, float p1);
    
    \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \u8d90\u9255\u3bd6\u5d20\ub83f\u1187(double p0, double p1, double p2) {
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
        
        if (cmpeq:boolean(invokevirtual:\u64ab\u760c\u416d\u88c5\uc31c\u36d3(\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6::\u8709\u3dd3\u8c8a\uc29a\ucef1\u3e75, invokeinterface:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6(\u47c2\u3504\u965f\uc9f6\u5bc4::\uf995\u983f\u4c04\u3504\u40a9\ud158, this:\u47c2\u3504\u965f\uc9f6\u5bc4)), getstatic:\u64ab\u760c\u416d\u88c5\uc31c\u36d3(\u64ab\u760c\u416d\u88c5\uc31c\u36d3::\u8c8a\u6cfe\u6d99\u64f2\u6c56\u0a06))) {
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\ud171\u0c95\ub7dc\ud217\ua562\u647c, this:\u47c2\u3504\u965f\uc9f6\u5bc4, and:int(ldc:int(3628), ldc:int(-3629)), d2f:float(p0:double))
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\ud171\u0c95\ub7dc\ud217\ua562\u647c, this:\u47c2\u3504\u965f\uc9f6\u5bc4, xor:int(ldc:int(-20224), ldc:int(-20220)), d2f:float(p1:double))
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\ud171\u0c95\ub7dc\ud217\ua562\u647c, this:\u47c2\u3504\u965f\uc9f6\u5bc4, ldc:int(8), d2f:float(p2:double))
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\uc3e3\ubcb0\u946b\u8aa5\u4975\ud523, this:\u47c2\u3504\u965f\uc9f6\u5bc4)
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(this:\u47c2\u3504\u965f\uc9f6\u5bc4[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102])
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>))
    }
    
    \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \ub70c\u600f\u93a2\uc910\u9937\u946b(int p0, int p1, int p2, int p3) {
        var_7_69 : \u67e9\u99f7\ucfaf\u156b\u3504\u6ec6
        
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
        var_7_69 = invokeinterface:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6(\u47c2\u3504\u965f\uc9f6\u5bc4::\uf995\u983f\u4c04\u3504\u40a9\ud158, this:\u47c2\u3504\u965f\uc9f6\u5bc4)
        
        if (cmpne:boolean(invokevirtual:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a(\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6::\u5245\ubf56\u6d99\u9033\u8413\u7873, var_7_69:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6), getstatic:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a(\u97e6\u52d3\u5bc4\u647c\u516c\uc29a::\u8aa5\u7bad\u7873\u67e9\u67d0\u071d))) {
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(this:\u47c2\u3504\u965f\uc9f6\u5bc4[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102])
        }
        
        if (cmpeq:boolean(invokevirtual:\u64ab\u760c\u416d\u88c5\uc31c\u36d3(\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6::\u8709\u3dd3\u8c8a\uc29a\ucef1\u3e75, var_7_69:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6), getstatic:\u64ab\u760c\u416d\u88c5\uc31c\u36d3(\u64ab\u760c\u416d\u88c5\uc31c\u36d3::\u6d99\u4c2b\ub1b9\u4e72\uc9f6\u4f52))) {
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc, this:\u47c2\u3504\u965f\uc9f6\u5bc4, and:int(ldc:int(-7223), ldc:int(7222)), i2b:byte(p0:int))
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc, this:\u47c2\u3504\u965f\uc9f6\u5bc4, and:int(ldc:int(339), ldc:int(4097)), i2b:byte(p1:int))
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc, this:\u47c2\u3504\u965f\uc9f6\u5bc4, and:int(ldc:int(2902), ldc:int(17546)), i2b:byte(p2:int))
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc, this:\u47c2\u3504\u965f\uc9f6\u5bc4, xor:int(ldc:int(-7680), ldc:int(-7677)), i2b:byte(p3:int))
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\uc3e3\ubcb0\u946b\u8aa5\u4975\ud523, this:\u47c2\u3504\u965f\uc9f6\u5bc4)
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(this:\u47c2\u3504\u965f\uc9f6\u5bc4[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102])
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>))
    }
    
    \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \u946b\uf995\ufe34\u1833\ua61f\uc246(float p0, float p1) {
        var_5_66 : \u67e9\u99f7\ucfaf\u156b\u3504\u6ec6
        
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
        var_5_66 = invokeinterface:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6(\u47c2\u3504\u965f\uc9f6\u5bc4::\uf995\u983f\u4c04\u3504\u40a9\ud158, this:\u47c2\u3504\u965f\uc9f6\u5bc4)
        
        if (logicalor:boolean(cmpne:boolean(invokevirtual:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a(\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6::\u5245\ubf56\u6d99\u9033\u8413\u7873, var_5_66:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6), getstatic:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a(\u97e6\u52d3\u5bc4\u647c\u516c\uc29a::\u76bc\u9af2\u927d\ud7e8\u5bc4\ud4fe)), cmpne:boolean(invokevirtual:int(\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6::\u446c\u6cfe\ucfaf\u4f4a\u5d20\u759a, var_5_66:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6), ldc:int(0)))) {
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(this:\u47c2\u3504\u965f\uc9f6\u5bc4[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102])
        }
        
        if (cmpeq:boolean(invokevirtual:\u64ab\u760c\u416d\u88c5\uc31c\u36d3(\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6::\u8709\u3dd3\u8c8a\uc29a\ucef1\u3e75, var_5_66:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6), getstatic:\u64ab\u760c\u416d\u88c5\uc31c\u36d3(\u64ab\u760c\u416d\u88c5\uc31c\u36d3::\u8c8a\u6cfe\u6d99\u64f2\u6c56\u0a06))) {
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\ud171\u0c95\ub7dc\ud217\ua562\u647c, this:\u47c2\u3504\u965f\uc9f6\u5bc4, and:int(ldc:int(2472), ldc:int(-23033)), p0:float)
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\ud171\u0c95\ub7dc\ud217\ua562\u647c, this:\u47c2\u3504\u965f\uc9f6\u5bc4, xor:int(ldc:int(8296), ldc:int(8300)), p1:float)
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\uc3e3\ubcb0\u946b\u8aa5\u4975\ud523, this:\u47c2\u3504\u965f\uc9f6\u5bc4)
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(this:\u47c2\u3504\u965f\uc9f6\u5bc4[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102])
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>))
    }
    
    \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \u12b2\u6b0d\ub102\u6fb0\u600f\uc7fe(int p0, int p1) {
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
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u47c2\u3504\u965f\uc9f6\u5bc4::\ua562\u7330\ub113\u64ab\u6d69\u5fe1, this:\u47c2\u3504\u965f\uc9f6\u5bc4, i2s:short(p0:int), i2s:short(p1:int), xor:int(ldc:int(520), ldc:int(521))))
        }
        
        goto(Label_0006)
    }
    
    \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \u56bd\ube23\u99f7\ubf56\u64ab\ud12e(int p0, int p1) {
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
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u47c2\u3504\u965f\uc9f6\u5bc4::\ua562\u7330\ub113\u64ab\u6d69\u5fe1, this:\u47c2\u3504\u965f\uc9f6\u5bc4, i2s:short(p0:int), i2s:short(p1:int), xor:int(ldc:int(-29568), ldc:int(-29566))))
        }
        
        goto(Label_0006)
    }
    
    \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \ua562\u7330\ub113\u64ab\u6d69\u5fe1(short p0, short p1, int p2) {
        var_6_69 : \u67e9\u99f7\ucfaf\u156b\u3504\u6ec6
        
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
        var_6_69 = invokeinterface:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6(\u47c2\u3504\u965f\uc9f6\u5bc4::\uf995\u983f\u4c04\u3504\u40a9\ud158, this:\u47c2\u3504\u965f\uc9f6\u5bc4)
        
        if (logicalor:boolean(cmpne:boolean(invokevirtual:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a(\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6::\u5245\ubf56\u6d99\u9033\u8413\u7873, var_6_69:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6), getstatic:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a(\u97e6\u52d3\u5bc4\u647c\u516c\uc29a::\u76bc\u9af2\u927d\ud7e8\u5bc4\ud4fe)), cmpne:boolean(invokevirtual:int(\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6::\u446c\u6cfe\ucfaf\u4f4a\u5d20\u759a, var_6_69:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6), p2:int))) {
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(this:\u47c2\u3504\u965f\uc9f6\u5bc4[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102])
        }
        
        if (cmpeq:boolean(invokevirtual:\u64ab\u760c\u416d\u88c5\uc31c\u36d3(\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6::\u8709\u3dd3\u8c8a\uc29a\ucef1\u3e75, var_6_69:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6), getstatic:\u64ab\u760c\u416d\u88c5\uc31c\u36d3(\u64ab\u760c\u416d\u88c5\uc31c\u36d3::\ua562\uae87\u6b5f\ub83f\u9af2\u93a2))) {
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\u8d90\u4c2b\ub1b9\u40a9\u12cb\ucfaf, this:\u47c2\u3504\u965f\uc9f6\u5bc4, and:int(ldc:int(-27979), ldc:int(27978)), p0:short)
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\u8d90\u4c2b\ub1b9\u40a9\u12cb\ucfaf, this:\u47c2\u3504\u965f\uc9f6\u5bc4, and:int(ldc:int(4102), ldc:int(9299)), p1:short)
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\uc3e3\ubcb0\u946b\u8aa5\u4975\ud523, this:\u47c2\u3504\u965f\uc9f6\u5bc4)
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(this:\u47c2\u3504\u965f\uc9f6\u5bc4[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102])
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>))
    }
    
    \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \u4179\uc7fe\ub8be\u64f2\ua068\u8389(float p0, float p1, float p2) {
        var_6_69 : \u67e9\u99f7\ucfaf\u156b\u3504\u6ec6
        
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
        var_6_69 = invokeinterface:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6(\u47c2\u3504\u965f\uc9f6\u5bc4::\uf995\u983f\u4c04\u3504\u40a9\ud158, this:\u47c2\u3504\u965f\uc9f6\u5bc4)
        
        if (cmpne:boolean(invokevirtual:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a(\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6::\u5245\ubf56\u6d99\u9033\u8413\u7873, var_6_69:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6), getstatic:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a(\u97e6\u52d3\u5bc4\u647c\u516c\uc29a::\uc2bd\u52d3\ub102\u3e2a\ub6ab\u4ab3))) {
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(this:\u47c2\u3504\u965f\uc9f6\u5bc4[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102])
        }
        
        if (cmpeq:boolean(invokevirtual:\u64ab\u760c\u416d\u88c5\uc31c\u36d3(\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6::\u8709\u3dd3\u8c8a\uc29a\ucef1\u3e75, var_6_69:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6), getstatic:\u64ab\u760c\u416d\u88c5\uc31c\u36d3(\u64ab\u760c\u416d\u88c5\uc31c\u36d3::\u873d\u3c25\u156b\u7873\ub7dc\u3c25))) {
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc, this:\u47c2\u3504\u965f\uc9f6\u5bc4, and:int(ldc:int(29704), ldc:int(-29705)), invokestatic:byte(\u47c2\u3504\u965f\uc9f6\u5bc4::\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179, p0:float))
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc, this:\u47c2\u3504\u965f\uc9f6\u5bc4, xor:int(ldc:int(-30720), ldc:int(-30719)), invokestatic:byte(\u47c2\u3504\u965f\uc9f6\u5bc4::\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179, p1:float))
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc, this:\u47c2\u3504\u965f\uc9f6\u5bc4, and:int(ldc:int(4162), ldc:int(8210)), invokestatic:byte(\u47c2\u3504\u965f\uc9f6\u5bc4::\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179, p2:float))
            invokeinterface:void(\u47c2\u3504\u965f\uc9f6\u5bc4::\uc3e3\ubcb0\u946b\u8aa5\u4975\ud523, this:\u47c2\u3504\u965f\uc9f6\u5bc4)
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(this:\u47c2\u3504\u965f\uc9f6\u5bc4[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102])
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>))
    }
    
    byte \u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(float p0) {
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
            return:byte(i2b:byte(and:int(f2i:int(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, p0:float, ldc:float(-1.0f), ldc:float(1.0f)), ldc:float(127.0f))), and:int(ldc:int(19711), ldc:int(767)))))
        }
        
        goto(Label_0006)
    }
}
