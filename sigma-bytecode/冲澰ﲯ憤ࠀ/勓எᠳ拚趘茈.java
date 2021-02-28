public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u0b8e\u1833\u62da\u8d98\u8308 {
    public void \u52d3\u0b8e\u1833\u62da\u8d98\u8308(long p0) {
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
            invokespecial:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::<init>, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, p0:long, xor:int[expected:boolean](ldc:int(16416), ldc:int(16417)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u52d3\u0b8e\u1833\u62da\u8d98\u8308(long p0, boolean p1) {
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
        invokespecial:\u3bc9\ua562\u965f\u156b\ub32d\u64f2(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::<init>, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
        putfield:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\ua61f\ubf56\u7049\ud7e8\ua6bd\u3504, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, getstatic:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4::\u3e2a\u64ab\u8413\u3d4b\u6b5f\uf9c5))
        putfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, ldc:long(1L))
        
        if (cmpgt:boolean(p0:long, ldc:long(0L))) {
            putfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, p0:long)
            
            if (cmple:boolean(p0:long, i2l:long(invokestatic:int(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u3504\u8709\u36d3\u5245\uff55\u392e)))) {
                putfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, newarray:byte[](byte.class, l2i:int(p0:long)))
            }
            else {
                putfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, invokevirtual:long(Unsafe::allocateMemory, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), mul:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))))
                
                if (p1:boolean) {
                    invokevirtual:void(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::\uc2bd\u6bb9\u385b\u8df4\u6b5f\uc910, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2], p0:long)
                }
                
                invokestatic:Cleaner(Cleaner::create, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308[expected:Object], initobject:\uf9c5\u392e\u8d90\u4975\uc3e3\u9033[expected:Runnable](\uf9c5\u392e\u8d90\u4975\uc3e3\u9033::<init>, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)))
                invokestatic:void(\u416d\ub19c\ube23\uc246\u4c04\ub70c::\u7330\u5654\uc29a\ub102\ub70c\u6cfe, mul:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)))
            }
            
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:long), loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(21596), ldc:int(-23773)))))))
    }
    
    public void \u52d3\u0b8e\u1833\u62da\u8d98\u8308(long p0, byte p1) {
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
        invokespecial:\u3bc9\ua562\u965f\u156b\ub32d\u64f2(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::<init>, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
        putfield:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\ua61f\ubf56\u7049\ud7e8\ua6bd\u3504, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, getstatic:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4::\u3e2a\u64ab\u8413\u3d4b\u6b5f\uf9c5))
        putfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, ldc:long(1L))
        
        if (cmpgt:boolean(p0:long, ldc:long(0L))) {
            putfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, p0:long)
            putfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, and:int[expected:boolean](ldc:int(29185), ldc:int(1043)))
            expr_92 = newarray:byte[](byte.class, and:int(ldc:int(225), ldc:int(5893)))
            storeelement:byte(expr_92:byte[], and:int(ldc:int(6688), ldc:int(-6689)), ternaryop:int[expected:byte](cmpeq:boolean(p1:byte, ldc:byte(0)), and:int(ldc:int(-4197), ldc:int(4196)), and:int(ldc:int(9129), ldc:int(7187))))
            putfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, expr_92:byte[])
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:long), loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(20816), ldc:int(-20817)))))))
    }
    
    public void \u52d3\u0b8e\u1833\u62da\u8d98\u8308(byte[] p0) {
        var_4_7D : int
        
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
            invokespecial:\u3bc9\ua562\u965f\u156b\ub32d\u64f2(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::<init>, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
            putfield:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\ua61f\ubf56\u7049\ud7e8\ua6bd\u3504, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, getstatic:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4::\u3e2a\u64ab\u8413\u3d4b\u6b5f\uf9c5))
            putfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, ldc:long(1L))
            putfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, i2l:long(arraylength:int(p0:byte[])))
            var_4_7D = and:int(ldc:int(-17058), ldc:int(17057))
            
            while (cmplt:boolean(var_4_7D:int, arraylength:int(p0:byte[]))) {
                if (logicaland:boolean(cmpne:boolean(loadelement:byte(p0:byte[], var_4_7D:int), ldc:byte(0)), cmpne:boolean(loadelement:byte(p0:byte[], var_4_7D:int), and:int(ldc:int(23), ldc:int(5377))))) {
                    athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(8195), ldc:int(2089)))))
                }
                
                inc:int(var_4_7D, ldc:int(1))
            }
            
            putfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, p0:byte[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u52d3\u0b8e\u1833\u62da\u8d98\u8308(boolean[] p0) {
        var_4_85 : int
        
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
            invokespecial:\u3bc9\ua562\u965f\u156b\ub32d\u64f2(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::<init>, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
            putfield:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\ua61f\ubf56\u7049\ud7e8\ua6bd\u3504, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, getstatic:\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4(\u4d85\u98a4\u7e3f\u99f7\uc2e8\u98a4::\u3e2a\u64ab\u8413\u3d4b\u6b5f\uf9c5))
            putfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, ldc:long(1L))
            putfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, i2l:long(arraylength:int(p0:boolean[])))
            putfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, newarray:byte[](byte.class, arraylength:int(p0:boolean[])))
            var_4_85 = and:int(ldc:int(-14225), ldc:int(14224))
            
            while (cmplt:boolean(var_4_85:int, arraylength:int(p0:boolean[]))) {
                storeelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), var_4_85:int, ternaryop:int(cmpne:boolean(loadelement:boolean(p0:boolean[], var_4_85:int), and:int(ldc:int(1099), ldc:int(18433))), and:int(ldc:int(-9862), ldc:int(9861)), and:int(ldc:int(145), ldc:int(9477))))
                inc:int(var_4_85, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u0b8e\u1833\u62da\u8d98\u8308 clone() {
        var_3_7E : \u52d3\u0b8e\u1833\u62da\u8d98\u8308
        
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
        
        if (logicalnot:boolean(getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
            var_3_7E = initobject:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::<init>, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int[expected:boolean](ldc:int(4551), ldc:int(-5576)))
            invokestatic:void(\ube23\u67d0\u3504\u0a06\u718f\uc910::\ub83f\u67e9\u8709\u76bc\ub6ab\u836c, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, ldc:long(0L), var_3_7E:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, ldc:long(0L), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))
            return:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(var_3_7E:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
        }
        
        return:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(initobject:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::<init>, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, ldc:long(0L))))
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
        var_2_5F = and:int(ldc:int(973596669), ldc:int(-1642604613))
        
        if (logicalnot:boolean(invokespecial:boolean(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::equals, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2], p0:Object))) {
            return:boolean(and:int[expected:boolean](ldc:int(23073), ldc:int(-24360)))
        }
        
        if (cmpne:boolean(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, checkcast:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u0b8e\u1833\u62da\u8d98\u8308.class, p0:Object[expected:\u52d3\u0b8e\u1833\u62da\u8d98\u8308])))) {
            var_2_5F = and:int(var_2_5F:int, ldc:int(-567814753))
            stack_AA_0 = and:int(ldc:int(6450), ldc:int(-7479))
        }
        else {
            stack_AA_0 = xor:int(ldc:int(12321), ldc:int(12320))
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
            var_1_5F = and:int(ldc:int(925545313), ldc:int(2086467146))
            stack_8D_0 = mul:int(ldc:int(29), invokespecial:int(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::hashCode, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2]))
            
            if (cmpeq:boolean(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), aconstnull:byte[]())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-414581127))
                stack_8D_1 = and:int(ldc:int(-22141), ldc:int(5708))
            }
            else {
                stack_8D_1 = invokevirtual:int(Object::hashCode, getfield:byte[][expected:Object](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))
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
            return:Byte(invokestatic:Byte(Byte::valueOf, invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, p0:long)))
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
            return:Byte(invokestatic:Byte(Byte::valueOf, invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), p0:long))))
        }
        
        goto(Label_0006)
    }
    
    public final boolean \ub7dc\u9255\uf94d\u8df4\u3e75\u7af6(long p0) {
        var_3_11C : int
        stack_202_0 : int [generated]
        stack_19C_0 : int [generated]
        stack_213_0 : int [generated]
        
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
            var_3_11C = and:int(ldc:int(403702785), ldc:int(901117593))
            
            if (cmpne:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                if (cmpeq:boolean(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), p0:long)), ldc:byte(0))) {
                    goto(Label_0314)
                }
                
                stack_202_0 = stack_19C_0 = xor(ldc(14338), ldc(14339))
                goto(Label_0392)
            }
            
            Label_0105:
            
            if (cmpne:boolean(and:int(var_3_11C:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0432)
            }
            
            if (cmpne:boolean(and:int(var_3_11C:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0314)
            }
            
            if (cmpeq:boolean(and:int(var_3_11C:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0220)
            }
            
            if (cmpne:boolean(and:int(var_3_11C:int, ldc:int(16384)), ldc:int(0))) {
                var_3_11C = and:int(var_3_11C:int, ldc:int(-716659070))
            }
            else {
                var_3_11C = and:int(var_3_11C:int, ldc:int(-1812977981))
                
                if (getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)) {
                    if (cmpeq:boolean(loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(8747), ldc:int(-8748))), ldc:byte(0))) {
                        goto(Label_0432)
                    }
                    
                    stack_202_0 = stack_19C_0 = xor(ldc(1292), ldc(1293))
                    goto(Label_0502)
                }
            }
            
            Label_0153:
            
            if (cmpne:boolean(and:int(var_3_11C:int, ldc:int(16384)), ldc:int(0))) {
                var_3_11C = and:int(var_3_11C:int, ldc:int(123033815))
                goto(Label_0432)
            }
            
            if (cmpne:boolean(and:int(var_3_11C:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0314)
            }
            
            if (cmpne:boolean(and:int(var_3_11C:int, ldc:int(65536)), ldc:int(0))) {
                var_3_11C = and:int(var_3_11C:int, ldc:int(843198047))
            }
            else {
                if (cmpne:boolean(and:int(var_3_11C:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_11C = and:int(var_3_11C:int, ldc:int(-1736652994))
                    goto(Label_0105)
                }
                
                var_3_11C = and:int(var_3_11C:int, ldc:int(483409189))
                
                if (cmpne:boolean(loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(p0:long)), ldc:byte(0))) {
                    stack_213_0 = and:int[expected:boolean](ldc:int(1029), ldc:int(2049))
                    return:boolean(stack_213_0:boolean)
                }
            }
            
            Label_0220:
            
            if (cmpeq:boolean(and:int(var_3_11C:int, ldc:int(1)), ldc:int(0))) {
                var_3_11C = and:int(var_3_11C:int, ldc:int(571946866))
                goto(Label_0432)
            }
            
            if (cmpeq:boolean(and:int(var_3_11C:int, ldc:int(1)), ldc:int(0))) {
                var_3_11C = and:int(var_3_11C:int, ldc:int(1571482250))
            }
            else {
                if (cmpne:boolean(and:int(var_3_11C:int, ldc:int(512)), ldc:int(0))) {
                    var_3_11C = and:int(var_3_11C:int, ldc:int(-891940879))
                    goto(Label_0153)
                }
                
                if (cmpne:boolean(and:int(var_3_11C:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_11C = and:int(var_3_11C:int, ldc:int(-2118304421))
                    goto(Label_0105)
                }
                
                var_3_11C = and:int(var_3_11C:int, ldc:int(-1120659625))
                stack_213_0 = and:int[expected:boolean](ldc:int(-3951), ldc:int(3690))
                return:boolean(stack_213_0:boolean[expected:int])
            }
            
            Label_0314:
            
            if (cmpne:boolean(and:int(var_3_11C:int, ldc:int(8192)), ldc:int(0))) {
                var_3_11C = and:int(var_3_11C:int, ldc:int(-760679775))
                goto(Label_0432)
            }
            
            if (cmpne:boolean(and:int(var_3_11C:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0220)
            }
            
            if (cmpne:boolean(and:int(var_3_11C:int, ldc:int(2)), ldc:int(0))) {
                var_3_11C = and:int(var_3_11C:int, ldc:int(-381607647))
                goto(Label_0153)
            }
            
            if (cmpeq:boolean(and:int(var_3_11C:int, ldc:int(2147483647)), ldc:int(0))) {
                var_3_11C = and:int(var_3_11C:int, ldc:int(-1097002203))
                goto(Label_0105)
            }
            
            var_3_11C = and:int(var_3_11C:int, ldc:int(2115302457))
            stack_202_0 = stack_19C_0 = and(ldc(21409), ldc(-21414))
            Label_0392:
            
            if (cmpne:boolean(and:int(var_3_11C:int, ldc:int(32)), ldc:int(0))) {
                var_3_11C = and:int(var_3_11C:int, ldc:int(-449333574))
                goto(Label_0502)
            }
            
            return:boolean(stack_19C_0:boolean)
            Label_0432:
            
            if (cmpne:boolean(and:int(var_3_11C:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0314)
            }
            
            if (cmpeq:boolean(and:int(var_3_11C:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0220)
            }
            
            if (cmpeq:boolean(and:int(var_3_11C:int, ldc:int(1024)), ldc:int(0))) {
                var_3_11C = and:int(var_3_11C:int, ldc:int(-1847001608))
                goto(Label_0153)
            }
            
            if (cmpne:boolean(and:int(var_3_11C:int, ldc:int(1073741824)), ldc:int(0))) {
                var_3_11C = and:int(var_3_11C:int, ldc:int(-174578616))
                goto(Label_0105)
            }
            
            var_3_11C = and:int(var_3_11C:int, ldc:int(-141037879))
            stack_202_0 = stack_19C_0 = and(ldc(9400), ldc(-13563))
            Label_0502:
            
            if (cmpne:boolean(and:int(var_3_11C:int, ldc:int(268435456)), ldc:int(0))) {
                return:boolean(stack_202_0:int)
            }
            
            goto(Label_0392)
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
        
        if (cmpne:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
            return:byte(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), p0:long)))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
            return:byte(loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(p0:long)))
        }
        
        return:byte(loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(-15245), ldc:int(7052))))
    }
    
    public final short \u56bd\ub113\u5654\u965f\u7006\u5140(long p0) {
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
            return:short(i2s:short(invokevirtual:byte[expected:int](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, p0:long)))
        }
        
        goto(Label_0006)
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
        
        if (cmpne:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
            return:short(i2s:short(invokevirtual:byte[expected:int](Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), p0:long))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
            return:short(i2s:short(loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(p0:long))))
        }
        
        return:short(i2s:short(loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(-27989), ldc:int(11600)))))
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
        
        if (cmpne:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
            return:int(invokevirtual:byte[expected:int](Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), p0:long)))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
            return:int(loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(p0:long)))
        }
        
        return:int(loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(-12014), ldc:int(8877))))
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
        
        if (cmpne:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
            return:long(i2l:long(invokevirtual:byte[expected:int](Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), p0:long))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
            return:long(i2l:long(loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(p0:long))))
        }
        
        return:long(i2l:long(loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(17161), ldc:int(-17162)))))
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
        
        if (cmpne:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
            return:float(i2f:float(invokevirtual:byte[expected:int](Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), p0:long))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
            return:float(i2f:float(loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(p0:long))))
        }
        
        return:float(i2f:float(loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(-415), ldc:int(414)))))
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
        
        if (cmpne:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
            return:double(i2d:double(invokevirtual:byte[expected:int](Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), p0:long))))
        }
        
        if (logicalnot:boolean(getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
            return:double(i2d:double(loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(p0:long))))
        }
        
        return:double(i2d:double(loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(406), ldc:int(-407)))))
    }
    
    public final boolean[] \u51b2\ud12e\u8709\u67e9\u183a\ubded(boolean[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_248 : int
        var_10_20E : long
        var_12_24F : boolean[]
        var_8_50A : int
        var_13_2A4 : int
        var_14_326 : long
        var_16_37A : byte
        stack_529_0 : boolean[] [generated]
        stack_3C8_0 : boolean[] [generated]
        stack_529_1 : int [generated]
        stack_3C8_1 : int [generated]
        stack_3C8_2 : int [generated]
        stack_43B_0 : int [generated]
        var_8_439 : int
        var_17_43B : boolean
        var_18_43E : long
        var_16_4ED : byte
        stack_529_2 : int [generated]
        
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
        var_8_63 = and:int(ldc:int(982879937), ldc:int(-1145787119))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                goto(Label_0195)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0459)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0388)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-115611815))
            goto(Label_0266)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1024)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(306), ldc:int(304)))))
        }
        
        Label_0195:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0459)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(131072)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(83477183))
            goto(Label_0388)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-399564783))
        }
        else {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-1699180671))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0388)
                    }
                }
            }
        }
        
        Label_0266:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0459)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(663854541))
                goto(Label_0195)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(131072)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(938273802))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(35), ldc:int(32)))))
        }
        
        Label_0388:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(32768)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-1493210963))
                goto(Label_0266)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0195)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(348538197))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(1390341469))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(8870), ldc:int(28)))))
            }
        }
        
        Label_0459:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0388)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(268435456)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1057307293))
            goto(Label_0266)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0195)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0107)
        }
        
        var_8_248 = and:int(var_8_63:int, ldc:int(2080160905))
        var_10_20E = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_20E:long, ldc:long(1073741824L))) {
            loop {
                if (cmpne:boolean(and:int(var_8_248:int, ldc:int(2048)), ldc:int(0))) {
                    var_8_248 = and:int(var_8_248:int, ldc:int(922066238))
                    
                    if (cmpne:boolean(p0:boolean[], aconstnull:boolean[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:boolean[])), var_10_20E:long)) {
                            var_12_24F = p0:boolean[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_8_248:int, ldc:int(4096)), ldc:int(0))) {
                    var_8_248 = and:int(var_8_248:int, ldc:int(1419685884))
                    var_12_24F = newarray:boolean[](boolean.class, l2i:int(var_10_20E:long))
                    looporswitchbreak()
                }
                
                var_8_248 = and:int(var_8_248:int, ldc:int(-2064574214))
            }
            
            var_8_50A = and:int(var_8_248:int, ldc:int(-1246515631))
            var_13_2A4 = and:int(ldc:int(22768), ldc:int(-24055))
            
            if (cmpeq:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                goto(Label_0687)
            }
            
            var_14_326 = p1:long
            
            loop {
                Label_0818:
                
                if (cmpeq:boolean(and:int(var_8_50A:int, ldc:int(4096)), ldc:int(0))) {
                    var_8_50A = and:int(var_8_50A:int, ldc:int(1436273875))
                    
                    if (cmplt:boolean(var_14_326:long, p2:long)) {
                        var_16_37A = invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), var_14_326:long))
                        stack_529_0 = stack_3C8_0 = var_12_24F
                        stack_529_1 = stack_3C8_1 = var_13_2A4
                        inc:int(var_13_2A4, ldc:int(1))
                        
                        if (cmpne:boolean(var_16_37A:byte[expected:int], xor:int(ldc:int(4208), ldc:int(4209)))) {
                            goto(Label_0911)
                        }
                        
                        stack_3C8_2 = xor:int(ldc:int(8460), ldc:int(8461))
                        goto(Label_0960)
                    }
                }
                
                if (cmpeq:boolean(and:int(var_8_50A:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_8_50A = and:int(var_8_50A:int, ldc:int(2012925926))
                    goto(Label_1179)
                }
                
                var_8_50A = and:int(var_8_50A:int, ldc:int(1744532622))
            }
            
            Label_0687:
            
            if (cmpeq:boolean(and:int(var_8_50A:int, ldc:int(1024)), ldc:int(0))) {
                var_8_50A = and:int(var_8_50A:int, ldc:int(869006881))
                goto(Label_1179)
            }
            
            if (cmpne:boolean(and:int(var_8_50A:int, ldc:int(4096)), ldc:int(0))) {
                var_8_50A = and:int(var_8_50A:int, ldc:int(470004761))
                goto(Label_0998)
            }
            
            if (cmpne:boolean(and:int(var_8_50A:int, ldc:int(524288)), ldc:int(0))) {
                var_8_50A = and:int(var_8_50A:int, ldc:int(-1891335556))
            }
            else {
                var_8_50A = and:int(var_8_50A:int, ldc:int(888508064))
                
                if (getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)) {
                    if (cmpeq:boolean(loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(-13033), ldc:int(4840))), ldc:byte(0))) {
                        goto(Label_0998)
                    }
                    
                    stack_43B_0 = and:int[expected:boolean](ldc:int(10561), ldc:int(22193))
                    goto(Label_1075)
                }
            }
            
            Label_0761:
            
            if (cmpne:boolean(and:int(var_8_50A:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_1179)
            }
            
            if (cmpeq:boolean(and:int(var_8_50A:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0998)
            }
            
            if (cmpeq:boolean(and:int(var_8_50A:int, ldc:int(1024)), ldc:int(0))) {
                var_8_50A = and:int(var_8_50A:int, ldc:int(1515835745))
                goto(Label_0687)
            }
            
            var_8_50A = and:int(var_8_50A:int, ldc:int(2059394219))
            var_14_326 = p1:long
            goto(Label_1171)
            Label_0911:
            
            if (cmpeq:boolean(and:int(var_8_50A:int, ldc:int(32768)), ldc:int(0))) {
                var_8_50A = and:int(var_8_50A:int, ldc:int(-1116384538))
                goto(Label_1275)
            }
            
            var_8_50A = and:int(var_8_50A:int, ldc:int(-1681928431))
            stack_3C8_2 = and:int(ldc:int(17352), ldc:int(-17354))
            Label_0960:
            var_8_50A = and:int(var_8_50A:int, ldc:int(1572200063))
            storeelement:boolean(stack_3C8_0:boolean[], stack_3C8_1:int, stack_3C8_2:boolean)
            var_14_326 = add:long(var_14_326:long, p3:long)
            goto(Label_0818)
            Label_0998:
            
            if (cmpeq:boolean(and:int(var_8_50A:int, ldc:int(268435456)), ldc:int(0))) {
                var_8_50A = and:int(var_8_50A:int, ldc:int(1804137320))
                goto(Label_1179)
            }
            
            if (cmpeq:boolean(and:int(var_8_50A:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0761)
            }
            
            if (cmpne:boolean(and:int(var_8_50A:int, ldc:int(131072)), ldc:int(0))) {
                var_8_50A = and:int(var_8_50A:int, ldc:int(2127575614))
                goto(Label_0687)
            }
            
            var_8_50A = and:int(var_8_50A:int, ldc:int(-1784902136))
            stack_43B_0 = and:int[expected:boolean](ldc:int(25641), ldc:int(-25642))
            Label_1075:
            var_8_439 = and:int(var_8_50A:int, ldc:int(-1210467208))
            var_17_43B = stack_43B_0:boolean
            var_18_43E = p1:long
            
            loop {
                if (cmpeq:boolean(and:int(var_8_439:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_8_439 = and:int(var_8_439:int, ldc:int(-1792449365))
                }
                else {
                    var_8_439 = and:int(var_8_439:int, ldc:int(-1191465644))
                    
                    if (cmplt:boolean(var_18_43E:long, p2:long)) {
                        storeelement:boolean(var_12_24F:boolean[], postincrement:int(1, var_13_2A4:int), var_17_43B:boolean)
                        var_18_43E = add:long(var_18_43E:long, p3:long)
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_8_439:int, ldc:int(131072)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_8_50A = and:int(var_8_439:int, ldc:int(2111094005))
            goto(Label_1179)
            Label_1171:
            
            if (cmplt:boolean(var_14_326:long, p2:long)) {
                var_16_4ED = loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(var_14_326:long))
                stack_529_0 = stack_3C8_0 = var_12_24F
                stack_529_1 = stack_3C8_1 = var_13_2A4
                inc:int(var_13_2A4, ldc:int(1))
                
                if (cmpeq:boolean(var_16_4ED:byte, ldc:byte(0))) {
                    goto(Label_1275)
                }
                
                stack_529_2 = xor:int[expected:boolean](ldc:int(4352), ldc:int(4353))
                goto(Label_1313)
            }
            
            Label_1179:
            
            if (cmpne:boolean(and:int(var_8_50A:int, ldc:int(4096)), ldc:int(0))) {
                var_8_50A = and:int(var_8_50A:int, ldc:int(281944241))
                goto(Label_0998)
            }
            
            if (cmpeq:boolean(and:int(var_8_50A:int, ldc:int(1048576)), ldc:int(0))) {
                var_8_50A = and:int(var_8_50A:int, ldc:int(1845343121))
                goto(Label_0761)
            }
            
            if (cmpeq:boolean(and:int(var_8_50A:int, ldc:int(8388608)), ldc:int(0))) {
                var_8_50A = and:int(var_8_50A:int, ldc:int(622308894))
                goto(Label_0687)
            }
            
            return:boolean[](var_12_24F:boolean[])
            Label_1275:
            
            if (cmpne:boolean(and:int(var_8_50A:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0911)
            }
            
            var_8_50A = and:int(var_8_50A:int, ldc:int(-1277718720))
            stack_529_2 = and:int[expected:boolean](ldc:int(-37), ldc:int(36))
            Label_1313:
            var_8_50A = and:int(var_8_50A:int, ldc:int(-570888434))
            storeelement:boolean(stack_529_0:boolean[], stack_529_1:int, stack_529_2:boolean)
            var_14_326 = add:long(var_14_326:long, p3:long)
            goto(Label_1171)
        }
        
        return:boolean[](aconstnull:boolean[]())
    }
    
    public final boolean[] \u51b2\ud12e\u8709\u67e9\u183a\ubded() {
        var_1_61 : int
        var_1_245 : int
        var_3_7A : boolean[]
        stack_1B4_0 : int [generated]
        var_4_BC : int
        stack_261_0 : boolean[] [generated]
        stack_261_1 : int [generated]
        stack_261_2 : int [generated]
        var_1_1CC : int
        var_5_1BD : int
        var_5_135 : byte
        stack_160_0 : boolean[] [generated]
        stack_160_1 : int [generated]
        stack_160_2 : int [generated]
        
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
        var_1_61 = and:int(ldc:int(371599471), ldc:int(-1630847378))
        
        if (cmpgt:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(1073741824L))) {
            return:boolean[](aconstnull:boolean[]())
        }
        
        var_1_245 = and:int(var_1_61:int, ldc:int(2120973694))
        var_3_7A = newarray:boolean[](boolean.class, l2i:int(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)))
        
        if (cmpeq:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
            loop {
                if (cmpne:boolean(and:int(var_1_245:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0378)
                }
                
                if (cmpeq:boolean(and:int(var_1_245:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_245 = and:int(var_1_245:int, ldc:int(1055403711))
                    
                    if (getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)) {
                        if (cmpeq:boolean(loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(-26169), ldc:int(9768))), ldc:byte(0))) {
                            goto(Label_0378)
                        }
                        
                        stack_1B4_0 = and:int(ldc:int(1169), ldc:int(4109))
                        looporswitchbreak()
                    }
                }
                
                Label_0159:
                
                if (cmpeq:boolean(and:int(var_1_245:int, ldc:int(16777216)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_245:int, ldc:int(8)), ldc:int(0))) {
                        var_1_245 = and:int(var_1_245:int, ldc:int(-1367494897))
                        var_4_BC = and:int(ldc:int(23745), ldc:int(-23798))
                        
                        while (cmplt:boolean(i2l:long(var_4_BC:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            stack_261_0 = var_3_7A:boolean[]
                            stack_261_1 = var_4_BC:int
                            
                            if (cmpeq:boolean(loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), var_4_BC:int), ldc:byte(0))) {
                                var_1_245 = and:int(var_1_245:int, ldc:int(394100687))
                                stack_261_2 = and:int[expected:boolean](ldc:int(10789), ldc:int(-32374))
                            }
                            else {
                                stack_261_2 = and:int[expected:boolean](ldc:int(10373), ldc:int(849))
                            }
                            
                            var_1_245 = and:int(var_1_245:int, ldc:int(-7738769))
                            storeelement:boolean(stack_261_0:boolean[], stack_261_1:int, stack_261_2:boolean)
                            inc:int(var_4_BC, ldc:int(1))
                        }
                        
                        goto(Label_0537)
                    }
                    
                    loopcontinue()
                }
                
                Label_0378:
                
                if (cmpne:boolean(and:int(var_1_245:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_245 = and:int(var_1_245:int, ldc:int(995479565))
                    goto(Label_0159)
                }
                
                if (cmpne:boolean(and:int(var_1_245:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_245 = and:int(var_1_245:int, ldc:int(-690062017))
                    stack_1B4_0 = and:int(ldc:int(2714), ldc:int(-10971))
                    looporswitchbreak()
                }
            }
            
            var_1_1CC = and:int(var_1_245:int, ldc:int(-1212208146))
            var_4_BC = stack_1B4_0:int
            var_5_1BD = and:int(ldc:int(18490), ldc:int(-23099))
            
            loop {
                if (cmpne:boolean(and:int(var_1_1CC:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_1CC = and:int(var_1_1CC:int, ldc:int(-1607321908))
                }
                else {
                    var_1_1CC = and:int(var_1_1CC:int, ldc:int(1315188383))
                    
                    if (cmplt:boolean(i2l:long(var_5_1BD:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                        storeelement:boolean(var_3_7A:boolean[], var_5_1BD:int, var_4_BC:boolean)
                        inc:int(var_5_1BD, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_1CC:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_1CC = and:int(var_1_1CC:int, ldc:int(-43144368))
            }
            
            var_1_245 = and:int(var_1_1CC:int, ldc:int(2115239870))
            goto(Label_0537)
        }
        
        var_4_BC = and:int(ldc:int(-15168), ldc:int(11040))
        Label_0212:
        
        while (cmpne:boolean(and:int(var_1_245:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_1_245:int, ldc:int(1048576)), ldc:int(0))) {
                var_1_245 = and:int(var_1_245:int, ldc:int(-1731836577))
                goto(Label_0252)
            }
            
            var_1_245 = and:int(var_1_245:int, ldc:int(-2033848882))
            
            if (cmpge:boolean(i2l:long(var_4_BC:boolean[expected:int]), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                goto(Label_0252)
            }
            
            var_5_135 = invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), mul:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), i2l:long(var_4_BC:boolean[expected:int]))))
            stack_160_0 = var_3_7A:boolean[]
            stack_160_1 = var_4_BC:int
            
            if (cmpeq:boolean(var_5_135:byte, ldc:byte(0))) {
                var_1_245 = and:int(var_1_245:int, ldc:int(-12325265))
                stack_160_2 = and:int[expected:boolean](ldc:int(-3621), ldc:int(3620))
            }
            else {
                stack_160_2 = and:int[expected:boolean](ldc:int(35), ldc:int(12289))
            }
            
            var_1_245 = and:int(var_1_245:int, ldc:int(-405029042))
            storeelement:boolean(stack_160_0:boolean[], stack_160_1:int, stack_160_2:boolean)
            inc:int(var_4_BC, ldc:int(1))
        }
        
        goto(Label_0537)
        Label_0252:
        
        if (cmpeq:boolean(and:int(var_1_245:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_1_245:int, ldc:int(8)), ldc:int(0))) {
                var_1_245 = and:int(var_1_245:int, ldc:int(1341902427))
                goto(Label_0212)
            }
            
            var_1_245 = and:int(var_1_245:int, ldc:int(907897823))
        }
        
        Label_0537:
        
        if (cmpeq:boolean(and:int(var_1_245:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0252)
        }
        
        if (cmpeq:boolean(and:int(var_1_245:int, ldc:int(1048576)), ldc:int(0))) {
            return:boolean[](var_3_7A:boolean[])
        }
        
        goto(Label_0212)
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
            return:byte[](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))
        }
        
        goto(Label_0006)
    }
    
    public final byte[] \u99f7\u6435\u72f1\ud4fe\u839e\u839e() {
        var_1_61 : int
        var_1_F5 : int
        var_3_7A : byte[]
        var_1_15C : int
        var_4_14C : byte
        var_5_155 : int
        var_4_E7 : int
        
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
        var_1_61 = and:int(ldc:int(-1355685160), ldc:int(-1096941845))
        
        if (cmple:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(1073741824L))) {
            var_1_F5 = and:int(var_1_61:int, ldc:int(-80611617))
            var_3_7A = newarray:byte[](byte.class, l2i:int(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)))
            
            if (cmpeq:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                loop {
                    if (cmpeq:boolean(and:int(var_1_F5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_15C = and:int(var_1_F5:int, ldc:int(524001704))
                    }
                    else {
                        var_1_15C = and:int(var_1_F5:int, ldc:int(-487064147))
                        
                        if (getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)) {
                            var_4_14C = loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(574), ldc:int(-8895)))
                            var_5_155 = and:int(ldc:int(209), ldc:int(-210))
                            
                            loop {
                                var_1_15C = and:int(var_1_15C:int, ldc:int(-1501826357))
                                
                                if (cmpge:boolean(i2l:long(var_5_155:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                                    looporswitchbreak()
                                }
                                
                                storeelement:byte(var_3_7A:byte[], var_5_155:int, var_4_14C:byte)
                                inc:int(var_5_155, ldc:int(1))
                            }
                            
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_15C:int, ldc:int(8192)), ldc:int(0))) {
                        invokestatic:void(System::arraycopy, getfield:byte[][expected:Object](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(-8340), ldc:int(8339)), var_3_7A:byte[][expected:Object], and:int(ldc:int(17896), ldc:int(-28655)), l2i:int(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)))
                        looporswitchbreak()
                    }
                    
                    var_1_F5 = and:int(var_1_15C:int, ldc:int(1208373533))
                }
            }
            else {
                var_4_E7 = and:int(ldc:int(12819), ldc:int(-12820))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_F5 = and:int(var_1_F5:int, ldc:int(-360975700))
                        
                        if (cmplt:boolean(i2l:long(var_4_E7:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            storeelement:byte(var_3_7A:byte[], var_4_E7:int, invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), mul:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), i2l:long(var_4_E7:int)))))
                            inc:int(var_4_E7, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_F5:int, ldc:int(4)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_F5 = and:int(var_1_F5:int, ldc:int(600115902))
                }
            }
            
            return:byte[](var_3_7A:byte[])
        }
        
        return:byte[](aconstnull:byte[]())
    }
    
    public final byte[] \u99f7\u6435\u72f1\ud4fe\u839e\u839e(byte[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_23C : int
        var_10_20E : long
        var_12_243 : byte[]
        var_8_301 : int
        var_13_298 : int
        var_14_2E0 : long
        var_14_2D6 : long
        
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
        var_8_63 = and:int(ldc:int(1708624453), ldc:int(-1422677114))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                goto(Label_0216)
            }
        }
        
        Label_0107:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(128)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-2046436091))
            goto(Label_0471)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0399)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(2099343805))
            goto(Label_0287)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(-19456), ldc:int(-19454)))))
        }
        
        var_8_63 = and:int(var_8_63:int, ldc:int(-1431643235))
        Label_0216:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0471)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2048)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-404190351))
            goto(Label_0399)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16384)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(1172623266))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(1803394725))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0399)
                    }
                }
            }
        }
        
        Label_0287:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0471)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(8)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(671866296))
                goto(Label_0216)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4096)), ldc:int(0))) {
                athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(160), ldc:int(163)))))
            }
            
            goto(Label_0107)
        }
        
        Label_0399:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0287)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(1608263750))
                goto(Label_0216)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(128)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(2104367888))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(796629916))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(13318), ldc:int(19141)))))
            }
        }
        
        Label_0471:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0399)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0287)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0107)
        }
        
        var_8_23C = and:int(var_8_63:int, ldc:int(1941134193))
        var_10_20E = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_20E:long, ldc:long(1073741824L))) {
            loop {
                if (cmpne:boolean(and:int(var_8_23C:int, ldc:int(65536)), ldc:int(0))) {
                    var_8_23C = and:int(var_8_23C:int, ldc:int(-113914152))
                    
                    if (cmpne:boolean(p0:byte[], aconstnull:byte[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:byte[])), var_10_20E:long)) {
                            var_12_243 = p0:byte[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_8_23C:int, ldc:int(8)), ldc:int(0))) {
                    var_8_23C = and:int(var_8_23C:int, ldc:int(592699080))
                    var_12_243 = newarray:byte[](byte.class, l2i:int(var_10_20E:long))
                    looporswitchbreak()
                }
            }
            
            var_8_301 = and:int(var_8_23C:int, ldc:int(-1109667868))
            var_13_298 = and:int(ldc:int(-3324), ldc:int(3291))
            
            if (cmpeq:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                do {
                    if (cmpne:boolean(and:int(var_8_301:int, ldc:int(16384)), ldc:int(0))) {
                        var_8_301 = and:int(var_8_301:int, ldc:int(77556859))
                    }
                    else {
                        var_8_301 = and:int(var_8_301:int, ldc:int(1931321056))
                        
                        if (logicalnot:boolean(getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            loopcontinue()
                        }
                        
                        var_14_2E0 = p1:long
                        goto(Label_0869)
                    }
                } while (cmpne:boolean(and:int(var_8_301:int, ldc:int(1024)), ldc:int(0)))
                
                var_14_2D6 = p1:long
                
                while (cmplt:boolean(var_14_2D6:long, p2:long)) {
                    storeelement:byte(var_12_243:byte[], postincrement:int(1, var_13_298:int), loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(var_14_2D6:long)))
                    var_14_2D6 = add:long(var_14_2D6:long, p3:long)
                }
                
                return:byte[](var_12_243:byte[])
            }
            
            var_14_2E0 = p1:long
            Label_0738:
            
            while (cmpne:boolean(and:int(var_8_301:int, ldc:int(2147483647)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_301:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0869)
                }
                
                if (cmpeq:boolean(and:int(var_8_301:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0779)
                }
                
                var_8_301 = and:int(var_8_301:int, ldc:int(1035460554))
                
                if (cmpge:boolean(var_14_2E0:long, p2:long)) {
                    goto(Label_0779)
                }
                
                storeelement:byte(var_12_243:byte[], postincrement:int(1, var_13_298:int), invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), var_14_2E0:long)))
                var_14_2E0 = add:long(var_14_2E0:long, p3:long)
            }
            
            goto(Label_0931)
            Label_0869:
            
            while (cmpeq:boolean(and:int(var_8_301:int, ldc:int(1024)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_301:int, ldc:int(1048576)), ldc:int(0))) {
                    var_8_301 = and:int(var_8_301:int, ldc:int(-879366968))
                    goto(Label_0779)
                }
                
                if (cmpne:boolean(and:int(var_8_301:int, ldc:int(268435456)), ldc:int(0))) {
                    var_8_301 = and:int(var_8_301:int, ldc:int(-773890306))
                    goto(Label_0738)
                }
                
                var_8_301 = and:int(var_8_301:int, ldc:int(2071564072))
                
                if (cmpge:boolean(var_14_2E0:long, p2:long)) {
                    looporswitchbreak()
                }
                
                storeelement:byte(var_12_243:byte[], postincrement:int(1, var_13_298:int), loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(19462), ldc:int(-19463))))
                var_14_2E0 = add:long(var_14_2E0:long, p3:long)
            }
            
            goto(Label_0931)
            Label_0779:
            
            if (cmpeq:boolean(and:int(var_8_301:int, ldc:int(268435456)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_301:int, ldc:int(134217728)), ldc:int(0))) {
                    var_8_301 = and:int(var_8_301:int, ldc:int(864569627))
                    goto(Label_0869)
                }
                
                if (cmpeq:boolean(and:int(var_8_301:int, ldc:int(134217728)), ldc:int(0))) {
                    return:byte[](var_12_243:byte[])
                }
                
                goto(Label_0738)
            }
            
            Label_0931:
            
            if (cmpne:boolean(and:int(var_8_301:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0869)
            }
            
            if (cmpeq:boolean(and:int(var_8_301:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0779)
            }
            
            if (cmpeq:boolean(and:int(var_8_301:int, ldc:int(65536)), ldc:int(0))) {
                var_8_301 = and:int(var_8_301:int, ldc:int(-1653458825))
                goto(Label_0738)
            }
            
            return:byte[](var_12_243:byte[])
        }
        
        return:byte[](aconstnull:byte[]())
    }
    
    public final short[] \ub70c\u62da\u3e75\ud7e8\u8c8a\ud4fe() {
        var_1_61 : int
        var_1_E4 : int
        var_3_7A : short[]
        var_1_153 : int
        var_4_13B : byte
        var_5_144 : int
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
        var_1_61 = and:int(ldc:int(-802906481), ldc:int(1092927111))
        
        if (cmple:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(1073741824L))) {
            var_1_E4 = and:int(var_1_61:int, ldc:int(1701093143))
            var_3_7A = newarray:short[](short.class, l2i:int(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)))
            
            if (cmpeq:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                loop {
                    if (cmpne:boolean(and:int(var_1_E4:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_153 = and:int(var_1_E4:int, ldc:int(-129932815))
                    }
                    else {
                        var_1_153 = and:int(var_1_E4:int, ldc:int(-77619498))
                        
                        if (getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)) {
                            var_4_13B = loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(15902), ldc:int(-15903)))
                            var_5_144 = and:int(ldc:int(-15390), ldc:int(15388))
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_1_153:int, ldc:int(2048)), ldc:int(0))) {
                                    var_1_153 = and:int(var_1_153:int, ldc:int(462175287))
                                }
                                else {
                                    var_1_153 = and:int(var_1_153:int, ldc:int(-134301106))
                                    
                                    if (cmplt:boolean(i2l:long(var_5_144:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                                        storeelement:short(var_3_7A:short[], var_5_144:int, i2s:short(var_4_13B:byte[expected:int]))
                                        inc:int(var_5_144, ldc:int(1))
                                        loopcontinue()
                                    }
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_153:int, ldc:int(8388608)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_153:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_4_BF = and:int(ldc:int(12483), ldc:int(-12484))
                        
                        while (cmplt:boolean(i2l:long(var_4_BF:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            storeelement:short(var_3_7A:short[], var_4_BF:int, i2s:short(loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), var_4_BF:int)))
                            inc:int(var_4_BF, ldc:int(1))
                        }
                        
                        looporswitchbreak()
                    }
                    
                    var_1_E4 = and:int(var_1_153:int, ldc:int(439785761))
                }
            }
            else {
                var_4_D5 = and:int(ldc:int(22546), ldc:int(-22579))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_E4:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_E4 = and:int(var_1_E4:int, ldc:int(-891532586))
                        
                        if (cmplt:boolean(i2l:long(var_4_D5:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            storeelement:short(var_3_7A:short[], var_4_D5:int, i2s:short(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), mul:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), i2l:long(var_4_D5:int))))))
                            inc:int(var_4_D5, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_E4:int, ldc:int(65536)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_E4 = and:int(var_1_E4:int, ldc:int(-1901250676))
                }
            }
            
            return:short[](var_3_7A:short[])
        }
        
        return:short[](aconstnull:short[]())
    }
    
    public final short[] \ub70c\u62da\u3e75\ud7e8\u8c8a\ud4fe(short[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_20B : int
        var_10_21A : long
        var_8_25F : int
        var_12_266 : short[]
        var_8_351 : int
        var_13_2BB : int
        var_14_304 : long
        var_14_2FA : long
        
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
        var_8_63 = and:int(ldc:int(-1391944616), ldc:int(-271655556))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                goto(Label_0206)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2048)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1482581748))
            goto(Label_0460)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0389)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(32)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1441111785))
            goto(Label_0278)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(8225), ldc:int(8227)))))
        }
        
        Label_0206:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0460)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1358455065))
            goto(Label_0389)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(33554432)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(511409808))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-1155809954))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0389)
                    }
                }
            }
        }
        
        Label_0278:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2048)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-930375900))
            goto(Label_0460)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0206)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
                athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(259), ldc:int(18455)))))
            }
            
            goto(Label_0107)
        }
        
        Label_0389:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2048)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(555373518))
                goto(Label_0278)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(4194304)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-821732606))
                goto(Label_0206)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-269902469))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(22656), ldc:int(22660)))))
            }
        }
        
        Label_0460:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0389)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(976368601))
            goto(Label_0278)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0206)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1024)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-128007608))
            goto(Label_0107)
        }
        
        var_8_20B = and:int(var_8_63:int, ldc:int(-1185235077))
        var_10_21A = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_21A:long, ldc:long(1073741824L))) {
            loop {
                if (cmpeq:boolean(and:int(var_8_20B:int, ldc:int(8)), ldc:int(0))) {
                    var_8_25F = and:int(var_8_20B:int, ldc:int(123526871))
                }
                else {
                    var_8_25F = and:int(var_8_20B:int, ldc:int(-1149313730))
                    
                    if (cmpne:boolean(p0:short[], aconstnull:short[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:short[])), var_10_21A:long)) {
                            var_12_266 = p0:short[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_25F:int, ldc:int(2048)), ldc:int(0))) {
                    var_8_25F = and:int(var_8_25F:int, ldc:int(-1155949249))
                    var_12_266 = newarray:short[](short.class, l2i:int(var_10_21A:long))
                    looporswitchbreak()
                }
                
                var_8_20B = and:int(var_8_25F:int, ldc:int(-417550871))
            }
            
            var_8_351 = and:int(var_8_25F:int, ldc:int(-349397571))
            var_13_2BB = and:int(ldc:int(-11972), ldc:int(3267))
            
            if (cmpeq:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                do {
                    if (cmpeq:boolean(and:int(var_8_351:int, ldc:int(536870912)), ldc:int(0))) {
                        var_8_351 = and:int(var_8_351:int, ldc:int(-412436691))
                    }
                    else {
                        var_8_351 = and:int(var_8_351:int, ldc:int(-1454449348))
                        
                        if (logicalnot:boolean(getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            loopcontinue()
                        }
                        
                        var_14_304 = p1:long
                        goto(Label_0928)
                    }
                } while (cmpne:boolean(and:int(var_8_351:int, ldc:int(128)), ldc:int(0)))
                
                var_14_2FA = p1:long
                
                while (cmplt:boolean(var_14_2FA:long, p2:long)) {
                    storeelement:short(var_12_266:short[], postincrement:int(1, var_13_2BB:int), i2s:short(loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(var_14_2FA:long))))
                    var_14_2FA = add:long(var_14_2FA:long, p3:long)
                }
                
                return:short[](var_12_266:short[])
            }
            
            var_14_304 = p1:long
            Label_0774:
            
            while (cmpne:boolean(and:int(var_8_351:int, ldc:int(16777216)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_351:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0928)
                }
                
                if (cmpeq:boolean(and:int(var_8_351:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0815)
                }
                
                var_8_351 = and:int(var_8_351:int, ldc:int(-34750728))
                
                if (cmpge:boolean(var_14_304:long, p2:long)) {
                    goto(Label_0815)
                }
                
                storeelement:short(var_12_266:short[], postincrement:int(1, var_13_2BB:int), i2s:short(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), var_14_304:long))))
                var_14_304 = add:long(var_14_304:long, p3:long)
            }
            
            goto(Label_1004)
            Label_0928:
            
            while (cmpeq:boolean(and:int(var_8_351:int, ldc:int(4194304)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_351:int, ldc:int(2048)), ldc:int(0))) {
                    var_8_351 = and:int(var_8_351:int, ldc:int(-909815549))
                    goto(Label_0815)
                }
                
                if (cmpne:boolean(and:int(var_8_351:int, ldc:int(33554432)), ldc:int(0))) {
                    var_8_351 = and:int(var_8_351:int, ldc:int(-2079907291))
                    goto(Label_0774)
                }
                
                var_8_351 = and:int(var_8_351:int, ldc:int(-1208164609))
                
                if (cmpge:boolean(var_14_304:long, p2:long)) {
                    goto(Label_1004)
                }
                
                storeelement:short(var_12_266:short[], postincrement:int(1, var_13_2BB:int), i2s:short(loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(20519), ldc:int(-20528)))))
                var_14_304 = add:long(var_14_304:long, p3:long)
            }
            
            var_8_351 = and:int(var_8_351:int, ldc:int(1217802295))
            goto(Label_1004)
            Label_0815:
            
            if (cmpne:boolean(and:int(var_8_351:int, ldc:int(1)), ldc:int(0))) {
                var_8_351 = and:int(var_8_351:int, ldc:int(-1776590349))
            }
            else {
                if (cmpne:boolean(and:int(var_8_351:int, ldc:int(256)), ldc:int(0))) {
                    var_8_351 = and:int(var_8_351:int, ldc:int(2065613932))
                    goto(Label_0928)
                }
                
                if (cmpne:boolean(and:int(var_8_351:int, ldc:int(128)), ldc:int(0))) {
                    var_8_351 = and:int(var_8_351:int, ldc:int(-1408221774))
                    goto(Label_0774)
                }
                
                return:short[](var_12_266:short[])
            }
            
            Label_1004:
            
            if (cmpeq:boolean(and:int(var_8_351:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0928)
            }
            
            if (cmpeq:boolean(and:int(var_8_351:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0815)
            }
            
            if (cmpeq:boolean(and:int(var_8_351:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0774)
            }
            
            return:short[](var_12_266:short[])
        }
        
        return:short[](aconstnull:short[]())
    }
    
    public final int[] \u4f4a\u9033\uc2e8\u3776\ud217\ucef1() {
        var_1_61 : int
        var_1_149 : int
        var_3_7A : int[]
        var_4_131 : byte
        var_5_13A : int
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
        var_1_61 = and:int(ldc:int(-1405455246), ldc:int(-1605241350))
        
        if (cmple:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(1073741824L))) {
            var_1_149 = and:int(var_1_61:int, ldc:int(-39848641))
            var_3_7A = newarray:int[](int.class, l2i:int(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)))
            
            if (cmpeq:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                loop {
                    if (cmpeq:boolean(and:int(var_1_149:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_149 = and:int(var_1_149:int, ldc:int(1145698228))
                        
                        if (getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)) {
                            var_4_131 = loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(5924), ldc:int(-22309)))
                            var_5_13A = and:int(ldc:int(-21792), ldc:int(21782))
                            
                            loop {
                                if (cmpne:boolean(and:int(var_1_149:int, ldc:int(8)), ldc:int(0))) {
                                    var_1_149 = and:int(var_1_149:int, ldc:int(1738319901))
                                }
                                else {
                                    var_1_149 = and:int(var_1_149:int, ldc:int(-1907230274))
                                    
                                    if (cmplt:boolean(i2l:long(var_5_13A:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                                        storeelement:int(var_3_7A:int[], var_5_13A:int, var_4_131:byte[expected:int])
                                        inc:int(var_5_13A, ldc:int(1))
                                        loopcontinue()
                                    }
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_149:int, ldc:int(256)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_149:int, ldc:int(262144)), ldc:int(0))) {
                        var_4_B7 = and:int(ldc:int(-5129), ldc:int(5128))
                        
                        while (cmplt:boolean(i2l:long(var_4_B7:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            storeelement:int(var_3_7A:int[], var_4_B7:int, loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), var_4_B7:int))
                            inc:int(var_4_B7, ldc:int(1))
                        }
                        
                        looporswitchbreak()
                    }
                    
                    var_1_149 = and:int(var_1_149:int, ldc:int(572217422))
                }
            }
            else {
                var_4_CD = and:int(ldc:int(12676), ldc:int(-12749))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_149:int, ldc:int(32)), ldc:int(0))) {
                        var_1_149 = and:int(var_1_149:int, ldc:int(1652176646))
                    }
                    else {
                        var_1_149 = and:int(var_1_149:int, ldc:int(-978290689))
                        
                        if (cmplt:boolean(i2l:long(var_4_CD:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            storeelement:int(var_3_7A:int[], var_4_CD:int, invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), mul:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), i2l:long(var_4_CD:int)))))
                            inc:int(var_4_CD, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_149:int, ldc:int(16384)), ldc:int(0))) {
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
        var_8_260 : int
        var_10_228 : long
        var_12_267 : int[]
        var_8_30A : int
        var_13_2BC : int
        var_14_2F9 : long
        var_14_2EF : long
        
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
        var_8_63 = and:int(ldc:int(775527596), ldc:int(677051829))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                goto(Label_0218)
            }
        }
        
        Label_0107:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(8192)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1369052692))
            goto(Label_0477)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(262144)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1338750603))
            goto(Label_0407)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0277)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(262144)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(4162), ldc:int(2)))))
        }
        
        var_8_63 = and:int(var_8_63:int, ldc:int(1739884879))
        Label_0218:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16384)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-2122372626))
            goto(Label_0477)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0407)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-1916870852))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0407)
                    }
                }
            }
        }
        
        Label_0277:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0477)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1579186721))
        }
        else {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(268435456)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(69484258))
                goto(Label_0218)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(268435456)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-1506705429))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(4819), ldc:int(1059)))))
        }
        
        Label_0407:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(32)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1093279020))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0277)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0218)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(268435456)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-1808941469))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-837050524))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(8428), ldc:int(20500)))))
            }
        }
        
        Label_0477:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(2)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(634619675))
            goto(Label_0407)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0277)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1114259550))
            goto(Label_0218)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0107)
        }
        
        var_8_260 = and:int(var_8_63:int, ldc:int(1925111167))
        var_10_228 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_228:long, ldc:long(1073741824L))) {
            loop {
                if (cmpeq:boolean(and:int(var_8_260:int, ldc:int(1048576)), ldc:int(0))) {
                    var_8_260 = and:int(var_8_260:int, ldc:int(1325836465))
                }
                else {
                    var_8_260 = and:int(var_8_260:int, ldc:int(714726820))
                    
                    if (cmpne:boolean(p0:int[], aconstnull:int[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:int[])), var_10_228:long)) {
                            var_12_267 = p0:int[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_8_260:int, ldc:int(8192)), ldc:int(0))) {
                    var_8_260 = and:int(var_8_260:int, ldc:int(-845415122))
                    var_12_267 = newarray:int[](int.class, l2i:int(var_10_228:long))
                    looporswitchbreak()
                }
            }
            
            var_8_30A = and:int(var_8_260:int, ldc:int(-444678544))
            var_13_2BC = and:int(ldc:int(-9395), ldc:int(9394))
            
            if (cmpeq:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                do {
                    if (cmpeq:boolean(and:int(var_8_30A:int, ldc:int(2)), ldc:int(0))) {
                        var_8_30A = and:int(var_8_30A:int, ldc:int(2008915191))
                        
                        if (logicalnot:boolean(getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            loopcontinue()
                        }
                        
                        var_14_2F9 = p1:long
                        goto(Label_0928)
                    }
                } while (cmpne:boolean(and:int(var_8_30A:int, ldc:int(8192)), ldc:int(0)))
                
                var_14_2EF = p1:long
                
                while (cmplt:boolean(var_14_2EF:long, p2:long)) {
                    storeelement:int(var_12_267:int[], postincrement:int(1, var_13_2BC:int), loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(var_14_2EF:long)))
                    var_14_2EF = add:long(var_14_2EF:long, p3:long)
                }
                
                return:int[](var_12_267:int[])
            }
            
            var_14_2F9 = p1:long
            Label_0763:
            
            while (cmpne:boolean(and:int(var_8_30A:int, ldc:int(2048)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_30A:int, ldc:int(262144)), ldc:int(0))) {
                    var_8_30A = and:int(var_8_30A:int, ldc:int(-163148286))
                    goto(Label_0928)
                }
                
                if (cmpeq:boolean(and:int(var_8_30A:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0828)
                }
                
                var_8_30A = and:int(var_8_30A:int, ldc:int(1274846497))
                
                if (cmpge:boolean(var_14_2F9:long, p2:long)) {
                    goto(Label_0828)
                }
                
                storeelement:int(var_12_267:int[], postincrement:int(1, var_13_2BC:int), invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), var_14_2F9:long)))
                var_14_2F9 = add:long(var_14_2F9:long, p3:long)
            }
            
            var_8_30A = and:int(var_8_30A:int, ldc:int(-1320914114))
            goto(Label_0992)
            Label_0928:
            
            while (cmpeq:boolean(and:int(var_8_30A:int, ldc:int(262144)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_30A:int, ldc:int(2)), ldc:int(0))) {
                    var_8_30A = and:int(var_8_30A:int, ldc:int(-601972254))
                    goto(Label_0828)
                }
                
                if (cmpeq:boolean(and:int(var_8_30A:int, ldc:int(4096)), ldc:int(0))) {
                    var_8_30A = and:int(var_8_30A:int, ldc:int(-652239985))
                    goto(Label_0763)
                }
                
                var_8_30A = and:int(var_8_30A:int, ldc:int(-377684619))
                
                if (cmpge:boolean(var_14_2F9:long, p2:long)) {
                    looporswitchbreak()
                }
                
                storeelement:int(var_12_267:int[], postincrement:int(1, var_13_2BC:int), loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(10012), ldc:int(-10080))))
                var_14_2F9 = add:long(var_14_2F9:long, p3:long)
            }
            
            goto(Label_0992)
            Label_0828:
            
            if (cmpne:boolean(and:int(var_8_30A:int, ldc:int(32)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_30A:int, ldc:int(4096)), ldc:int(0))) {
                    var_8_30A = and:int(var_8_30A:int, ldc:int(-1484032835))
                    goto(Label_0928)
                }
                
                if (cmpne:boolean(and:int(var_8_30A:int, ldc:int(16384)), ldc:int(0))) {
                    var_8_30A = and:int(var_8_30A:int, ldc:int(351070123))
                    goto(Label_0763)
                }
                
                return:int[](var_12_267:int[])
            }
            
            Label_0992:
            
            if (cmpne:boolean(and:int(var_8_30A:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0928)
            }
            
            if (cmpeq:boolean(and:int(var_8_30A:int, ldc:int(1024)), ldc:int(0))) {
                var_8_30A = and:int(var_8_30A:int, ldc:int(187125259))
                goto(Label_0828)
            }
            
            if (cmpeq:boolean(and:int(var_8_30A:int, ldc:int(2048)), ldc:int(0))) {
                var_8_30A = and:int(var_8_30A:int, ldc:int(1907933882))
                goto(Label_0763)
            }
            
            return:int[](var_12_267:int[])
        }
        
        return:int[](aconstnull:int[]())
    }
    
    public final long[] \u3c25\u8df4\u5654\uc246\u8258\u983f() {
        var_1_61 : int
        var_1_13A : int
        var_3_7A : long[]
        var_4_122 : byte
        var_5_12B : int
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
        var_1_61 = and:int(ldc:int(1603158325), ldc:int(1530361909))
        
        if (cmple:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(1073741824L))) {
            var_1_13A = and:int(var_1_61:int, ldc:int(-71931521))
            var_3_7A = newarray:long[](long.class, l2i:int(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)))
            
            if (cmpeq:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                do {
                    if (cmpne:boolean(and:int(var_1_13A:int, ldc:int(16)), ldc:int(0))) {
                        var_1_13A = and:int(var_1_13A:int, ldc:int(-611881097))
                        
                        if (logicalnot:boolean(getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            loopcontinue()
                        }
                        
                        var_4_122 = loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(-23181), ldc:int(23180)))
                        var_5_12B = and:int(ldc:int(-20737), ldc:int(20736))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_13A:int, ldc:int(4)), ldc:int(0))) {
                                var_1_13A = and:int(var_1_13A:int, ldc:int(-1668729689))
                            }
                            else {
                                var_1_13A = and:int(var_1_13A:int, ldc:int(-8456459))
                                
                                if (cmplt:boolean(i2l:long(var_5_12B:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                                    storeelement:long(var_3_7A:long[], var_5_12B:int, i2l:long(var_4_122:byte[expected:int]))
                                    inc:int(var_5_12B, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_13A:int, ldc:int(2)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        return:long[](var_3_7A:long[])
                    }
                } while (cmpeq:boolean(and:int(var_1_13A:int, ldc:int(134217728)), ldc:int(0)))
                
                var_4_AE = and:int(ldc:int(31512), ldc:int(-32538))
                
                while (cmplt:boolean(i2l:long(var_4_AE:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                    storeelement:long(var_3_7A:long[], var_4_AE:int, i2l:long(loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), var_4_AE:int)))
                    inc:int(var_4_AE, ldc:int(1))
                }
            }
            else {
                var_4_C4 = and:int(ldc:int(25784), ldc:int(-28409))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_13A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_13A = and:int(var_1_13A:int, ldc:int(-547950601))
                        
                        if (cmplt:boolean(i2l:long(var_4_C4:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            storeelement:long(var_3_7A:long[], var_4_C4:int, i2l:long(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), mul:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), i2l:long(var_4_C4:int))))))
                            inc:int(var_4_C4, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_13A:int, ldc:int(262144)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:long[](var_3_7A:long[])
        }
        
        return:long[](aconstnull:long[]())
    }
    
    public final long[] \u3c25\u8df4\u5654\uc246\u8258\u983f(long[] p0, long p1, long p2, long p3) {
        var_8_8D : int
        var_8_268 : int
        var_10_230 : long
        var_12_26F : long[]
        var_8_31F : int
        var_13_2C4 : int
        var_14_30E : long
        var_14_304 : long
        
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
        var_8_8D = and:int(ldc:int(901728986), ldc:int(-1128738977))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                goto(Label_0218)
            }
        }
        
        Label_0107:
        
        if (cmpne:boolean(and:int(var_8_8D:int, ldc:int(32)), ldc:int(0))) {
            var_8_8D = and:int(var_8_8D:int, ldc:int(1558282881))
            goto(Label_0483)
        }
        
        if (cmpne:boolean(and:int(var_8_8D:int, ldc:int(134217728)), ldc:int(0))) {
            var_8_8D = and:int(var_8_8D:int, ldc:int(1127460716))
            goto(Label_0390)
        }
        
        if (cmpeq:boolean(and:int(var_8_8D:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0268)
        }
        
        if (cmpne:boolean(and:int(var_8_8D:int, ldc:int(2048)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(8738), ldc:int(4562)))))
        }
        
        var_8_8D = and:int(var_8_8D:int, ldc:int(-63595016))
        Label_0218:
        
        if (cmpeq:boolean(and:int(var_8_8D:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0483)
        }
        
        if (cmpeq:boolean(and:int(var_8_8D:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0390)
        }
        
        if (cmpne:boolean(and:int(var_8_8D:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_8D:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_8D = and:int(var_8_8D:int, ldc:int(-193262977))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0390)
                    }
                }
            }
        }
        
        Label_0268:
        
        if (cmpeq:boolean(and:int(var_8_8D:int, ldc:int(64)), ldc:int(0))) {
            var_8_8D = and:int(var_8_8D:int, ldc:int(-1860364508))
            goto(Label_0483)
        }
        
        if (cmpeq:boolean(and:int(var_8_8D:int, ldc:int(4)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_8_8D:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0218)
            }
            
            if (cmpeq:boolean(and:int(var_8_8D:int, ldc:int(16)), ldc:int(0))) {
                var_8_8D = and:int(var_8_8D:int, ldc:int(-220055373))
                goto(Label_0107)
            }
            
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(3584), ldc:int(3587)))))
        }
        
        Label_0390:
        
        if (cmpeq:boolean(and:int(var_8_8D:int, ldc:int(2147483647)), ldc:int(0))) {
            var_8_8D = and:int(var_8_8D:int, ldc:int(1593631819))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_8D:int, ldc:int(2)), ldc:int(0))) {
                var_8_8D = and:int(var_8_8D:int, ldc:int(-678959008))
                goto(Label_0268)
            }
            
            if (cmpeq:boolean(and:int(var_8_8D:int, ldc:int(16)), ldc:int(0))) {
                var_8_8D = and:int(var_8_8D:int, ldc:int(1848046449))
                goto(Label_0218)
            }
            
            if (cmpeq:boolean(and:int(var_8_8D:int, ldc:int(16)), ldc:int(0))) {
                var_8_8D = and:int(var_8_8D:int, ldc:int(1361048486))
                goto(Label_0107)
            }
            
            var_8_8D = and:int(var_8_8D:int, ldc:int(901286483))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(10373), ldc:int(10369)))))
            }
        }
        
        Label_0483:
        
        if (cmpeq:boolean(and:int(var_8_8D:int, ldc:int(2048)), ldc:int(0))) {
            var_8_8D = and:int(var_8_8D:int, ldc:int(-1768032121))
            goto(Label_0390)
        }
        
        if (cmpne:boolean(and:int(var_8_8D:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0268)
        }
        
        if (cmpne:boolean(and:int(var_8_8D:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0218)
        }
        
        if (cmpne:boolean(and:int(var_8_8D:int, ldc:int(1073741824)), ldc:int(0))) {
            var_8_8D = and:int(var_8_8D:int, ldc:int(1026291039))
            goto(Label_0107)
        }
        
        var_8_268 = and:int(var_8_8D:int, ldc:int(901054423))
        var_10_230 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_230:long, ldc:long(1073741824L))) {
            loop {
                if (cmpeq:boolean(and:int(var_8_268:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_8_268 = and:int(var_8_268:int, ldc:int(918305626))
                    
                    if (cmpne:boolean(p0:long[], aconstnull:long[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:long[])), var_10_230:long)) {
                            var_12_26F = p0:long[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_268:int, ldc:int(2)), ldc:int(0))) {
                    var_8_268 = and:int(var_8_268:int, ldc:int(901278463))
                    var_12_26F = newarray:long[](long.class, l2i:int(var_10_230:long))
                    looporswitchbreak()
                }
                
                var_8_268 = and:int(var_8_268:int, ldc:int(-1410770612))
            }
            
            var_8_31F = and:int(var_8_268:int, ldc:int(-1237509513))
            var_13_2C4 = and:int(ldc:int(13836), ldc:int(-13837))
            
            if (cmpeq:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                do {
                    if (cmpeq:boolean(and:int(var_8_31F:int, ldc:int(64)), ldc:int(0))) {
                        var_8_31F = and:int(var_8_31F:int, ldc:int(-64044518))
                    }
                    else {
                        var_8_31F = and:int(var_8_31F:int, ldc:int(934571643))
                        
                        if (logicalnot:boolean(getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            loopcontinue()
                        }
                        
                        var_14_30E = p1:long
                        goto(Label_0949)
                    }
                } while (cmpeq:boolean(and:int(var_8_31F:int, ldc:int(64)), ldc:int(0)))
                
                var_14_304 = p1:long
                
                while (cmplt:boolean(var_14_304:long, p2:long)) {
                    storeelement:long(var_12_26F:long[], postincrement:int(1, var_13_2C4:int), i2l:long(loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(var_14_304:long))))
                    var_14_304 = add:long(var_14_304:long, p3:long)
                }
                
                return:long[](var_12_26F:long[])
            }
            
            var_14_30E = p1:long
            Label_0784:
            
            while (cmpne:boolean(and:int(var_8_31F:int, ldc:int(16)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_31F:int, ldc:int(2)), ldc:int(0))) {
                    var_8_31F = and:int(var_8_31F:int, ldc:int(-918646925))
                    goto(Label_0949)
                }
                
                if (cmpne:boolean(and:int(var_8_31F:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0847)
                }
                
                var_8_31F = and:int(var_8_31F:int, ldc:int(-29881382))
                
                if (cmpge:boolean(var_14_30E:long, p2:long)) {
                    goto(Label_0847)
                }
                
                storeelement:long(var_12_26F:long[], postincrement:int(1, var_13_2C4:int), i2l:long(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), var_14_30E:long))))
                var_14_30E = add:long(var_14_30E:long, p3:long)
            }
            
            var_8_31F = and:int(var_8_31F:int, ldc:int(-591758241))
            goto(Label_1003)
            Label_0949:
            
            while (cmpne:boolean(and:int(var_8_31F:int, ldc:int(67108864)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_8_31F:int, ldc:int(4)), ldc:int(0))) {
                    var_8_31F = and:int(var_8_31F:int, ldc:int(-504078850))
                    goto(Label_0847)
                }
                
                if (cmpne:boolean(and:int(var_8_31F:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0784)
                }
                
                var_8_31F = and:int(var_8_31F:int, ldc:int(-193224866))
                
                if (cmpge:boolean(var_14_30E:long, p2:long)) {
                    looporswitchbreak()
                }
                
                storeelement:long(var_12_26F:long[], postincrement:int(1, var_13_2C4:int), i2l:long(loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(-22449), ldc:int(22448)))))
                var_14_30E = add:long(var_14_30E:long, p3:long)
            }
            
            goto(Label_1003)
            Label_0847:
            
            if (cmpeq:boolean(and:int(var_8_31F:int, ldc:int(2)), ldc:int(0))) {
                var_8_31F = and:int(var_8_31F:int, ldc:int(1524991255))
            }
            else {
                if (cmpne:boolean(and:int(var_8_31F:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0949)
                }
                
                if (cmpne:boolean(and:int(var_8_31F:int, ldc:int(4)), ldc:int(0))) {
                    var_8_31F = and:int(var_8_31F:int, ldc:int(133106522))
                    goto(Label_0784)
                }
                
                return:long[](var_12_26F:long[])
            }
            
            Label_1003:
            
            if (cmpne:boolean(and:int(var_8_31F:int, ldc:int(32)), ldc:int(0))) {
                var_8_31F = and:int(var_8_31F:int, ldc:int(-950119783))
                goto(Label_0949)
            }
            
            if (cmpeq:boolean(and:int(var_8_31F:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0847)
            }
            
            if (cmpeq:boolean(and:int(var_8_31F:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0784)
            }
            
            return:long[](var_12_26F:long[])
        }
        
        return:long[](aconstnull:long[]())
    }
    
    public final float[] \u61a4\u72f1\u494c\u385b\u5bc4\u8c8a() {
        var_1_61 : int
        var_1_141 : int
        var_3_7A : float[]
        var_4_12A : float
        var_5_133 : int
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
        var_1_61 = and:int(ldc:int(-1934772404), ldc:int(805173107))
        
        if (cmple:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(1073741824L))) {
            var_1_141 = and:int(var_1_61:int, ldc:int(-577392568))
            var_3_7A = newarray:float[](float.class, l2i:int(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)))
            
            if (cmpeq:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                do {
                    if (cmpne:boolean(and:int(var_1_141:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_141 = and:int(var_1_141:int, ldc:int(801632468))
                        
                        if (logicalnot:boolean(getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            loopcontinue()
                        }
                        
                        var_4_12A = i2f:float(loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(21767), ldc:int(-24520))))
                        var_5_133 = and:int(ldc:int(3370), ldc:int(-3435))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_141:int, ldc:int(32)), ldc:int(0))) {
                                var_1_141 = and:int(var_1_141:int, ldc:int(-289030451))
                                
                                if (cmplt:boolean(i2l:long(var_5_133:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                                    storeelement:float(var_3_7A:float[], var_5_133:int, var_4_12A:float)
                                    inc:int(var_5_133, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_1_141:int, ldc:int(8192)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        return:float[](var_3_7A:float[])
                    }
                } while (cmpne:boolean(and:int(var_1_141:int, ldc:int(1048576)), ldc:int(0)))
                
                var_4_AD = and:int(ldc:int(-9484), ldc:int(1291))
                
                while (cmplt:boolean(i2l:long(var_4_AD:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                    storeelement:float(var_3_7A:float[], var_4_AD:int, i2f:float(loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), var_4_AD:int)))
                    inc:int(var_4_AD, ldc:int(1))
                }
            }
            else {
                var_4_C3 = and:int(ldc:int(-348), ldc:int(347))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_141:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_141 = and:int(var_1_141:int, ldc:int(-1615334697))
                        
                        if (cmplt:boolean(i2l:long(var_4_C3:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            storeelement:float(var_3_7A:float[], var_4_C3:int, i2f:float(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), mul:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), i2l:long(var_4_C3:int))))))
                            inc:int(var_4_C3, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_141:int, ldc:int(8192)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_141 = and:int(var_1_141:int, ldc:int(-1645758132))
                }
            }
            
            return:float[](var_3_7A:float[])
        }
        
        return:float[](aconstnull:float[]())
    }
    
    public final float[] \u61a4\u72f1\u494c\u385b\u5bc4\u8c8a(float[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_25A : int
        var_10_22D : long
        var_12_261 : float[]
        var_8_310 : int
        var_13_2B6 : int
        var_14_2FF : long
        var_14_2F5 : long
        
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
        var_8_63 = and:int(ldc:int(-1514173943), ldc:int(1029171209))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                goto(Label_0229)
            }
        }
        
        Label_0107:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-680290175))
            goto(Label_0492)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-704010160))
            goto(Label_0421)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(256)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-273945482))
            goto(Label_0299)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(29862), ldc:int(2)))))
        }
        
        var_8_63 = and:int(var_8_63:int, ldc:int(1494044525))
        Label_0229:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1648133063))
            goto(Label_0492)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0421)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1038189880))
        }
        else {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(-1358706423))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0421)
                    }
                }
            }
        }
        
        Label_0299:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-310098526))
            goto(Label_0492)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(16777216)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-1682271094))
                goto(Label_0229)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16777216)), ldc:int(0))) {
                athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(8725), ldc:int(8726)))))
            }
            
            goto(Label_0107)
        }
        
        Label_0421:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(489612129))
                goto(Label_0299)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(67108864)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(2019214033))
                goto(Label_0229)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(2140903513))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(19585), ldc:int(19589)))))
            }
        }
        
        Label_0492:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0421)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0299)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0229)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1024)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(895301147))
            goto(Label_0107)
        }
        
        var_8_25A = and:int(var_8_63:int, ldc:int(95152911))
        var_10_22D = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_22D:long, ldc:long(1073741824L))) {
            loop {
                if (cmpeq:boolean(and:int(var_8_25A:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_8_25A = and:int(var_8_25A:int, ldc:int(802895949))
                    
                    if (cmpne:boolean(p0:float[], aconstnull:float[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:float[])), var_10_22D:long)) {
                            var_12_261 = p0:float[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_8_25A:int, ldc:int(268435456)), ldc:int(0))) {
                    var_8_25A = and:int(var_8_25A:int, ldc:int(623896891))
                    var_12_261 = newarray:float[](float.class, l2i:int(var_10_22D:long))
                    looporswitchbreak()
                }
            }
            
            var_8_310 = and:int(var_8_25A:int, ldc:int(624126175))
            var_13_2B6 = and:int(ldc:int(-15074), ldc:int(15008))
            
            if (cmpeq:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                loop {
                    if (cmpeq:boolean(and:int(var_8_310:int, ldc:int(64)), ldc:int(0))) {
                        var_8_310 = and:int(var_8_310:int, ldc:int(90653933))
                        
                        if (getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)) {
                            var_14_2FF = p1:long
                            goto(Label_0925)
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_310:int, ldc:int(1024)), ldc:int(0))) {
                        var_14_2F5 = p1:long
                        
                        while (cmplt:boolean(var_14_2F5:long, p2:long)) {
                            storeelement:float(var_12_261:float[], postincrement:int(1, var_13_2B6:int), i2f:float(loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(var_14_2F5:long))))
                            var_14_2F5 = add:long(var_14_2F5:long, p3:long)
                        }
                        
                        return:float[](var_12_261:float[])
                    }
                    
                    var_8_310 = and:int(var_8_310:int, ldc:int(-347095393))
                }
            }
            else {
                var_14_2FF = p1:long
            }
            
            Label_0769:
            
            while (cmpne:boolean(and:int(var_8_310:int, ldc:int(131072)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_310:int, ldc:int(16777216)), ldc:int(0))) {
                    var_8_310 = and:int(var_8_310:int, ldc:int(-2097193723))
                    goto(Label_0925)
                }
                
                if (cmpne:boolean(and:int(var_8_310:int, ldc:int(268435456)), ldc:int(0))) {
                    var_8_310 = and:int(var_8_310:int, ldc:int(1198051454))
                    goto(Label_0844)
                }
                
                var_8_310 = and:int(var_8_310:int, ldc:int(1341355167))
                
                if (cmpge:boolean(var_14_2FF:long, p2:long)) {
                    goto(Label_0844)
                }
                
                storeelement:float(var_12_261:float[], postincrement:int(1, var_13_2B6:int), i2f:float(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), var_14_2FF:long))))
                var_14_2FF = add:long(var_14_2FF:long, p3:long)
            }
            
            var_8_310 = and:int(var_8_310:int, ldc:int(-86345839))
            goto(Label_0988)
            Label_0925:
            
            while (cmpne:boolean(and:int(var_8_310:int, ldc:int(131072)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_310:int, ldc:int(65536)), ldc:int(0))) {
                    var_8_310 = and:int(var_8_310:int, ldc:int(-631415811))
                    goto(Label_0844)
                }
                
                if (cmpeq:boolean(and:int(var_8_310:int, ldc:int(1)), ldc:int(0))) {
                    var_8_310 = and:int(var_8_310:int, ldc:int(-1475490850))
                    goto(Label_0769)
                }
                
                var_8_310 = and:int(var_8_310:int, ldc:int(1032018765))
                
                if (cmpge:boolean(var_14_2FF:long, p2:long)) {
                    looporswitchbreak()
                }
                
                storeelement:float(var_12_261:float[], postincrement:int(1, var_13_2B6:int), i2f:float(loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(19777), ldc:int(-19784)))))
                var_14_2FF = add:long(var_14_2FF:long, p3:long)
            }
            
            goto(Label_0988)
            Label_0844:
            
            if (cmpeq:boolean(and:int(var_8_310:int, ldc:int(64)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_310:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0925)
                }
                
                if (cmpeq:boolean(and:int(var_8_310:int, ldc:int(4194304)), ldc:int(0))) {
                    return:float[](var_12_261:float[])
                }
                
                goto(Label_0769)
            }
            
            Label_0988:
            
            if (cmpeq:boolean(and:int(var_8_310:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0925)
            }
            
            if (cmpeq:boolean(and:int(var_8_310:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0844)
            }
            
            if (cmpeq:boolean(and:int(var_8_310:int, ldc:int(2147483647)), ldc:int(0))) {
                var_8_310 = and:int(var_8_310:int, ldc:int(-1678220267))
                goto(Label_0769)
            }
            
            return:float[](var_12_261:float[])
        }
        
        return:float[](aconstnull:float[]())
    }
    
    public final double[] \u4f52\u7bad\u527a\u3a62\uc9f6\u99f7() {
        var_1_61 : int
        var_1_14A : int
        var_3_7A : double[]
        var_5_132 : double
        var_7_13B : int
        var_4_B5 : int
        var_4_CB : int
        
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
        var_1_61 = and:int(ldc:int(1716591338), ldc:int(-1521027733))
        
        if (cmple:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(1073741824L))) {
            var_1_14A = and:int(var_1_61:int, ldc:int(710932131))
            var_3_7A = newarray:double[](double.class, l2i:int(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)))
            
            if (cmpeq:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                do {
                    if (cmpne:boolean(and:int(var_1_14A:int, ldc:int(1)), ldc:int(0))) {
                        var_1_14A = and:int(var_1_14A:int, ldc:int(-498344245))
                    }
                    else {
                        var_1_14A = and:int(var_1_14A:int, ldc:int(1892784237))
                        
                        if (logicalnot:boolean(getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            loopcontinue()
                        }
                        
                        var_5_132 = i2d:double(loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(20646), ldc:int(-20647))))
                        var_7_13B = and:int(ldc:int(-20218), ldc:int(20169))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_14A:int, ldc:int(4096)), ldc:int(0))) {
                                var_1_14A = and:int(var_1_14A:int, ldc:int(-336536022))
                            }
                            else {
                                var_1_14A = and:int(var_1_14A:int, ldc:int(2129663282))
                                
                                if (cmplt:boolean(i2l:long(var_7_13B:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                                    storeelement:double(var_3_7A:double[], var_7_13B:int, var_5_132:double)
                                    inc:int(var_7_13B, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_1_14A:int, ldc:int(32)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        return:double[](var_3_7A:double[])
                    }
                } while (cmpne:boolean(and:int(var_1_14A:int, ldc:int(8192)), ldc:int(0)))
                
                var_4_B5 = and:int(ldc:int(-2624), ldc:int(566))
                
                while (cmplt:boolean(i2l:long(var_4_B5:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                    storeelement:double(var_3_7A:double[], var_4_B5:int, i2d:double(loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), var_4_B5:int)))
                    inc:int(var_4_B5, ldc:int(1))
                }
            }
            else {
                var_4_CB = and:int(ldc:int(-23960), ldc:int(23958))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_14A:int, ldc:int(1)), ldc:int(0))) {
                        var_1_14A = and:int(var_1_14A:int, ldc:int(792683470))
                    }
                    else {
                        var_1_14A = and:int(var_1_14A:int, ldc:int(-1260684635))
                        
                        if (cmplt:boolean(i2l:long(var_4_CB:int), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            storeelement:double(var_3_7A:double[], var_4_CB:int, i2d:double(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), mul:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5654\u3776\u946b\uc87f\ub70c\uc2e8, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), i2l:long(var_4_CB:int))))))
                            inc:int(var_4_CB, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_14A:int, ldc:int(262144)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:double[](var_3_7A:double[])
        }
        
        return:double[](aconstnull:double[]())
    }
    
    public final double[] \u4f52\u7bad\u527a\u3a62\uc9f6\u99f7(double[] p0, long p1, long p2, long p3) {
        var_8_63 : int
        var_8_24E : int
        var_10_215 : long
        var_12_255 : double[]
        var_8_32B : int
        var_13_2AA : int
        var_14_2F3 : long
        var_14_2E9 : long
        
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
        var_8_63 = and:int(ldc:int(-1029146394), ldc:int(-486687902))
        
        if (cmpge:boolean(p1:long, ldc:long(0L))) {
            if (cmplt:boolean(p1:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                goto(Label_0205)
            }
        }
        
        Label_0107:
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(8192)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1021270861))
            goto(Label_0468)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(8388608)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(2000187792))
            goto(Label_0397)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0275)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
            athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(23842), ldc:int(8262)))))
        }
        
        Label_0205:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0468)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(65536)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1928008337))
            goto(Label_0397)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1048576)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(434543612))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(2130427759))
            
            if (cmpge:boolean(p2:long, ldc:long(0L))) {
                if (cmple:boolean(p2:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                    if (cmpge:boolean(p2:long, p1:long)) {
                        goto(Label_0397)
                    }
                }
            }
        }
        
        Label_0275:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(131072)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1654773779))
            goto(Label_0468)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(134217728)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(1019616373))
        }
        else {
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0205)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1073741824)), ldc:int(0))) {
                athrow(initobject:ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(1035), ldc:int(8771)))))
            }
            
            goto(Label_0107)
        }
        
        Label_0397:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0275)
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2147483647)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(1416619921))
                goto(Label_0205)
            }
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-1808479502))
                goto(Label_0107)
            }
            
            var_8_63 = and:int(var_8_63:int, ldc:int(1592655603))
            
            if (cmplt:boolean(p3:long, ldc:long(1L))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(324), ldc:int(11303)))))
            }
        }
        
        Label_0468:
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(536870912)), ldc:int(0))) {
            var_8_63 = and:int(var_8_63:int, ldc:int(-1127546134))
            goto(Label_0397)
        }
        
        if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0275)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0205)
        }
        
        if (cmpne:boolean(and:int(var_8_63:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0107)
        }
        
        var_8_24E = and:int(var_8_63:int, ldc:int(2130411510))
        var_10_215 = d2l:long(invokestatic:double(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8df4\u5fe1\u4c2b\uf94d\u718f\ud217, div:double(l2d:double(sub:long(p2:long, p1:long)), l2d:double(p3:long))))
        
        if (cmple:boolean(var_10_215:long, ldc:long(1073741824L))) {
            loop {
                if (cmpeq:boolean(and:int(var_8_24E:int, ldc:int(1)), ldc:int(0))) {
                    var_8_24E = and:int(var_8_24E:int, ldc:int(2062120935))
                    
                    if (cmpne:boolean(p0:double[], aconstnull:double[]())) {
                        if (cmpge:boolean(i2l:long(arraylength:int(p0:double[])), var_10_215:long)) {
                            var_12_255 = p0:double[]
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_24E:int, ldc:int(4096)), ldc:int(0))) {
                    var_8_24E = and:int(var_8_24E:int, ldc:int(1269692915))
                    var_12_255 = newarray:double[](double.class, l2i:int(var_10_215:long))
                    looporswitchbreak()
                }
                
                var_8_24E = and:int(var_8_24E:int, ldc:int(2072379369))
            }
            
            var_8_32B = and:int(var_8_24E:int, ldc:int(2063299823))
            var_13_2AA = and:int(ldc:int(17671), ldc:int(-17784))
            
            if (cmpeq:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                loop {
                    if (cmpne:boolean(and:int(var_8_32B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_8_32B = and:int(var_8_32B:int, ldc:int(1136424551))
                        
                        if (getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)) {
                            var_14_2F3 = p1:long
                            goto(Label_0897)
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_8_32B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_14_2E9 = p1:long
                        
                        while (cmplt:boolean(var_14_2E9:long, p2:long)) {
                            storeelement:double(var_12_255:double[], postincrement:int(1, var_13_2AA:int), i2d:double(loadelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(var_14_2E9:long))))
                            var_14_2E9 = add:long(var_14_2E9:long, p3:long)
                        }
                        
                        return:double[](var_12_255:double[])
                    }
                    
                    var_8_32B = and:int(var_8_32B:int, ldc:int(402026500))
                }
            }
            else {
                var_14_2F3 = p1:long
            }
            
            Label_0757:
            
            while (cmpne:boolean(and:int(var_8_32B:int, ldc:int(2)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_32B:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0897)
                }
                
                if (cmpeq:boolean(and:int(var_8_32B:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0797)
                }
                
                var_8_32B = and:int(var_8_32B:int, ldc:int(-558894870))
                
                if (cmpge:boolean(var_14_2F3:long, p2:long)) {
                    goto(Label_0797)
                }
                
                storeelement:double(var_12_255:double[], postincrement:int(1, var_13_2AA:int), i2d:double(invokevirtual:byte(Unsafe::getByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), var_14_2F3:long))))
                var_14_2F3 = add:long(var_14_2F3:long, p3:long)
            }
            
            goto(Label_0938)
            Label_0897:
            
            while (cmpne:boolean(and:int(var_8_32B:int, ldc:int(2)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_8_32B:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0797)
                }
                
                if (cmpeq:boolean(and:int(var_8_32B:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0757)
                }
                
                var_8_32B = and:int(var_8_32B:int, ldc:int(2008628203))
                
                if (cmpge:boolean(var_14_2F3:long, p2:long)) {
                    looporswitchbreak()
                }
                
                storeelement:double(var_12_255:double[], postincrement:int(1, var_13_2AA:int), i2d:double(loadelement:byte[expected:int](getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int(ldc:int(-23876), ldc:int(7235)))))
                var_14_2F3 = add:long(var_14_2F3:long, p3:long)
            }
            
            goto(Label_0938)
            Label_0797:
            
            if (cmpeq:boolean(and:int(var_8_32B:int, ldc:int(2147483647)), ldc:int(0))) {
                var_8_32B = and:int(var_8_32B:int, ldc:int(2072093478))
            }
            else {
                if (cmpeq:boolean(and:int(var_8_32B:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0897)
                }
                
                if (cmpeq:boolean(and:int(var_8_32B:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_8_32B = and:int(var_8_32B:int, ldc:int(-749887267))
                    goto(Label_0757)
                }
                
                return:double[](var_12_255:double[])
            }
            
            Label_0938:
            
            if (cmpeq:boolean(and:int(var_8_32B:int, ldc:int(8192)), ldc:int(0))) {
                var_8_32B = and:int(var_8_32B:int, ldc:int(-1212648496))
                goto(Label_0897)
            }
            
            if (cmpne:boolean(and:int(var_8_32B:int, ldc:int(16)), ldc:int(0))) {
                var_8_32B = and:int(var_8_32B:int, ldc:int(1012245397))
                goto(Label_0797)
            }
            
            if (cmpeq:boolean(and:int(var_8_32B:int, ldc:int(2097152)), ldc:int(0))) {
                var_8_32B = and:int(var_8_32B:int, ldc:int(-333547232))
                goto(Label_0757)
            }
            
            return:double[](var_12_255:double[])
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
            invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), p0:long), invokevirtual:byte(Byte::byteValue, checkcast:Byte(java.lang.Byte.class, p1:Object[expected:Byte])))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u62da\u40a9\u3bc9\u527a\u8389\u62da(long p0, boolean p1) {
        var_4_E3 : int
        var_4_A0 : int
        stack_135_0 : byte[] [generated]
        stack_135_1 : int [generated]
        stack_135_2 : int [generated]
        stack_102_0 : Unsafe [generated]
        expr_D1 : long [generated]
        stack_102_3 : int [generated]
        
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
            var_4_E3 = and:int(ldc:int(2016724591), ldc:int(-1183463608))
            
            if (cmpeq:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                loop {
                    if (cmpeq:boolean(and:int(var_4_E3:int, ldc:int(131072)), ldc:int(0))) {
                        var_4_E3 = and:int(var_4_E3:int, ldc:int(1015018977))
                        
                        if (getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)) {
                            athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(363), ldc:int(366)))))
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_4_E3:int, ldc:int(2097152)), ldc:int(0))) {
                        var_4_A0 = and:int(var_4_E3:int, ldc:int(1025889986))
                        stack_135_0 = getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
                        stack_135_1 = l2i:int(p0:long)
                        
                        if (cmpne:boolean(p1:boolean[expected:int], and:int(ldc:int(4099), ldc:int(2849)))) {
                            var_4_A0 = and:int(var_4_A0:int, ldc:int(1031599524))
                            stack_135_2 = and:int[expected:byte](ldc:int(813), ldc:int(-9022))
                        }
                        else {
                            stack_135_2 = and:int[expected:byte](ldc:int(33), ldc:int(13331))
                        }
                        
                        storeelement:byte(stack_135_0:byte[], stack_135_1:int, stack_135_2:byte)
                        looporswitchbreak()
                    }
                    
                    var_4_E3 = and:int(var_4_E3:int, ldc:int(794463064))
                }
            }
            else {
                stack_102_0 = getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258)
                expr_D1 = add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), p0:long)
                
                if (cmpne:boolean(p1:boolean[expected:int], and:int(ldc:int(2211), ldc:int(16653)))) {
                    var_4_E3 = and:int(var_4_E3:int, ldc:int(2138353522))
                    stack_102_3 = and:int(ldc:int(-23405), ldc:int(19212))
                }
                else {
                    stack_102_3 = and:int(ldc:int(65), ldc:int(28801))
                }
                
                invokevirtual:void(Unsafe::putByte, stack_102_0:Unsafe, expr_D1:long, stack_102_3:byte)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u392e\u6cfe\u5fe1\u4cd9\u8258\u69d9(long p0, byte p1) {
        var_4_63 : int
        
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
            var_4_63 = and:int(ldc:int(229251837), ldc:int(-1428270263))
            
            if (cmpge:boolean(p1:byte, ldc:byte(0))) {
                if (cmple:boolean(p1:byte[expected:int], and:int(ldc:int(2307), ldc:int(5189)))) {
                    goto(Label_0177)
                }
            }
            
            Label_0105:
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0212)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(1)), ldc:int(0))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(66), ldc:int(68)))))
            }
            
            var_4_63 = and:int(var_4_63:int, ldc:int(-296241035))
            Label_0177:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(262144)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0105)
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(1138823781))
                
                if (cmpne:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                    invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), p0:long), p1:byte)
                    return:void()
                }
            }
            
            Label_0212:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0177)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0105)
            }
            
            if (getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)) {
                athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(10278), ldc:int(10275)))))
            }
            
            storeelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(p0:long), p1:byte)
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
            invokevirtual:void(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\uc9f6\u3d64\uc2bd\u98a4\u8bb0\u494c, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, p0:long, p1:short)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \uc9f6\u3d64\uc2bd\u98a4\u8bb0\u494c(long p0, short p1) {
        var_4_63 : int
        
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
            var_4_63 = and:int(ldc:int(23832884), ldc:int(1533800179))
            
            if (cmpge:boolean(p1:short, ldc:short(0))) {
                if (cmple:boolean(p1:short[expected:int], xor:int(ldc:int(4128), ldc:int(4129)))) {
                    goto(Label_0178)
                }
            }
            
            Label_0105:
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(1)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1523667840))
                goto(Label_0211)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(524288)), ldc:int(0))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(487), ldc:int(30238)))))
            }
            
            Label_0178:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1048576)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0105)
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(393210037))
                
                if (cmpne:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                    invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), p0:long), i2b:byte(p1:short[expected:int]))
                    return:void()
                }
            }
            
            Label_0211:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0178)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(8)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(162947375))
                goto(Label_0105)
            }
            
            if (getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)) {
                athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(1024), ldc:int(1029)))))
            }
            
            storeelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(p0:long), i2b:byte(p1:short[expected:int]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \ucfaf\u5654\ud36e\u6198\ufe34\u8640(long p0, int p1) {
        var_4_63 : int
        
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
            var_4_63 = and:int(ldc:int(-62537289), ldc:int(-1091661125))
            
            if (cmpge:boolean(p1:int, ldc:int(0))) {
                if (cmple:boolean(p1:int, xor:int(ldc:int(3072), ldc:int(3073)))) {
                    goto(Label_0178)
                }
            }
            
            Label_0105:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0224)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(2177), ldc:int(2183)))))
            }
            
            var_4_63 = and:int(var_4_63:int, ldc:int(149910432))
            Label_0178:
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4096)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1046824575))
            }
            else {
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0105)
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(-1460302419))
                
                if (cmpne:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                    invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), p0:long), i2b:byte(p1:int))
                    return:void()
                }
            }
            
            Label_0224:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0178)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4096)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(884528635))
                goto(Label_0105)
            }
            
            if (getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)) {
                athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(16392), ldc:int(16397)))))
            }
            
            storeelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(p0:long), i2b:byte(p1:int))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u8709\u3bd6\u071d\u760c\u8bb0\u51fa(long p0, long p1) {
        var_5_63 : int
        
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
            var_5_63 = and:int(ldc:int(-1360582636), ldc:int(1265106308))
            
            if (cmpge:boolean(p1:long, ldc:long(0L))) {
                if (cmple:boolean(p1:long, ldc:long(1L))) {
                    goto(Label_0164)
                }
            }
            
            Label_0107:
            
            if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0199)
            }
            
            if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(4096)), ldc:int(0))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(26692), ldc:int(26690)))))
            }
            
            Label_0164:
            
            if (cmpne:boolean(and:int(var_5_63:int, ldc:int(4194304)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0107)
                }
                
                var_5_63 = and:int(var_5_63:int, ldc:int(1995947709))
                
                if (cmpne:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                    invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), p0:long), i2b:byte(l2i:int(p1:long)))
                    return:void()
                }
            }
            
            Label_0199:
            
            if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0164)
            }
            
            if (cmpne:boolean(and:int(var_5_63:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            if (getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)) {
                athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(5133), ldc:int(5)))))
            }
            
            storeelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(p0:long), i2b:byte(l2i:int(p1:long)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u59ec\u47c2\u7043\u51b2\u9255\u12cb(long p0, float p1) {
        var_4_7A : int
        
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
            var_4_7A = and:int(ldc:int(-341783329), ldc:int(1940417263))
            
            if (cmpne:boolean(f2d:double(p1:float), ldc:double(0.0))) {
                if (cmpne:boolean(f2d:double(p1:float), ldc:double(1.0))) {
                    athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(2245), ldc:int(2243)))))
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_4_7A:int, ldc:int(1)), ldc:int(0))) {
                    var_4_7A = and:int(var_4_7A:int, ldc:int(-886154017))
                    
                    if (cmpne:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                        invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), p0:long), i2b:byte(f2i:int(p1:float)))
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_7A:int, ldc:int(4096)), ldc:int(0))) {
                    var_4_7A = and:int(var_4_7A:int, ldc:int(-1855998747))
                }
                else {
                    if (logicalnot:boolean(getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                        storeelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(p0:long), i2b:byte(f2i:int(p1:float)))
                        looporswitchbreak()
                    }
                    
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(4113), ldc:int(4116)))))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \ub171\u183a\ubefe\u36d3\uf9c5\u8258(long p0, double p1) {
        var_5_79 : int
        
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
            var_5_79 = and:int(ldc:int(1738985675), ldc:int(-33554467))
            
            if (cmpne:boolean(p1:double, ldc:double(0.0))) {
                if (cmpne:boolean(p1:double, ldc:double(1.0))) {
                    athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(-31872), ldc:int(-31866)))))
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_5_79:int, ldc:int(1024)), ldc:int(0))) {
                    var_5_79 = and:int(var_5_79:int, ldc:int(667835133))
                    
                    if (cmpne:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), ldc:long(0L))) {
                        invokevirtual:void(Unsafe::putByte, getstatic:Unsafe(\ube23\u67d0\u3504\u0a06\u718f\uc910::\u4ab3\u8d98\uc29a\u71ae\u759a\u8258), add:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u385b\u9033\u3bd6\u72f1\u9937\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), p0:long), i2b:byte(d2i:int(p1:double)))
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_5_79:int, ldc:int(32)), ldc:int(0))) {
                    var_5_79 = and:int(var_5_79:int, ldc:int(1485227537))
                }
                else {
                    if (logicalnot:boolean(getfield:boolean(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6d99\ubefe\ub8be\u71ae\u3504\u76bc, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                        storeelement:byte(getfield:byte[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u5db4\u98a4\u0a06\u3d4b\ubff1\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), l2i:int(p0:long), i2b:byte(d2i:int(p1:double)))
                        looporswitchbreak()
                    }
                    
                    athrow(initobject:IllegalAccessError(IllegalAccessError::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(18496), ldc:int(18501)))))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u0b8e\u1833\u62da\u8d98\u8308 \u624e\u12cb\u34df\u61a4\u6c56\u99f7(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u0b8e\u1833\u62da\u8d98\u8308 p0) {
        var_2_61 : int
        var_4_137 : \u52d3\u0b8e\u1833\u62da\u8d98\u8308
        var_2_1F0 : int
        var_5_14B : int
        var_6_1F2 : long
        var_2_368 : int
        var_8_36E : Future[]
        var_2_4D0 : int
        var_9_37D : int
        var_2_3FD : int
        var_10_404 : long
        var_2_440 : int
        stack_457_0 : long [generated]
        var_2_456 : int
        var_12_457 : long
        var_2_465 : int
        var_2_4DF : int
        var_10_4E1 : long
        var_2_5A9 : int
        var_10_5AB : long
        var_2_5BA : int
        var_2_623 : int
        
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
        var_2_61 = and:int(ldc:int(417244723), ldc:int(-1647577541))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0225)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0179)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(676093182))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(2081335295))
                
                if (cmpeq:boolean(p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, aconstnull:\u52d3\u0b8e\u1833\u62da\u8d98\u8308())) {
                    goto(Label_0225)
                }
            }
            
            Label_0139:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0225)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8192)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(-1085294665))
                
                if (cmpeq:boolean(invokevirtual:long(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::\u516c\u516c\uc31c\u71ae\u51b2\uff55, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2]), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                    var_4_137 = initobject:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::<init>, invokevirtual:long(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::\u516c\u516c\uc31c\u71ae\u51b2\uff55, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2]), and:int[expected:boolean](ldc:int(-15658), ldc:int(10537)))
                    var_2_1F0 = and:int(var_2_61:int, ldc:int(-1169162633))
                    var_5_14B = l2i:int(invokestatic:long(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8d90\u64f2\u71ae\u927d\uff55\uc29a, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), i2l:long(invokestatic:int(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u392e\u8bb0\u8753\u965f\u97e6\u52d3))))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(524288)), ldc:int(0))) {
                            var_2_1F0 = and:int(var_2_1F0:int, ldc:int(1068087566))
                            goto(Label_0468)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(16)), ldc:int(0))) {
                            var_2_1F0 = and:int(var_2_1F0:int, ldc:int(2013895687))
                            goto(Label_0440)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_1F0:int, ldc:int(512)), ldc:int(0))) {
                            var_2_1F0 = and:int(var_2_1F0:int, ldc:int(-1318129925))
                            
                            if (cmple:boolean(var_5_14B:int, and:int(ldc:int(2178), ldc:int(16386)))) {
                                goto(Label_0468)
                            }
                        }
                        
                        Label_0392:
                        
                        if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0468)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(16)), ldc:int(0))) {
                            var_2_1F0 = and:int(var_2_1F0:int, ldc:int(1499541818))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(32)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_1F0 = and:int(var_2_1F0:int, ldc:int(412790647))
                            
                            if (cmpge:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), invokestatic:long(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u7006\ubded\u8aa5\u8c8a\ubcb0\u416d))) {
                                var_6_1F2 = div:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), i2l:long(var_5_14B:int))
                                goto(Label_0819)
                            }
                        }
                        
                        Label_0440:
                        
                        if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(16384)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_2_1F0:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_0392)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(268435456)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_1F0 = and:int(var_2_1F0:int, ldc:int(1977348031))
                        }
                        
                        Label_0468:
                        
                        if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0440)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(8)), ldc:int(0))) {
                            var_2_1F0 = and:int(var_2_1F0:int, ldc:int(-77660557))
                            var_6_1F2 = ldc:long(0L)
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0500:
                    
                    if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(1024)), ldc:int(0))) {
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(1778569228))
                        goto(Label_0819)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(-188339359))
                        goto(Label_0727)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(1024)), ldc:int(0))) {
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(-181683312))
                        goto(Label_0643)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(1024)), ldc:int(0))) {
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(1416044458))
                    }
                    else {
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(-1200949645))
                        
                        if (cmpge:boolean(var_6_1F2:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            return:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(var_4_137:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
                        }
                    }
                    
                    Label_0580:
                    
                    if (cmpne:boolean(and:int(var_2_1F0:int, ldc:int(8)), ldc:int(0))) {
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(892298425))
                        goto(Label_0819)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_1F0:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(-1041299252))
                        goto(Label_0727)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(1)), ldc:int(0))) {
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(-1016277667))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_2_1F0:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0500)
                        }
                        
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(-1752439233))
                    }
                    
                    Label_0643:
                    
                    if (cmpne:boolean(and:int(var_2_1F0:int, ldc:int(8)), ldc:int(0))) {
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(-244159596))
                        goto(Label_0819)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(8192)), ldc:int(0))) {
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(418552502))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(8192)), ldc:int(0))) {
                            var_2_1F0 = and:int(var_2_1F0:int, ldc:int(630587644))
                            goto(Label_0500)
                        }
                        
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(-140579021))
                        invokevirtual:void(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u392e\u6cfe\u5fe1\u4cd9\u8258\u69d9, var_4_137:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_6_1F2:long, i2b:byte(and:byte(invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_6_1F2:long), invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_6_1F2:long))))
                    }
                    
                    Label_0727:
                    
                    if (cmpne:boolean(and:int(var_2_1F0:int, ldc:int(256)), ldc:int(0))) {
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(1828340613))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(1)), ldc:int(0))) {
                            var_2_1F0 = and:int(var_2_1F0:int, ldc:int(1584425985))
                            goto(Label_0643)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(1)), ldc:int(0))) {
                            var_2_1F0 = and:int(var_2_1F0:int, ldc:int(462851215))
                            goto(Label_0500)
                        }
                        
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(-265355405))
                        var_6_1F2 = add:long(var_6_1F2:long, ldc:long(1L))
                        goto(Label_0500)
                    }
                    
                    Label_0819:
                    
                    if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0727)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(1024)), ldc:int(0))) {
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(-645017664))
                        goto(Label_0643)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_1F0:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(1896003968))
                        goto(Label_0500)
                    }
                    
                    var_2_368 = and:int(var_2_1F0:int, ldc:int(-1195381065))
                    var_8_36E = newarray:Future[](java.util.concurrent.Future.class, var_5_14B:int)
                    var_2_4D0 = and:int(var_2_368:int, ldc:int(-1143232585))
                    var_9_37D = and:int(ldc:int(10592), ldc:int(-10601))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_2_4D0:int, ldc:int(8)), ldc:int(0))) {
                            var_2_4D0 = and:int(var_2_4D0:int, ldc:int(241057536))
                            goto(Label_1196)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4D0:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0976)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4D0:int, ldc:int(32)), ldc:int(0))) {
                            var_2_4D0 = and:int(var_2_4D0:int, ldc:int(1095064890))
                        }
                        else {
                            var_2_4D0 = and:int(var_2_4D0:int, ldc:int(2107555583))
                            
                            if (cmpge:boolean(var_9_37D:int, var_5_14B:int)) {
                                goto(Label_1191)
                            }
                        }
                        
                        Label_0949:
                        
                        if (cmpeq:boolean(and:int(var_2_4D0:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1196)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_4D0:int, ldc:int(1)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_2_4D0:int, ldc:int(1)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_4D0 = and:int(var_2_4D0:int, ldc:int(-557124045))
                        }
                        
                        Label_0976:
                        
                        if (cmpeq:boolean(and:int(var_2_4D0:int, ldc:int(268435456)), ldc:int(0))) {
                            var_2_4D0 = and:int(var_2_4D0:int, ldc:int(969768579))
                            goto(Label_1196)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4D0:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_2_4D0 = and:int(var_2_4D0:int, ldc:int(-870766054))
                            goto(Label_0949)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4D0:int, ldc:int(8)), ldc:int(0))) {
                            var_2_3FD = and:int(var_2_4D0:int, ldc:int(-184631501))
                            var_10_404 = mul:long(i2l:long(var_9_37D:int), var_6_1F2:long)
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_2_3FD:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_2_440 = and:int(var_2_3FD:int, ldc:int(811337795))
                                }
                                else {
                                    var_2_440 = and:int(var_2_3FD:int, ldc:int(2024531827))
                                    
                                    if (cmpne:boolean(var_9_37D:int, sub:int(var_5_14B:int, and:int(ldc:int(30337), ldc:int(99))))) {
                                        stack_457_0 = add:long(var_10_404:long, var_6_1F2:long)
                                        looporswitchbreak()
                                    }
                                }
                                
                                if (cmpne:boolean(and:int(var_2_440:int, ldc:int(268435456)), ldc:int(0))) {
                                    var_2_440 = and:int(var_2_440:int, ldc:int(2062286523))
                                    stack_457_0 = getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
                                    looporswitchbreak()
                                }
                                
                                var_2_3FD = and:int(var_2_440:int, ldc:int(1946025628))
                            }
                            
                            var_2_456 = and:int(var_2_440:int, ldc:int(1486614199))
                            var_12_457 = stack_457_0:long
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_2_456:int, ldc:int(32)), ldc:int(0))) {
                                    var_2_465 = and:int(var_2_456:int, ldc:int(-1419544897))
                                }
                                else {
                                    var_2_465 = and:int(var_2_456:int, ldc:int(-1696616713))
                                    storeelement:Future<?>(var_8_36E:Future<?>[], var_9_37D:int, invokestatic:Future<?>(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u927d\u4c04\u9937\u8308\u51fa\u960f, initobject:\u71f1\u8413\u67e9\ub32d\u494c\u839e(\u71f1\u8413\u67e9\ub32d\u494c\u839e::<init>, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_404:long, var_12_457:long, var_4_137:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)))
                                }
                                
                                if (cmpne:boolean(and:int(var_2_465:int, ldc:int(16)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                var_2_456 = and:int(var_2_465:int, ldc:int(911273291))
                            }
                            
                            var_2_4D0 = and:int(var_2_465:int, ldc:int(-1214318925))
                            inc:int(var_9_37D, ldc:int(1))
                            loopcontinue()
                        }
                        
                        loopcontinue()
                        
                        try {
                            Label_1191:
                            invokestatic:void(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u9033\u6fb0\u7330\u8aa5\u67d0\u5245, var_8_36E:Future<?>[])
                            Label_1196:
                            
                            if (cmpeq:boolean(and:int(var_2_4D0:int, ldc:int(1024)), ldc:int(0))) {
                                var_2_4D0 = and:int(var_2_4D0:int, ldc:int(-91360961))
                                goto(Label_0976)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_4D0:int, ldc:int(131072)), ldc:int(0))) {
                                goto(Label_0949)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_4D0:int, ldc:int(268435456)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_4D0 = and:int(var_2_4D0:int, ldc:int(1357882939))
                        }
                        catch (java.lang.InterruptedException var_9_4D8) {
                            var_2_4DF = and:int(var_2_4D0:int, ldc:int(314570679))
                            var_10_4E1 = ldc:long(0L)
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_2_4DF:int, ldc:int(8192)), ldc:int(0))) {
                                    var_2_4DF = and:int(var_2_4DF:int, ldc:int(1816913136))
                                    goto(Label_1394)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4DF:int, ldc:int(512)), ldc:int(0))) {
                                    var_2_4DF = and:int(var_2_4DF:int, ldc:int(-2078761212))
                                    goto(Label_1344)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4DF:int, ldc:int(8192)), ldc:int(0))) {
                                    var_2_4DF = and:int(var_2_4DF:int, ldc:int(-1340166145))
                                    
                                    if (cmpge:boolean(var_10_4E1:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                                        goto(Label_1435)
                                    }
                                }
                                
                                Label_1306:
                                
                                if (cmpne:boolean(and:int(var_2_4DF:int, ldc:int(256)), ldc:int(0))) {
                                    goto(Label_1394)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4DF:int, ldc:int(8)), ldc:int(0))) {
                                    var_2_4DF = and:int(var_2_4DF:int, ldc:int(-881698732))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_2_4DF:int, ldc:int(512)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_2_4DF = and:int(var_2_4DF:int, ldc:int(-24381517))
                                }
                                
                                Label_1344:
                                
                                if (cmpne:boolean(and:int(var_2_4DF:int, ldc:int(1024)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_2_4DF:int, ldc:int(524288)), ldc:int(0))) {
                                        goto(Label_1306)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4DF:int, ldc:int(16)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_2_4DF = and:int(var_2_4DF:int, ldc:int(2121248631))
                                    invokevirtual:void(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u392e\u6cfe\u5fe1\u4cd9\u8258\u69d9, var_4_137:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_4E1:long, i2b:byte(and:byte(invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_4E1:long), invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_4E1:long))))
                                }
                                
                                Label_1394:
                                
                                if (cmpeq:boolean(and:int(var_2_4DF:int, ldc:int(8192)), ldc:int(0))) {
                                    goto(Label_1344)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4DF:int, ldc:int(256)), ldc:int(0))) {
                                    goto(Label_1306)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4DF:int, ldc:int(2)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_4DF = and:int(var_2_4DF:int, ldc:int(-1286674637))
                                var_10_4E1 = add:long(var_10_4E1:long, ldc:long(1L))
                            }
                        }
                        catch (java.util.concurrent.ExecutionException var_9_5A2) {
                            var_2_5A9 = and:int(var_2_4D0:int, ldc:int(1584375359))
                            var_10_5AB = ldc:long(0L)
                            
                            loop {
                                if (cmpne:boolean(and:int(var_2_5A9:int, ldc:int(4)), ldc:int(0))) {
                                    var_2_5BA = and:int(var_2_5A9:int, ldc:int(752343583))
                                    goto(Label_1534)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_5A9:int, ldc:int(524288)), ldc:int(0))) {
                                    var_2_5BA = and:int(var_2_5A9:int, ldc:int(-1150365983))
                                }
                                else {
                                    var_2_5BA = and:int(var_2_5A9:int, ldc:int(1071316795))
                                    
                                    if (cmpge:boolean(var_10_5AB:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                                        looporswitchbreak()
                                    }
                                }
                                
                                Label_1503:
                                
                                if (cmpne:boolean(and:int(var_2_5BA:int, ldc:int(16)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_2_5BA:int, ldc:int(8)), ldc:int(0))) {
                                        var_2_5A9 = and:int(var_2_5BA:int, ldc:int(1423891916))
                                        loopcontinue()
                                    }
                                    
                                    var_2_5BA = and:int(var_2_5BA:int, ldc:int(-229722381))
                                }
                                
                                Label_1534:
                                
                                if (cmpeq:boolean(and:int(var_2_5BA:int, ldc:int(8192)), ldc:int(0))) {
                                    var_2_5BA = and:int(var_2_5BA:int, ldc:int(847013805))
                                    goto(Label_1503)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_5BA:int, ldc:int(2)), ldc:int(0))) {
                                    var_2_5A9 = and:int(var_2_5BA:int, ldc:int(999028671))
                                }
                                else {
                                    var_2_623 = and:int(var_2_5BA:int, ldc:int(-1252329669))
                                    invokevirtual:void(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u392e\u6cfe\u5fe1\u4cd9\u8258\u69d9, var_4_137:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_5AB:long, i2b:byte(and:byte(invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_5AB:long), invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_5AB:long))))
                                    var_2_5A9 = and:int(var_2_623:int, ldc:int(1936441275))
                                    var_10_5AB = add:long(var_10_5AB:long, ldc:long(1L))
                                }
                            }
                        }
                        
                        looporswitchbreak()
                    }
                    
                    return:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(var_4_137:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
                }
            }
            
            Label_0179:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-200338609))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(749765094))
                    goto(Label_0139)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(813432499))
            }
            
            Label_0225:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0179)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(2039273845))
                goto(Label_0139)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(7), ldc:int(6167)))))
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(1864571778))
        }
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u0b8e\u1833\u62da\u8d98\u8308 \u527a\u5d20\u4c04\u4f4a\ua6bd\ud51e(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u0b8e\u1833\u62da\u8d98\u8308 p0) {
        var_2_61 : int
        var_4_14D : \u52d3\u0b8e\u1833\u62da\u8d98\u8308
        var_2_27C : int
        var_5_161 : int
        var_6_21C : long
        var_2_377 : int
        var_8_37D : Future[]
        var_2_4F0 : int
        var_9_38C : int
        var_2_419 : int
        var_10_420 : long
        var_2_45E : int
        stack_475_0 : long [generated]
        var_2_474 : int
        var_12_475 : long
        var_2_4FF : int
        var_10_501 : long
        var_2_5DE : int
        var_10_5E0 : long
        var_2_5EE : int
        var_2_64F : int
        
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
        var_2_61 = and:int(ldc:int(594766822), ldc:int(-2094537769))
        
        loop {
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-706584259))
                goto(Label_0246)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0210)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1703444531))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1350873163))
                
                if (cmpeq:boolean(p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, aconstnull:\u52d3\u0b8e\u1833\u62da\u8d98\u8308())) {
                    goto(Label_0246)
                }
            }
            
            Label_0150:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1861073200))
                goto(Label_0246)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1798320594))
                    loopcontinue()
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(-1956221041))
                
                if (cmpeq:boolean(invokevirtual:long(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::\u516c\u516c\uc31c\u71ae\u51b2\uff55, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2]), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                    var_4_14D = initobject:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::<init>, invokevirtual:long(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::\u516c\u516c\uc31c\u71ae\u51b2\uff55, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2]), and:int[expected:boolean](ldc:int(8785), ldc:int(-8796)))
                    var_2_27C = and:int(var_2_61:int, ldc:int(-618437723))
                    var_5_161 = l2i:int(invokestatic:long(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8d90\u64f2\u71ae\u927d\uff55\uc29a, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), i2l:long(invokestatic:int(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u392e\u8bb0\u8753\u965f\u97e6\u52d3))))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0500)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(131072)), ldc:int(0))) {
                            var_2_27C = and:int(var_2_27C:int, ldc:int(-1463404721))
                            goto(Label_0462)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(512)), ldc:int(0))) {
                            var_2_27C = and:int(var_2_27C:int, ldc:int(-2082773614))
                        }
                        else {
                            var_2_27C = and:int(var_2_27C:int, ldc:int(457400318))
                            
                            if (cmple:boolean(var_5_161:int, xor:int(ldc:int(338), ldc:int(336)))) {
                                goto(Label_0500)
                            }
                        }
                        
                        Label_0414:
                        
                        if (cmpne:boolean(and:int(var_2_27C:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0500)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(1)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(512)), ldc:int(0))) {
                                var_2_27C = and:int(var_2_27C:int, ldc:int(-1861549258))
                                loopcontinue()
                            }
                            
                            var_2_27C = and:int(var_2_27C:int, ldc:int(-82913315))
                            
                            if (cmpge:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), invokestatic:long(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u7006\ubded\u8aa5\u8c8a\ubcb0\u416d))) {
                                var_6_21C = div:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), i2l:long(var_5_161:int))
                                goto(Label_0834)
                            }
                        }
                        
                        Label_0462:
                        
                        if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_2_27C = and:int(var_2_27C:int, ldc:int(1993139455))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(4)), ldc:int(0))) {
                                goto(Label_0414)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(131072)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_27C = and:int(var_2_27C:int, ldc:int(1071075326))
                        }
                        
                        Label_0500:
                        
                        if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(131072)), ldc:int(0))) {
                            var_2_27C = and:int(var_2_27C:int, ldc:int(183812106))
                            goto(Label_0462)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_27C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_2_27C = and:int(var_2_27C:int, ldc:int(-277098507))
                            var_6_21C = ldc:long(0L)
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0542:
                    
                    if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_27C = and:int(var_2_27C:int, ldc:int(-2030310948))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0748)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0653)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(131072)), ldc:int(0))) {
                        var_2_27C = and:int(var_2_27C:int, ldc:int(-1985898631))
                    }
                    else {
                        var_2_27C = and:int(var_2_27C:int, ldc:int(-1288963147))
                        
                        if (cmpge:boolean(var_6_21C:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            return:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(var_4_14D:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
                        }
                    }
                    
                    Label_0607:
                    
                    if (cmpne:boolean(and:int(var_2_27C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0748)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(4)), ldc:int(0))) {
                        var_2_27C = and:int(var_2_27C:int, ldc:int(-2082740135))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0542)
                        }
                        
                        var_2_27C = and:int(var_2_27C:int, ldc:int(265546684))
                    }
                    
                    Label_0653:
                    
                    if (cmpne:boolean(and:int(var_2_27C:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_27C = and:int(var_2_27C:int, ldc:int(729021412))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_27C = and:int(var_2_27C:int, ldc:int(-1200391160))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_2_27C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_2_27C = and:int(var_2_27C:int, ldc:int(-1835193341))
                            goto(Label_0607)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_2_27C = and:int(var_2_27C:int, ldc:int(618347403))
                            goto(Label_0542)
                        }
                        
                        var_2_27C = and:int(var_2_27C:int, ldc:int(-1682291714))
                        invokevirtual:void(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u392e\u6cfe\u5fe1\u4cd9\u8258\u69d9, var_4_14D:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_6_21C:long, i2b:byte(or:byte(invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_6_21C:long), invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_6_21C:long))))
                    }
                    
                    Label_0748:
                    
                    if (cmpne:boolean(and:int(var_2_27C:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_27C = and:int(var_2_27C:int, ldc:int(-383585960))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(4)), ldc:int(0))) {
                            var_2_27C = and:int(var_2_27C:int, ldc:int(1509108519))
                            goto(Label_0653)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0607)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_2_27C = and:int(var_2_27C:int, ldc:int(523463597))
                            var_6_21C = add:long(var_6_21C:long, ldc:long(1L))
                        }
                        
                        goto(Label_0542)
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_2_27C:int, ldc:int(1)), ldc:int(0))) {
                        var_2_27C = and:int(var_2_27C:int, ldc:int(-1730621246))
                        goto(Label_0748)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0653)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_27C:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_27C = and:int(var_2_27C:int, ldc:int(635323558))
                        goto(Label_0607)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_27C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0542)
                    }
                    
                    var_2_377 = and:int(var_2_27C:int, ldc:int(265284566))
                    var_8_37D = newarray:Future[](java.util.concurrent.Future.class, var_5_161:int)
                    var_2_4F0 = and:int(var_2_377:int, ldc:int(1740565404))
                    var_9_38C = and:int(ldc:int(20998), ldc:int(-21015))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_2_4F0:int, ldc:int(512)), ldc:int(0))) {
                            var_2_4F0 = and:int(var_2_4F0:int, ldc:int(2075586491))
                            goto(Label_1218)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4F0:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_1002)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_4F0:int, ldc:int(512)), ldc:int(0))) {
                            var_2_4F0 = and:int(var_2_4F0:int, ldc:int(1671940044))
                            
                            if (cmpge:boolean(var_9_38C:int, var_5_161:int)) {
                                goto(Label_1213)
                            }
                        }
                        
                        Label_0954:
                        
                        if (cmpeq:boolean(and:int(var_2_4F0:int, ldc:int(16777216)), ldc:int(0))) {
                            var_2_4F0 = and:int(var_2_4F0:int, ldc:int(-767437176))
                            goto(Label_1218)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4F0:int, ldc:int(262144)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_2_4F0:int, ldc:int(16)), ldc:int(0))) {
                                var_2_4F0 = and:int(var_2_4F0:int, ldc:int(900131585))
                                loopcontinue()
                            }
                            
                            var_2_4F0 = and:int(var_2_4F0:int, ldc:int(66577374))
                        }
                        
                        Label_1002:
                        
                        if (cmpeq:boolean(and:int(var_2_4F0:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1218)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4F0:int, ldc:int(256)), ldc:int(0))) {
                            var_2_4F0 = and:int(var_2_4F0:int, ldc:int(-2125935427))
                            goto(Label_0954)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4F0:int, ldc:int(131072)), ldc:int(0))) {
                            var_2_4F0 = and:int(var_2_4F0:int, ldc:int(-1804123067))
                            loopcontinue()
                        }
                        
                        var_2_419 = and:int(var_2_4F0:int, ldc:int(-614475809))
                        var_10_420 = mul:long(i2l:long(var_9_38C:int), var_6_21C:long)
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_2_419:int, ldc:int(131072)), ldc:int(0))) {
                                var_2_45E = and:int(var_2_419:int, ldc:int(1643507998))
                            }
                            else {
                                var_2_45E = and:int(var_2_419:int, ldc:int(-681153545))
                                
                                if (cmpne:boolean(var_9_38C:int, sub:int(var_5_161:int, xor:int(ldc:int(586), ldc:int(587))))) {
                                    stack_475_0 = add:long(var_10_420:long, var_6_21C:long)
                                    looporswitchbreak()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_2_45E:int, ldc:int(16777216)), ldc:int(0))) {
                                var_2_45E = and:int(var_2_45E:int, ldc:int(-1283265651))
                                stack_475_0 = getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
                                looporswitchbreak()
                            }
                            
                            var_2_419 = and:int(var_2_45E:int, ldc:int(-1893262144))
                        }
                        
                        var_2_474 = and:int(var_2_45E:int, ldc:int(-1015648346))
                        var_12_475 = stack_475_0:long
                        
                        do {
                            if (cmpeq:boolean(and:int(var_2_474:int, ldc:int(128)), ldc:int(0))) {
                                var_2_474 = and:int(var_2_474:int, ldc:int(-1267882784))
                            }
                            else {
                                var_2_474 = and:int(var_2_474:int, ldc:int(-1489797212))
                                storeelement:Future<?>(var_8_37D:Future<?>[], var_9_38C:int, invokestatic:Future<?>(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u927d\u4c04\u9937\u8308\u51fa\u960f, initobject:\u12b2\uc910\uc7fe\u6c56\ubcb0\u3a62(\u12b2\uc910\uc7fe\u6c56\ubcb0\u3a62::<init>, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_420:long, var_12_475:long, var_4_14D:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)))
                            }
                        } while (cmpne:boolean(and:int(var_2_474:int, ldc:int(262144)), ldc:int(0)))
                        
                        var_2_4F0 = and:int(var_2_474:int, ldc:int(-1479289867))
                        inc:int(var_9_38C, ldc:int(1))
                        loopcontinue()
                        
                        try {
                            Label_1213:
                            invokestatic:void(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u9033\u6fb0\u7330\u8aa5\u67d0\u5245, var_8_37D:Future<?>[])
                            Label_1218:
                            
                            if (cmpeq:boolean(and:int(var_2_4F0:int, ldc:int(131072)), ldc:int(0))) {
                                var_2_4F0 = and:int(var_2_4F0:int, ldc:int(-1729188071))
                                goto(Label_1002)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_4F0:int, ldc:int(16384)), ldc:int(0))) {
                                var_2_4F0 = and:int(var_2_4F0:int, ldc:int(-774313970))
                                goto(Label_0954)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_4F0:int, ldc:int(16777216)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_4F0 = and:int(var_2_4F0:int, ldc:int(-816154723))
                        }
                        catch (java.lang.InterruptedException var_9_4F8) {
                            var_2_4FF = and:int(var_2_4F0:int, ldc:int(2074273751))
                            var_10_501 = ldc:long(0L)
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_2_4FF:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Label_1445)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4FF:int, ldc:int(4)), ldc:int(0))) {
                                    var_2_4FF = and:int(var_2_4FF:int, ldc:int(-1605107776))
                                    goto(Label_1387)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4FF:int, ldc:int(4)), ldc:int(0))) {
                                    var_2_4FF = and:int(var_2_4FF:int, ldc:int(-1113549007))
                                }
                                else {
                                    var_2_4FF = and:int(var_2_4FF:int, ldc:int(1341386644))
                                    
                                    if (cmpge:boolean(var_10_501:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                                        goto(Label_1488)
                                    }
                                }
                                
                                Label_1340:
                                
                                if (cmpeq:boolean(and:int(var_2_4FF:int, ldc:int(128)), ldc:int(0))) {
                                    goto(Label_1445)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4FF:int, ldc:int(256)), ldc:int(0))) {
                                    var_2_4FF = and:int(var_2_4FF:int, ldc:int(-217057723))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_2_4FF:int, ldc:int(16384)), ldc:int(0))) {
                                        var_2_4FF = and:int(var_2_4FF:int, ldc:int(326154907))
                                        loopcontinue()
                                    }
                                    
                                    var_2_4FF = and:int(var_2_4FF:int, ldc:int(1539462110))
                                }
                                
                                Label_1387:
                                
                                if (cmpne:boolean(and:int(var_2_4FF:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_2_4FF = and:int(var_2_4FF:int, ldc:int(680364489))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_2_4FF:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_1340)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_4FF:int, ldc:int(1)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_2_4FF = and:int(var_2_4FF:int, ldc:int(929262534))
                                    invokevirtual:void(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u392e\u6cfe\u5fe1\u4cd9\u8258\u69d9, var_4_14D:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_501:long, i2b:byte(or:byte(invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_501:long), invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_501:long))))
                                }
                                
                                Label_1445:
                                
                                if (cmpeq:boolean(and:int(var_2_4FF:int, ldc:int(131072)), ldc:int(0))) {
                                    goto(Label_1387)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4FF:int, ldc:int(33554432)), ldc:int(0))) {
                                    goto(Label_1340)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4FF:int, ldc:int(256)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_4FF = and:int(var_2_4FF:int, ldc:int(595230599))
                                var_10_501 = add:long(var_10_501:long, ldc:long(1L))
                            }
                        }
                        catch (java.util.concurrent.ExecutionException var_9_5D7) {
                            var_2_5DE = and:int(var_2_4F0:int, ldc:int(-1287457892))
                            var_10_5E0 = ldc:long(0L)
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_2_5DE:int, ldc:int(16384)), ldc:int(0))) {
                                    var_2_5EE = and:int(var_2_5DE:int, ldc:int(-1878092171))
                                    goto(Label_1576)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_5DE:int, ldc:int(256)), ldc:int(0))) {
                                    var_2_5DE = and:int(var_2_5DE:int, ldc:int(-1745389651))
                                    
                                    if (cmpge:boolean(var_10_5E0:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                                        looporswitchbreak()
                                    }
                                }
                                
                                Label_1546:
                                
                                if (cmpeq:boolean(and:int(var_2_5DE:int, ldc:int(4)), ldc:int(0))) {
                                    var_2_5EE = and:int(var_2_5DE:int, ldc:int(-587771263))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_2_5DE:int, ldc:int(512)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_2_5EE = and:int(var_2_5DE:int, ldc:int(-1021917220))
                                }
                                
                                Label_1576:
                                
                                if (cmpne:boolean(and:int(var_2_5EE:int, ldc:int(262144)), ldc:int(0))) {
                                    var_2_5DE = and:int(var_2_5EE:int, ldc:int(-1582512777))
                                    goto(Label_1546)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_5EE:int, ldc:int(256)), ldc:int(0))) {
                                    var_2_5DE = and:int(var_2_5EE:int, ldc:int(-560989290))
                                }
                                else {
                                    var_2_64F = and:int(var_2_5EE:int, ldc:int(-2023040010))
                                    invokevirtual:void(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u392e\u6cfe\u5fe1\u4cd9\u8258\u69d9, var_4_14D:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_5E0:long, i2b:byte(or:byte(invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_5E0:long), invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_5E0:long))))
                                    var_2_5DE = and:int(var_2_64F:int, ldc:int(2002174869))
                                    var_10_5E0 = add:long(var_10_5E0:long, ldc:long(1L))
                                }
                            }
                        }
                        
                        looporswitchbreak()
                    }
                    
                    return:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(var_4_14D:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
                }
            }
            
            Label_0210:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(790471888))
                    goto(Label_0150)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(-1278812210))
            }
            
            Label_0246:
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(401995701))
                goto(Label_0210)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(262661468))
                goto(Label_0150)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), xor:int(ldc:int(6725), ldc:int(6722)))))
            }
        }
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u0b8e\u1833\u62da\u8d98\u8308 \u7c6b\ub70c\ud523\u0800\ud217\u6198(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u0b8e\u1833\u62da\u8d98\u8308 p0) {
        var_2_61 : int
        var_2_80 : int
        var_4_14F : \u52d3\u0b8e\u1833\u62da\u8d98\u8308
        var_2_221 : int
        var_5_163 : int
        var_6_223 : long
        var_2_372 : int
        var_8_378 : Future[]
        var_2_4DB : int
        var_9_387 : int
        var_2_44C : int
        var_10_418 : long
        stack_463_0 : long [generated]
        var_2_462 : int
        var_12_463 : long
        var_2_51C : int
        var_10_4EC : long
        var_2_61A : int
        var_10_5E4 : long
        var_2_641 : int
        
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
        var_2_61 = and:int(ldc:int(1319020604), ldc:int(1608465790))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-2013844994))
                goto(Label_0256)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                var_2_80 = and:int(var_2_61:int, ldc:int(-481206883))
                goto(Label_0201)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1788509869))
                
                if (cmpeq:boolean(p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, aconstnull:\u52d3\u0b8e\u1833\u62da\u8d98\u8308())) {
                    goto(Label_0256)
                }
            }
            
            Label_0150:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0256)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
                var_2_80 = and:int(var_2_61:int, ldc:int(82478265))
            }
            else {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_80 = and:int(var_2_61:int, ldc:int(-876726084))
                
                if (cmpeq:boolean(invokevirtual:long(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::\u516c\u516c\uc31c\u71ae\u51b2\uff55, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2]), getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                    var_4_14F = initobject:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::<init>, invokevirtual:long(\u3bc9\ua562\u965f\u156b\ub32d\u64f2::\u516c\u516c\uc31c\u71ae\u51b2\uff55, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308[expected:\u3bc9\ua562\u965f\u156b\ub32d\u64f2]), and:int[expected:boolean](ldc:int(-7004), ldc:int(4955)))
                    var_2_221 = and:int(var_2_80:int, ldc:int(-876692804))
                    var_5_163 = l2i:int(invokestatic:long(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8d90\u64f2\u71ae\u927d\uff55\uc29a, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), i2l:long(invokestatic:int(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u392e\u8bb0\u8753\u965f\u97e6\u52d3))))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_2_221:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0501)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0464)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_2_221 = and:int(var_2_221:int, ldc:int(2000365262))
                        }
                        else {
                            var_2_221 = and:int(var_2_221:int, ldc:int(1807432636))
                            
                            if (cmple:boolean(var_5_163:int, and:int(ldc:int(9222), ldc:int(6922)))) {
                                goto(Label_0501)
                            }
                        }
                        
                        Label_0406:
                        
                        if (cmpne:boolean(and:int(var_2_221:int, ldc:int(65536)), ldc:int(0))) {
                            var_2_221 = and:int(var_2_221:int, ldc:int(287692355))
                            goto(Label_0501)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(4)), ldc:int(0))) {
                            var_2_221 = and:int(var_2_221:int, ldc:int(-1940954116))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_2_221:int, ldc:int(4096)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_221 = and:int(var_2_221:int, ldc:int(-872531587))
                            
                            if (cmpge:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), invokestatic:long(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u7006\ubded\u8aa5\u8c8a\ubcb0\u416d))) {
                                var_6_223 = div:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), i2l:long(var_5_163:int))
                                goto(Label_0820)
                            }
                        }
                        
                        Label_0464:
                        
                        if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(134217728)), ldc:int(0))) {
                            var_2_221 = and:int(var_2_221:int, ldc:int(-582893703))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_2_221:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_0406)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_221:int, ldc:int(536870912)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_221 = and:int(var_2_221:int, ldc:int(1606303612))
                        }
                        
                        Label_0501:
                        
                        if (cmpne:boolean(and:int(var_2_221:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0464)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(32)), ldc:int(0))) {
                            var_2_221 = and:int(var_2_221:int, ldc:int(572513536))
                            goto(Label_0406)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_221:int, ldc:int(8192)), ldc:int(0))) {
                            var_2_221 = and:int(var_2_221:int, ldc:int(-289511300))
                            var_6_223 = ldc:long(0L)
                            looporswitchbreak()
                        }
                        
                        var_2_221 = and:int(var_2_221:int, ldc:int(1967820916))
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_2_221:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0820)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_221:int, ldc:int(256)), ldc:int(0))) {
                        var_2_221 = and:int(var_2_221:int, ldc:int(-1953433494))
                        goto(Label_0744)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(134217728)), ldc:int(0))) {
                        var_2_221 = and:int(var_2_221:int, ldc:int(-191987786))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_221:int, ldc:int(524288)), ldc:int(0))) {
                        var_2_221 = and:int(var_2_221:int, ldc:int(1604319534))
                        
                        if (cmpge:boolean(var_6_223:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                            return:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(var_4_14F:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
                        }
                    }
                    
                    Label_0614:
                    
                    if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_221 = and:int(var_2_221:int, ldc:int(1018330040))
                        goto(Label_0820)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_221 = and:int(var_2_221:int, ldc:int(1602862402))
                        goto(Label_0744)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        var_2_221 = and:int(var_2_221:int, ldc:int(1255831740))
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_2_221:int, ldc:int(4096)), ldc:int(0))) {
                        var_2_221 = and:int(var_2_221:int, ldc:int(2033722076))
                        goto(Label_0820)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_221:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0614)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(134217728)), ldc:int(0))) {
                            var_2_221 = and:int(var_2_221:int, ldc:int(-290752421))
                            goto(Label_0549)
                        }
                        
                        var_2_221 = and:int(var_2_221:int, ldc:int(-381252))
                        invokevirtual:void(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u392e\u6cfe\u5fe1\u4cd9\u8258\u69d9, var_4_14F:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_6_223:long, i2b:byte(xor:byte(invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_6_223:long), invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_6_223:long))))
                    }
                    
                    Label_0744:
                    
                    if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(524288)), ldc:int(0))) {
                        var_2_221 = and:int(var_2_221:int, ldc:int(385616050))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_221:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0614)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_221:int, ldc:int(8388608)), ldc:int(0))) {
                            var_2_221 = and:int(var_2_221:int, ldc:int(-876942276))
                            var_6_223 = add:long(var_6_223:long, ldc:long(1L))
                        }
                        
                        goto(Label_0549)
                    }
                    
                    Label_0820:
                    
                    if (cmpne:boolean(and:int(var_2_221:int, ldc:int(256)), ldc:int(0))) {
                        var_2_221 = and:int(var_2_221:int, ldc:int(-1358514250))
                        goto(Label_0744)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_221 = and:int(var_2_221:int, ldc:int(-1649718393))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_221 = and:int(var_2_221:int, ldc:int(455156312))
                        goto(Label_0614)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_221:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    var_2_372 = and:int(var_2_221:int, ldc:int(1610312621))
                    var_8_378 = newarray:Future[](java.util.concurrent.Future.class, var_5_163:int)
                    var_2_4DB = and:int(var_2_372:int, ldc:int(-872763972))
                    var_9_387 = and:int(ldc:int(20049), ldc:int(-24150))
                    
                    loop {
                        Label_0905:
                        
                        if (cmpeq:boolean(and:int(var_2_4DB:int, ldc:int(4)), ldc:int(0))) {
                            var_2_4DB = and:int(var_2_4DB:int, ldc:int(537064381))
                            goto(Label_1198)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4DB:int, ldc:int(8192)), ldc:int(0))) {
                            var_2_4DB = and:int(var_2_4DB:int, ldc:int(1105892657))
                            goto(Label_1005)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4DB:int, ldc:int(8)), ldc:int(0))) {
                            var_2_4DB = and:int(var_2_4DB:int, ldc:int(-830370653))
                        }
                        else {
                            var_2_4DB = and:int(var_2_4DB:int, ldc:int(-88458691))
                            
                            if (cmpge:boolean(var_9_387:int, var_5_163:int)) {
                                goto(Label_1193)
                            }
                        }
                        
                        Label_0968:
                        
                        if (cmpne:boolean(and:int(var_2_4DB:int, ldc:int(536870912)), ldc:int(0))) {
                            var_2_4DB = and:int(var_2_4DB:int, ldc:int(-1009641000))
                            goto(Label_1198)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_4DB:int, ldc:int(8388608)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_2_4DB:int, ldc:int(1073741824)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_4DB = and:int(var_2_4DB:int, ldc:int(-86038225))
                        }
                        
                        Label_1005:
                        
                        if (cmpne:boolean(and:int(var_2_4DB:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1198)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4DB:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0968)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_4DB:int, ldc:int(256)), ldc:int(0))) {
                            var_2_4DB = and:int(var_2_4DB:int, ldc:int(-862759503))
                            loopcontinue()
                        }
                        
                        var_2_44C = and:int(var_2_4DB:int, ldc:int(-20972116))
                        var_10_418 = mul:long(i2l:long(var_9_387:int), var_6_223:long)
                        
                        do {
                            if (cmpne:boolean(and:int(var_2_44C:int, ldc:int(536870912)), ldc:int(0))) {
                                var_2_44C = and:int(var_2_44C:int, ldc:int(65772744))
                            }
                            else {
                                var_2_44C = and:int(var_2_44C:int, ldc:int(-272696786))
                                
                                if (cmpeq:boolean(var_9_387:int, sub:int(var_5_163:int, and:int(ldc:int(4737), ldc:int(8481))))) {
                                    loopcontinue()
                                }
                                
                                stack_463_0 = add:long(var_10_418:long, var_6_223:long)
                                Label_1117:
                                var_2_462 = and:int(var_2_44C:int, ldc:int(-826349009))
                                var_12_463 = stack_463_0:long
                                
                                do {
                                    if (cmpeq:boolean(and:int(var_2_462:int, ldc:int(2147483647)), ldc:int(0))) {
                                        var_2_462 = and:int(var_2_462:int, ldc:int(-1925646115))
                                    }
                                    else {
                                        var_2_462 = and:int(var_2_462:int, ldc:int(1792780846))
                                        storeelement:Future<?>(var_8_378:Future<?>[], var_9_387:int, invokestatic:Future<?>(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u927d\u4c04\u9937\u8308\u51fa\u960f, initobject:\uc29a\u6d69\u7c6b\uc4d2\u62da\ubefe(\uc29a\u6d69\u7c6b\uc4d2\u62da\ubefe::<init>, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_418:long, var_12_463:long, var_4_14F:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)))
                                    }
                                } while (cmpne:boolean(and:int(var_2_462:int, ldc:int(1)), ldc:int(0)))
                                
                                var_2_4DB = and:int(var_2_462:int, ldc:int(-872743571))
                                inc:int(var_9_387, ldc:int(1))
                                loopcontinue(Label_0905)
                            }
                        } while (cmpeq:boolean(and:int(var_2_44C:int, ldc:int(33554432)), ldc:int(0)))
                        
                        var_2_44C = and:int(var_2_44C:int, ldc:int(-891377172))
                        stack_463_0 = getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
                        goto(Label_1117)
                        
                        try {
                            Label_1193:
                            invokestatic:void(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u9033\u6fb0\u7330\u8aa5\u67d0\u5245, var_8_378:Future<?>[])
                            Label_1198:
                            
                            if (cmpne:boolean(and:int(var_2_4DB:int, ldc:int(512)), ldc:int(0))) {
                                var_2_4DB = and:int(var_2_4DB:int, ldc:int(-946090794))
                                goto(Label_1005)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_4DB:int, ldc:int(256)), ldc:int(0))) {
                                var_2_4DB = and:int(var_2_4DB:int, ldc:int(198361032))
                                goto(Label_0968)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_4DB:int, ldc:int(8192)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_4DB = and:int(var_2_4DB:int, ldc:int(-536892484))
                        }
                        catch (java.lang.InterruptedException var_9_4E3) {
                            var_2_51C = and:int(var_2_4DB:int, ldc:int(1526644413))
                            var_10_4EC = ldc:long(0L)
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_2_51C:int, ldc:int(8)), ldc:int(0))) {
                                    var_2_51C = and:int(var_2_51C:int, ldc:int(1677953128))
                                    goto(Label_1442)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_51C:int, ldc:int(134217728)), ldc:int(0))) {
                                    var_2_51C = and:int(var_2_51C:int, ldc:int(-1292463325))
                                    goto(Label_1384)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_51C:int, ldc:int(65536)), ldc:int(0))) {
                                    var_2_51C = and:int(var_2_51C:int, ldc:int(-1746598343))
                                }
                                else {
                                    var_2_51C = and:int(var_2_51C:int, ldc:int(1805543741))
                                    
                                    if (cmpge:boolean(var_10_4EC:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                                        goto(Label_1492)
                                    }
                                }
                                
                                Label_1328:
                                
                                if (cmpne:boolean(and:int(var_2_51C:int, ldc:int(1024)), ldc:int(0))) {
                                    var_2_51C = and:int(var_2_51C:int, ldc:int(-2030831439))
                                    goto(Label_1442)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_51C:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_2_51C = and:int(var_2_51C:int, ldc:int(791101141))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_2_51C:int, ldc:int(4)), ldc:int(0))) {
                                        var_2_51C = and:int(var_2_51C:int, ldc:int(-677876216))
                                        loopcontinue()
                                    }
                                    
                                    var_2_51C = and:int(var_2_51C:int, ldc:int(1258008188))
                                }
                                
                                Label_1384:
                                
                                if (cmpne:boolean(and:int(var_2_51C:int, ldc:int(4096)), ldc:int(0))) {
                                    var_2_51C = and:int(var_2_51C:int, ldc:int(-1176403276))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_2_51C:int, ldc:int(8192)), ldc:int(0))) {
                                        goto(Label_1328)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_51C:int, ldc:int(1048576)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_2_51C = and:int(var_2_51C:int, ldc:int(-86344449))
                                    invokevirtual:void(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u392e\u6cfe\u5fe1\u4cd9\u8258\u69d9, var_4_14F:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_4EC:long, i2b:byte(xor:byte(invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_4EC:long), invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_4EC:long))))
                                }
                                
                                Label_1442:
                                
                                if (cmpeq:boolean(and:int(var_2_51C:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_2_51C = and:int(var_2_51C:int, ldc:int(-931955321))
                                    goto(Label_1384)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_51C:int, ldc:int(32)), ldc:int(0))) {
                                    goto(Label_1328)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_51C:int, ldc:int(8)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_51C = and:int(var_2_51C:int, ldc:int(-610621394))
                                var_10_4EC = add:long(var_10_4EC:long, ldc:long(1L))
                            }
                        }
                        catch (java.util.concurrent.ExecutionException var_9_5DB) {
                            var_2_61A = and:int(var_2_4DB:int, ldc:int(1878993519))
                            var_10_5E4 = ldc:long(0L)
                            
                            loop {
                                if (cmpne:boolean(and:int(var_2_61A:int, ldc:int(4096)), ldc:int(0))) {
                                    goto(Label_1563)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_61A:int, ldc:int(4)), ldc:int(0))) {
                                    var_2_61A = and:int(var_2_61A:int, ldc:int(1539238781))
                                    
                                    if (cmpge:boolean(var_10_5E4:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                                        looporswitchbreak()
                                    }
                                }
                                
                                Label_1542:
                                
                                if (cmpne:boolean(and:int(var_2_61A:int, ldc:int(8)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_2_61A:int, ldc:int(32)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_2_61A = and:int(var_2_61A:int, ldc:int(1543482156))
                                }
                                
                                Label_1563:
                                
                                if (cmpeq:boolean(and:int(var_2_61A:int, ldc:int(32)), ldc:int(0))) {
                                    var_2_61A = and:int(var_2_61A:int, ldc:int(1307963315))
                                    goto(Label_1542)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_61A:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_2_61A = and:int(var_2_61A:int, ldc:int(-1775922978))
                                }
                                else {
                                    var_2_641 = and:int(var_2_61A:int, ldc:int(-625071379))
                                    invokevirtual:void(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u392e\u6cfe\u5fe1\u4cd9\u8258\u69d9, var_4_14F:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_5E4:long, i2b:byte(xor:byte(invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_5E4:long), invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, p0:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_10_5E4:long))))
                                    var_2_61A = and:int(var_2_641:int, ldc:int(-553698260))
                                    var_10_5E4 = add:long(var_10_5E4:long, ldc:long(1L))
                                }
                            }
                        }
                        
                        looporswitchbreak()
                    }
                    
                    return:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(var_4_14F:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
                }
            }
            
            Label_0201:
            
            if (cmpne:boolean(and:int(var_2_80:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_61 = and:int(var_2_80:int, ldc:int(-557188855))
            }
            else {
                if (cmpne:boolean(and:int(var_2_80:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_80:int, ldc:int(-957570034))
                    goto(Label_0150)
                }
                
                if (cmpne:boolean(and:int(var_2_80:int, ldc:int(1)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_80:int, ldc:int(200941739))
                    loopcontinue()
                }
                
                var_2_61 = and:int(var_2_80:int, ldc:int(-270849044))
            }
            
            Label_0256:
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(65536)), ldc:int(0))) {
                var_2_80 = and:int(var_2_61:int, ldc:int(-1478753181))
                goto(Label_0201)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0150)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1), and:int(ldc:int(7063), ldc:int(1039)))))
            }
        }
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u0b8e\u1833\u62da\u8d98\u8308 \uae87\u71f1\uc31c\u4bc8\u7873\u960f() {
        var_1_67 : int
        var_3_7A : \u52d3\u0b8e\u1833\u62da\u8d98\u8308
        var_1_143 : int
        var_4_8D : int
        var_5_145 : long
        var_1_277 : int
        var_7_27D : Future[]
        var_1_3E2 : int
        var_8_28C : int
        var_1_353 : int
        var_9_329 : long
        stack_36A_0 : long [generated]
        var_1_369 : int
        var_11_36A : long
        var_1_3F1 : int
        var_9_3F3 : long
        var_1_4E8 : int
        var_9_4D3 : long
        var_1_52F : int
        
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
            var_1_67 = and:int(and:int(ldc:int(311764513), ldc:int(867952189)), ldc:int(-1766340895))
            var_3_7A = initobject:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::<init>, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), and:int[expected:boolean](ldc:int(8365), ldc:int(-25774)))
            var_1_143 = and:int(var_1_67:int, ldc:int(402091699))
            var_4_8D = l2i:int(invokestatic:long(\u2dcc\u9937\u7873\u7006\ua6bd\ua3b4::\u8d90\u64f2\u71ae\u927d\uff55\uc29a, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), i2l:long(invokestatic:int(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u392e\u8bb0\u8753\u965f\u97e6\u52d3))))
            
            loop {
                if (cmpne:boolean(and:int(var_1_143:int, ldc:int(2)), ldc:int(0))) {
                    var_1_143 = and:int(var_1_143:int, ldc:int(-1690939689))
                    goto(Label_0296)
                }
                
                if (cmpeq:boolean(and:int(var_1_143:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_143 = and:int(var_1_143:int, ldc:int(1442601088))
                    goto(Label_0249)
                }
                
                if (cmpeq:boolean(and:int(var_1_143:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_143 = and:int(var_1_143:int, ldc:int(1939314549))
                    
                    if (cmple:boolean(var_4_8D:int, and:int(ldc:int(17443), ldc:int(478)))) {
                        goto(Label_0296)
                    }
                }
                
                Label_0201:
                
                if (cmpne:boolean(and:int(var_1_143:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0296)
                }
                
                if (cmpne:boolean(and:int(var_1_143:int, ldc:int(1048576)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_143:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_143 = and:int(var_1_143:int, ldc:int(1849286824))
                        loopcontinue()
                    }
                    
                    var_1_143 = and:int(var_1_143:int, ldc:int(2056380193))
                    
                    if (cmpge:boolean(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), invokestatic:long(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u7006\ubded\u8aa5\u8c8a\ubcb0\u416d))) {
                        var_5_145 = div:long(getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308), i2l:long(var_4_8D:int))
                        goto(Label_0586)
                    }
                }
                
                Label_0249:
                
                if (cmpeq:boolean(and:int(var_1_143:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_143 = and:int(var_1_143:int, ldc:int(1805730022))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_143:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_143 = and:int(var_1_143:int, ldc:int(601578325))
                        goto(Label_0201)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_143:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_143 = and:int(var_1_143:int, ldc:int(-1828882831))
                }
                
                Label_0296:
                
                if (cmpeq:boolean(and:int(var_1_143:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0249)
                }
                
                if (cmpeq:boolean(and:int(var_1_143:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0201)
                }
                
                if (cmpeq:boolean(and:int(var_1_143:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_143 = and:int(var_1_143:int, ldc:int(-90587163))
                    var_5_145 = ldc:long(0L)
                    looporswitchbreak()
                }
            }
            
            Label_0327:
            
            if (cmpne:boolean(and:int(var_1_143:int, ldc:int(16384)), ldc:int(0))) {
                var_1_143 = and:int(var_1_143:int, ldc:int(417211407))
                goto(Label_0586)
            }
            
            if (cmpne:boolean(and:int(var_1_143:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0511)
            }
            
            if (cmpne:boolean(and:int(var_1_143:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0435)
            }
            
            if (cmpeq:boolean(and:int(var_1_143:int, ldc:int(512)), ldc:int(0))) {
                var_1_143 = and:int(var_1_143:int, ldc:int(-840470840))
            }
            else {
                var_1_143 = and:int(var_1_143:int, ldc:int(-1684715999))
                
                if (cmpge:boolean(var_5_145:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                    return:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(var_3_7A:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
                }
            }
            
            Label_0391:
            
            if (cmpeq:boolean(and:int(var_1_143:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0586)
            }
            
            if (cmpne:boolean(and:int(var_1_143:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0511)
            }
            
            if (cmpeq:boolean(and:int(var_1_143:int, ldc:int(65536)), ldc:int(0))) {
                var_1_143 = and:int(var_1_143:int, ldc:int(-1584189891))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_143:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0327)
                }
                
                var_1_143 = and:int(var_1_143:int, ldc:int(-1231183889))
            }
            
            Label_0435:
            
            if (cmpeq:boolean(and:int(var_1_143:int, ldc:int(1048576)), ldc:int(0))) {
                var_1_143 = and:int(var_1_143:int, ldc:int(471634526))
                goto(Label_0586)
            }
            
            if (cmpne:boolean(and:int(var_1_143:int, ldc:int(8388608)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_143:int, ldc:int(8)), ldc:int(0))) {
                    var_1_143 = and:int(var_1_143:int, ldc:int(301120972))
                    goto(Label_0391)
                }
                
                if (cmpne:boolean(and:int(var_1_143:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0327)
                }
                
                var_1_143 = and:int(var_1_143:int, ldc:int(2140894839))
                invokevirtual:void(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u392e\u6cfe\u5fe1\u4cd9\u8258\u69d9, var_3_7A:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_5_145:long, i2b:byte(sub:int(xor:int(ldc:int(9282), ldc:int(9283)), invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_5_145:long))))
            }
            
            Label_0511:
            
            if (cmpne:boolean(and:int(var_1_143:int, ldc:int(1)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_143:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0435)
                }
                
                if (cmpne:boolean(and:int(var_1_143:int, ldc:int(64)), ldc:int(0))) {
                    var_1_143 = and:int(var_1_143:int, ldc:int(551455999))
                    goto(Label_0391)
                }
                
                if (cmpne:boolean(and:int(var_1_143:int, ldc:int(512)), ldc:int(0))) {
                    var_1_143 = and:int(var_1_143:int, ldc:int(2147067503))
                    var_5_145 = add:long(var_5_145:long, ldc:long(1L))
                }
                
                goto(Label_0327)
            }
            
            Label_0586:
            
            if (cmpne:boolean(and:int(var_1_143:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0511)
            }
            
            if (cmpne:boolean(and:int(var_1_143:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0435)
            }
            
            if (cmpne:boolean(and:int(var_1_143:int, ldc:int(32768)), ldc:int(0))) {
                var_1_143 = and:int(var_1_143:int, ldc:int(607163244))
                goto(Label_0391)
            }
            
            if (cmpeq:boolean(and:int(var_1_143:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0327)
            }
            
            var_1_277 = and:int(var_1_143:int, ldc:int(-7123275))
            var_7_27D = newarray:Future[](java.util.concurrent.Future.class, var_4_8D:int)
            var_1_3E2 = and:int(var_1_277:int, ldc:int(-1751939155))
            var_8_28C = and:int(ldc:int(2841), ldc:int(-12090))
            
            loop {
                Label_0654:
                
                if (cmpne:boolean(and:int(var_1_3E2:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_3E2 = and:int(var_1_3E2:int, ldc:int(1771400369))
                    goto(Label_0940)
                }
                
                if (cmpne:boolean(and:int(var_1_3E2:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0755)
                }
                
                if (cmpne:boolean(and:int(var_1_3E2:int, ldc:int(1)), ldc:int(0))) {
                    var_1_3E2 = and:int(var_1_3E2:int, ldc:int(-1296445527))
                    
                    if (cmpge:boolean(var_8_28C:int, var_4_8D:int)) {
                        goto(Label_0935)
                    }
                }
                
                Label_0699:
                
                if (cmpeq:boolean(and:int(var_1_3E2:int, ldc:int(512)), ldc:int(0))) {
                    var_1_3E2 = and:int(var_1_3E2:int, ldc:int(-561165603))
                    goto(Label_0940)
                }
                
                if (cmpne:boolean(and:int(var_1_3E2:int, ldc:int(64)), ldc:int(0))) {
                    var_1_3E2 = and:int(var_1_3E2:int, ldc:int(-1874348474))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_3E2:int, ldc:int(128)), ldc:int(0))) {
                        var_1_3E2 = and:int(var_1_3E2:int, ldc:int(714795509))
                        loopcontinue()
                    }
                    
                    var_1_3E2 = and:int(var_1_3E2:int, ldc:int(1471645497))
                }
                
                Label_0755:
                
                if (cmpne:boolean(and:int(var_1_3E2:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0940)
                }
                
                if (cmpne:boolean(and:int(var_1_3E2:int, ldc:int(8)), ldc:int(0))) {
                    var_1_3E2 = and:int(var_1_3E2:int, ldc:int(1260963444))
                    goto(Label_0699)
                }
                
                if (cmpeq:boolean(and:int(var_1_3E2:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_3E2 = and:int(var_1_3E2:int, ldc:int(144890286))
                    loopcontinue()
                }
                
                var_1_353 = and:int(var_1_3E2:int, ldc:int(-1158473823))
                var_9_329 = mul:long(i2l:long(var_8_28C:int), var_5_145:long)
                
                do {
                    if (cmpne:boolean(and:int(var_1_353:int, ldc:int(32)), ldc:int(0))) {
                        var_1_353 = and:int(var_1_353:int, ldc:int(-1682499927))
                        
                        if (cmpeq:boolean(var_8_28C:int, sub:int(var_4_8D:int, xor:int(ldc:int(-32494), ldc:int(-32493))))) {
                            loopcontinue()
                        }
                        
                        stack_36A_0 = add:long(var_9_329:long, var_5_145:long)
                        Label_0868:
                        var_1_369 = and:int(var_1_353:int, ldc:int(1922373537))
                        var_11_36A = stack_36A_0:long
                        
                        do {
                            if (cmpeq:boolean(and:int(var_1_369:int, ldc:int(67108864)), ldc:int(0))) {
                                var_1_369 = and:int(var_1_369:int, ldc:int(1002160097))
                                storeelement:Future<?>(var_7_27D:Future<?>[], var_8_28C:int, invokestatic:Future<?>(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u927d\u4c04\u9937\u8308\u51fa\u960f, initobject:\u9033\u183a\u5d20\u4975\u7e3f\u4daf(\u9033\u183a\u5d20\u4975\u7e3f\u4daf::<init>, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_9_329:long, var_11_36A:long, var_3_7A:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)))
                            }
                        } while (cmpne:boolean(and:int(var_1_369:int, ldc:int(2097152)), ldc:int(0)))
                        
                        var_1_3E2 = and:int(var_1_369:int, ldc:int(869478131))
                        inc:int(var_8_28C, ldc:int(1))
                        loopcontinue(Label_0654)
                    }
                } while (cmpne:boolean(and:int(var_1_353:int, ldc:int(16384)), ldc:int(0)))
                
                var_1_353 = and:int(var_1_353:int, ldc:int(1050627621))
                stack_36A_0 = getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
                goto(Label_0868)
                
                try {
                    Label_0935:
                    invokestatic:void(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u9033\u6fb0\u7330\u8aa5\u67d0\u5245, var_7_27D:Future<?>[])
                    Label_0940:
                    
                    if (cmpeq:boolean(and:int(var_1_3E2:int, ldc:int(32)), ldc:int(0))) {
                        var_1_3E2 = and:int(var_1_3E2:int, ldc:int(-171789931))
                        goto(Label_0755)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_3E2:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_3E2 = and:int(var_1_3E2:int, ldc:int(-299441105))
                        goto(Label_0699)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_3E2:int, ldc:int(8)), ldc:int(0))) {
                        var_1_3E2 = and:int(var_1_3E2:int, ldc:int(1473041312))
                        loopcontinue()
                    }
                    
                    var_1_3E2 = and:int(var_1_3E2:int, ldc:int(1475995643))
                }
                catch (java.lang.InterruptedException var_8_3EA) {
                    var_1_3F1 = and:int(var_1_3E2:int, ldc:int(-688031765))
                    var_9_3F3 = ldc:long(0L)
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_1_3F1:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_3F1 = and:int(var_1_3F1:int, ldc:int(-770458405))
                            goto(Label_1159)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_3F1:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1100)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_3F1:int, ldc:int(134217728)), ldc:int(0))) {
                            var_1_3F1 = and:int(var_1_3F1:int, ldc:int(1052075941))
                            
                            if (cmpge:boolean(var_9_3F3:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                                goto(Label_1219)
                            }
                        }
                        
                        Label_1061:
                        
                        if (cmpeq:boolean(and:int(var_1_3F1:int, ldc:int(33554432)), ldc:int(0))) {
                            var_1_3F1 = and:int(var_1_3F1:int, ldc:int(-401887708))
                            goto(Label_1159)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_3F1:int, ldc:int(67108864)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_1_3F1:int, ldc:int(4194304)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_3F1 = and:int(var_1_3F1:int, ldc:int(-74096899))
                        }
                        
                        Label_1100:
                        
                        if (cmpeq:boolean(and:int(var_1_3F1:int, ldc:int(524288)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_1_3F1:int, ldc:int(16384)), ldc:int(0))) {
                                goto(Label_1061)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_3F1:int, ldc:int(2097152)), ldc:int(0))) {
                                var_1_3F1 = and:int(var_1_3F1:int, ldc:int(-6022540))
                                loopcontinue()
                            }
                            
                            var_1_3F1 = and:int(var_1_3F1:int, ldc:int(449906415))
                            invokevirtual:void(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u392e\u6cfe\u5fe1\u4cd9\u8258\u69d9, var_3_7A:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_9_3F3:long, i2b:byte(sub:int(and:int(ldc:int(13), ldc:int(25059)), invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_9_3F3:long))))
                        }
                        
                        Label_1159:
                        
                        if (cmpne:boolean(and:int(var_1_3F1:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_1100)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_3F1:int, ldc:int(32)), ldc:int(0))) {
                            var_1_3F1 = and:int(var_1_3F1:int, ldc:int(469518807))
                            goto(Label_1061)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_3F1:int, ldc:int(4)), ldc:int(0))) {
                            var_1_3F1 = and:int(var_1_3F1:int, ldc:int(2095771721))
                        }
                        else {
                            var_1_3F1 = and:int(var_1_3F1:int, ldc:int(1474131825))
                            var_9_3F3 = add:long(var_9_3F3:long, ldc:long(1L))
                        }
                    }
                }
                catch (java.util.concurrent.ExecutionException var_8_4CA) {
                    var_1_4E8 = and:int(var_1_3E2:int, ldc:int(-1835960325))
                    var_9_4D3 = ldc:long(0L)
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_1_4E8:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1306)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_4E8:int, ldc:int(1024)), ldc:int(0))) {
                            var_1_4E8 = and:int(var_1_4E8:int, ldc:int(-1680353431))
                            
                            if (cmpge:boolean(var_9_4D3:long, getfield:long(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u7049\uf995\uff55\ub102\u98a4\u839e, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))) {
                                looporswitchbreak()
                            }
                        }
                        
                        Label_1267:
                        
                        if (cmpne:boolean(and:int(var_1_4E8:int, ldc:int(2)), ldc:int(0))) {
                            var_1_4E8 = and:int(var_1_4E8:int, ldc:int(-866608134))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_1_4E8:int, ldc:int(8)), ldc:int(0))) {
                                var_1_4E8 = and:int(var_1_4E8:int, ldc:int(637691717))
                                loopcontinue()
                            }
                            
                            var_1_4E8 = and:int(var_1_4E8:int, ldc:int(-1143521753))
                        }
                        
                        Label_1306:
                        
                        if (cmpne:boolean(and:int(var_1_4E8:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_1267)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_4E8:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_52F = and:int(var_1_4E8:int, ldc:int(-208298179))
                        invokevirtual:void(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u392e\u6cfe\u5fe1\u4cd9\u8258\u69d9, var_3_7A:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_9_4D3:long, i2b:byte(sub:int(and:int(ldc:int(2369), ldc:int(9865)), invokevirtual:byte(\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u600f\u8709\u760c\u64ab\u97e6\u5245, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, var_9_4D3:long))))
                        var_1_4E8 = and:int(var_1_52F:int, ldc:int(871980579))
                        var_9_4D3 = add:long(var_9_4D3:long, ldc:long(1L))
                    }
                }
                
                looporswitchbreak()
            }
            
            return:\u52d3\u0b8e\u1833\u62da\u8d98\u8308(var_3_7A:\u52d3\u0b8e\u1833\u62da\u8d98\u8308)
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
            return:Object(invokevirtual:\u52d3\u0b8e\u1833\u62da\u8d98\u8308[expected:Object](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::clone, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))
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
            return:Object(invokevirtual:byte[][expected:Object](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u6b5f\u36d3\u72f1\u61a4\uc4d2\u7d52, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308))
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
            return:Object(invokevirtual:Byte[expected:Object](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\ua068\u12cb\ubf56\u34df\u3776\u385b, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, p0:long))
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
            return:Object(invokevirtual:Byte[expected:Object](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u0800\u8413\u3bc9\u3776\u392e\u4492, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308, p0:long))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_265 : int
        expr_6E : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C4_0 : byte[] [generated]
        stack_C6_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_20E_0 : byte[] [generated]
        stack_278_0 : byte[] [generated]
        stack_2F2_0 : byte[] [generated]
        var_4_1EF : int
        var_3_1F4 : byte[]
        var_5_1F5 : int
        expr_211 : byte [generated]
        var_0_292 : int
        expr_278 : byte [generated]
        stack_2C0_2 : byte [generated]
        stack_295_0 : byte [generated]
        expr_9E : int [generated]
        var_2_C4 : byte[]
        expr_C8 : int [generated]
        var_3_2E0 : byte[]
        var_5_2E1 : int
        var_3_F8 : String
        stack_1E8_0 : String[] [generated]
        expr_10A : String[] [generated]
        
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
        var_0_265 = and:int(ldc:int(-1406222303), ldc:int(-1695380175))
        expr_6E = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C4_0 = stack_C6_0 = stack_EC_0 = stack_20E_0 = stack_278_0 = stack_2F2_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("MOPr8OGu8CQxLujt5+6V5d7oJ6o86u573ALv3jcS8O/hoOVA7SI/6aDj39kl4zSu7+2bJOTkIejo5/Cm2ebu8D4zNiM/mdPw03vt4zGcNOzed9wxr93i3S3rP+jiOJIy4tcjk/Wp4i0S7fGh0TAY7U7v6HncouLVNONA5ZMj37A/oeN230Cw0nEuLz2Zo/aVKSIYIaXvOaEs8OsqP5nV590rN+mup5+lN+wpJBwvOenu6trR6TasBaWw5DCA1TDc3xjhNqwFo+AnGzA56a4+7Kko3N8Y4TasBaXwgBx77xDl4/BB7e/iEOXjoAWlsOQwgNWA7tl77xDl46AF85MjFBkvOek9O9Q/maSpphBATEAh")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1EF = expr_6E:int
        var_3_1F4 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1F5 = expr_6E:int
        Label_0503:
        
        while (cmpeq:boolean(and:int(var_0_265:int, ldc:int(4)), ldc:int(0))) {
            var_0_265 = and:int(var_0_265:int, ldc:int(-2002043145))
            var_5_1F5 = add:int(var_5_1F5:int, ldc:int(-1))
            expr_211 = add:byte(loadelement:byte(stack_20E_0:byte[], var_5_1F5:int), ldc:byte(111))
            storeelement:byte(var_3_1F4:byte[], var_5_1F5:int, xor:int(or:int(and:int(shl:int(expr_211:byte, and:int(ldc:int(2060), ldc:int(8580))), ldc:int(-16)), and:int(shr:int(expr_211:byte[expected:int], and:int(ldc:int(284), ldc:int(27140))), ldc:int(15))), ldc:int(5)))
            
            if (cmpne:boolean(var_5_1F5:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C4_0 = stack_C6_0 = stack_EC_0 = stack_20E_0 = stack_278_0 = stack_2F2_0 = var_3_1F4:byte[]
            goto(Label_0115)
        }
        
        Label_0601:
        
        while (cmpne:boolean(and:int(var_0_265:int, ldc:int(1)), ldc:int(0))) {
            var_0_292 = and:int(var_0_265:int, ldc:int(-285917841))
            var_5_1F5 = add:int(var_5_1F5:int, ldc:int(-1))
            expr_278 = stack_2C0_2 = loadelement(stack_278_0, var_5_1F5)
            
            if (cmplt:boolean(add:int(add:int(var_5_1F5:int, ldc:int(4)), neg:int(var_4_1EF:int)), ldc:int(0))) {
                stack_2C0_2 = stack_295_0 = add:byte(expr_278:byte, loadelement:byte(var_3_1F4:byte[], add:int(var_5_1F5:int, ldc:int(4))))
                goto(Label_0677)
            }
            
            Label_0645:
            
            if (cmpne:boolean(and:int(var_0_292:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_292 = and:int(var_0_292:int, ldc:int(-110340319))
                stack_2C0_2 = stack_295_0 = add:byte(expr_278:byte, ldc:byte(4))
            }
            
            Label_0677:
            
            if (cmpeq:boolean(and:int(var_0_292:int, ldc:int(1)), ldc:int(0))) {
                var_0_292 = and:int(var_0_292:int, ldc:int(-8889143))
                goto(Label_0645)
            }
            
            var_0_265 = and:int(var_0_292:int, ldc:int(-1109044819))
            storeelement:byte(var_3_1F4:byte[], var_5_1F5:int, stack_2C0_2:byte)
            
            if (cmpne:boolean(var_5_1F5:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C4_0 = stack_C6_0 = stack_EC_0 = stack_20E_0 = stack_278_0 = stack_2F2_0 = var_3_1F4:byte[]
            goto(Label_0163)
        }
        
        var_0_265 = and:int(var_0_265:int, ldc:int(1523909422))
        goto(Label_0503)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_265:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_265 = and:int(var_0_265:int, ldc:int(769613036))
            goto(Label_0205)
        }
        
        if (cmpeq:boolean(and:int(var_0_265:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_265 = and:int(var_0_265:int, ldc:int(25184357))
        }
        else {
            var_0_265 = and:int(var_0_265:int, ldc:int(-1678673237))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_1EF = expr_9E:int
                var_3_1F4 = newarray:byte[](byte.class, expr_9E:int)
                var_5_1F5 = expr_9E:int
                goto(Label_0601)
            }
        }
        
        Label_0163:
        
        if (cmpeq:boolean(and:int(var_0_265:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_265 = and:int(var_0_265:int, ldc:int(69410886))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_265:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_265 = and:int(var_0_265:int, ldc:int(-387846159))
            var_2_C4 = stack_C4_0:byte[]
            expr_C8 = add:int(arraylength:int(stack_C6_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C8:int, ldc:int(0))) {
                var_3_2E0 = newarray:byte[](byte.class, expr_C8:int)
                var_5_2E1 = expr_C8:int
                
                loop {
                    var_0_265 = and:int(var_0_265:int, ldc:int(-1352320211))
                    var_5_2E1 = add:int(var_5_2E1:int, ldc:int(-1))
                    storeelement:byte(var_3_2E0:byte[], var_5_2E1:int, add:int(shl:int(loadelement:byte(stack_2F2_0:byte[], var_5_2E1:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_C4:byte[], add:int(var_5_2E1:int, xor:int(ldc:int(68), ldc:int(69)))), ldc:int(4)), xor:int(ldc:int(21009), ldc:int(21022)))))
                    
                    if (cmpne:boolean(var_5_2E1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C4_0 = stack_C6_0 = stack_EC_0 = stack_20E_0 = stack_278_0 = stack_2F2_0 = var_3_2E0:byte[]
            }
        }
        
        Label_0205:
        
        if (cmpne:boolean(and:int(var_0_265:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_265:int, ldc:int(4)), ldc:int(0))) {
            var_0_265 = and:int(var_0_265:int, ldc:int(-1092053553))
            goto(Label_0115)
        }
        
        var_3_F8 = initobject:String(String::<init>, stack_EC_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1E8_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4394), ldc:int(9864)))
        expr_10A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(17416), ldc:int(8489)))
        storeelement:String(expr_10A:String[], and:int(ldc:int(-10184), ldc:int(10055)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(-22416), ldc:int(21391)), xor:int(ldc:int(19459), ldc:int(19486))))
        storeelement:String(expr_10A:String[], xor:int(ldc:int(516), ldc:int(513)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(-32256), ldc:int(-32227)), and:int(ldc:int(5200), ldc:int(27460))))
        storeelement:String(expr_10A:String[], xor:int(ldc:int(20672), ldc:int(20673)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(16960), ldc:int(2120)), xor:int(ldc:int(-31410), ldc:int(-31426))))
        storeelement:String(expr_10A:String[], xor:int(ldc:int(8418), ldc:int(8420)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(2928), ldc:int(5360)), and:int(ldc:int(3215), ldc:int(4235))))
        storeelement:String(expr_10A:String[], xor:int(ldc:int(-32748), ldc:int(-32749)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(5241), ldc:int(5362)), xor:int(ldc:int(16455), ldc:int(16627))))
        storeelement:String(expr_10A:String[], and:int(ldc:int(4167), ldc:int(18563)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(2121), ldc:int(2301)), and:int(ldc:int(19702), ldc:int(998))))
        storeelement:String(expr_10A:String[], xor:int(ldc:int(10243), ldc:int(10241)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(-32547), ldc:int(-32709)), and:int(ldc:int(2312), ldc:int(16859))))
        storeelement:String(expr_10A:String[], xor:int(ldc:int(-24574), ldc:int(-24570)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(264), ldc:int(14696)), xor:int(ldc:int(-30083), ldc:int(-29843))))
        putstatic:String[](\u52d3\u0b8e\u1833\u62da\u8d98\u8308::\u8d98\u74b1\ub19c\u36d3\u718f\u5fe1, expr_10A:String[])
    }
    
    public void \ub32d\ub171\u3711\u76bc\u7c6b\u6fb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_617 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_622 : int
        
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
        var_3_617 = and:int(ldc:int(26315492), ldc:int(2042983414))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u52d3\u0b8e\u1833\u62da\u8d98\u8308[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_617 = and:int(var_3_617:int, ldc:int(-708011243))
        }
        else {
            var_3_617 = and:int(var_3_617:int, ldc:int(-114578476))
            var_5_8A = and:int(ldc:int(15948), ldc:int(-15998))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3197), ldc:int(3132)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_617:int, ldc:int(-1177483579))
                    var_9_C7 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_91:int, xor:int(ldc:int(34), ldc:int(35)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(-32222), ldc:int(-32221)))), var_7_A0:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_617 = and:int(var_3_D9:int, ldc:int(132638407))
                    var_14_114 = var_7_A0:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(6193), ldc:int(16385)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_91:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(128)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-1633116951))
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1041)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(1)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-2094212383))
                        goto(Label_0894)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0764)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(1434708934))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0532)
                            }
                            
                            goto(Label_0764)
                        }
                    }
                    
                    Label_0388:
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(8)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-1436093835))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1041)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0894)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0764)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(307808077))
                        goto(Label_0645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(-2061751315))
                            var_11_EA = and:int(ldc:int(-16653), ldc:int(16652))
                            goto(Label_1466)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0532:
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-1995463633))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(4)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-903208041))
                        goto(Label_1041)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0894)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0764)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(470483890))
                            loopcontinue()
                        }
                        
                        var_3_617 = and:int(var_3_617:int, ldc:int(659864293))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0764)
                        }
                    }
                    
                    Label_0645:
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1041)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0894)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(8)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(-1577288347))
                            goto(Label_0532)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(994023800))
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(1927661836))
                            loopcontinue()
                        }
                        
                        var_3_617 = and:int(var_3_617:int, ldc:int(-235117827))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0764:
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-266987168))
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(1017349505))
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(1938621320))
                        goto(Label_1041)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(1)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(769294676))
                            goto(Label_0645)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0532)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(1365534103))
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_617 = and:int(var_3_617:int, ldc:int(-944696593))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EA = and:int(ldc:int(209), ldc:int(523))
                                goto(Label_1041)
                            }
                        }
                    }
                    
                    Label_0894:
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-497812163))
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(-1198541811))
                            goto(Label_0764)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0645)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0532)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(449321791))
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_617 = and:int(var_3_617:int, ldc:int(-1653206322))
                        var_11_EA = and:int(ldc:int(-30956), ldc:int(30723))
                    }
                    
                    Label_1041:
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-1151255000))
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(1339792112))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0894)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0764)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(16)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(-845737393))
                            goto(Label_0645)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(-1227608350))
                            goto(Label_0532)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_617 = and:int(var_3_617:int, ldc:int(-1012251684))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1305)
                            }
                        }
                    }
                    
                    Label_1163:
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(1884257240))
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(16)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(393829364))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(512)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(-874409583))
                            goto(Label_1041)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0894)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(884181606))
                            goto(Label_0764)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0645)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0532)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(1641059433))
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(-1644221498))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_8A:int, var_16_118:int)
                            goto(Label_1466)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1305:
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(57426220))
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(128)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(230385908))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1041)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(16)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(303838066))
                        goto(Label_0894)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(512)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-570314676))
                        goto(Label_0764)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-281012688))
                        goto(Label_0645)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(1957391659))
                        goto(Label_0532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-354751396))
                        loopcontinue()
                    }
                    
                    var_3_617 = and:int(var_3_617:int, ldc:int(-571022625))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1466:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_622 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1477:
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1041)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0894)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0764)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0645)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(1316489703))
                        goto(Label_0532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(96483276))
                        var_17_622 = add:int(var_16_118:int, and:int(ldc:int(12849), ldc:int(17481)))
                        looporswitchbreak()
                    }
                }
                
                var_3_617 = and:int(var_3_617:int, ldc:int(-175330345))
                
                if (cmple:boolean(var_5_8A = var_17_622:int, sub:int(var_6_91:int, and:int(ldc:int(385), ldc:int(16481))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
