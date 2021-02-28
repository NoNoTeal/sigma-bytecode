public class \u59ec\u8413\u97e6\uc229\u3776.\u7c6b\u392e\ub113\uae87\u6b0d {
    public void \u7c6b\u392e\ub113\uae87\u6b0d(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, java.lang.String p1, int p2, int p3, int p4, int p5) {
        var_9_D3 : Iterator<\u9af2\u72f1\ubf56\u40a9\u3bc9>
        var_10_135 : \u9af2\u72f1\ubf56\u40a9\u3bc9
        
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
            invokespecial:\u3bd6\u156b\u8258\u0b8e\u4492(\u3bd6\u156b\u8258\u0b8e\u4492::<init>, this:\u7c6b\u392e\ub113\uae87\u6b0d, p0:\u12cb\u93a2\ubf56\uc229\u8d90, p1:String, p2:int, p3:int, p4:int, p5:int, and:int[expected:boolean](ldc:int(12941), ldc:int(-13968)))
            putfield:List<\ud7e8\u9937\u4c04\ub1b9\ub19c>(\u7c6b\u392e\ub113\uae87\u6b0d::\u93a2\u97b7\u647c\ud36e\u64ab, this:\u7c6b\u392e\ub113\uae87\u6b0d, initobject:ArrayList<\ud7e8\u9937\u4c04\ub1b9\ub19c>[expected:List<\ud7e8\u9937\u4c04\ub1b9\ub19c>](ArrayList<E>::<init>))
            putfield:List<\u946b\u12cb\u67e9\u156b\u69d9>(\u7c6b\u392e\ub113\uae87\u6b0d::\uc31c\uc87f\uc246\u3776\ub7dc, this:\u7c6b\u392e\ub113\uae87\u6b0d, initobject:ArrayList<\u946b\u12cb\u67e9\u156b\u69d9>[expected:List<\u946b\u12cb\u67e9\u156b\u69d9>](ArrayList<E>::<init>))
            putfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u4492\u4bc8\ub113\u3bc9\u74b1, this:\u7c6b\u392e\ub113\uae87\u6b0d, and:int(ldc:int(388), ldc:int(27932)))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u494c\u494c\ub32d\u36d3\u8753, this:\u7c6b\u392e\ub113\uae87\u6b0d[expected:\u12cb\u93a2\ubf56\uc229\u8d90], putfield:\uc29a\u965f\ubb2b\u56bd\u4f52[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u7c6b\u392e\ub113\uae87\u6b0d::\u3711\u6b0d\u99f7\u071d\uc2bd, this:\u7c6b\u392e\ub113\uae87\u6b0d, initobject:\uc29a\u965f\ubb2b\u56bd\u4f52(\uc29a\u965f\ubb2b\u56bd\u4f52::<init>, this:\u7c6b\u392e\ub113\uae87\u6b0d[expected:\u12cb\u93a2\ubf56\uc229\u8d90], loadelement:String(getstatic:String[](\u7c6b\u392e\ub113\uae87\u6b0d::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(10455), ldc:int(-10456))), and:int(ldc:int(-31505), ldc:int(31504)), ldc:int(65), getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u4492\u4bc8\ub113\u3bc9\u74b1, this:\u7c6b\u392e\ub113\uae87\u6b0d), sub:int(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\ub8be\u7873\u36d3\ub102\u8258, this:\u7c6b\u392e\ub113\uae87\u6b0d), ldc:int(65)))))
            var_9_D3 = invokeinterface:Iterator<\u9af2\u72f1\ubf56\u40a9\u3bc9>(List<\u9af2\u72f1\ubf56\u40a9\u3bc9>::iterator, invokevirtual:List<\u9af2\u72f1\ubf56\u40a9\u3bc9>(\u9033\u0c95\u4975\uafe7\ub7dc::\u8413\u6fb0\uf9c5\u6435\u7bad, invokevirtual:\u9033\u0c95\u4975\uafe7\ub7dc(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4f52\u6ec6\u6b0d\u7e3f\u8640, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_9_D3:Iterator<\u9af2\u72f1\ubf56\u40a9\u3bc9>)) {
                var_10_135 = checkcast:\u9af2\u72f1\ubf56\u40a9\u3bc9(\u927d\u92ff\u71ae\uafe7\u6bb9.\u9af2\u72f1\ubf56\u40a9\u3bc9.class, invokeinterface:\u9af2\u72f1\ubf56\u40a9\u3bc9(Iterator<\u9af2\u72f1\ubf56\u40a9\u3bc9>::next, var_9_D3:Iterator<\u9af2\u72f1\ubf56\u40a9\u3bc9>))
                invokevirtual:void(\uc29a\u965f\ubb2b\u56bd\u4f52::\u5140\u5bc4\u4e72\ud523\u7bad, getfield:\uc29a\u965f\ubb2b\u56bd\u4f52(\u7c6b\u392e\ub113\uae87\u6b0d::\u3711\u6b0d\u99f7\u071d\uc2bd, this:\u7c6b\u392e\ub113\uae87\u6b0d), getfield:String(\u9af2\u72f1\ubf56\u40a9\u3bc9::\u5db4\u8640\u6cfe\u9a18\ubff1, var_10_135:\u9af2\u72f1\ubf56\u40a9\u3bc9), initobject:\u3a62\uc9f6\u3776\u4f52\ua068\u34df(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::<init>, getfield:int(\u9af2\u72f1\ubf56\u40a9\u3bc9::\u59ec\u97b7\u8640\u5d20\uc2e8, var_10_135:\u9af2\u72f1\ubf56\u40a9\u3bc9), ldc:int(64), getfield:int(\u9af2\u72f1\ubf56\u40a9\u3bc9::\uc31c\u516c\u72f1\u6d99\ubcb0, var_10_135:\u9af2\u72f1\ubf56\u40a9\u3bc9)), getfield:int(\u9af2\u72f1\ubf56\u40a9\u3bc9::\u56bd\u6b0d\u3711\ub18d\u12b2, var_10_135:\u9af2\u72f1\ubf56\u40a9\u3bc9))
            }
            
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u494c\u494c\ub32d\u36d3\u8753, this:\u7c6b\u392e\ub113\uae87\u6b0d[expected:\u12cb\u93a2\ubf56\uc229\u8d90], putfield:\u61a4\u8413\u960f\uf9c5\ubcb0[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u7c6b\u392e\ub113\uae87\u6b0d::\u759a\u5245\u0c95\u385b\u56bd, this:\u7c6b\u392e\ub113\uae87\u6b0d, initobject:\u61a4\u8413\u960f\uf9c5\ubcb0(\u61a4\u8413\u960f\uf9c5\ubcb0::<init>, this:\u7c6b\u392e\ub113\uae87\u6b0d[expected:\u12cb\u93a2\ubf56\uc229\u8d90], loadelement:String(getstatic:String[](\u7c6b\u392e\ub113\uae87\u6b0d::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(13), ldc:int(12819))), getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u4492\u4bc8\ub113\u3bc9\u74b1, this:\u7c6b\u392e\ub113\uae87\u6b0d), and:int(ldc:int(-12579), ldc:int(12578)), sub:int(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u8350\u1187\u6c56\ub32d\u927d, this:\u7c6b\u392e\ub113\uae87\u6b0d), getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u4492\u4bc8\ub113\u3bc9\u74b1, this:\u7c6b\u392e\ub113\uae87\u6b0d)), getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\ub8be\u7873\u36d3\ub102\u8258, this:\u7c6b\u392e\ub113\uae87\u6b0d))))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u93a2\u93a2\u3504\uc84e\ud158, this:\u7c6b\u392e\ub113\uae87\u6b0d[expected:\u12cb\u93a2\ubf56\uc229\u8d90], and:int[expected:boolean](ldc:int(-15772), ldc:int(15763)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uafe7\u47c2\ufcaf\u9255\u960f(int p0, int p1) {
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
            invokespecial:void(\uafe7\u72f1\u7e3f\uc238\u34df::\uafe7\u47c2\ufcaf\u9255\u960f, this:\u7c6b\u392e\ub113\uae87\u6b0d[expected:\uafe7\u72f1\u7e3f\uc238\u34df], p0:int, p1:int)
            
            if (getfield:boolean(\u7c6b\u392e\ub113\uae87\u6b0d::\u1833\u7330\ua068\u0c95\u527a, this:\u7c6b\u392e\ub113\uae87\u6b0d)) {
                invokevirtual:void(HashMap<K, V>::clear, getfield:HashMap<Long, ByteBuffer>(\u9033\u0c95\u4975\uafe7\ub7dc::\ud523\u4f52\u59ec\u516c\u3e75, invokevirtual:\u9033\u0c95\u4975\uafe7\ub7dc(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4f52\u6ec6\u6b0d\u7e3f\u8640, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucfaf\u7e3f\ube23\u4f52\u071d(float p0) {
        var_4_62 : int
        var_5_9F : float
        var_7_221 : String
        
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
            var_4_62 = ldc:int(14)
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u7330\uf995\u7af6\uc29a\u960f\u3bc9, i2f:float(add:int(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u7c6b\u392e\ub113\uae87\u6b0d), div:int(var_4_62:int, and:int(ldc:int(8198), ldc:int(6530))))), i2f:float(add:int(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u7c6b\u392e\ub113\uae87\u6b0d), div:int(var_4_62:int, and:int(ldc:int(163), ldc:int(21010))))), i2f:float(sub:int(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u8350\u1187\u6c56\ub32d\u927d, this:\u7c6b\u392e\ub113\uae87\u6b0d), var_4_62:int)), i2f:float(sub:int(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\ub8be\u7873\u36d3\ub102\u8258, this:\u7c6b\u392e\ub113\uae87\u6b0d), var_4_62:int)), ldc:float(20.0f), mul:float(p0:float, ldc:float(0.9f)))
            var_5_9F = ldc:float(0.88f)
            
            if (logicalnot:boolean(invokevirtual:boolean(\ucfaf\ud217\u8df4\u52d3\u446c::\u3c25\ud523\u51fa\ubf56\ud171\u516c, invokevirtual:\ucfaf\ud217\u8df4\u52d3\u446c(\u6b0d\ua068\uc4d2\u5245\u4d85::\u16f6\u5fe1\uc3e3\u6d69\u4c2b, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))))) {
                var_5_9F = ldc:float(0.95f)
            }
            
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u97e6\u98a4\ubded\u527a\u836c\u4975, i2f:float(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u7c6b\u392e\ub113\uae87\u6b0d)), i2f:float(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u7c6b\u392e\ub113\uae87\u6b0d)), i2f:float(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u8350\u1187\u6c56\ub32d\u927d, this:\u7c6b\u392e\ub113\uae87\u6b0d)), i2f:float(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\ub8be\u7873\u36d3\ub102\u8258, this:\u7c6b\u392e\ub113\uae87\u6b0d)), ldc:float(14.0f), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), var_5_9F:float))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u4d85\ucef1\u8640\ub102\u5db4\u64ab, i2f:float(add:int(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u7c6b\u392e\ub113\uae87\u6b0d), getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u4492\u4bc8\ub113\u3bc9\u74b1, this:\u7c6b\u392e\ub113\uae87\u6b0d))), i2f:float(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u7c6b\u392e\ub113\uae87\u6b0d)), i2f:float(sub:int(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u8350\u1187\u6c56\ub32d\u927d, this:\u7c6b\u392e\ub113\uae87\u6b0d), getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u4492\u4bc8\ub113\u3bc9\u74b1, this:\u7c6b\u392e\ub113\uae87\u6b0d))), i2f:float(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\ub8be\u7873\u36d3\ub102\u8258, this:\u7c6b\u392e\ub113\uae87\u6b0d)), ldc:float(14.0f), ldc:int(-7687425))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u156b\u61a4\u36d3\u74b1\u8aa5\u6b0d)
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u4d85\ucef1\u8640\ub102\u5db4\u64ab, i2f:float(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u7c6b\u392e\ub113\uae87\u6b0d)), i2f:float(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u7c6b\u392e\ub113\uae87\u6b0d)), i2f:float(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u8350\u1187\u6c56\ub32d\u927d, this:\u7c6b\u392e\ub113\uae87\u6b0d)), i2f:float(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\ub8be\u7873\u36d3\ub102\u8258, this:\u7c6b\u392e\ub113\uae87\u6b0d)), ldc:float(14.0f), getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\ua068\u40a9\u8753\ud217\u624e\u0c95, getstatic:\u600f\ub18d\u4ab3\uc229\u9a18(\u600f\ub18d\u4ab3\uc229\u9a18::\u9af2\ub7dc\u5654\u1833\u760c))
            invokestatic:void(GL11::glPushMatrix)
            invokestatic:void(GL11::glTranslatef, i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u7c6b\u392e\ub113\uae87\u6b0d[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u7c6b\u392e\ub113\uae87\u6b0d[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), ldc:float(0.0f))
            invokevirtual:void(\uc29a\u965f\ubb2b\u56bd\u4f52::\ucfaf\u7e3f\ube23\u4f52\u071d, getfield:\uc29a\u965f\ubb2b\u56bd\u4f52(\u7c6b\u392e\ub113\uae87\u6b0d::\u3711\u6b0d\u99f7\u071d\uc2bd, this:\u7c6b\u392e\ub113\uae87\u6b0d), p0:float)
            invokestatic:void(GL11::glPopMatrix)
            invokestatic:void(GL11::glPushMatrix)
            invokestatic:void(GL11::glTranslatef, i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u7c6b\u392e\ub113\uae87\u6b0d[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u7c6b\u392e\ub113\uae87\u6b0d[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), ldc:float(0.0f))
            invokevirtual:void(\u61a4\u8413\u960f\uf9c5\ubcb0::\ucfaf\u7e3f\ube23\u4f52\u071d, getfield:\u61a4\u8413\u960f\uf9c5\ubcb0(\u7c6b\u392e\ub113\uae87\u6b0d::\u759a\u5245\u0c95\u385b\u56bd, this:\u7c6b\u392e\ub113\uae87\u6b0d), p0:float)
            invokestatic:void(GL11::glPopMatrix)
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u72f1\u9937\ubded\u98a4\u51fa\u5bc4)
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u446c\u8d90\u1187\uff55\ua3b4\u98a4, i2f:float(add:int(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u7c6b\u392e\ub113\uae87\u6b0d), getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u4492\u4bc8\ub113\u3bc9\u74b1, this:\u7c6b\u392e\ub113\uae87\u6b0d))), i2f:float(add:int(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u7c6b\u392e\ub113\uae87\u6b0d), and:int(ldc:int(-20016), ldc:int(20009)))), ldc:float(1.0f), i2f:float(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\ub8be\u7873\u36d3\ub102\u8258, this:\u7c6b\u392e\ub113\uae87\u6b0d)), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), ldc:float(0.14f)))
            invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\ucef1\u516c\u3a62\ubcb0, ldc:int(-7687425), ldc:float(0.2f)), ldc:float(0.8f))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ubded\u5654\u120d\u7330\u516c), i2f:float(add:int(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u7c6b\u392e\ub113\uae87\u6b0d), ldc:int(30))), i2f:float(add:int(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u7c6b\u392e\ub113\uae87\u6b0d), ldc:int(25))), loadelement:String(getstatic:String[](\u7c6b\u392e\ub113\uae87\u6b0d::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(3106), ldc:int(4098))), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), ldc:float(0.6f)))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ua6bd\u4c04\u3a62\u47c2\ud158), i2f:float(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u7c6b\u392e\ub113\uae87\u6b0d)), i2f:float(sub:int(div:int(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, getfield:\u12cb\u93a2\ubf56\uc229\u8d90(\u7c6b\u392e\ub113\uae87\u6b0d::\u8df4\u6198\u5fe1\ubefe\u5fe1, this:\u7c6b\u392e\ub113\uae87\u6b0d)), getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\ub8be\u7873\u36d3\ub102\u8258, this:\u7c6b\u392e\ub113\uae87\u6b0d)), and:int(ldc:int(16406), ldc:int(1315))), ldc:int(70))), loadelement:String(getstatic:String[](\u7c6b\u392e\ub113\uae87\u6b0d::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(17170), ldc:int(17169))), getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)))
            var_7_221 = invokevirtual:String(String::replace, invokevirtual:String(\u9033\u0c95\u4975\uafe7\ub7dc::\u7049\uc29a\u40a9\ud36e\u6ec6, invokevirtual:\u9033\u0c95\u4975\uafe7\ub7dc(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4f52\u6ec6\u6b0d\u7e3f\u8640, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))), loadelement:String[expected:CharSequence](getstatic:String[](\u7c6b\u392e\ub113\uae87\u6b0d::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(24596), ldc:int(4164))), loadelement:String[expected:CharSequence](getstatic:String[](\u7c6b\u392e\ub113\uae87\u6b0d::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(22775), ldc:int(261))))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u836c\u3504\uc87f\ud171\u8aa5), i2f:float(sub:int(sub:int(add:int(getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u7c6b\u392e\ub113\uae87\u6b0d), getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\u8350\u1187\u6c56\ub32d\u927d, this:\u7c6b\u392e\ub113\uae87\u6b0d)), invokevirtual:int(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::\u446c\u8bb0\u3776\u446c\u385b\u8308, getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u836c\u3504\uc87f\ud171\u8aa5), var_7_221:String)), ldc:int(10))), i2f:float(sub:int(div:int(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, getfield:\u12cb\u93a2\ubf56\uc229\u8d90(\u7c6b\u392e\ub113\uae87\u6b0d::\u8df4\u6198\u5fe1\ubefe\u5fe1, this:\u7c6b\u392e\ub113\uae87\u6b0d)), getfield:int(\u7c6b\u392e\ub113\uae87\u6b0d::\ub8be\u7873\u36d3\ub102\u8258, this:\u7c6b\u392e\ub113\uae87\u6b0d)), xor:int(ldc:int(2317), ldc:int(2319))), ldc:int(62))), var_7_221:String, invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), ldc:float(0.5f)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u5140\u9255\ud7e8\ud51e\u6435(\u6b0d\u12cb\u156b\u4179\u8bb0.\u946b\u12cb\u67e9\u156b\u69d9 p0) {
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
            invokeinterface:boolean(List<\u946b\u12cb\u67e9\u156b\u69d9>::add, getfield:List<\u946b\u12cb\u67e9\u156b\u69d9>(\u7c6b\u392e\ub113\uae87\u6b0d::\uc31c\uc87f\uc246\u3776\ub7dc, this:\u7c6b\u392e\ub113\uae87\u6b0d), p0:\u946b\u12cb\u67e9\u156b\u69d9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u873d\u183a\u51fa\u5fe1\u51b2(int p0, int p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b5f\u1187\u3e75\u5d20\ud217 p2) {
        var_4_63 : int
        var_6_6E : Iterator<\u946b\u12cb\u67e9\u156b\u69d9>
        
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
            var_4_63 = and:int(ldc:int(105505722), ldc:int(1583309042))
            var_6_6E = invokeinterface:Iterator<\u946b\u12cb\u67e9\u156b\u69d9>(List<\u946b\u12cb\u67e9\u156b\u69d9>::iterator, getfield:List<\u946b\u12cb\u67e9\u156b\u69d9>(\u7c6b\u392e\ub113\uae87\u6b0d::\uc31c\uc87f\uc246\u3776\ub7dc, this:\u7c6b\u392e\ub113\uae87\u6b0d))
            
            loop {
                var_4_63 = and:int(var_4_63:int, ldc:int(2086349145))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_6E:Iterator<\u946b\u12cb\u67e9\u156b\u69d9>))) {
                    looporswitchbreak()
                }
                
                invokeinterface:void(\u946b\u12cb\u67e9\u156b\u69d9::\u6435\u527a\uc29a\u71ae\uc229, checkcast:\u946b\u12cb\u67e9\u156b\u69d9(\u6b0d\u12cb\u156b\u4179\u8bb0.\u946b\u12cb\u67e9\u156b\u69d9.class, invokeinterface:\u946b\u12cb\u67e9\u156b\u69d9(Iterator<\u946b\u12cb\u67e9\u156b\u69d9>::next, var_6_6E:Iterator<\u946b\u12cb\u67e9\u156b\u69d9>)), this:\u7c6b\u392e\ub113\uae87\u6b0d, p0:int, p1:int, p2:\u6b5f\u1187\u3e75\u5d20\ud217)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_27C : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_151_0 : byte[] [generated]
        stack_23D_0 : byte[] [generated]
        stack_28F_0 : byte[] [generated]
        stack_30A_0 : byte[] [generated]
        stack_360_0 : byte[] [generated]
        var_4_21E : int
        var_3_223 : byte[]
        var_5_224 : int
        var_0_2A9 : int
        expr_28F : byte [generated]
        stack_2D8_2 : byte [generated]
        stack_2AC_0 : byte [generated]
        var_0_80 : int
        expr_A7 : int [generated]
        var_2_D5 : byte[]
        expr_D9 : int [generated]
        var_3_2F8 : byte[]
        var_5_2F9 : int
        expr_112 : int [generated]
        var_3_34E : byte[]
        var_5_34F : int
        expr_360 : byte [generated]
        var_3_15D : String
        stack_217_0 : String[] [generated]
        expr_16F : String[] [generated]
        
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
        var_0_27C = and:int(ldc:int(1918065597), ldc:int(-76063159))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_151_0 = stack_23D_0 = stack_28F_0 = stack_30A_0 = stack_360_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ZTGpf49Ll6/3O6UhJ/8RMQ/5+Tn7CRuPIR/jTwEJKzHxD/n/we8h+YdDHTU=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_21E = expr_6E:int
        var_3_223 = newarray:byte[](byte.class, expr_6E:int)
        var_5_224 = expr_6E:int
        Label_0550:
        
        while (cmpeq:boolean(and:int(var_0_27C:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_27C = and:int(var_0_27C:int, ldc:int(1323003579))
            var_5_224 = add:int(var_5_224:int, ldc:int(-1))
            storeelement:byte(var_3_223:byte[], var_5_224:int, xor:byte(add:byte(loadelement:byte(stack_23D_0:byte[], var_5_224:int), ldc:byte(116)), ldc:byte(117)))
            
            if (cmpne:boolean(var_5_224:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_151_0 = stack_23D_0 = stack_28F_0 = stack_30A_0 = stack_360_0 = var_3_223:byte[]
            goto(Label_0115)
        }
        
        Label_0623:
        
        while (cmpeq:boolean(and:int(var_0_27C:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_2A9 = and:int(var_0_27C:int, ldc:int(1776279313))
            var_5_224 = add:int(var_5_224:int, ldc:int(-1))
            expr_28F = stack_2D8_2 = loadelement(stack_28F_0, var_5_224)
            
            if (cmplt:boolean(add:int(add:int(var_5_224:int, ldc:int(4)), neg:int(var_4_21E:int)), ldc:int(0))) {
                stack_2D8_2 = stack_2AC_0 = add:byte(expr_28F:byte, loadelement:byte(var_3_223:byte[], add:int(var_5_224:int, ldc:int(4))))
                goto(Label_0700)
            }
            
            Label_0668:
            
            if (cmpne:boolean(and:int(var_0_2A9:int, ldc:int(512)), ldc:int(0))) {
                var_0_2A9 = and:int(var_0_2A9:int, ldc:int(-495292761))
                stack_2D8_2 = stack_2AC_0 = add:byte(expr_28F:byte, ldc:byte(4))
            }
            
            Label_0700:
            
            if (cmpne:boolean(and:int(var_0_2A9:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_2A9 = and:int(var_0_2A9:int, ldc:int(-502975250))
                goto(Label_0668)
            }
            
            var_0_27C = and:int(var_0_2A9:int, ldc:int(-495293739))
            storeelement:byte(var_3_223:byte[], var_5_224:int, stack_2D8_2:byte)
            
            if (cmpne:boolean(var_5_224:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_151_0 = stack_23D_0 = stack_28F_0 = stack_30A_0 = stack_360_0 = var_3_223:byte[]
            goto(Label_0172)
        }
        
        var_0_27C = and:int(var_0_27C:int, ldc:int(-327168106))
        goto(Label_0550)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_27C:int, ldc:int(524288)), ldc:int(0))) {
            var_0_80 = and:int(var_0_27C:int, ldc:int(389104545))
            goto(Label_0279)
        }
        
        if (cmpeq:boolean(and:int(var_0_27C:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_27C:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_27C = and:int(var_0_27C:int, ldc:int(-262963166))
        }
        else {
            var_0_27C = and:int(var_0_27C:int, ldc:int(-2047377443))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_21E = expr_A7:int
                var_3_223 = newarray:byte[](byte.class, expr_A7:int)
                var_5_224 = expr_A7:int
                goto(Label_0623)
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_27C:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_80 = and:int(var_0_27C:int, ldc:int(182867170))
            goto(Label_0279)
        }
        
        if (cmpeq:boolean(and:int(var_0_27C:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_27C:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_27C = and:int(var_0_27C:int, ldc:int(-681877729))
            var_2_D5 = stack_D5_0:byte[]
            expr_D9 = add:int(arraylength:int(stack_D7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_3_2F8 = newarray:byte[](byte.class, expr_D9:int)
                var_5_2F9 = expr_D9:int
                
                loop {
                    var_0_27C = and:int(var_0_27C:int, ldc:int(159312655))
                    var_5_2F9 = add:int(var_5_2F9:int, ldc:int(-1))
                    storeelement:byte(var_3_2F8:byte[], var_5_2F9:int, add:int(shl:int(loadelement:byte(stack_30A_0:byte[], var_5_2F9:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_D5:byte[], add:int(var_5_2F9:int, and:int(ldc:int(16393), ldc:int(149)))), ldc:int(5)), xor:int(ldc:int(192), ldc:int(199)))))
                    
                    if (cmpne:boolean(var_5_2F9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_151_0 = stack_23D_0 = stack_28F_0 = stack_30A_0 = stack_360_0 = var_3_2F8:byte[]
            }
        }
        
        Label_0222:
        
        if (cmpeq:boolean(and:int(var_0_27C:int, ldc:int(16384)), ldc:int(0))) {
            var_0_80 = and:int(var_0_27C:int, ldc:int(461329987))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_27C:int, ldc:int(131072)), ldc:int(0))) {
                var_0_27C = and:int(var_0_27C:int, ldc:int(-1042205844))
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_0_27C:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_80 = and:int(var_0_27C:int, ldc:int(108158881))
            expr_112 = arraylength:int(stack_112_0:byte[])
            
            if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                var_3_34E = newarray:byte[](byte.class, expr_112:int)
                var_5_34F = expr_112:int
                
                loop {
                    var_0_80 = and:int(var_0_80:int, ldc:int(-925410443))
                    var_5_34F = add:int(var_5_34F:int, ldc:int(-1))
                    expr_360 = loadelement:byte(stack_360_0:byte[], var_5_34F:int)
                    storeelement:byte(var_3_34E:byte[], var_5_34F:int, or:int(and:int(shl:int(expr_360:byte, xor:int(ldc:int(10816), ldc:int(10820))), ldc:int(-16)), and:int(shr:int(expr_360:byte[expected:int], xor:int(ldc:int(2058), ldc:int(2062))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_34F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_151_0 = stack_23D_0 = stack_28F_0 = stack_30A_0 = stack_360_0 = var_3_34E:byte[]
            }
        }
        
        Label_0279:
        
        if (cmpne:boolean(and:int(var_0_80:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_27C = and:int(var_0_80:int, ldc:int(590926281))
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(2048)), ldc:int(0))) {
            var_0_27C = and:int(var_0_80:int, ldc:int(-60323484))
            goto(Label_0172)
        }
        
        if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(131072)), ldc:int(0))) {
            var_0_27C = and:int(var_0_80:int, ldc:int(263383886))
            goto(Label_0115)
        }
        
        var_3_15D = initobject:String(String::<init>, stack_151_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_217_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16438), ldc:int(2055)))
        expr_16F = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(6247), ldc:int(134)))
        storeelement:String(expr_16F:String[], and:int(ldc:int(24661), ldc:int(1677)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(-8624), ldc:int(8583)), and:int(ldc:int(2059), ldc:int(16535))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(16388), ldc:int(8228)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(1291), ldc:int(8947)), xor:int(ldc:int(411), ldc:int(415))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(20075), ldc:int(4099)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(4610), ldc:int(4614)), xor:int(ldc:int(513), ldc:int(527))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(1028), ldc:int(1030)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(78), ldc:int(8334)), and:int(ldc:int(22583), ldc:int(8535))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(28693), ldc:int(3401)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(8727), ldc:int(1087)), xor:int(ldc:int(1345), ldc:int(1374))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(16556), ldc:int(-16557)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(8991), ldc:int(2207)), xor:int(ldc:int(17522), ldc:int(17497))))
        putstatic:String[](\u7c6b\u392e\ub113\uae87\u6b0d::\u4ab3\u99f7\u3a62\u3711\ub6ab, expr_16F:String[])
    }
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63C : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_647 : int
        
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
        var_3_63C = and:int(ldc:int(-1121983040), ldc:int(-1086357548))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7c6b\u392e\ub113\uae87\u6b0d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_63C = and:int(var_3_63C:int, ldc:int(-790753551))
        }
        else {
            var_3_63C = and:int(var_3_63C:int, ldc:int(-1109690376))
            var_5_8A = and:int(ldc:int(-31958), ldc:int(15505))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18656), ldc:int(-18658)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_63C:int, ldc:int(-1646334612))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(3093), ldc:int(16713)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(20500), ldc:int(20501)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_63C = and:int(var_3_DA:int, ldc:int(-539035805))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(12801), ldc:int(1497)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-778695905))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1513998054))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1373742980))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-849225978))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-687841659))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1815593967))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1625397799))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-125835628))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1121982627))
                            var_11_EB = and:int(ldc:int(7689), ldc:int(-7738))
                            goto(Label_1490)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0568:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1727106453))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1767520512))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-351731665))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-576576638))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1578236530))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1660099113))
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1088690740))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(329017543))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1351057879))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(63407417))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1550094292))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1027304861))
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-6554161))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1771402235))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1909943856))
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1115947156))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(25569), ldc:int(13))
                                goto(Label_1092)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1472817538))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1621203086))
                        var_11_EB = and:int(ldc:int(29522), ldc:int(-29523))
                    }
                    
                    Label_1092:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1270138656))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-837794912))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(583203322))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1838348272))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1904018174))
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1088684732))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1353)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1092)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(640007719))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1843659637))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(2147334652))
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1650524334))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1490)
                    }
                    
                    Label_1353:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-2057026691))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1164322463))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1112399697))
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1212852236))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63C = and:int(var_3_63C:int, ldc:int(-15043097))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1490:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_647 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1501:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-633868299))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1277060785))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1082497046))
                        var_17_647 = add:int(var_16_119:int, and:int(ldc:int(5131), ldc:int(2437)))
                        looporswitchbreak()
                    }
                }
                
                var_3_63C = and:int(var_3_63C:int, ldc:int(-46500000))
                
                if (cmple:boolean(var_5_8A = var_17_647:int, sub:int(var_6_91:int, and:int(ldc:int(3137), ldc:int(8197))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
