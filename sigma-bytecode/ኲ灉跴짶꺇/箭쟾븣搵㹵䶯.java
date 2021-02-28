public class \u12b2\u7049\u8df4\uc9f6\uae87.\u7bad\uc7fe\ube23\u6435\u3e75\u4daf {
    public void \u7bad\uc7fe\ube23\u6435\u3e75\u4daf(long p0) {
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
            invokespecial:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::<init>, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, p0:long, xor:int[expected:boolean](ldc:int(4103), ldc:int(4102)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\uc7fe\ube23\u6435\u3e75\u4daf(long p0, boolean p1) {
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
        invokespecial:\u3bc9\ua562\u965f\u156b\ub32d\u64f2(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::<init>, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)
        putfield:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ua61f\ubf56\u7049\ud7e8\ua6bd\u3504, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, getstatic:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4::\u2dcc\ub83f\u839e\u8aa5\u8bb0\uc3e3))
        putfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, ldc:long(1L))
        
        if (cmpgt:boolean(p0:long, ldc:long(0L))) {
            putfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, p0:long)
            
            if (cmple:boolean(p0:long, i2l:long(invokestatic:int(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u3504\u8709\u36d3\u5245\uff55\u392e)))) {
                putfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, newarray:byte[](byte.class, l2i:int(p0:long)))
            }
            else {
                putfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, invokevirtual:long(Unsafe::allocateMemory, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), mul:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))))
                
                if (p1:boolean) {
                    invokevirtual:void(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::\uc2bd\u6bb9\u385b\u8df4\u6b5f\uc910, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2], p0:long)
                }
                
                invokestatic:Cleaner(Cleaner::create, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf[expected:Object], initobject:\uf9c5\u392e\u8d90\u4975\uc3e3\u9033[expected:Runnable](\uf9c5\u392e\u8d90\u4975\uc3e3\u9033::<init>, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)))
                invokestatic:void(\u416d\ub19c\ube23\uc246\u4c04\ub70c::\u7330\u5654\uc29a\ub102\ub70c\u6cfe, mul:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)))
            }
            
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:long), loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), and:int(ldc:int(-9868), ldc:int(9867)))))))
    }
    
    public void \u7bad\uc7fe\ube23\u6435\u3e75\u4daf(long p0, byte p1) {
        expr_92 : byte[] [generated]
        
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
        invokespecial:\u3bc9\ua562\u965f\u156b\ub32d\u64f2(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::<init>, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)
        putfield:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ua61f\ubf56\u7049\ud7e8\ua6bd\u3504, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, getstatic:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4::\u2dcc\ub83f\u839e\u8aa5\u8bb0\uc3e3))
        putfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, ldc:long(1L))
        
        if (cmpgt:boolean(p0:long, ldc:long(0L))) {
            putfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, p0:long)
            putfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, xor:int[expected:boolean](ldc:int(5125), ldc:int(5124)))
            expr_92 = newarray:byte[](byte.class, and:int(ldc:int(513), ldc:int(1029)))
            storeelement:byte(expr_92:byte[], and:int(ldc:int(-9321), ldc:int(9320)), p1:byte)
            putfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, expr_92:byte[])
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:long), loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), and:int(ldc:int(18856), ldc:int(-18857)))))))
    }
    
    public void \u7bad\uc7fe\ube23\u6435\u3e75\u4daf(byte[] p0) {
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
            invokespecial:\u3bc9\ua562\u965f\u156b\ub32d\u64f2(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::<init>, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)
            putfield:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ua61f\ubf56\u7049\ud7e8\ua6bd\u3504, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, getstatic:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4::\u2dcc\ub83f\u839e\u8aa5\u8bb0\uc3e3))
            putfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, ldc:long(1L))
            putfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, i2l:long(arraylength:int(p0:byte[])))
            putfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, p0:byte[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u12b2\u7049\u8df4\uc9f6\uae87.\u7bad\uc7fe\ube23\u6435\u3e75\u4daf clone() {
        var_3_7E : \u7bad\uc7fe\ube23\u6435\u3e75\u4daf
        
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
        
        if (logicalnot:boolean(getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
            var_3_7E = initobject:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::<init>, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int[expected:boolean](ldc:int(31232), ldc:int(-31305)))
            invokestatic:void(\ube23\u67d0\u3504\u0a06\u718f\uc910::\ub83f\u67e9\u8709\u76bc\ub6ab\u836c, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, ldc:long(0L), var_3_7E:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, ldc:long(0L), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))
            return:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf(var_3_7E:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)
        }
        
        return:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf(initobject:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::<init>, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), invokevirtual:byte(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, ldc:long(0L))))
    }
    
    public boolean equals(java.lang.Object p0) {
        var_2_5F : int
        stack_AA_0 : int [generated]
        
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
        var_2_5F = and:int(ldc:int(-516843779), ldc:int(-954952257))
        
        if (logicalnot:boolean(invokespecial:boolean(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::equals, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2], p0:Object))) {
            return:boolean(and:int[expected:boolean](ldc:int(2679), ldc:int(-11000)))
        }
        
        if (cmpne:boolean(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, checkcast:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf(\u12b2\u7049\u8df4\uc9f6\uae87.\u7bad\uc7fe\ube23\u6435\u3e75\u4daf.class, p0:Object[expected:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf])))) {
            var_2_5F = and:int(var_2_5F:int, ldc:int(-745482250))
            stack_AA_0 = and:int(ldc:int(1682), ldc:int(-1683))
        }
        else {
            stack_AA_0 = and:int(ldc:int(21637), ldc:int(8209))
        }
        
        return:boolean(stack_AA_0:int)
    }
    
    public int hashCode() {
        var_1_5F : int
        stack_8D_0 : int [generated]
        stack_8D_1 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(524916477), ldc:int(536082363))
            stack_8D_0 = mul:int(ldc:int(29), invokespecial:int(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::hashCode, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2]))
            
            if (cmpeq:boolean(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), aconstnull:byte[]())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1564735413))
                stack_8D_1 = and:int(ldc:int(-12250), ldc:int(10201))
            }
            else {
                stack_8D_1 = invokevirtual:int(Object::hashCode, getfield:byte[][expected:Object](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))
            }
            
            return:int(add:int(stack_8D_0:int, stack_8D_1:int))
        }
        
        goto(Label_0006)
    }
    
    public final java.lang.Byte \u0800\u8413\u3bc9\u3776\u392e\u4492(long p0) {
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
            return:Byte(invokestatic:Byte(Byte::valueOf, invokevirtual:byte(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, p0:long)))
        }
        
        goto(Label_0006)
    }
    
    public final java.lang.Byte \ua068\u12cb\ubf56\u34df\u3776\u385b(long p0) {
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
            return:Byte(invokestatic:Byte(Byte::valueOf, invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long))))
        }
        
        goto(Label_0006)
    }
    
    public final boolean \ub7dc\u9255\uf94d\u8df4\u3e75\u7af6(long p0) {
        var_3_10C : int
        stack_1D2_0 : int [generated]
        stack_174_0 : int [generated]
        stack_1E3_0 : int [generated]
        
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
            var_3_10C = and:int(ldc:int(-142801234), ldc:int(-547368468))
            
            if (cmpne:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                if (cmpeq:boolean(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long)), ldc:byte(0))) {
                    goto(Label_0298)
                }
                
                stack_1D2_0 = stack_174_0 = xor(ldc(1280), ldc(1281))
                goto(Label_0352)
            }
            
            Label_0105:
            
            if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0392)
            }
            
            if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0298)
            }
            
            if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(262144)), ldc:int(0))) {
                var_3_10C = and:int(var_3_10C:int, ldc:int(-1368837385))
                goto(Label_0220)
            }
            
            if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(67108864)), ldc:int(0))) {
                var_3_10C = and:int(var_3_10C:int, ldc:int(1576771349))
            }
            else {
                var_3_10C = and:int(var_3_10C:int, ldc:int(-10508236))
                
                if (getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)) {
                    if (cmpeq:boolean(loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(-25995), ldc:int(24970))), ldc:byte(0))) {
                        goto(Label_0392)
                    }
                    
                    stack_1D2_0 = stack_174_0 = xor(ldc(226), ldc(227))
                    goto(Label_0454)
                }
            }
            
            Label_0161:
            
            if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0392)
            }
            
            if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(268435456)), ldc:int(0))) {
                var_3_10C = and:int(var_3_10C:int, ldc:int(-883462691))
                goto(Label_0298)
            }
            
            if (cmpne:boolean(and:int(var_3_10C:int, ldc:int(262144)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_10C = and:int(var_3_10C:int, ldc:int(1363769918))
                    goto(Label_0105)
                }
                
                var_3_10C = and:int(var_3_10C:int, ldc:int(-681575010))
                
                if (cmpne:boolean(loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(p0:long)), ldc:byte(0))) {
                    stack_1E3_0 = and:int[expected:boolean](ldc:int(3329), ldc:int(8705))
                    return:boolean(stack_1E3_0:boolean)
                }
            }
            
            Label_0220:
            
            if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(4194304)), ldc:int(0))) {
                var_3_10C = and:int(var_3_10C:int, ldc:int(311759168))
                goto(Label_0392)
            }
            
            if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(32768)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(262144)), ldc:int(0))) {
                    var_3_10C = and:int(var_3_10C:int, ldc:int(147446609))
                    goto(Label_0161)
                }
                
                if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(32768)), ldc:int(0))) {
                    var_3_10C = and:int(var_3_10C:int, ldc:int(-580974340))
                    stack_1E3_0 = and:int[expected:boolean](ldc:int(2932), ldc:int(-19319))
                    return:boolean(stack_1E3_0:boolean[expected:int])
                }
                
                goto(Label_0105)
            }
            
            Label_0298:
            
            if (cmpne:boolean(and:int(var_3_10C:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0392)
            }
            
            if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0220)
            }
            
            if (cmpne:boolean(and:int(var_3_10C:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0161)
            }
            
            if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0105)
            }
            
            var_3_10C = and:int(var_3_10C:int, ldc:int(-142778821))
            stack_1D2_0 = stack_174_0 = and(ldc(-32747), ldc(32352))
            Label_0352:
            
            if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(2147483647)), ldc:int(0))) {
                var_3_10C = and:int(var_3_10C:int, ldc:int(909838742))
                goto(Label_0454)
            }
            
            return:boolean(stack_174_0:boolean)
            Label_0392:
            
            if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0298)
            }
            
            if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0220)
            }
            
            if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0161)
            }
            
            if (cmpeq:boolean(and:int(var_3_10C:int, ldc:int(262144)), ldc:int(0))) {
                var_3_10C = and:int(var_3_10C:int, ldc:int(-1174148339))
                goto(Label_0105)
            }
            
            var_3_10C = and:int(var_3_10C:int, ldc:int(-8555985))
            stack_1D2_0 = stack_174_0 = and(ldc(-17986), ldc(17985))
            Label_0454:
            
            if (cmpne:boolean(and:int(var_3_10C:int, ldc:int(2147483647)), ldc:int(0))) {
                return:boolean(stack_1D2_0:int)
            }
            
            goto(Label_0352)
        }
        
        goto(Label_0006)
    }
    
    public final byte \u600f\u8709\u760c\u64ab\u97e6\u5245(long p0) {
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
        
        if (cmpne:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
            return:byte(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long)))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
            return:byte(loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(p0:long)))
        }
        
        return:byte(loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(16414), ldc:int(-17439))))
    }
    
    public final short \u56bd\ub113\u5654\u965f\u7006\u5140(long p0) {
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
        
        if (cmpne:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
            return:short(i2s:short(and:int(and:int(ldc:int(9215), ldc:int(23807)), invokevirtual:byte[expected:int](Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long)))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
            return:short(i2s:short(and:int(and:int(ldc:int(1023), ldc:int(18687)), loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(p0:long)))))
        }
        
        return:short(i2s:short(and:int(xor:int(ldc:int(4144), ldc:int(4303)), loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(342), ldc:int(-16727))))))
    }
    
    public final short \ub32d\ud12e\uf9c5\ub83f\u16f6\u527a(long p0) {
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
        
        if (cmpne:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
            return:short(i2s:short(invokevirtual:byte[expected:int](Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
            return:short(i2s:short(loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(p0:long))))
        }
        
        return:short(i2s:short(loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(13489), ldc:int(-13490)))))
    }
    
    public final int \u99f7\u120d\u34df\u446c\ud4fe\u6cfe(long p0) {
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
        
        if (cmpne:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
            return:int(invokevirtual:byte[expected:int](Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long)))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
            return:int(loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(p0:long)))
        }
        
        return:int(loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(16581), ldc:int(-20694))))
    }
    
    public final long \u1187\u59ec\u72f1\u64ab\u8413\u67d0(long p0) {
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
        
        if (cmpne:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
            return:long(i2l:long(invokevirtual:byte[expected:int](Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
            return:long(i2l:long(loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(p0:long))))
        }
        
        return:long(i2l:long(loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(-11), ldc:int(10)))))
    }
    
    public final float \u5bc4\ucb79\ubf56\u74b1\u6ec6\u16f6(long p0) {
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
        
        if (cmpne:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
            return:float(i2f:float(invokevirtual:byte[expected:int](Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
            return:float(i2f:float(loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(p0:long))))
        }
        
        return:float(i2f:float(loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(12309), ldc:int(-12310)))))
    }
    
    public final double \ube23\u97b7\u4cd9\u8aa5\u7bad\ud158(long p0) {
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
        
        if (cmpne:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
            return:double(i2d:double(invokevirtual:byte[expected:int](Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
            return:double(i2d:double(loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(p0:long))))
        }
        
        return:double(i2d:double(loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(21782), ldc:int(-23992)))))
    }
    
    public final boolean[] \u51b2\ud12e\u8709\u67e9\u183a\ubded(boolean[] p0, long p1, long p2, long p3) {
        var_8_E7 : int
        var_8_26F : int
        var_10_235 : long
        var_12_276 : boolean[]
        var_8_4FE : int
        var_13_2CB : int
        var_14_338 : long
        var_16_396 : byte
        stack_51D_0 : boolean[] [generated]
        stack_3D2_0 : boolean[] [generated]
        stack_51D_1 : int [generated]
        stack_3D2_1 : int [generated]
        stack_3D2_2 : int [generated]
        stack_43A_0 : int [generated]
        var_8_438 : int
        var_17_43A : boolean
        var_18_43D : long
        var_16_4D6 : byte
        stack_51D_2 : int [generated]
        
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
        var_8_E7 = and:int(ldc:int(-1002912325), ldc:int(-541219008))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                goto(Label_0208)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_E7:int, ldc:int(524288)), ldc:int(0))) {
            var_8_E7 = and:int(var_8_E7:int, ldc:int(-1310148707))
            goto(Label_0486)
        }
        
        if (cmpeq:boolean(and:int(var_8_E7:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0391)
        }
        
        if (cmpne:boolean(and:int(var_8_E7:int, ldc:int(64)), ldc:int(0))) {
            var_8_E7 = and:int(var_8_E7:int, ldc:int(-1177389192))
            goto(Label_0269)
        }
        
        if (cmpeq:boolean(and:int(var_8_E7:int, ldc:int(8388608)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), xor:int(ldc:int(24836), ldc:int(24837)))))
        }
        
        Label_0208:
        
        if (cmpne:boolean(and:int(var_8_E7:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0486)
        }
        
        if (cmpeq:boolean(and:int(var_8_E7:int, ldc:int(1024)), ldc:int(0))) {
            var_8_E7 = and:int(var_8_E7:int, ldc:int(-568848674))
            goto(Label_0391)
        }
        
        if (cmpne:boolean(and:int(var_8_E7:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_8_E7:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_E7 = and:int(var_8_E7:int, ldc:int(-226937304))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0391)
                    }
                }
            }
        }
        
        Label_0269:
        
        if (cmpne:boolean(and:int(var_8_E7:int, ldc:int(64)), ldc:int(0))) {
            var_8_E7 = and:int(var_8_E7:int, ldc:int(-1579017627))
            goto(Label_0486)
        }
        
        if (cmpne:boolean(and:int(var_8_E7:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_E7:int, ldc:int(524288)), ldc:int(0))) {
                var_8_E7 = and:int(var_8_E7:int, ldc:int(-1983899704))
                goto(Label_0208)
            }
            
            if (cmpne:boolean(and:int(var_8_E7:int, ldc:int(2147483647)), ldc:int(0))) {
                athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), and:int(ldc:int(642), ldc:int(1058)))))
            }
            
            goto(Label_0107)
        }
        
        Label_0391:
        
        if (cmpeq:boolean(and:int(var_8_E7:int, ldc:int(524288)), ldc:int(0))) {
            var_8_E7 = and:int(var_8_E7:int, ldc:int(180966080))
        }
        else {
            if (cmpne:boolean(and:int(var_8_E7:int, ldc:int(131072)), ldc:int(0))) {
                var_8_E7 = and:int(var_8_E7:int, ldc:int(1009534045))
                goto(Label_0269)
            }
            
            if (cmpne:boolean(and:int(var_8_E7:int, ldc:int(131072)), ldc:int(0))) {
                var_8_E7 = and:int(var_8_E7:int, ldc:int(12045954))
                goto(Label_0208)
            }
            
            if (cmpeq:boolean(and:int(var_8_E7:int, ldc:int(2097152)), ldc:int(0))) {
                var_8_E7 = and:int(var_8_E7:int, ldc:int(-1148194005))
                goto(Label_0107)
            }
            
            var_8_E7 = and:int(var_8_E7:int, ldc:int(561989201))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), xor:int(ldc:int(4096), ldc:int(4099)))))
            }
        }
        
        Label_0486:
        
        if (cmpne:boolean(and:int(var_8_E7:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0391)
        }
        
        if (cmpne:boolean(and:int(var_8_E7:int, ldc:int(64)), ldc:int(0))) {
            var_8_E7 = and:int(var_8_E7:int, ldc:int(897339625))
            goto(Label_0269)
        }
        
        if (cmpeq:boolean(and:int(var_8_E7:int, ldc:int(524288)), ldc:int(0))) {
            var_8_E7 = and:int(var_8_E7:int, ldc:int(1049088031))
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_8_E7:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0107)
        }
        
        var_8_26F = and:int(var_8_E7:int, ldc:int(624854991))
        var_10_235 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_235:long, ldc:long(1073741824L))) {
            loop {
                if (cmpeq:boolean(and:int(var_8_26F:int, ldc:int(1024)), ldc:int(0))) {
                    var_8_26F = and:int(var_8_26F:int, ldc:int(1659724444))
                }
                else {
                    var_8_26F = and:int(var_8_26F:int, ldc:int(-671255290))
                    
                    if (cmpne:boolean(p0:boolean[], aconstnull:boolean[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:boolean[])), var_10_235:long)) {
                            var_12_276 = p0:boolean[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_8_26F:int, ldc:int(33554432)), ldc:int(0))) {
                    var_8_26F = and:int(var_8_26F:int, ldc:int(-138842897))
                    var_12_276 = newarray:boolean[](boolean.class, l2i:int(var_10_235:long))
                    looporswitchbreak()
                }
            }
            
            var_8_4FE = and:int(var_8_26F:int, ldc:int(-604384174))
            var_13_2CB = and:int(ldc:int(9692), ldc:int(-26589))
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                goto(Label_0726)
            }
            
            var_14_338 = p1:long
            
            loop {
                Label_0836:
                
                if (cmpeq:boolean(and:int(var_8_4FE:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_8_4FE = and:int(var_8_4FE:int, ldc:int(-943389563))
                }
                else {
                    var_8_4FE = and:int(var_8_4FE:int, ldc:int(-1367407572))
                    
                    if (cmplt:boolean(var_14_338:long, p2:long)) {
                        var_16_396 = invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), var_14_338:long))
                        stack_51D_0 = stack_3D2_0 = var_12_276
                        stack_51D_1 = stack_3D2_1 = var_13_2CB
                        inc:int(var_13_2CB, ldc:int(1))
                        
                        if (cmpeq:boolean(var_16_396:byte, ldc:byte(0))) {
                            goto(Label_0932)
                        }
                        
                        stack_3D2_2 = xor:int(ldc:int(18948), ldc:int(18949))
                        goto(Label_0970)
                    }
                }
                
                if (cmpeq:boolean(and:int(var_8_4FE:int, ldc:int(16777216)), ldc:int(0))) {
                    var_8_4FE = and:int(var_8_4FE:int, ldc:int(1090147332))
                    goto(Label_1178)
                }
                
                var_8_4FE = and:int(var_8_4FE:int, ldc:int(-946948380))
            }
            
            Label_0726:
            
            if (cmpne:boolean(and:int(var_8_4FE:int, ldc:int(4)), ldc:int(0))) {
                var_8_4FE = and:int(var_8_4FE:int, ldc:int(231815563))
                goto(Label_1178)
            }
            
            if (cmpne:boolean(and:int(var_8_4FE:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_1008)
            }
            
            if (cmpne:boolean(and:int(var_8_4FE:int, ldc:int(2147483647)), ldc:int(0))) {
                var_8_4FE = and:int(var_8_4FE:int, ldc:int(1576759210))
                
                if (getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)) {
                    if (cmpeq:boolean(loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(-18962), ldc:int(18961))), ldc:byte(0))) {
                        goto(Label_1008)
                    }
                    
                    stack_43A_0 = xor:int[expected:boolean](ldc:int(1185), ldc:int(1184))
                    goto(Label_1074)
                }
            }
            
            Label_0777:
            
            if (cmpeq:boolean(and:int(var_8_4FE:int, ldc:int(1024)), ldc:int(0))) {
                var_8_4FE = and:int(var_8_4FE:int, ldc:int(1504284415))
                goto(Label_1178)
            }
            
            if (cmpeq:boolean(and:int(var_8_4FE:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_1008)
            }
            
            if (cmpne:boolean(and:int(var_8_4FE:int, ldc:int(524288)), ldc:int(0))) {
                var_8_4FE = and:int(var_8_4FE:int, ldc:int(838501810))
                var_14_338 = p1:long
                goto(Label_1170)
            }
            
            goto(Label_0726)
            Label_0932:
            
            if (cmpne:boolean(and:int(var_8_4FE:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_1252)
            }
            
            var_8_4FE = and:int(var_8_4FE:int, ldc:int(-608368995))
            stack_3D2_2 = and:int(ldc:int(-18305), ldc:int(18304))
            Label_0970:
            var_8_4FE = and:int(var_8_4FE:int, ldc:int(1740355169))
            storeelement:boolean(stack_3D2_0:boolean[], stack_3D2_1:int, stack_3D2_2:boolean)
            var_14_338 = add:long(var_14_338:long, p3:long)
            goto(Label_0836)
            Label_1008:
            
            if (cmpne:boolean(and:int(var_8_4FE:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_1178)
            }
            
            if (cmpeq:boolean(and:int(var_8_4FE:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0777)
            }
            
            if (cmpne:boolean(and:int(var_8_4FE:int, ldc:int(33554432)), ldc:int(0))) {
                var_8_4FE = and:int(var_8_4FE:int, ldc:int(1463976297))
                goto(Label_0726)
            }
            
            var_8_4FE = and:int(var_8_4FE:int, ldc:int(-1090865964))
            stack_43A_0 = and:int[expected:boolean](ldc:int(-10525), ldc:int(8476))
            Label_1074:
            var_8_438 = and:int(var_8_4FE:int, ldc:int(440319226))
            var_17_43A = stack_43A_0:boolean
            var_18_43D = p1:long
            
            loop {
                if (cmpeq:boolean(and:int(var_8_438:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_8_438 = and:int(var_8_438:int, ldc:int(-2034363931))
                }
                else {
                    var_8_438 = and:int(var_8_438:int, ldc:int(-880816515))
                    
                    if (cmplt:boolean(var_18_43D:long, p2:long)) {
                        storeelement:boolean(var_12_276:boolean[], postincrement:int(1, var_13_2CB:int), var_17_43A:boolean)
                        var_18_43D = add:long(var_18_43D:long, p3:long)
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_438:int, ldc:int(1048576)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_8_4FE = and:int(var_8_438:int, ldc:int(-1288059445))
            goto(Label_1178)
            Label_1170:
            
            if (cmplt:boolean(var_14_338:long, p2:long)) {
                var_16_4D6 = loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(var_14_338:long))
                stack_51D_0 = stack_3D2_0 = var_12_276
                stack_51D_1 = stack_3D2_1 = var_13_2CB
                inc:int(var_13_2CB, ldc:int(1))
                
                if (cmpeq:boolean(var_16_4D6:byte, ldc:byte(0))) {
                    goto(Label_1252)
                }
                
                stack_51D_2 = xor:int[expected:boolean](ldc:int(4112), ldc:int(4113))
                goto(Label_1301)
            }
            
            Label_1178:
            
            if (cmpeq:boolean(and:int(var_8_4FE:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_1008)
            }
            
            if (cmpeq:boolean(and:int(var_8_4FE:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0777)
            }
            
            if (cmpne:boolean(and:int(var_8_4FE:int, ldc:int(33554432)), ldc:int(0))) {
                var_8_4FE = and:int(var_8_4FE:int, ldc:int(-120213361))
                goto(Label_0726)
            }
            
            return:boolean[](var_12_276:boolean[])
            Label_1252:
            
            if (cmpeq:boolean(and:int(var_8_4FE:int, ldc:int(1024)), ldc:int(0))) {
                var_8_4FE = and:int(var_8_4FE:int, ldc:int(595578696))
                goto(Label_0932)
            }
            
            var_8_4FE = and:int(var_8_4FE:int, ldc:int(427648150))
            stack_51D_2 = and:int[expected:boolean](ldc:int(17993), ldc:int(-17998))
            Label_1301:
            var_8_4FE = and:int(var_8_4FE:int, ldc:int(-885422785))
            storeelement:boolean(stack_51D_0:boolean[], stack_51D_1:int, stack_51D_2:boolean)
            var_14_338 = add:long(var_14_338:long, p3:long)
            goto(Label_1170)
        }
        
        return:boolean[](aconstnull:boolean[]())
    }
    
    public final boolean[] \u51b2\ud12e\u8709\u67e9\u183a\ubded() {
        var_1_61 : int
        var_1_25A : int
        var_3_7A : boolean[]
        stack_1D1_0 : int [generated]
        var_4_D6 : int
        stack_276_0 : boolean[] [generated]
        stack_276_1 : int [generated]
        stack_276_2 : int [generated]
        var_1_1D0 : int
        var_5_1DA : int
        var_5_14B : byte
        stack_176_0 : boolean[] [generated]
        stack_176_1 : int [generated]
        stack_176_2 : int [generated]
        
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
        var_1_61 = and:int(ldc:int(813408087), ldc:int(-1115819673))
        
        if (cmpgt:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(1073741824L))) {
            return:boolean[](aconstnull:boolean[]())
        }
        
        var_1_25A = and:int(var_1_61:int, ldc:int(2037512042))
        var_3_7A = newarray:boolean[](boolean.class, l2i:int(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)))
        
        if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
            loop {
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(268435456)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(672280430))
                    goto(Label_0400)
                }
                
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(134217728)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(-1313884841))
                    
                    if (getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)) {
                        if (cmpeq:boolean(loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(18008), ldc:int(-18041))), ldc:byte(0))) {
                            goto(Label_0400)
                        }
                        
                        stack_1D1_0 = xor:int(ldc:int(8208), ldc:int(8209))
                        looporswitchbreak()
                    }
                }
                
                Label_0169:
                
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(2041412538))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_25A = and:int(var_1_25A:int, ldc:int(130074299))
                        loopcontinue()
                    }
                    
                    var_1_25A = and:int(var_1_25A:int, ldc:int(-94243498))
                    var_4_D6 = and:int(ldc:int(10762), ldc:int(-10763))
                    
                    while (cmplt:boolean(i2l:long(var_4_D6:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                        stack_276_0 = var_3_7A:boolean[]
                        stack_276_1 = var_4_D6:int
                        
                        if (cmpeq:boolean(loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), var_4_D6:int), ldc:byte(0))) {
                            var_1_25A = and:int(var_1_25A:int, ldc:int(1958329682))
                            stack_276_2 = and:int[expected:boolean](ldc:int(13384), ldc:int(-13385))
                        }
                        else {
                            stack_276_2 = xor:int[expected:boolean](ldc:int(643), ldc:int(642))
                        }
                        
                        var_1_25A = and:int(var_1_25A:int, ldc:int(866513150))
                        storeelement:boolean(stack_276_0:boolean[], stack_276_1:int, stack_276_2:boolean)
                        inc:int(var_4_D6, ldc:int(1))
                    }
                    
                    goto(Label_0548)
                }
                
                Label_0400:
                
                if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(268435456)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(1660615683))
                    goto(Label_0169)
                }
                
                if (cmpne:boolean(and:int(var_1_25A:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_25A = and:int(var_1_25A:int, ldc:int(1923200879))
                    stack_1D1_0 = and:int(ldc:int(-32425), ldc:int(30216))
                    looporswitchbreak()
                }
                
                var_1_25A = and:int(var_1_25A:int, ldc:int(1377997388))
            }
            
            var_1_1D0 = and:int(var_1_25A:int, ldc:int(-1259998777))
            var_4_D6 = stack_1D1_0:int
            var_5_1DA = and:int(ldc:int(3493), ldc:int(-3494))
            
            loop {
                if (cmpne:boolean(and:int(var_1_1D0:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_1D0 = and:int(var_1_1D0:int, ldc:int(1034141278))
                    
                    if (cmplt:boolean(i2l:long(var_5_1DA:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                        storeelement:boolean(var_3_7A:boolean[], var_5_1DA:int, var_4_D6:boolean)
                        inc:int(var_5_1DA, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_1D0:int, ldc:int(2097152)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_1_25A = and:int(var_1_1D0:int, ldc:int(821548531))
            goto(Label_0548)
        }
        
        var_4_D6 = and:int(ldc:int(25878), ldc:int(-25888))
        Label_0238:
        
        while (cmpne:boolean(and:int(var_1_25A:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(4096)), ldc:int(0))) {
                var_1_25A = and:int(var_1_25A:int, ldc:int(-1677701968))
                goto(Label_0280)
            }
            
            var_1_25A = and:int(var_1_25A:int, ldc:int(-1111631530))
            
            if (cmpge:boolean(i2l:long(var_4_D6:boolean[expected:int]), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                goto(Label_0280)
            }
            
            var_5_14B = invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), i2l:long(var_4_D6:boolean[expected:int])))
            stack_176_0 = var_3_7A:boolean[]
            stack_176_1 = var_4_D6:int
            
            if (cmpeq:boolean(var_5_14B:byte, ldc:byte(0))) {
                var_1_25A = and:int(var_1_25A:int, ldc:int(-239738942))
                stack_176_2 = and:int[expected:boolean](ldc:int(-18634), ldc:int(18569))
            }
            else {
                stack_176_2 = and:int[expected:boolean](ldc:int(3095), ldc:int(20489))
            }
            
            var_1_25A = and:int(var_1_25A:int, ldc:int(-1251877046))
            storeelement:boolean(stack_176_0:boolean[], stack_176_1:int, stack_176_2:boolean)
            inc:int(var_4_D6, ldc:int(1))
        }
        
        goto(Label_0548)
        Label_0280:
        
        if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(268435456)), ldc:int(0))) {
            var_1_25A = and:int(var_1_25A:int, ldc:int(2101318593))
        }
        else {
            if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0238)
            }
            
            var_1_25A = and:int(var_1_25A:int, ldc:int(917363451))
        }
        
        Label_0548:
        
        if (cmpeq:boolean(and:int(var_1_25A:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0280)
        }
        
        if (cmpne:boolean(and:int(var_1_25A:int, ldc:int(8192)), ldc:int(0))) {
            var_1_25A = and:int(var_1_25A:int, ldc:int(-1292267112))
            goto(Label_0238)
        }
        
        return:boolean[](var_3_7A:boolean[])
    }
    
    public final byte[] \u6b5f\u36d3\u72f1\u61a4\uc4d2\u7d52() {
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
            return:byte[](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))
        }
        
        goto(Label_0006)
    }
    
    public final byte[] \u99f7\u6435\u72f1\ud4fe\u839e\u839e() {
        var_1_61 : int
        var_1_150 : int
        var_3_7A : byte[]
        var_4_140 : byte
        var_5_149 : int
        var_4_DF : int
        
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
        var_1_61 = and:int(ldc:int(576910476), ldc:int(-1226801738))
        
        if (cmple:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(1073741824L))) {
            var_1_150 = and:int(var_1_61:int, ldc:int(-1611305264))
            var_3_7A = newarray:byte[](byte.class, l2i:int(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)))
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                do {
                    if (cmpne:boolean(and:int(var_1_150:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_150 = and:int(var_1_150:int, ldc:int(281804553))
                    }
                    else {
                        var_1_150 = and:int(var_1_150:int, ldc:int(-957127551))
                        
                        if (logicalnot:boolean(getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                            loopcontinue()
                        }
                        
                        var_4_140 = loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(31636), ldc:int(-31703)))
                        var_5_149 = and:int(ldc:int(-28347), ldc:int(11960))
                        
                        loop {
                            var_1_150 = and:int(var_1_150:int, ldc:int(-903074394))
                            
                            if (cmpge:boolean(i2l:long(var_5_149:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                                looporswitchbreak()
                            }
                            
                            storeelement:byte(var_3_7A:byte[], var_5_149:int, var_4_140:byte)
                            inc:int(var_5_149, ldc:int(1))
                        }
                        
                        return:byte[](var_3_7A:byte[])
                    }
                } while (cmpne:boolean(and:int(var_1_150:int, ldc:int(8388608)), ldc:int(0)))
                
                invokestatic:void(System::arraycopy, getfield:byte[][expected:Object](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(1772), ldc:int(-5885)), var_3_7A:byte[][expected:Object], and:int(ldc:int(3411), ldc:int(-3412)), l2i:int(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)))
            }
            else {
                var_4_DF = and:int(ldc:int(24883), ldc:int(-28980))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_150:int, ldc:int(64)), ldc:int(0))) {
                        var_1_150 = and:int(var_1_150:int, ldc:int(1843843348))
                    }
                    else {
                        var_1_150 = and:int(var_1_150:int, ldc:int(41596351))
                        
                        if (cmplt:boolean(i2l:long(var_4_DF:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                            storeelement:byte(var_3_7A:byte[], var_4_DF:int, invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), i2l:long(var_4_DF:int))))
                            inc:int(var_4_DF, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_150:int, ldc:int(1024)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:byte[](var_3_7A:byte[])
        }
        
        return:byte[](aconstnull:byte[]())
    }
    
    public final byte[] \u99f7\u6435\u72f1\ud4fe\u839e\u839e(byte[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_260 : int
        var_10_228 : long
        var_12_267 : byte[]
        var_8_31C : int
        var_13_2BC : int
        var_14_2FA : long
        var_14_2F0 : long
        
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
        var_8_63 = and:int(ldc:int(-2060613726), ldc:int(-945835288))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                goto(Label_0229)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(128)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-910631076))
            goto(Label_0486)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1819887603))
            goto(Label_0413)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(693592106))
            goto(Label_0290)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4194304)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), and:int(ldc:int(8485), ldc:int(2123)))))
        }
        
        var_8_63 = and:int(var_8_63:int, ldc:int(-1395005994))
        Label_0229:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-799905487))
            goto(Label_0486)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0413)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-1779512675))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0413)
                    }
                }
            }
        }
        
        Label_0290:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(890984984))
            goto(Label_0486)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(128)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(875536500))
        }
        else {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0229)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
                athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), and:int(ldc:int(16386), ldc:int(338)))))
            }
            
            goto(Label_0107)
        }
        
        Label_0413:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-674058916))
                goto(Label_0290)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0229)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-231625829))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-25442607))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), and:int(ldc:int(8611), ldc:int(4175)))))
            }
        }
        
        Label_0486:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4194304)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-854597602))
            goto(Label_0413)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0290)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0229)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0107)
        }
        
        var_8_260 = and:int(var_8_63:int, ldc:int(-562306430))
        var_10_228 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_228:long, ldc:long(1073741824L))) {
            loop {
                if (cmpeq:boolean(and:int(var_8_260:int, ldc:int(67108864)), ldc:int(0))) {
                    var_8_260 = and:int(var_8_260:int, ldc:int(1288370383))
                }
                else {
                    var_8_260 = and:int(var_8_260:int, ldc:int(-984638735))
                    
                    if (cmpne:boolean(p0:byte[], aconstnull:byte[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:byte[])), var_10_228:long)) {
                            var_12_267 = p0:byte[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_260:int, ldc:int(67108864)), ldc:int(0))) {
                    var_8_260 = and:int(var_8_260:int, ldc:int(-950282276))
                    var_12_267 = newarray:byte[](byte.class, l2i:int(var_10_228:long))
                    looporswitchbreak()
                }
            }
            
            var_8_31C = and:int(var_8_260:int, ldc:int(-152243468))
            var_13_2BC = and:int(ldc:int(18881), ldc:int(-19960))
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                do {
                    if (cmpne:boolean(and:int(var_8_31C:int, ldc:int(32768)), ldc:int(0))) {
                        var_8_31C = and:int(var_8_31C:int, ldc:int(-601295939))
                        
                        if (logicalnot:boolean(getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                            loopcontinue()
                        }
                        
                        var_14_2FA = p1:long
                        goto(Label_0906)
                    }
                } while (cmpne:boolean(and:int(var_8_31C:int, ldc:int(16384)), ldc:int(0)))
                
                var_14_2F0 = p1:long
                
                while (cmplt:boolean(var_14_2F0:long, p2:long)) {
                    storeelement:byte(var_12_267:byte[], postincrement:int(1, var_13_2BC:int), loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(var_14_2F0:long)))
                    var_14_2F0 = add:long(var_14_2F0:long, p3:long)
                }
                
                return:byte[](var_12_267:byte[])
            }
            
            var_14_2FA = p1:long
            Label_0764:
            
            while (cmpne:boolean(and:int(var_8_31C:int, ldc:int(67108864)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_31C:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0906)
                }
                
                if (cmpne:boolean(and:int(var_8_31C:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0806)
                }
                
                var_8_31C = and:int(var_8_31C:int, ldc:int(-2063755298))
                
                if (cmpge:boolean(var_14_2FA:long, p2:long)) {
                    goto(Label_0806)
                }
                
                storeelement:byte(var_12_267:byte[], postincrement:int(1, var_13_2BC:int), invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), var_14_2FA:long)))
                var_14_2FA = add:long(var_14_2FA:long, p3:long)
            }
            
            goto(Label_0969)
            Label_0906:
            
            while (cmpne:boolean(and:int(var_8_31C:int, ldc:int(512)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_31C:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0806)
                }
                
                if (cmpne:boolean(and:int(var_8_31C:int, ldc:int(4194304)), ldc:int(0))) {
                    var_8_31C = and:int(var_8_31C:int, ldc:int(-895395481))
                    goto(Label_0764)
                }
                
                var_8_31C = and:int(var_8_31C:int, ldc:int(-843480069))
                
                if (cmpge:boolean(var_14_2FA:long, p2:long)) {
                    goto(Label_0969)
                }
                
                storeelement:byte(var_12_267:byte[], postincrement:int(1, var_13_2BC:int), loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(-7923), ldc:int(7858))))
                var_14_2FA = add:long(var_14_2FA:long, p3:long)
            }
            
            var_8_31C = and:int(var_8_31C:int, ldc:int(-545483811))
            goto(Label_0969)
            Label_0806:
            
            if (cmpne:boolean(and:int(var_8_31C:int, ldc:int(131072)), ldc:int(0))) {
                var_8_31C = and:int(var_8_31C:int, ldc:int(386828718))
            }
            else {
                if (cmpeq:boolean(and:int(var_8_31C:int, ldc:int(32768)), ldc:int(0))) {
                    var_8_31C = and:int(var_8_31C:int, ldc:int(-2098063037))
                    goto(Label_0906)
                }
                
                if (cmpne:boolean(and:int(var_8_31C:int, ldc:int(2147483647)), ldc:int(0))) {
                    return:byte[](var_12_267:byte[])
                }
                
                goto(Label_0764)
            }
            
            Label_0969:
            
            if (cmpeq:boolean(and:int(var_8_31C:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0906)
            }
            
            if (cmpne:boolean(and:int(var_8_31C:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0806)
            }
            
            if (cmpne:boolean(and:int(var_8_31C:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0764)
            }
            
            return:byte[](var_12_267:byte[])
        }
        
        return:byte[](aconstnull:byte[]())
    }
    
    public final short[] \ub70c\u62da\u3e75\ud7e8\u8c8a\ud4fe() {
        var_1_61 : int
        var_1_151 : int
        var_3_7A : short[]
        var_4_139 : short
        var_5_142 : int
        var_4_B7 : int
        var_4_CD : int
        
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
        var_1_61 = and:int(ldc:int(558896070), ldc:int(802232523))
        
        if (cmple:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(1073741824L))) {
            var_1_151 = and:int(var_1_61:int, ldc:int(770883050))
            var_3_7A = newarray:short[](short.class, l2i:int(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)))
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                loop {
                    if (cmpeq:boolean(and:int(var_1_151:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_151 = and:int(var_1_151:int, ldc:int(-1345038105))
                        
                        if (getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)) {
                            var_4_139 = i2s:short(loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(-5054), ldc:int(4781))))
                            var_5_142 = and:int(ldc:int(26710), ldc:int(-26711))
                            
                            loop {
                                if (cmpne:boolean(and:int(var_1_151:int, ldc:int(128)), ldc:int(0))) {
                                    var_1_151 = and:int(var_1_151:int, ldc:int(-211920686))
                                    
                                    if (cmplt:boolean(i2l:long(var_5_142:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                                        storeelement:short(var_3_7A:short[], var_5_142:int, var_4_139:short)
                                        inc:int(var_5_142, ldc:int(1))
                                        loopcontinue()
                                    }
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_151:int, ldc:int(268435456)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                var_1_151 = and:int(var_1_151:int, ldc:int(487842351))
                            }
                            
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_151:int, ldc:int(134217728)), ldc:int(0))) {
                        var_4_B7 = and:int(ldc:int(22795), ldc:int(-22812))
                        
                        while (cmplt:boolean(i2l:long(var_4_B7:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                            storeelement:short(var_3_7A:short[], var_4_B7:int, i2s:short(loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), var_4_B7:int)))
                            inc:int(var_4_B7, ldc:int(1))
                        }
                        
                        looporswitchbreak()
                    }
                    
                    var_1_151 = and:int(var_1_151:int, ldc:int(-1348552917))
                }
            }
            else {
                var_4_CD = and:int(ldc:int(9479), ldc:int(-9480))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_151:int, ldc:int(536870912)), ldc:int(0))) {
                        var_1_151 = and:int(var_1_151:int, ldc:int(-1479970423))
                    }
                    else {
                        var_1_151 = and:int(var_1_151:int, ldc:int(701872367))
                        
                        if (cmplt:boolean(i2l:long(var_4_CD:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                            storeelement:short(var_3_7A:short[], var_4_CD:int, i2s:short(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), i2l:long(var_4_CD:int)))))
                            inc:int(var_4_CD, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_151:int, ldc:int(1048576)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_151 = and:int(var_1_151:int, ldc:int(-2141296726))
                }
            }
            
            return:short[](var_3_7A:short[])
        }
        
        return:short[](aconstnull:short[]())
    }
    
    public final short[] \ub70c\u62da\u3e75\ud7e8\u8c8a\ud4fe(short[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_23C : int
        var_10_24B : long
        var_8_28F : int
        var_12_296 : short[]
        var_8_36D : int
        var_13_2EB : int
        var_14_340 : long
        var_14_336 : long
        
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
        var_8_63 = and:int(ldc:int(-37943126), ldc:int(-1075947152))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                goto(Label_0218)
            }
        }
        
        Label_0107:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1449115500))
            goto(Label_0508)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0424)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1328507372))
            goto(Label_0291)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(16)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), xor:int(ldc:int(-32502), ldc:int(-32501)))))
        }
        
        var_8_63 = and:int(var_8_63:int, ldc:int(1172453425))
        Label_0218:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0508)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(131072)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-835516470))
            goto(Label_0424)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-688268019))
        }
        else {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(2113751479))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0424)
                    }
                }
            }
        }
        
        Label_0291:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(67108864)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(701890851))
            goto(Label_0508)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(33554432)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-311234397))
        }
        else {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0218)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(337221670))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), xor:int(ldc:int(4), ldc:int(6)))))
        }
        
        Label_0424:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(372187023))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0291)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(156070995))
                goto(Label_0218)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(269279299))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(1574489891))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), xor:int(ldc:int(-15350), ldc:int(-15351)))))
            }
        }
        
        Label_0508:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1024)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1675643692))
            goto(Label_0424)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0291)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0218)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1292804768))
            goto(Label_0107)
        }
        
        var_8_23C = and:int(var_8_63:int, ldc:int(-1078137693))
        var_10_24B = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_24B:long, ldc:long(1073741824L))) {
            loop {
                if (cmpeq:boolean(and:int(var_8_23C:int, ldc:int(524288)), ldc:int(0))) {
                    var_8_28F = and:int(var_8_23C:int, ldc:int(1858007974))
                }
                else {
                    var_8_28F = and:int(var_8_23C:int, ldc:int(1572473002))
                    
                    if (cmpne:boolean(p0:short[], aconstnull:short[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:short[])), var_10_24B:long)) {
                            var_12_296 = p0:short[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_28F:int, ldc:int(268435456)), ldc:int(0))) {
                    var_8_28F = and:int(var_8_28F:int, ldc:int(1570656048))
                    var_12_296 = newarray:short[](short.class, l2i:int(var_10_24B:long))
                    looporswitchbreak()
                }
                
                var_8_23C = and:int(var_8_28F:int, ldc:int(935710330))
            }
            
            var_8_36D = and:int(var_8_28F:int, ldc:int(1073650472))
            var_13_2EB = and:int(ldc:int(-27556), ldc:int(27041))
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                loop {
                    if (cmpne:boolean(and:int(var_8_36D:int, ldc:int(16)), ldc:int(0))) {
                        var_8_36D = and:int(var_8_36D:int, ldc:int(1365531261))
                    }
                    else {
                        var_8_36D = and:int(var_8_36D:int, ldc:int(2109242301))
                        
                        if (getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)) {
                            var_14_340 = p1:long
                            goto(Label_1001)
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_8_36D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_14_336 = p1:long
                        
                        while (cmplt:boolean(var_14_336:long, p2:long)) {
                            storeelement:short(var_12_296:short[], postincrement:int(1, var_13_2EB:int), i2s:short(loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(var_14_336:long))))
                            var_14_336 = add:long(var_14_336:long, p3:long)
                        }
                        
                        return:short[](var_12_296:short[])
                    }
                    
                    var_8_36D = and:int(var_8_36D:int, ldc:int(-1484184713))
                }
            }
            else {
                var_14_340 = p1:long
            }
            
            Label_0834:
            
            while (cmpne:boolean(and:int(var_8_36D:int, ldc:int(32)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_36D:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_8_36D = and:int(var_8_36D:int, ldc:int(1877030604))
                    goto(Label_1001)
                }
                
                if (cmpne:boolean(and:int(var_8_36D:int, ldc:int(1024)), ldc:int(0))) {
                    var_8_36D = and:int(var_8_36D:int, ldc:int(184644455))
                    goto(Label_0898)
                }
                
                var_8_36D = and:int(var_8_36D:int, ldc:int(1035566833))
                
                if (cmpge:boolean(var_14_340:long, p2:long)) {
                    goto(Label_0898)
                }
                
                storeelement:short(var_12_296:short[], postincrement:int(1, var_13_2EB:int), i2s:short(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), var_14_340:long))))
                var_14_340 = add:long(var_14_340:long, p3:long)
            }
            
            goto(Label_1065)
            Label_1001:
            
            while (cmpeq:boolean(and:int(var_8_36D:int, ldc:int(1024)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_36D:int, ldc:int(2048)), ldc:int(0))) {
                    var_8_36D = and:int(var_8_36D:int, ldc:int(-1809595718))
                    goto(Label_0898)
                }
                
                if (cmpeq:boolean(and:int(var_8_36D:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_8_36D = and:int(var_8_36D:int, ldc:int(-2003642899))
                    goto(Label_0834)
                }
                
                var_8_36D = and:int(var_8_36D:int, ldc:int(-1612927178))
                
                if (cmpge:boolean(var_14_340:long, p2:long)) {
                    looporswitchbreak()
                }
                
                storeelement:short(var_12_296:short[], postincrement:int(1, var_13_2EB:int), i2s:short(loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(-28943), ldc:int(20750)))))
                var_14_340 = add:long(var_14_340:long, p3:long)
            }
            
            goto(Label_1065)
            Label_0898:
            
            if (cmpeq:boolean(and:int(var_8_36D:int, ldc:int(8192)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_36D:int, ldc:int(8192)), ldc:int(0))) {
                    var_8_36D = and:int(var_8_36D:int, ldc:int(-557719632))
                    goto(Label_1001)
                }
                
                if (cmpne:boolean(and:int(var_8_36D:int, ldc:int(131072)), ldc:int(0))) {
                    var_8_36D = and:int(var_8_36D:int, ldc:int(1590660375))
                    goto(Label_0834)
                }
                
                return:short[](var_12_296:short[])
            }
            
            Label_1065:
            
            if (cmpne:boolean(and:int(var_8_36D:int, ldc:int(1024)), ldc:int(0))) {
                var_8_36D = and:int(var_8_36D:int, ldc:int(405382249))
                goto(Label_1001)
            }
            
            if (cmpeq:boolean(and:int(var_8_36D:int, ldc:int(67108864)), ldc:int(0))) {
                var_8_36D = and:int(var_8_36D:int, ldc:int(1033574895))
                goto(Label_0898)
            }
            
            if (cmpeq:boolean(and:int(var_8_36D:int, ldc:int(2048)), ldc:int(0))) {
                var_8_36D = and:int(var_8_36D:int, ldc:int(-482294817))
                goto(Label_0834)
            }
            
            return:short[](var_12_296:short[])
        }
        
        return:short[](aconstnull:short[]())
    }
    
    public final int[] \u4f4a\u9033\uc2e8\u3776\ud217\ucef1() {
        var_1_61 : int
        var_1_134 : int
        var_3_7A : int[]
        var_4_11C : byte
        var_5_125 : int
        var_4_AE : int
        var_4_C4 : int
        
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
        var_1_61 = and:int(ldc:int(-363300900), ldc:int(-69789791))
        
        if (cmple:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(1073741824L))) {
            var_1_134 = and:int(var_1_61:int, ldc:int(-129708035))
            var_3_7A = newarray:int[](int.class, l2i:int(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)))
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                do {
                    if (cmpeq:boolean(and:int(var_1_134:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_134 = and:int(var_1_134:int, ldc:int(-339718185))
                        
                        if (logicalnot:boolean(getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                            loopcontinue()
                        }
                        
                        var_4_11C = loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(18100), ldc:int(-20149)))
                        var_5_125 = and:int(ldc:int(1984), ldc:int(-1985))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_134:int, ldc:int(8388608)), ldc:int(0))) {
                                var_1_134 = and:int(var_1_134:int, ldc:int(-272360495))
                                
                                if (cmplt:boolean(i2l:long(var_5_125:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                                    storeelement:int(var_3_7A:int[], var_5_125:int, var_4_11C:byte[expected:int])
                                    inc:int(var_5_125, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_134:int, ldc:int(16777216)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        return:int[](var_3_7A:int[])
                    }
                } while (cmpne:boolean(and:int(var_1_134:int, ldc:int(2)), ldc:int(0)))
                
                var_4_AE = and:int(ldc:int(-14590), ldc:int(6372))
                
                while (cmplt:boolean(i2l:long(var_4_AE:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                    storeelement:int(var_3_7A:int[], var_4_AE:int, loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), var_4_AE:int))
                    inc:int(var_4_AE, ldc:int(1))
                }
            }
            else {
                var_4_C4 = and:int(ldc:int(-1579), ldc:int(1578))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_134:int, ldc:int(1)), ldc:int(0))) {
                        var_1_134 = and:int(var_1_134:int, ldc:int(-363487302))
                        
                        if (cmplt:boolean(i2l:long(var_4_C4:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                            storeelement:int(var_3_7A:int[], var_4_C4:int, invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), i2l:long(var_4_C4:int))))
                            inc:int(var_4_C4, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_134:int, ldc:int(8388608)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:int[](var_3_7A:int[])
        }
        
        return:int[](aconstnull:int[]())
    }
    
    public final int[] \u4f4a\u9033\uc2e8\u3776\ud217\ucef1(int[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_21F : int
        var_10_1F1 : long
        var_12_226 : int[]
        var_8_2E5 : int
        var_13_27B : int
        var_14_2C4 : long
        var_14_2BA : long
        
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
        var_8_63 = and:int(ldc:int(-1687131652), ldc:int(525533991))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                goto(Label_0208)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1637251237))
            goto(Label_0441)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(676250378))
            goto(Label_0392)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0280)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), and:int(ldc:int(17409), ldc:int(2315)))))
        }
        
        Label_0208:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1507431705))
            goto(Label_0441)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(234017333))
            goto(Label_0392)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-8546369))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0392)
                    }
                }
            }
        }
        
        Label_0280:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0441)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0208)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-1687395242))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), xor:int(ldc:int(72), ldc:int(74)))))
        }
        
        Label_0392:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0280)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0208)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-1412242002))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), xor:int(ldc:int(16642), ldc:int(16641)))))
            }
        }
        
        Label_0441:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0392)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0280)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0107)
        }
        
        var_8_21F = and:int(var_8_63:int, ldc:int(-1915121297))
        var_10_1F1 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_1F1:long, ldc:long(1073741824L))) {
            loop {
                if (cmpne:boolean(and:int(var_8_21F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_8_21F = and:int(var_8_21F:int, ldc:int(-1611482756))
                    
                    if (cmpne:boolean(p0:int[], aconstnull:int[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:int[])), var_10_1F1:long)) {
                            var_12_226 = p0:int[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_21F:int, ldc:int(4)), ldc:int(0))) {
                    var_8_21F = and:int(var_8_21F:int, ldc:int(-375918081))
                    var_12_226 = newarray:int[](int.class, l2i:int(var_10_1F1:long))
                    looporswitchbreak()
                }
            }
            
            var_8_2E5 = and:int(var_8_21F:int, ldc:int(731523444))
            var_13_27B = and:int(ldc:int(-31914), ldc:int(31913))
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                loop {
                    if (cmpeq:boolean(and:int(var_8_2E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_8_2E5 = and:int(var_8_2E5:int, ldc:int(-610786817))
                        
                        if (getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)) {
                            var_14_2C4 = p1:long
                            goto(Label_0874)
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_8_2E5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_14_2BA = p1:long
                        
                        while (cmplt:boolean(var_14_2BA:long, p2:long)) {
                            storeelement:int(var_12_226:int[], postincrement:int(1, var_13_27B:int), loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(var_14_2BA:long)))
                            var_14_2BA = add:long(var_14_2BA:long, p3:long)
                        }
                        
                        return:int[](var_12_226:int[])
                    }
                    
                    var_8_2E5 = and:int(var_8_2E5:int, ldc:int(-215672050))
                }
            }
            else {
                var_14_2C4 = p1:long
            }
            
            Label_0710:
            
            while (cmpeq:boolean(and:int(var_8_2E5:int, ldc:int(4096)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_2E5:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0874)
                }
                
                if (cmpne:boolean(and:int(var_8_2E5:int, ldc:int(67108864)), ldc:int(0))) {
                    var_8_2E5 = and:int(var_8_2E5:int, ldc:int(1229519573))
                    goto(Label_0762)
                }
                
                var_8_2E5 = and:int(var_8_2E5:int, ldc:int(1763301813))
                
                if (cmpge:boolean(var_14_2C4:long, p2:long)) {
                    goto(Label_0762)
                }
                
                storeelement:int(var_12_226:int[], postincrement:int(1, var_13_27B:int), invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), var_14_2C4:long)))
                var_14_2C4 = add:long(var_14_2C4:long, p3:long)
            }
            
            goto(Label_0937)
            Label_0874:
            
            while (cmpne:boolean(and:int(var_8_2E5:int, ldc:int(32)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_2E5:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_8_2E5 = and:int(var_8_2E5:int, ldc:int(2066025169))
                    goto(Label_0762)
                }
                
                if (cmpeq:boolean(and:int(var_8_2E5:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0710)
                }
                
                var_8_2E5 = and:int(var_8_2E5:int, ldc:int(-277842633))
                
                if (cmpge:boolean(var_14_2C4:long, p2:long)) {
                    goto(Label_0937)
                }
                
                storeelement:int(var_12_226:int[], postincrement:int(1, var_13_27B:int), loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(-24119), ldc:int(24082))))
                var_14_2C4 = add:long(var_14_2C4:long, p3:long)
            }
            
            var_8_2E5 = and:int(var_8_2E5:int, ldc:int(-1327676077))
            goto(Label_0937)
            Label_0762:
            
            if (cmpeq:boolean(and:int(var_8_2E5:int, ldc:int(4)), ldc:int(0))) {
                var_8_2E5 = and:int(var_8_2E5:int, ldc:int(1423132574))
            }
            else {
                if (cmpne:boolean(and:int(var_8_2E5:int, ldc:int(4096)), ldc:int(0))) {
                    var_8_2E5 = and:int(var_8_2E5:int, ldc:int(808744721))
                    goto(Label_0874)
                }
                
                if (cmpeq:boolean(and:int(var_8_2E5:int, ldc:int(16777216)), ldc:int(0))) {
                    var_8_2E5 = and:int(var_8_2E5:int, ldc:int(1494790580))
                    goto(Label_0710)
                }
                
                return:int[](var_12_226:int[])
            }
            
            Label_0937:
            
            if (cmpeq:boolean(and:int(var_8_2E5:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0874)
            }
            
            if (cmpne:boolean(and:int(var_8_2E5:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0762)
            }
            
            if (cmpne:boolean(and:int(var_8_2E5:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0710)
            }
            
            return:int[](var_12_226:int[])
        }
        
        return:int[](aconstnull:int[]())
    }
    
    public final long[] \u3c25\u8df4\u5654\uc246\u8258\u983f() {
        var_1_61 : int
        var_1_E4 : int
        var_3_7A : long[]
        var_1_144 : int
        var_4_12D : byte
        var_5_136 : int
        var_4_BF : int
        var_4_D5 : int
        
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
        var_1_61 = and:int(ldc:int(-644451482), ldc:int(-342796938))
        
        if (cmple:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(1073741824L))) {
            var_1_E4 = and:int(var_1_61:int, ldc:int(-6361630))
            var_3_7A = newarray:long[](long.class, l2i:int(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)))
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                loop {
                    if (cmpne:boolean(and:int(var_1_E4:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_144 = and:int(var_1_E4:int, ldc:int(-1736574601))
                    }
                    else {
                        var_1_144 = and:int(var_1_E4:int, ldc:int(-593790470))
                        
                        if (getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)) {
                            var_4_12D = loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(19778), ldc:int(-19796)))
                            var_5_136 = and:int(ldc:int(-19772), ldc:int(3386))
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_1_144:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_1_144 = and:int(var_1_144:int, ldc:int(-1164502070))
                                }
                                else {
                                    var_1_144 = and:int(var_1_144:int, ldc:int(-861898645))
                                    
                                    if (cmplt:boolean(i2l:long(var_5_136:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                                        storeelement:long(var_3_7A:long[], var_5_136:int, i2l:long(var_4_12D:byte[expected:int]))
                                        inc:int(var_5_136, ldc:int(1))
                                        loopcontinue()
                                    }
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_144:int, ldc:int(16)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                var_1_144 = and:int(var_1_144:int, ldc:int(-210272363))
                            }
                            
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_144:int, ldc:int(64)), ldc:int(0))) {
                        var_4_BF = and:int(ldc:int(-7196), ldc:int(7194))
                        
                        while (cmplt:boolean(i2l:long(var_4_BF:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                            storeelement:long(var_3_7A:long[], var_4_BF:int, i2l:long(loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), var_4_BF:int)))
                            inc:int(var_4_BF, ldc:int(1))
                        }
                        
                        looporswitchbreak()
                    }
                    
                    var_1_E4 = and:int(var_1_144:int, ldc:int(1422412964))
                }
            }
            else {
                var_4_D5 = and:int(ldc:int(-22219), ldc:int(22026))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_E4:int, ldc:int(32)), ldc:int(0))) {
                        var_1_E4 = and:int(var_1_E4:int, ldc:int(-846268437))
                        
                        if (cmplt:boolean(i2l:long(var_4_D5:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                            storeelement:long(var_3_7A:long[], var_4_D5:int, i2l:long(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), i2l:long(var_4_D5:int)))))
                            inc:int(var_4_D5, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_E4:int, ldc:int(2147483647)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:long[](var_3_7A:long[])
        }
        
        return:long[](aconstnull:long[]())
    }
    
    public final long[] \u3c25\u8df4\u5654\uc246\u8258\u983f(long[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_247 : int
        var_10_20E : long
        var_12_24E : long[]
        var_8_319 : int
        var_13_2A3 : int
        var_14_2F6 : long
        var_14_2EC : long
        
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
        var_8_63 = and:int(ldc:int(224199006), ldc:int(1899437390))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                goto(Label_0218)
            }
        }
        
        Label_0107:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0448)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(31617327))
            goto(Label_0399)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(131072)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1749598933))
            goto(Label_0289)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), xor:int(ldc:int(520), ldc:int(521)))))
        }
        
        var_8_63 = and:int(var_8_63:int, ldc:int(-392206408))
        Label_0218:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8192)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(229307774))
            goto(Label_0448)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0399)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(16777216)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1415782234))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-686489369))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0399)
                    }
                }
            }
        }
        
        Label_0289:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0448)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8192)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-746861689))
                goto(Label_0218)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(65536)), ldc:int(0))) {
                athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), xor:int(ldc:int(5132), ldc:int(5134)))))
            }
            
            goto(Label_0107)
        }
        
        Label_0399:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0289)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0218)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-2049595937))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), xor:int(ldc:int(8209), ldc:int(8210)))))
            }
        }
        
        Label_0448:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(131072)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1471929218))
            goto(Label_0399)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1969369260))
            goto(Label_0289)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0218)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0107)
        }
        
        var_8_247 = and:int(var_8_63:int, ldc:int(192754631))
        var_10_20E = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_20E:long, ldc:long(1073741824L))) {
            loop {
                if (cmpne:boolean(and:int(var_8_247:int, ldc:int(16777216)), ldc:int(0))) {
                    var_8_247 = and:int(var_8_247:int, ldc:int(455057607))
                    
                    if (cmpne:boolean(p0:long[], aconstnull:long[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:long[])), var_10_20E:long)) {
                            var_12_24E = p0:long[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_247:int, ldc:int(2)), ldc:int(0))) {
                    var_8_247 = and:int(var_8_247:int, ldc:int(2009007982))
                    var_12_24E = newarray:long[](long.class, l2i:int(var_10_20E:long))
                    looporswitchbreak()
                }
                
                var_8_247 = and:int(var_8_247:int, ldc:int(-788351739))
            }
            
            var_8_319 = and:int(var_8_247:int, ldc:int(928322278))
            var_13_2A3 = and:int(ldc:int(5548), ldc:int(-5565))
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                loop {
                    if (cmpne:boolean(and:int(var_8_319:int, ldc:int(32768)), ldc:int(0))) {
                        var_8_319 = and:int(var_8_319:int, ldc:int(1082129609))
                    }
                    else {
                        var_8_319 = and:int(var_8_319:int, ldc:int(-409113602))
                        
                        if (getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)) {
                            var_14_2F6 = p1:long
                            goto(Label_0905)
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_8_319:int, ldc:int(65536)), ldc:int(0))) {
                        var_14_2EC = p1:long
                        
                        while (cmplt:boolean(var_14_2EC:long, p2:long)) {
                            storeelement:long(var_12_24E:long[], postincrement:int(1, var_13_2A3:int), i2l:long(loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(var_14_2EC:long))))
                            var_14_2EC = add:long(var_14_2EC:long, p3:long)
                        }
                        
                        return:long[](var_12_24E:long[])
                    }
                    
                    var_8_319 = and:int(var_8_319:int, ldc:int(-258260350))
                }
            }
            else {
                var_14_2F6 = p1:long
            }
            
            Label_0760:
            
            while (cmpne:boolean(and:int(var_8_319:int, ldc:int(1048576)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_319:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0905)
                }
                
                if (cmpeq:boolean(and:int(var_8_319:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0803)
                }
                
                var_8_319 = and:int(var_8_319:int, ldc:int(-606606241))
                
                if (cmpge:boolean(var_14_2F6:long, p2:long)) {
                    goto(Label_0803)
                }
                
                storeelement:long(var_12_24E:long[], postincrement:int(1, var_13_2A3:int), i2l:long(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), var_14_2F6:long))))
                var_14_2F6 = add:long(var_14_2F6:long, p3:long)
            }
            
            goto(Label_0958)
            Label_0905:
            
            while (cmpne:boolean(and:int(var_8_319:int, ldc:int(1048576)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_319:int, ldc:int(16777216)), ldc:int(0))) {
                    var_8_319 = and:int(var_8_319:int, ldc:int(1607026607))
                    goto(Label_0803)
                }
                
                if (cmpeq:boolean(and:int(var_8_319:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0760)
                }
                
                var_8_319 = and:int(var_8_319:int, ldc:int(2008534014))
                
                if (cmpge:boolean(var_14_2F6:long, p2:long)) {
                    looporswitchbreak()
                }
                
                storeelement:long(var_12_24E:long[], postincrement:int(1, var_13_2A3:int), i2l:long(loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(12616), ldc:int(-13129)))))
                var_14_2F6 = add:long(var_14_2F6:long, p3:long)
            }
            
            goto(Label_0958)
            Label_0803:
            
            if (cmpeq:boolean(and:int(var_8_319:int, ldc:int(2)), ldc:int(0))) {
                var_8_319 = and:int(var_8_319:int, ldc:int(1942685515))
            }
            else {
                if (cmpeq:boolean(and:int(var_8_319:int, ldc:int(64)), ldc:int(0))) {
                    var_8_319 = and:int(var_8_319:int, ldc:int(56069632))
                    goto(Label_0905)
                }
                
                if (cmpne:boolean(and:int(var_8_319:int, ldc:int(2147483647)), ldc:int(0))) {
                    return:long[](var_12_24E:long[])
                }
                
                goto(Label_0760)
            }
            
            Label_0958:
            
            if (cmpeq:boolean(and:int(var_8_319:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0905)
            }
            
            if (cmpeq:boolean(and:int(var_8_319:int, ldc:int(64)), ldc:int(0))) {
                var_8_319 = and:int(var_8_319:int, ldc:int(-1772412061))
                goto(Label_0803)
            }
            
            if (cmpne:boolean(and:int(var_8_319:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0760)
            }
            
            return:long[](var_12_24E:long[])
        }
        
        return:long[](aconstnull:long[]())
    }
    
    public final float[] \u61a4\u72f1\u494c\u385b\u5bc4\u8c8a() {
        var_1_61 : int
        var_1_147 : int
        var_3_7A : float[]
        var_4_12F : byte
        var_5_138 : int
        var_4_B7 : int
        var_4_CD : int
        
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
        var_1_61 = and:int(ldc:int(227353992), ldc:int(-1853995865))
        
        if (cmple:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(1073741824L))) {
            var_1_147 = and:int(var_1_61:int, ldc:int(-1451604125))
            var_3_7A = newarray:float[](float.class, l2i:int(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)))
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                do {
                    if (cmpne:boolean(and:int(var_1_147:int, ldc:int(32)), ldc:int(0))) {
                        var_1_147 = and:int(var_1_147:int, ldc:int(807987085))
                    }
                    else {
                        var_1_147 = and:int(var_1_147:int, ldc:int(2032639473))
                        
                        if (logicalnot:boolean(getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                            loopcontinue()
                        }
                        
                        var_4_12F = loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(-32520), ldc:int(32005)))
                        var_5_138 = and:int(ldc:int(-14753), ldc:int(10656))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_1_147:int, ldc:int(512)), ldc:int(0))) {
                                var_1_147 = and:int(var_1_147:int, ldc:int(2064236702))
                            }
                            else {
                                var_1_147 = and:int(var_1_147:int, ldc:int(1664711811))
                                
                                if (cmplt:boolean(i2l:long(var_5_138:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                                    storeelement:float(var_3_7A:float[], var_5_138:int, i2f:float(var_4_12F:byte[expected:int]))
                                    inc:int(var_5_138, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_1_147:int, ldc:int(2147483647)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        return:float[](var_3_7A:float[])
                    }
                } while (cmpne:boolean(and:int(var_1_147:int, ldc:int(32)), ldc:int(0)))
                
                var_4_B7 = and:int(ldc:int(286), ldc:int(-287))
                
                while (cmplt:boolean(i2l:long(var_4_B7:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                    storeelement:float(var_3_7A:float[], var_4_B7:int, i2f:float(loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), var_4_B7:int)))
                    inc:int(var_4_B7, ldc:int(1))
                }
            }
            else {
                var_4_CD = and:int(ldc:int(-14382), ldc:int(14381))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_147:int, ldc:int(2)), ldc:int(0))) {
                        var_1_147 = and:int(var_1_147:int, ldc:int(306634176))
                    }
                    else {
                        var_1_147 = and:int(var_1_147:int, ldc:int(1297330110))
                        
                        if (cmplt:boolean(i2l:long(var_4_CD:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                            storeelement:float(var_3_7A:float[], var_4_CD:int, i2f:float(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), i2l:long(var_4_CD:int)))))
                            inc:int(var_4_CD, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_147:int, ldc:int(1048576)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:float[](var_3_7A:float[])
        }
        
        return:float[](aconstnull:float[]())
    }
    
    public final float[] \u61a4\u72f1\u494c\u385b\u5bc4\u8c8a(float[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_249 : int
        var_10_21A : long
        var_12_250 : float[]
        var_8_312 : int
        var_13_2A5 : int
        var_14_2FA : long
        var_14_2F0 : long
        
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
        var_8_63 = and:int(ldc:int(1042622214), ldc:int(2138755822))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                goto(Label_0206)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(67108864)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(622072715))
            goto(Label_0449)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0366)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1943757605))
            goto(Label_0266)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), and:int(ldc:int(17473), ldc:int(4245)))))
        }
        
        Label_0206:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0449)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0366)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(268435456)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-423444907))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-1622670497))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0366)
                    }
                }
            }
        }
        
        Label_0266:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0449)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0206)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
                athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), xor:int(ldc:int(8344), ldc:int(8346)))))
            }
            
            goto(Label_0107)
        }
        
        Label_0366:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(32)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-323508481))
        }
        else {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16777216)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-1297878021))
                goto(Label_0266)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0206)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-141263005))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-1101917387))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), and:int(ldc:int(12355), ldc:int(18451)))))
            }
        }
        
        Label_0449:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0366)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(67108864)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-670351132))
            goto(Label_0266)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(390944146))
            goto(Label_0206)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2048)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-946368641))
            goto(Label_0107)
        }
        
        var_8_249 = and:int(var_8_63:int, ldc:int(529597390))
        var_10_21A = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_21A:long, ldc:long(1073741824L))) {
            loop {
                if (cmpeq:boolean(and:int(var_8_249:int, ldc:int(2048)), ldc:int(0))) {
                    var_8_249 = and:int(var_8_249:int, ldc:int(-568442220))
                    
                    if (cmpne:boolean(p0:float[], aconstnull:float[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:float[])), var_10_21A:long)) {
                            var_12_250 = p0:float[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_8_249:int, ldc:int(32)), ldc:int(0))) {
                    var_8_249 = and:int(var_8_249:int, ldc:int(1609642868))
                    var_12_250 = newarray:float[](float.class, l2i:int(var_10_21A:long))
                    looporswitchbreak()
                }
            }
            
            var_8_312 = and:int(var_8_249:int, ldc:int(1588135455))
            var_13_2A5 = and:int(ldc:int(16914), ldc:int(-16915))
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                loop {
                    if (cmpeq:boolean(and:int(var_8_312:int, ldc:int(134217728)), ldc:int(0))) {
                        var_8_312 = and:int(var_8_312:int, ldc:int(1951058181))
                    }
                    else {
                        var_8_312 = and:int(var_8_312:int, ldc:int(-1079839804))
                        
                        if (getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)) {
                            var_14_2FA = p1:long
                            goto(Label_0906)
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_8_312:int, ldc:int(134217728)), ldc:int(0))) {
                        var_14_2F0 = p1:long
                        
                        while (cmplt:boolean(var_14_2F0:long, p2:long)) {
                            storeelement:float(var_12_250:float[], postincrement:int(1, var_13_2A5:int), i2f:float(loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(var_14_2F0:long))))
                            var_14_2F0 = add:long(var_14_2F0:long, p3:long)
                        }
                        
                        return:float[](var_12_250:float[])
                    }
                    
                    var_8_312 = and:int(var_8_312:int, ldc:int(249275336))
                }
            }
            else {
                var_14_2FA = p1:long
            }
            
            Label_0764:
            
            while (cmpne:boolean(and:int(var_8_312:int, ldc:int(67108864)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_312:int, ldc:int(67108864)), ldc:int(0))) {
                    var_8_312 = and:int(var_8_312:int, ldc:int(-747121849))
                    goto(Label_0906)
                }
                
                if (cmpeq:boolean(and:int(var_8_312:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0815)
                }
                
                var_8_312 = and:int(var_8_312:int, ldc:int(2116038302))
                
                if (cmpge:boolean(var_14_2FA:long, p2:long)) {
                    goto(Label_0815)
                }
                
                storeelement:float(var_12_250:float[], postincrement:int(1, var_13_2A5:int), i2f:float(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), var_14_2FA:long))))
                var_14_2FA = add:long(var_14_2FA:long, p3:long)
            }
            
            goto(Label_0959)
            Label_0906:
            
            while (cmpne:boolean(and:int(var_8_312:int, ldc:int(134217728)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_312:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0815)
                }
                
                if (cmpeq:boolean(and:int(var_8_312:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0764)
                }
                
                var_8_312 = and:int(var_8_312:int, ldc:int(-28812411))
                
                if (cmpge:boolean(var_14_2FA:long, p2:long)) {
                    goto(Label_0959)
                }
                
                storeelement:float(var_12_250:float[], postincrement:int(1, var_13_2A5:int), i2f:float(loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(28002), ldc:int(-32100)))))
                var_14_2FA = add:long(var_14_2FA:long, p3:long)
            }
            
            var_8_312 = and:int(var_8_312:int, ldc:int(-246419316))
            goto(Label_0959)
            Label_0815:
            
            if (cmpeq:boolean(and:int(var_8_312:int, ldc:int(2147483647)), ldc:int(0))) {
                var_8_312 = and:int(var_8_312:int, ldc:int(727672991))
            }
            else {
                if (cmpne:boolean(and:int(var_8_312:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0906)
                }
                
                if (cmpne:boolean(and:int(var_8_312:int, ldc:int(512)), ldc:int(0))) {
                    return:float[](var_12_250:float[])
                }
                
                goto(Label_0764)
            }
            
            Label_0959:
            
            if (cmpne:boolean(and:int(var_8_312:int, ldc:int(16777216)), ldc:int(0))) {
                var_8_312 = and:int(var_8_312:int, ldc:int(-1007449484))
                goto(Label_0906)
            }
            
            if (cmpeq:boolean(and:int(var_8_312:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0815)
            }
            
            if (cmpeq:boolean(and:int(var_8_312:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0764)
            }
            
            return:float[](var_12_250:float[])
        }
        
        return:float[](aconstnull:float[]())
    }
    
    public final double[] \u4f52\u7bad\u527a\u3a62\uc9f6\u99f7() {
        var_1_61 : int
        var_1_146 : int
        var_3_7A : double[]
        var_4_12E : byte
        var_5_137 : int
        var_4_AD : int
        var_4_C3 : int
        
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
        var_1_61 = and:int(ldc:int(-2012811874), ldc:int(2118052774))
        
        if (cmple:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(1073741824L))) {
            var_1_146 = and:int(var_1_61:int, ldc:int(-400327774))
            var_3_7A = newarray:double[](double.class, l2i:int(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)))
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                do {
                    if (cmpeq:boolean(and:int(var_1_146:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_146 = and:int(var_1_146:int, ldc:int(1008006558))
                        
                        if (logicalnot:boolean(getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                            loopcontinue()
                        }
                        
                        var_4_12E = loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(-7748), ldc:int(3651)))
                        var_5_137 = and:int(ldc:int(1171), ldc:int(-1172))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_1_146:int, ldc:int(524288)), ldc:int(0))) {
                                var_1_146 = and:int(var_1_146:int, ldc:int(1803230902))
                            }
                            else {
                                var_1_146 = and:int(var_1_146:int, ldc:int(-44996130))
                                
                                if (cmplt:boolean(i2l:long(var_5_137:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                                    storeelement:double(var_3_7A:double[], var_5_137:int, i2d:double(var_4_12E:byte[expected:int]))
                                    inc:int(var_5_137, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_146:int, ldc:int(32)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        return:double[](var_3_7A:double[])
                    }
                } while (cmpeq:boolean(and:int(var_1_146:int, ldc:int(16384)), ldc:int(0)))
                
                var_4_AD = and:int(ldc:int(26726), ldc:int(-26999))
                
                while (cmplt:boolean(i2l:long(var_4_AD:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                    storeelement:double(var_3_7A:double[], var_4_AD:int, i2d:double(loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), var_4_AD:int)))
                    inc:int(var_4_AD, ldc:int(1))
                }
            }
            else {
                var_4_C3 = and:int(ldc:int(-1787), ldc:int(1786))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_146:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_146 = and:int(var_1_146:int, ldc:int(-1355503712))
                    }
                    else {
                        var_1_146 = and:int(var_1_146:int, ldc:int(1848730583))
                        
                        if (cmplt:boolean(i2l:long(var_4_C3:int), getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                            storeelement:double(var_3_7A:double[], var_4_C3:int, i2d:double(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), i2l:long(var_4_C3:int)))))
                            inc:int(var_4_C3, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_146:int, ldc:int(524288)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_146 = and:int(var_1_146:int, ldc:int(-1488510460))
                }
            }
            
            return:double[](var_3_7A:double[])
        }
        
        return:double[](aconstnull:double[]())
    }
    
    public final double[] \u4f52\u7bad\u527a\u3a62\uc9f6\u99f7(double[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_262 : int
        var_10_229 : long
        var_12_269 : double[]
        var_8_320 : int
        var_13_2BE : int
        var_14_307 : long
        var_14_2FD : long
        
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
        var_8_63 = and:int(ldc:int(1284111806), ldc:int(-1099072068))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                goto(Label_0219)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(128)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1397495007))
            goto(Label_0464)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0392)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(131072)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1383776117))
            goto(Label_0281)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(128)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), and:int(ldc:int(16677), ldc:int(25)))))
        }
        
        var_8_63 = and:int(var_8_63:int, ldc:int(792314418))
        Label_0219:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0464)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0392)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(128)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1816167322))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-589579779))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0392)
                    }
                }
            }
        }
        
        Label_0281:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0464)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(128)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0219)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2097152)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-575901055))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), and:int(ldc:int(2310), ldc:int(16394)))))
        }
        
        Label_0392:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1422536767))
        }
        else {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0281)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0219)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-1261810512))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-322093094))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), and:int(ldc:int(24835), ldc:int(1059)))))
            }
        }
        
        Label_0464:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1437898873))
            goto(Label_0392)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0281)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(65536)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1623432058))
            goto(Label_0219)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(16)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-538695968))
            goto(Label_0107)
        }
        
        var_8_262 = and:int(var_8_63:int, ldc:int(-1630537793))
        var_10_229 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_229:long, ldc:long(1073741824L))) {
            loop {
                if (cmpne:boolean(and:int(var_8_262:int, ldc:int(65536)), ldc:int(0))) {
                    var_8_262 = and:int(var_8_262:int, ldc:int(221197273))
                    
                    if (cmpne:boolean(p0:double[], aconstnull:double[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:double[])), var_10_229:long)) {
                            var_12_269 = p0:double[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_262:int, ldc:int(134217728)), ldc:int(0))) {
                    var_8_262 = and:int(var_8_262:int, ldc:int(1554986936))
                    var_12_269 = newarray:double[](double.class, l2i:int(var_10_229:long))
                    looporswitchbreak()
                }
                
                var_8_262 = and:int(var_8_262:int, ldc:int(-1743093405))
            }
            
            var_8_320 = and:int(var_8_262:int, ldc:int(1833680797))
            var_13_2BE = and:int(ldc:int(-23678), ldc:int(21565))
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                loop {
                    if (cmpne:boolean(and:int(var_8_320:int, ldc:int(67108864)), ldc:int(0))) {
                        var_8_320 = and:int(var_8_320:int, ldc:int(775796671))
                        
                        if (getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)) {
                            var_14_307 = p1:long
                            goto(Label_0933)
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_320:int, ldc:int(131072)), ldc:int(0))) {
                        var_14_2FD = p1:long
                        
                        while (cmplt:boolean(var_14_2FD:long, p2:long)) {
                            storeelement:double(var_12_269:double[], postincrement:int(1, var_13_2BE:int), i2d:double(loadelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(var_14_2FD:long))))
                            var_14_2FD = add:long(var_14_2FD:long, p3:long)
                        }
                        
                        return:double[](var_12_269:double[])
                    }
                    
                    var_8_320 = and:int(var_8_320:int, ldc:int(2043353359))
                }
            }
            else {
                var_14_307 = p1:long
            }
            
            Label_0777:
            
            while (cmpeq:boolean(and:int(var_8_320:int, ldc:int(4194304)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_320:int, ldc:int(128)), ldc:int(0))) {
                    var_8_320 = and:int(var_8_320:int, ldc:int(-1597524740))
                    goto(Label_0933)
                }
                
                if (cmpeq:boolean(and:int(var_8_320:int, ldc:int(8192)), ldc:int(0))) {
                    var_8_320 = and:int(var_8_320:int, ldc:int(1759120203))
                    goto(Label_0841)
                }
                
                var_8_320 = and:int(var_8_320:int, ldc:int(-1127236197))
                
                if (cmpge:boolean(var_14_307:long, p2:long)) {
                    goto(Label_0841)
                }
                
                storeelement:double(var_12_269:double[], postincrement:int(1, var_13_2BE:int), i2d:double(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), var_14_307:long))))
                var_14_307 = add:long(var_14_307:long, p3:long)
            }
            
            goto(Label_0986)
            Label_0933:
            
            while (cmpeq:boolean(and:int(var_8_320:int, ldc:int(2097152)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_320:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0841)
                }
                
                if (cmpeq:boolean(and:int(var_8_320:int, ldc:int(128)), ldc:int(0))) {
                    var_8_320 = and:int(var_8_320:int, ldc:int(-1993742723))
                    goto(Label_0777)
                }
                
                var_8_320 = and:int(var_8_320:int, ldc:int(1062188477))
                
                if (cmpge:boolean(var_14_307:long, p2:long)) {
                    looporswitchbreak()
                }
                
                storeelement:double(var_12_269:double[], postincrement:int(1, var_13_2BE:int), i2d:double(loadelement:byte[expected:int](getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), and:int(ldc:int(20773), ldc:int(-20774)))))
                var_14_307 = add:long(var_14_307:long, p3:long)
            }
            
            goto(Label_0986)
            Label_0841:
            
            if (cmpeq:boolean(and:int(var_8_320:int, ldc:int(256)), ldc:int(0))) {
                var_8_320 = and:int(var_8_320:int, ldc:int(80417130))
            }
            else {
                if (cmpeq:boolean(and:int(var_8_320:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0933)
                }
                
                if (cmpne:boolean(and:int(var_8_320:int, ldc:int(8)), ldc:int(0))) {
                    return:double[](var_12_269:double[])
                }
                
                goto(Label_0777)
            }
            
            Label_0986:
            
            if (cmpeq:boolean(and:int(var_8_320:int, ldc:int(524288)), ldc:int(0))) {
                var_8_320 = and:int(var_8_320:int, ldc:int(-168676278))
                goto(Label_0933)
            }
            
            if (cmpeq:boolean(and:int(var_8_320:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0841)
            }
            
            if (cmpne:boolean(and:int(var_8_320:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0777)
            }
            
            return:double[](var_12_269:double[])
        }
        
        return:double[](aconstnull:double[]())
    }
    
    public final void \u76bc\u6fb0\u52d3\ud51e\u5140\u5245(long p0, java.lang.Object p1) {
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
            invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long), invokevirtual:byte(Byte::byteValue, checkcast:Byte(java.lang.Byte.class, p1:Object[expected:Byte])))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u62da\u40a9\u3bc9\u527a\u8389\u62da(long p0, boolean p1) {
        var_4_D6 : int
        var_4_93 : int
        stack_128_0 : byte[] [generated]
        stack_128_1 : int [generated]
        stack_128_2 : int [generated]
        stack_F5_0 : Unsafe [generated]
        expr_C4 : long [generated]
        stack_F5_3 : int [generated]
        
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
            var_4_D6 = and:int(ldc:int(-502472272), ldc:int(977138809))
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                do {
                    if (cmpeq:boolean(and:int(var_4_D6:int, ldc:int(268435456)), ldc:int(0))) {
                        var_4_D6 = and:int(var_4_D6:int, ldc:int(1073004140))
                        
                        if (logicalnot:boolean(getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))) {
                            loopcontinue()
                        }
                        
                        athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), xor:int(ldc:int(-32254), ldc:int(-32250)))))
                    }
                } while (cmpne:boolean(and:int(var_4_D6:int, ldc:int(4194304)), ldc:int(0)))
                
                var_4_93 = and:int(var_4_D6:int, ldc:int(1812376885))
                stack_128_0 = getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)
                stack_128_1 = l2i:int(p0:long)
                
                if (cmpne:boolean(p1:boolean[expected:int], xor:int(ldc:int(18), ldc:int(19)))) {
                    var_4_93 = and:int(var_4_93:int, ldc:int(-658702610))
                    stack_128_2 = and:int[expected:byte](ldc:int(17620), ldc:int(-19711))
                }
                else {
                    stack_128_2 = and:int[expected:byte](ldc:int(2305), ldc:int(4113))
                }
                
                storeelement:byte(stack_128_0:byte[], stack_128_1:int, stack_128_2:byte)
            }
            else {
                stack_F5_0 = getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258)
                expr_C4 = add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long)
                
                if (cmpne:boolean(p1:boolean[expected:int], xor:int(ldc:int(16552), ldc:int(16553)))) {
                    var_4_D6 = and:int(var_4_D6:int, ldc:int(-1471354070))
                    stack_F5_3 = and:int(ldc:int(-23739), ldc:int(23736))
                }
                else {
                    stack_F5_3 = xor:int(ldc:int(8340), ldc:int(8341))
                }
                
                invokevirtual:void(Unsafe::putByte, stack_F5_0:Unsafe, expr_C4:long, stack_F5_3:byte)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u392e\u6cfe\u5fe1\u4cd9\u8258\u69d9(long p0, byte p1) {
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
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                if (getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), xor:int(ldc:int(219), ldc:int(223)))))
                }
                
                storeelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(p0:long), p1:byte)
            }
            else {
                invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long), p1:byte)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \uc29a\ub70c\u7043\ubf56\u718f\u7330(long p0, short p1) {
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
            invokevirtual:void(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\uc9f6\u3d64\uc2bd\u98a4\u8bb0\u494c, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, p0:long, p1:short)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \uc9f6\u3d64\uc2bd\u98a4\u8bb0\u494c(long p0, short p1) {
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
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                if (getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), and:int(ldc:int(44), ldc:int(5892)))))
                }
                
                storeelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(p0:long), i2b:byte(p1:short[expected:int]))
            }
            else {
                invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long), i2b:byte(p1:short[expected:int]))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \ucfaf\u5654\ud36e\u6198\ufe34\u8640(long p0, int p1) {
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
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                if (getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), xor:int(ldc:int(288), ldc:int(292)))))
                }
                
                storeelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(p0:long), i2b:byte(p1:int))
            }
            else {
                invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long), i2b:byte(p1:int))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u8709\u3bd6\u071d\u760c\u8bb0\u51fa(long p0, long p1) {
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
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                if (getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), and:int(ldc:int(9732), ldc:int(61)))))
                }
                
                storeelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(p0:long), i2b:byte(l2i:int(p1:long)))
            }
            else {
                invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long), i2b:byte(l2i:int(p1:long)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u59ec\u47c2\u7043\u51b2\u9255\u12cb(long p0, float p1) {
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
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                if (getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), xor:int(ldc:int(10757), ldc:int(10753)))))
                }
                
                storeelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(p0:long), i2b:byte(f2i:int(p1:float)))
            }
            else {
                invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long), i2b:byte(f2i:int(p1:float)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \ub171\u183a\ubefe\u36d3\uf9c5\u8258(long p0, double p1) {
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
            
            if (cmpeq:boolean(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), ldc:long(0L))) {
                if (getfield:boolean(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf)) {
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be), xor:int(ldc:int(4736), ldc:int(4740)))))
                }
                
                storeelement:byte(getfield:byte[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u71ae\u4bc8\ua6bd\u4f52\u4bc8\uf9c5, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), l2i:int(p0:long), i2b:byte(d2i:int(p1:double)))
            }
            else {
                invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf), p0:long), i2b:byte(d2i:int(p1:double)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object clone() {
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
            return:Object(invokevirtual:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf[expected:Object](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::clone, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u6b5f\u36d3\u72f1\u61a4\uc4d2\u7d52() {
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
            return:Object(invokevirtual:byte[][expected:Object](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u6b5f\u36d3\u72f1\u61a4\uc4d2\u7d52, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \ua068\u12cb\ubf56\u34df\u3776\u385b(long p0) {
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
            return:Object(invokevirtual:Byte[expected:Object](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ua068\u12cb\ubf56\u34df\u3776\u385b, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, p0:long))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u0800\u8413\u3bc9\u3776\u392e\u4492(long p0) {
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
            return:Object(invokevirtual:Byte[expected:Object](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\u0800\u8413\u3bc9\u3776\u392e\u4492, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf, p0:long))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_220 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_E8_0 : byte[] [generated]
        stack_128_0 : byte[] [generated]
        stack_12A_0 : byte[] [generated]
        stack_159_0 : byte[] [generated]
        stack_244_0 : byte[] [generated]
        stack_2AB_0 : byte[] [generated]
        stack_33F_0 : byte[] [generated]
        stack_37A_0 : byte[] [generated]
        var_4_20B : int
        var_3_210 : byte[]
        var_5_211 : int
        expr_244 : byte [generated]
        var_0_2C4 : int
        expr_2AB : byte [generated]
        stack_2FC_2 : byte [generated]
        stack_2D0_0 : byte [generated]
        expr_A7 : int [generated]
        expr_E8 : int [generated]
        var_2_128 : byte[]
        expr_12C : int [generated]
        var_3_368 : byte[]
        var_5_369 : int
        var_3_165 : String
        stack_204_0 : String[] [generated]
        expr_177 : String[] [generated]
        
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
        var_0_220 = and:int(ldc:int(-740196755), ldc:int(-138838020))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_E6_0 = stack_E8_0 = stack_128_0 = stack_12A_0 = stack_159_0 = stack_244_0 = stack_2AB_0 = stack_33F_0 = stack_37A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("gYQSXGqge5W06Xe8Y35zqH9XX7hvX5Chi4xfT5DUX7QeC5ysB/2cHh9bZ0uF5Fpjd2J7jaSgqU93X6dbpFsDWIxu/5enGs1YV2iNP+eJhG7/n1drgTDtR0aU8ApHjT/niYRu/5eoqFxs4dd7lF9bmKyk23uUHr+XpxrNWFdY5Sdr4dd7lB6/D2pLrRw44UeIsF9PdocKh5avPq9uKw==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_20B = expr_6E:int
        var_3_210 = newarray:byte[](byte.class, expr_6E:int)
        var_5_211 = expr_6E:int
        Label_0531:
        
        while (cmpeq:boolean(and:int(var_0_220:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_220:int, ldc:int(16)), ldc:int(0))) {
                var_0_220 = and:int(var_0_220:int, ldc:int(57962647))
                goto(Label_0652)
            }
            
            var_0_220 = and:int(var_0_220:int, ldc:int(-67127715))
            var_5_211 = add:int(var_5_211:int, ldc:int(-1))
            expr_244 = loadelement:byte(stack_244_0:byte[], var_5_211:int)
            storeelement:byte(var_3_210:byte[], var_5_211:int, xor:int(or:int(and:int(shl:int(expr_244:byte, xor:int(ldc:int(211), ldc:int(215))), ldc:int(-16)), and:int(shr:int(expr_244:byte[expected:int], xor:int(ldc:int(-14319), ldc:int(-14315))), ldc:int(15))), ldc:int(117)))
            
            if (cmpne:boolean(var_5_211:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_E6_0 = stack_E8_0 = stack_128_0 = stack_12A_0 = stack_159_0 = stack_244_0 = stack_2AB_0 = stack_33F_0 = stack_37A_0 = var_3_210:byte[]
            goto(Label_0115)
        }
        
        var_0_220 = and:int(var_0_220:int, ldc:int(-2137265937))
        goto(Label_0802)
        Label_0652:
        
        while (cmpeq:boolean(and:int(var_0_220:int, ldc:int(16)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_220:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0531)
            }
            
            var_0_2C4 = and:int(var_0_220:int, ldc:int(-806236420))
            var_5_211 = add:int(var_5_211:int, ldc:int(-1))
            expr_2AB = stack_2FC_2 = loadelement(stack_2AB_0, var_5_211)
            
            if (cmplt:boolean(add:int(add:int(var_5_211:int, ldc:int(5)), neg:int(var_4_20B:int)), ldc:int(0))) {
                stack_2FC_2 = stack_2D0_0 = add:byte(expr_2AB:byte, loadelement:byte(var_3_210:byte[], add:int(var_5_211:int, ldc:int(5))))
                goto(Label_0736)
            }
            
            Label_0696:
            
            if (cmpeq:boolean(and:int(var_0_2C4:int, ldc:int(65536)), ldc:int(0))) {
                var_0_2C4 = and:int(var_0_2C4:int, ldc:int(-785263021))
            }
            else {
                var_0_2C4 = and:int(var_0_2C4:int, ldc:int(-1969127448))
                stack_2FC_2 = stack_2D0_0 = add:byte(expr_2AB:byte, ldc:byte(5))
            }
            
            Label_0736:
            
            if (cmpne:boolean(and:int(var_0_2C4:int, ldc:int(524288)), ldc:int(0))) {
                var_0_2C4 = and:int(var_0_2C4:int, ldc:int(1953063742))
                goto(Label_0696)
            }
            
            var_0_220 = and:int(var_0_2C4:int, ldc:int(-1481013671))
            storeelement:byte(var_3_210:byte[], var_5_211:int, stack_2FC_2:byte)
            
            if (cmpne:boolean(var_5_211:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_E6_0 = stack_E8_0 = stack_128_0 = stack_12A_0 = stack_159_0 = stack_244_0 = stack_2AB_0 = stack_33F_0 = stack_37A_0 = var_3_210:byte[]
            goto(Label_0172)
        }
        
        Label_0802:
        
        while (cmpne:boolean(and:int(var_0_220:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0531)
            }
            
            var_0_220 = and:int(var_0_220:int, ldc:int(-889874485))
            var_5_211 = add:int(var_5_211:int, ldc:int(-1))
            storeelement:byte(var_3_210:byte[], var_5_211:int, add:byte(loadelement:byte(stack_33F_0:byte[], var_5_211:int), ldc:byte(116)))
            
            if (cmpne:boolean(var_5_211:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_E6_0 = stack_E8_0 = stack_128_0 = stack_12A_0 = stack_159_0 = stack_244_0 = stack_2AB_0 = stack_33F_0 = stack_37A_0 = var_3_210:byte[]
            goto(Label_0237)
        }
        
        goto(Label_0652)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_220 = and:int(var_0_220:int, ldc:int(-1395132094))
            goto(Label_0305)
        }
        
        if (cmpne:boolean(and:int(var_0_220:int, ldc:int(131072)), ldc:int(0))) {
            var_0_220 = and:int(var_0_220:int, ldc:int(482179480))
            goto(Label_0237)
        }
        
        if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(524288)), ldc:int(0))) {
            var_0_220 = and:int(var_0_220:int, ldc:int(-336363683))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_20B = expr_A7:int
                var_3_210 = newarray:byte[](byte.class, expr_A7:int)
                var_5_211 = expr_A7:int
                goto(Label_0652)
            }
        }
        
        Label_0172:
        
        if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(1024)), ldc:int(0))) {
            var_0_220 = and:int(var_0_220:int, ldc:int(-1582156798))
            goto(Label_0305)
        }
        
        if (cmpne:boolean(and:int(var_0_220:int, ldc:int(32768)), ldc:int(0))) {
            var_0_220 = and:int(var_0_220:int, ldc:int(1598404373))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(512)), ldc:int(0))) {
                var_0_220 = and:int(var_0_220:int, ldc:int(1136105392))
                goto(Label_0115)
            }
            
            var_0_220 = and:int(var_0_220:int, ldc:int(-1880524935))
            expr_E8 = arraylength:int(stack_E8_0:byte[])
            
            if (cmpne:boolean(expr_E8:int, ldc:int(0))) {
                var_4_20B = expr_E8:int
                var_3_210 = newarray:byte[](byte.class, expr_E8:int)
                var_5_211 = expr_E8:int
                goto(Label_0802)
            }
        }
        
        Label_0237:
        
        if (cmpne:boolean(and:int(var_0_220:int, ldc:int(524288)), ldc:int(0))) {
            var_0_220 = and:int(var_0_220:int, ldc:int(1206031091))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(64)), ldc:int(0))) {
                var_0_220 = and:int(var_0_220:int, ldc:int(-1055273898))
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(512)), ldc:int(0))) {
                var_0_220 = and:int(var_0_220:int, ldc:int(-1013988560))
                goto(Label_0115)
            }
            
            var_0_220 = and:int(var_0_220:int, ldc:int(-1633962113))
            var_2_128 = stack_128_0:byte[]
            expr_12C = add:int(arraylength:int(stack_12A_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_12C:int, ldc:int(0))) {
                var_3_368 = newarray:byte[](byte.class, expr_12C:int)
                var_5_369 = expr_12C:int
                
                loop {
                    var_0_220 = and:int(var_0_220:int, ldc:int(-1211152550))
                    var_5_369 = add:int(var_5_369:int, ldc:int(-1))
                    storeelement:byte(var_3_368:byte[], var_5_369:int, add:int(shl:int(loadelement:byte(stack_37A_0:byte[], var_5_369:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_128:byte[], add:int(var_5_369:int, xor:int(ldc:int(8273), ldc:int(8272)))), ldc:int(6)), xor:int(ldc:int(3840), ldc:int(3843)))))
                    
                    if (cmpne:boolean(var_5_369:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_E6_0 = stack_E8_0 = stack_128_0 = stack_12A_0 = stack_159_0 = stack_244_0 = stack_2AB_0 = stack_33F_0 = stack_37A_0 = var_3_368:byte[]
            }
        }
        
        Label_0305:
        
        if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0237)
        }
        
        if (cmpne:boolean(and:int(var_0_220:int, ldc:int(524288)), ldc:int(0))) {
            var_0_220 = and:int(var_0_220:int, ldc:int(474414663))
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_220:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_165 = initobject:String(String::<init>, stack_159_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_204_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(5), ldc:int(9991)))
            expr_177 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(12306), ldc:int(12311)))
            storeelement:String(expr_177:String[], and:int(ldc:int(9763), ldc:int(-13860)), invokevirtual:String[expected:String](String::substring, var_3_165:String, and:int(ldc:int(-32538), ldc:int(31496)), and:int(ldc:int(12319), ldc:int(1373))))
            storeelement:String(expr_177:String[], xor:int(ldc:int(16898), ldc:int(16902)), invokevirtual:String[expected:String](String::substring, var_3_165:String, and:int(ldc:int(4159), ldc:int(925)), and:int(ldc:int(16576), ldc:int(99))))
            storeelement:String(expr_177:String[], xor:int(ldc:int(2561), ldc:int(2563)), invokevirtual:String[expected:String](String::substring, var_3_165:String, xor:int(ldc:int(12602), ldc:int(12666)), and:int(ldc:int(20086), ldc:int(114))))
            storeelement:String(expr_177:String[], xor:int(ldc:int(116), ldc:int(117)), invokevirtual:String[expected:String](String::substring, var_3_165:String, and:int(ldc:int(4731), ldc:int(502)), and:int(ldc:int(5310), ldc:int(2517))))
            storeelement:String(expr_177:String[], and:int(ldc:int(11399), ldc:int(611)), invokevirtual:String[expected:String](String::substring, var_3_165:String, xor:int(ldc:int(-22424), ldc:int(-22276)), xor:int(ldc:int(3984), ldc:int(3852))))
            putstatic:String[](\u7bad\uc7fe\ube23\u6435\u3e75\u4daf::\ufcaf\u6b5f\ud217\ua068\u392e\ub8be, expr_177:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ub32d\ub171\u3711\u76bc\u7c6b\u6fb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_694 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_69F : int
        
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
        var_3_694 = and:int(ldc:int(871951017), ldc:int(-1670454426))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7bad\uc7fe\ube23\u6435\u3e75\u4daf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_694 = and:int(var_3_694:int, ldc:int(-59968785))
            var_5_80 = and:int(ldc:int(31239), ldc:int(-31256))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(13362), ldc:int(-15411)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_694:int, ldc:int(1500445304))
                    var_9_C6 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_87:int, xor:int(ldc:int(16800), ldc:int(16801)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, and:int(ldc:int(2305), ldc:int(16389)))), var_7_96:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_694 = and:int(var_3_D8:int, ldc:int(997063217))
                    var_14_113 = var_7_96:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(1856), ldc:int(1857)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_87:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-761698466))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(502201011))
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1858113909))
                        goto(Label_0975)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(120501305))
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(530929196))
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1592533661))
                    }
                    else {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1678973214))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0423:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(362160137))
                        goto(Label_1432)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-544439011))
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0975)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-974016572))
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(219299664))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1209343198))
                        var_11_E9 = and:int(ldc:int(-24860), ldc:int(24859))
                        goto(Label_1553)
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1735737020))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1432)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0975)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1541104201))
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(419774977))
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(1543431861))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0696:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1758172061))
                        goto(Label_1432)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(489230651))
                        goto(Label_0975)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(6813948))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-2146601208))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1334838491))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0827:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1482765034))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(198552354))
                        goto(Label_1432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1002841498))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1007769781))
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1728428054))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-667773506))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(266239837))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(1533997859))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E9 = and:int(ldc:int(12293), ldc:int(2249))
                                goto(Label_1160)
                            }
                        }
                    }
                    
                    Label_0975:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1873756675))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1432)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1561497278))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1466433314))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-2142262905))
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1116845855))
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1500619343))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-482989331))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-764871062))
                        var_11_E9 = and:int(ldc:int(23190), ldc:int(-31383))
                    }
                    
                    Label_1160:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1520230325))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(212879837))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0975)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1834561188))
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(779920410))
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(938007825))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-100996167))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1432)
                            }
                        }
                    }
                    
                    Label_1289:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-163833024))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(869748623))
                            goto(Label_1160)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0975)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1712496997))
                            goto(Label_0827)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(435746991))
                            goto(Label_0696)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1964576168))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1083507975))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_80:int, var_16_117:int)
                            goto(Label_1553)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1432:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0975)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1496785805))
                        goto(Label_0696)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-408423234))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-676472664))
                        loopcontinue()
                    }
                    
                    var_3_694 = and:int(var_3_694:int, ldc:int(-555026906))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1553:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69F = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1564:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1257769003))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1360514645))
                        goto(Label_0975)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1427544800))
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(224786799))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(986803587))
                        goto(Label_0423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1500373810))
                        var_17_69F = add:int(var_16_117:int, xor:int(ldc:int(2064), ldc:int(2065)))
                        looporswitchbreak()
                    }
                }
                
                var_3_694 = and:int(var_3_694:int, ldc:int(-58727450))
                
                if (cmple:boolean(var_5_80 = var_17_69F:int, sub:int(var_6_87:int, and:int(ldc:int(7265), ldc:int(521))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
            var_3_694 = and:int(var_3_694:int, ldc:int(843429000))
            goto(Label_0108)
        }
    }
}
