public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc238\u4f52\u93a2\u9a18\u7006\u16f6 {
    public void \uc238\u4f52\u93a2\u9a18\u7006\u16f6() {
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
            invokespecial:\u8753\u8df4\u624e\u6b5f\u6c56\u5d20(\u8753\u8df4\u624e\u6b5f\u6c56\u5d20::<init>, this:\uc238\u4f52\u93a2\u9a18\u7006\u16f6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String[] \u4c04\uae5d\u183a\u494c\u071d\u8753(\u6435\ub8be\u718f\u6b0d\u67e9.\u5654\u3e75\u92ff\u97e6\u8c8a\uf995 p0, int p1) {
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
        
        if (instanceof:boolean(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u98a4\u64f2\u7043\u76bc\u34df\uceb8.class, p0:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995)) {
            return:String[](invokespecial:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\uf995\u156b\u71ae\u8df4\u9033\u7006, this:\uc238\u4f52\u93a2\u9a18\u7006\u16f6, invokevirtual:\u120d\u7c6b\u1187\u52d3\u3e75\u446c(\u98a4\u64f2\u7043\u76bc\u34df\uceb8::\u3bc9\ub6ab\uc910\u873d\u34df\u9255, checkcast:\u98a4\u64f2\u7043\u76bc\u34df\uceb8(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u98a4\u64f2\u7043\u76bc\u34df\uceb8.class, p0:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995[expected:\u98a4\u64f2\u7043\u76bc\u34df\uceb8])), p1:int))
        }
        
        return:String[](aconstnull:String[]())
    }
    
    private java.lang.String[] \uf995\u156b\u71ae\u8df4\u9033\u7006(\u3504\ufe34\u600f\u6b0d\u69d9.\u120d\u7c6b\u1187\u52d3\u3e75\u446c p0, int p1) {
        var_5_64 : String
        var_7_78 : String[]
        var_8_7D : \u4daf\u8df4\ubb2b\u759a\u7330\u4ab3
        var_9_80 : String
        var_10_8F : String
        var_11_99 : String
        var_12_A9 : ArrayList<String>
        
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
            var_5_64 = invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\ubcb0\u9af2\u446c\u71f1\u52d3\u5140, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)
            var_7_78 = invokespecial:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\u839e\u69d9\u647c\u6fb0\u8709\ua068, this:\uc238\u4f52\u93a2\u9a18\u7006\u16f6, invokevirtual:String(String::trim, invokestatic:String(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\uc3e3\u8413\u718f\u97b7\u64f2\u156b, invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\u8bb0\u8753\ub32d\u960f\u92ff\u5fe1, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c))))
            var_8_7D = invokestatic:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u3a62\u2dcc\u1187\u6c56\u5db4\u6c52)
            var_9_80 = aconstnull:String()
            
            if (logicalnot:boolean(invokevirtual:boolean(String::equals, var_5_64:String, invokevirtual:String[expected:Object](\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\uc2e8\u5654\u4daf\u4ab3\u7ce1\u385b, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)))) {
                if (getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u7c6b\u3bc9\u3dd3\u71f1\u67e9\u64f2, var_8_7D:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3)) {
                    var_9_80 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\u34df\u5245\u6c52\ubefe\u120d\u8709), and:int(ldc:int(1589), ldc:int(-11902)))), invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\ud523\u4ab3\u93a2\u67d0\u7d52\u93a2, loadelement:String(getstatic:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\u34df\u5245\u6c52\ubefe\u120d\u8709), and:int(ldc:int(14501), ldc:int(539))))), loadelement:String(getstatic:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\u34df\u5245\u6c52\ubefe\u120d\u8709), xor:int(ldc:int(-29664), ldc:int(-29662)))), invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\uc2e8\u5654\u4daf\u4ab3\u7ce1\u385b, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)))
                }
            }
            
            var_10_8F = aconstnull:String()
            
            if (cmpne:boolean(invokevirtual:String[](\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\ud36e\u5654\u9033\u8df4\u7d52\u3e2a, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c), aconstnull:String[]())) {
                if (getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u7c6b\u3bc9\u3dd3\u71f1\u67e9\u64f2, var_8_7D:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3)) {
                    var_10_8F = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\u34df\u5245\u6c52\ubefe\u120d\u8709), and:int(ldc:int(20573), ldc:int(-21214)))), invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\ud523\u4ab3\u93a2\u67d0\u7d52\u93a2, loadelement:String(getstatic:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\u34df\u5245\u6c52\ubefe\u120d\u8709), and:int(ldc:int(18699), ldc:int(8291))))), loadelement:String(getstatic:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\u34df\u5245\u6c52\ubefe\u120d\u8709), and:int(ldc:int(643), ldc:int(10250)))), invokestatic:String(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u51fa\u64ab\u3e2a\ucfaf\uc3e3\uff55, checkcast:String[][expected:Object[]](java.lang.String[].class, invokevirtual:String[][expected:Object[]](\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\ud36e\u5654\u9033\u8df4\u7d52\u3e2a, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)))))
                }
            }
            
            var_11_99 = aconstnull:String()
            
            if (cmpne:boolean(invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\u52d3\ub18d\u8c8a\uc246\u12cb\uf995, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c), aconstnull:String())) {
                if (getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u7c6b\u3bc9\u3dd3\u71f1\u67e9\u64f2, var_8_7D:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3)) {
                    var_11_99 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\u34df\u5245\u6c52\ubefe\u120d\u8709), and:int(ldc:int(2815), ldc:int(-3072)))), invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u983f\u93a2\u6bb9\u93a2\u0c95\u7d52)), loadelement:String(getstatic:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\u34df\u5245\u6c52\ubefe\u120d\u8709), xor:int(ldc:int(-24439), ldc:int(-24437)))), ternaryop:String(invokevirtual:boolean(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\u99f7\u8709\ua562\uc2bd\u6435\ubefe, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c), invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\u99f7\u071d\u416d\uc910\u3a62\u6b5f, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c, invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\u52d3\ub18d\u8c8a\uc246\u12cb\uf995, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)), invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\ud523\u4ab3\u93a2\u67d0\u7d52\u93a2, loadelement:String(getstatic:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\u34df\u5245\u6c52\ubefe\u120d\u8709), xor:int(ldc:int(1563), ldc:int(1567)))))))
                }
            }
            
            var_12_A9 = initobject:ArrayList<String>(ArrayList<E>::<init>)
            invokeinterface:boolean(List<String>::add, var_12_A9:ArrayList<String>[expected:List<String>], var_5_64:String)
            invokeinterface:boolean(List<Object>::addAll, var_12_A9:List<Object>, invokestatic:List<String>[expected:Collection<?>](Arrays::asList, var_7_78:String[]))
            
            if (cmpne:boolean(var_9_80:String, aconstnull:String())) {
                invokeinterface:boolean(List<String>::add, var_12_A9:ArrayList<String>[expected:List<String>], var_9_80:String)
            }
            
            if (cmpne:boolean(var_10_8F:String, aconstnull:String())) {
                invokeinterface:boolean(List<String>::add, var_12_A9:ArrayList<String>[expected:List<String>], var_10_8F:String)
            }
            
            if (cmpne:boolean(var_11_99:String, aconstnull:String())) {
                invokeinterface:boolean(List<String>::add, var_12_A9:ArrayList<String>[expected:List<String>], var_11_99:String)
            }
            
            return:String[](invokespecial:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\uf995\u156b\u71ae\u8df4\u9033\u7006, this:\uc238\u4f52\u93a2\u9a18\u7006\u16f6, p1:int, var_12_A9:ArrayList<String>[expected:List<String>]))
        }
        
        goto(Label_0006)
    }
    
    private java.lang.String[] \u839e\u69d9\u647c\u6fb0\u8709\ua068(java.lang.String p0) {
        var_4_8B : String[]
        var_5_94 : int
        
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
        
        if (cmpgt:boolean(invokevirtual:int(String::length, p0:String), ldc:int(0))) {
            p0 = invokestatic:String(\ud7e8\ua3b4\uc9f6\u56bd\u2dcc\u718f::\u8d90\u1833\u0b8e\u8cae\u5140\u8640, p0:String, loadelement:String(getstatic:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\u34df\u5245\u6c52\ubefe\u120d\u8709), xor:int(ldc:int(17), ldc:int(20))))
            var_4_8B = invokevirtual:String[](String::split, p0:String, loadelement:String(getstatic:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\u34df\u5245\u6c52\ubefe\u120d\u8709), and:int(ldc:int(21782), ldc:int(135))))
            var_5_94 = and:int(ldc:int(21833), ldc:int(-21982))
            
            while (cmplt:boolean(var_5_94:int, arraylength:int(var_4_8B:String[]))) {
                storeelement:String(var_4_8B:String[], var_5_94:int, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\u34df\u5245\u6c52\ubefe\u120d\u8709), and:int(ldc:int(18439), ldc:int(12655)))), invokevirtual:String(String::trim, loadelement:String(var_4_8B:String[], var_5_94:int)))))
                storeelement:String(var_4_8B:String[], var_5_94:int, invokestatic:String(\ud7e8\ua3b4\uc9f6\u56bd\u2dcc\u718f::\ub113\u59ec\u1833\u4e72\u8640\u9a18, loadelement:String(var_4_8B:String[], var_5_94:int), loadelement:String(getstatic:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\u34df\u5245\u6c52\ubefe\u120d\u8709), and:int(ldc:int(17721), ldc:int(12296)))))
                inc:int(var_5_94, ldc:int(1))
            }
            
            return:String[](var_4_8B:String[])
        }
        
        return:String[](newarray:String[](java.lang.String.class, and:int(ldc:int(-2286), ldc:int(233))))
    }
    
    private java.lang.String[] \uf995\u156b\u71ae\u8df4\u9033\u7006(int p0, java.util.List<java.lang.String> p1) {
        var_3_10A : int
        var_5_66 : \ucef1\u99f7\u4e72\u7873\u0800\u72f1
        var_6_6F : ArrayList<String>
        var_7_78 : int
        var_8_C1 : String
        var_10_104 : Iterator<ITextProperties>
        
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
            var_3_10A = and:int(ldc:int(-831620579), ldc:int(-1984005811))
            var_5_66 = getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ube23\ufcaf\u6198\u8413\u97e6\uc87f))
            var_6_6F = initobject:ArrayList<String>(ArrayList<E>::<init>)
            var_7_78 = and:int(ldc:int(11110), ldc:int(-11119))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_10A:int, ldc:int(128)), ldc:int(0))) {
                    var_3_10A = and:int(var_3_10A:int, ldc:int(-1090609987))
                    
                    if (cmplt:boolean(var_7_78:int, invokeinterface:int(List<E>::size, p1:List<String>))) {
                        var_8_C1 = checkcast:String(java.lang.String.class, invokeinterface:String(List<String>::get, p1:List<String>, var_7_78:int))
                        
                        if (cmpne:boolean(var_8_C1:String, aconstnull:String())) {
                            if (cmpgt:boolean(invokevirtual:int(String::length, var_8_C1:String), ldc:int(0))) {
                                var_10_104 = invokeinterface:Iterator<ITextProperties>(List<ITextProperties>::iterator, invokevirtual:List<ITextProperties>(CharacterManager::func_238362_b_, invokevirtual:CharacterManager(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u92ff\u760c\u3bc9\u6198\ubff1\u64ab, var_5_66:\ucef1\u99f7\u4e72\u7873\u0800\u72f1), initobject:StringTextComponent[expected:ITextProperties](StringTextComponent::<init>, var_8_C1:String), p0:int, getstatic:Style(Style::EMPTY)))
                                
                                loop {
                                    var_3_10A = and:int(var_3_10A:int, ldc:int(-688407377))
                                    
                                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_10_104:Iterator<ITextProperties>))) {
                                        looporswitchbreak()
                                    }
                                    
                                    invokeinterface:boolean(List<String>::add, var_6_6F:ArrayList<String>[expected:List<String>], invokeinterface:String(ITextProperties::getString, checkcast:ITextProperties(net.minecraft.util.text.ITextProperties.class, invokeinterface:ITextProperties(Iterator<ITextProperties>::next, var_10_104:Iterator<ITextProperties>))))
                                }
                            }
                        }
                        
                        var_3_10A = and:int(var_3_10A:int, ldc:int(-1054159057))
                        inc:int(var_7_78, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_10A:int, ldc:int(8)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:String[](checkcast:String[](java.lang.String[].class, invokeinterface:String[](List<E>::toArray, var_6_6F:ArrayList<String>[expected:List<String>], newarray:String[](java.lang.String.class, invokeinterface:int(List<E>::size, var_6_6F:ArrayList<String>[expected:List<String>])))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_88 : int
        expr_6E : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_F7_0 : byte[] [generated]
        stack_234_0 : byte[] [generated]
        stack_29F_0 : byte[] [generated]
        stack_310_0 : byte[] [generated]
        var_4_215 : int
        var_3_21A : byte[]
        var_5_21B : int
        expr_237 : byte [generated]
        var_0_295 : int
        expr_29F : byte [generated]
        stack_2DE_2 : byte [generated]
        stack_2BC_0 : byte [generated]
        expr_96 : int [generated]
        var_2_C5 : byte[]
        expr_C9 : int [generated]
        var_3_2FE : byte[]
        var_5_2FF : int
        var_3_103 : String
        stack_20E_0 : String[] [generated]
        expr_115 : String[] [generated]
        
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
        var_0_88 = and:int(ldc:int(-292185400), ldc:int(-1965644837))
        expr_6E = arraylength:int(stack_94_0 = stack_96_0 = stack_C5_0 = stack_C7_0 = stack_F7_0 = stack_234_0 = stack_29F_0 = stack_310_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("RKEgAUzkcmVQWiRhKXU0SHAMdRgxVWF5fXkoMCMcKGEpdTRIcByJTEVlHEckMGEpdTRIcCxVliKMs4b+rIk=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_215 = expr_6E:int
        var_3_21A = newarray:byte[](byte.class, expr_6E:int)
        var_5_21B = expr_6E:int
        Label_0541:
        
        while (cmpeq:boolean(and:int(var_0_88:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_88 = and:int(var_0_88:int, ldc:int(-1164754865))
            var_5_21B = add:int(var_5_21B:int, ldc:int(-1))
            expr_237 = add:byte(loadelement:byte(stack_234_0:byte[], var_5_21B:int), ldc:byte(47))
            storeelement:byte(var_3_21A:byte[], var_5_21B:int, xor:int(or:int(and:int(shl:int(expr_237:byte, xor:int(ldc:int(10308), ldc:int(10304))), ldc:int(-16)), and:int(shr:int(expr_237:byte[expected:int], and:int(ldc:int(16644), ldc:int(9334))), ldc:int(15))), ldc:int(119)))
            
            if (cmpne:boolean(var_5_21B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C5_0 = stack_C7_0 = stack_F7_0 = stack_234_0 = stack_29F_0 = stack_310_0 = var_3_21A:byte[]
            goto(Label_0115)
        }
        
        Label_0639:
        
        while (cmpne:boolean(and:int(var_0_88:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_295 = and:int(var_0_88:int, ldc:int(-1835809461))
            var_5_21B = add:int(var_5_21B:int, ldc:int(-1))
            expr_29F = stack_2DE_2 = loadelement(stack_29F_0, var_5_21B)
            
            if (cmplt:boolean(add:int(add:int(var_5_21B:int, ldc:int(4)), neg:int(var_4_215:int)), ldc:int(0))) {
                stack_2DE_2 = stack_2BC_0 = add:byte(expr_29F:byte, loadelement:byte(var_3_21A:byte[], add:int(var_5_21B:int, ldc:int(4))))
                goto(Label_0716)
            }
            
            Label_0684:
            
            if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(524288)), ldc:int(0))) {
                var_0_295 = and:int(var_0_295:int, ldc:int(-208099079))
                stack_2DE_2 = stack_2BC_0 = add:byte(expr_29F:byte, ldc:byte(4))
            }
            
            Label_0716:
            
            if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0684)
            }
            
            var_0_88 = and:int(var_0_295:int, ldc:int(-340028435))
            storeelement:byte(var_3_21A:byte[], var_5_21B:int, stack_2DE_2:byte)
            
            if (cmpne:boolean(var_5_21B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C5_0 = stack_C7_0 = stack_F7_0 = stack_234_0 = stack_29F_0 = stack_310_0 = var_3_21A:byte[]
            goto(Label_0155)
        }
        
        var_0_88 = and:int(var_0_88:int, ldc:int(-827460907))
        goto(Label_0541)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_88:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0206)
        }
        
        if (cmpeq:boolean(and:int(var_0_88:int, ldc:int(64)), ldc:int(0))) {
            var_0_88 = and:int(var_0_88:int, ldc:int(-1865726684))
        }
        else {
            var_0_88 = and:int(var_0_88:int, ldc:int(-1543913746))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_215 = expr_96:int
                var_3_21A = newarray:byte[](byte.class, expr_96:int)
                var_5_21B = expr_96:int
                goto(Label_0639)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_88:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_88 = and:int(var_0_88:int, ldc:int(1767666350))
        }
        else {
            if (cmpne:boolean(and:int(var_0_88:int, ldc:int(4)), ldc:int(0))) {
                var_0_88 = and:int(var_0_88:int, ldc:int(-181205429))
                goto(Label_0115)
            }
            
            var_0_88 = and:int(var_0_88:int, ldc:int(-1631873841))
            var_2_C5 = stack_C5_0:byte[]
            expr_C9 = add:int(arraylength:int(stack_C7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C9:int, ldc:int(0))) {
                var_3_2FE = newarray:byte[](byte.class, expr_C9:int)
                var_5_2FF = expr_C9:int
                
                loop {
                    var_0_88 = and:int(var_0_88:int, ldc:int(-547821986))
                    var_5_2FF = add:int(var_5_2FF:int, ldc:int(-1))
                    storeelement:byte(var_3_2FE:byte[], var_5_2FF:int, add:int(shl:int(loadelement:byte(stack_310_0:byte[], var_5_2FF:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_C5:byte[], add:int(var_5_2FF:int, and:int(ldc:int(16393), ldc:int(6547)))), ldc:int(6)), xor:int(ldc:int(10504), ldc:int(10507)))))
                    
                    if (cmpne:boolean(var_5_2FF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C5_0 = stack_C7_0 = stack_F7_0 = stack_234_0 = stack_29F_0 = stack_310_0 = var_3_2FE:byte[]
            }
        }
        
        Label_0206:
        
        if (cmpne:boolean(and:int(var_0_88:int, ldc:int(1)), ldc:int(0))) {
            var_0_88 = and:int(var_0_88:int, ldc:int(247037182))
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_88:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_88 = and:int(var_0_88:int, ldc:int(216443283))
            goto(Label_0115)
        }
        
        var_3_103 = initobject:String(String::<init>, stack_F7_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_20E_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1051), ldc:int(24905)))
        expr_115 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4171), ldc:int(17161)))
        storeelement:String(expr_115:String[], xor:int(ldc:int(-31616), ldc:int(-31609)), invokevirtual:String[expected:String](String::substring, var_3_103:String, and:int(ldc:int(-12051), ldc:int(12050)), xor:int(ldc:int(-16366), ldc:int(-16368))))
        storeelement:String(expr_115:String[], and:int(ldc:int(24650), ldc:int(4905)), invokevirtual:String[expected:String](String::substring, var_3_103:String, xor:int(ldc:int(8192), ldc:int(8194)), and:int(ldc:int(16451), ldc:int(9363))))
        storeelement:String(expr_115:String[], and:int(ldc:int(17285), ldc:int(10303)), invokevirtual:String[expected:String](String::substring, var_3_103:String, and:int(ldc:int(127), ldc:int(3)), xor:int(ldc:int(16395), ldc:int(16398))))
        storeelement:String(expr_115:String[], and:int(ldc:int(13971), ldc:int(6)), invokevirtual:String[expected:String](String::substring, var_3_103:String, and:int(ldc:int(10511), ldc:int(1669)), xor:int(ldc:int(4166), ldc:int(4161))))
        storeelement:String(expr_115:String[], xor:int(ldc:int(-24064), ldc:int(-24058)), invokevirtual:String[expected:String](String::substring, var_3_103:String, and:int(ldc:int(2055), ldc:int(21959)), and:int(ldc:int(22026), ldc:int(31))))
        storeelement:String(expr_115:String[], xor:int(ldc:int(2), ldc:int(6)), invokevirtual:String[expected:String](String::substring, var_3_103:String, xor:int(ldc:int(-32745), ldc:int(-32739)), xor:int(ldc:int(198), ldc:int(216))))
        storeelement:String(expr_115:String[], and:int(ldc:int(5655), ldc:int(16387)), invokevirtual:String[expected:String](String::substring, var_3_103:String, and:int(ldc:int(543), ldc:int(2142)), and:int(ldc:int(8749), ldc:int(20733))))
        storeelement:String(expr_115:String[], xor:int(ldc:int(12448), ldc:int(12449)), invokevirtual:String[expected:String](String::substring, var_3_103:String, xor:int(ldc:int(16421), ldc:int(16392)), xor:int(ldc:int(16417), ldc:int(16411))))
        storeelement:String(expr_115:String[], and:int(ldc:int(-313), ldc:int(312)), invokevirtual:String[expected:String](String::substring, var_3_103:String, xor:int(ldc:int(303), ldc:int(277)), xor:int(ldc:int(16454), ldc:int(16506))))
        putstatic:String[](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::\u34df\u5245\u6c52\ubefe\u120d\u8709, expr_115:String[])
    }
    
    public void \u62da\u6c56\ud4fe\ubff1\ua61f\u1187(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_663 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_66E : int
        
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
        var_3_663 = and:int(ldc:int(2086520119), ldc:int(-547397929))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc238\u4f52\u93a2\u9a18\u7006\u16f6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
            var_3_663 = and:int(var_3_663:int, ldc:int(2004733083))
            var_5_81 = and:int(ldc:int(-14453), ldc:int(14384))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(31044), ldc:int(-31086)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_663:int, ldc:int(-44075405))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(8203), ldc:int(8202)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(2323), ldc:int(1)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_663 = and:int(var_3_DA:int, ldc:int(1962237719))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(8194), ldc:int(8195)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-500838896))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1391488894))
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-765157693))
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0992)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1881742417))
                        goto(Label_0885)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1763830303))
                        goto(Label_0737)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1423271295))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0885)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1200502854))
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1840069755))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1704864433))
                        goto(Label_0992)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0885)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1681396752))
                        goto(Label_0737)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-820899601))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1559625439))
                            var_11_EB = and:int(ldc:int(-30790), ldc:int(30785))
                            goto(Label_1502)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0595:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(547663150))
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1544171081))
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-382334206))
                        goto(Label_0992)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-2073954277))
                        goto(Label_0885)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-655825135))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1546220868))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-176303049))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0885)
                        }
                    }
                    
                    Label_0737:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(518382345))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-942765884))
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1718840474))
                        goto(Label_0992)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1205164795))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(52175791))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-431871464))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(2144823039))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0885:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-830909617))
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-121474007))
                            goto(Label_0737)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(1610444595))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(8256), ldc:int(8257))
                                goto(Label_1133)
                            }
                        }
                    }
                    
                    Label_0992:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1647052787))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0885)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0737)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1428218002))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(1560113015))
                        var_11_EB = and:int(ldc:int(-17981), ldc:int(1592))
                    }
                    
                    Label_1133:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1115110084))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(992313417))
                            goto(Label_0992)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0885)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0737)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1397136013))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(2094358071))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1356)
                            }
                        }
                    }
                    
                    Label_1248:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-225055648))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1133)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0992)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0885)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0737)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-673364685))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1502)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1356:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(809782598))
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-934727465))
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-177186084))
                        goto(Label_0992)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(2094850890))
                        goto(Label_0885)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0737)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-825799511))
                        loopcontinue()
                    }
                    
                    var_3_663 = and:int(var_3_663:int, ldc:int(1433790327))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1502:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66E = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1513:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(653715783))
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(805023297))
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1656499263))
                        goto(Label_0992)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0885)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0737)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1689946747))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-25856101))
                        var_17_66E = add:int(var_16_119:int, xor:int(ldc:int(-15328), ldc:int(-15327)))
                        looporswitchbreak()
                    }
                    
                    var_3_663 = and:int(var_3_663:int, ldc:int(1596514511))
                }
                
                var_3_663 = and:int(var_3_663:int, ldc:int(-153793441))
                
                if (cmple:boolean(var_5_81 = var_17_66E:int, sub:int(var_6_88:int, and:int(ldc:int(8273), ldc:int(901))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
            var_3_663 = and:int(var_3_663:int, ldc:int(-1382451988))
            goto(Label_0108)
        }
    }
}
